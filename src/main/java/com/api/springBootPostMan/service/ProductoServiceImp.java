package com.api.springBootPostMan.service;

import com.api.springBootPostMan.entity.Producto;
import com.api.springBootPostMan.repository.ProductoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImp implements ProductoService {
    private final ProductoRepository productoRepository;
    public ProductoServiceImp(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    @Override
    public Producto save(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public List<Producto> findAll() {
        return productoRepository.findAll();
    }

    @Override
    public Producto findById (int id) {
        Producto producto = productoRepository.findById(id).get();
        return producto;
    }

    @Override
    public void deleteById (int id) {
        productoRepository.deleteById(id);
    }

    @Override
    public Producto update(Producto producto) {
        return productoRepository.save(producto);
    }
}
