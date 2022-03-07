package com.db.livrariamentesbrilhantes.service;

import com.db.livrariamentesbrilhantes.model.Autor;

import com.db.livrariamentesbrilhantes.model.Categoria;
import com.db.livrariamentesbrilhantes.repository.AutorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorService {

    private AutorRepository repository;

    public AutorService(AutorRepository repository) {
        this.repository = repository;
    }

    public void save(Autor autor) {
        repository.save(autor);
    }

    public List<Autor> findAll() {
        return repository.findAll();
    }
}