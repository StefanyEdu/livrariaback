package com.db.livrariamentesbrilhantes.repository;


import com.db.livrariamentesbrilhantes.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
