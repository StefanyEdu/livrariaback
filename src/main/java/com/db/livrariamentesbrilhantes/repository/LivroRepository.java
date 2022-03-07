package com.db.livrariamentesbrilhantes.repository;

import com.db.livrariamentesbrilhantes.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {
}
