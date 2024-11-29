package com.api.springBootPostMan.repository;

import com.api.springBootPostMan.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository <Producto, Integer> {
}
