package com.api.springBootPostMan.controller;

import com.api.springBootPostMan.entity.Producto;
import com.api.springBootPostMan.service.ProductoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
public class ProductoController {
    private final ProductoService productoService;
    public ProductoController(ProductoService productoService) {this.productoService = productoService;}

    @PostMapping
    public Producto save(@RequestBody Producto producto) {return productoService.save(producto);}
    @GetMapping
    public List<Producto> findAll() {return productoService.findAll();}
    @GetMapping("/{id}")
    public Producto findById(@PathVariable int id) {return productoService.findById(id);}
    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {productoService.deleteById(id);}
    @PutMapping
    public Producto update(@RequestBody Producto producto) {
        Producto old = productoService.findById(producto.getId());
        old.setNombre(producto.getNombre());
        old.setPrecio(producto.getPrecio());
        old.setDescripcion(producto.getDescripcion());
        return productoService.update(producto);}
}
