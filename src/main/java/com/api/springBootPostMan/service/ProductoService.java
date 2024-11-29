package com.api.springBootPostMan.service;

import com.api.springBootPostMan.entity.Producto;

import java.util.List;

public interface ProductoService {
    Producto save(Producto producto);
    List<Producto> findAll();
    Producto findById(int id);
    void deleteById(int id);
    Producto update(Producto producto);
}
