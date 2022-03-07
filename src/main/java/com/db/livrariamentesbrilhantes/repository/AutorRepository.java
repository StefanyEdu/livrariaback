package com.db.livrariamentesbrilhantes.repository;

import com.db.livrariamentesbrilhantes.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepository extends JpaRepository<Autor, Long> {
}