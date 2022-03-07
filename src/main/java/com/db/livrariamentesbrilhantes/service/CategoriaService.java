package com.db.livrariamentesbrilhantes.service;

import com.db.livrariamentesbrilhantes.model.Categoria;
import com.db.livrariamentesbrilhantes.repository.CategoriaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {

    private CategoriaRepository categoriaRepository;

    public CategoriaService(CategoriaRepository repository) {
        this.categoriaRepository = categoriaRepository;
    }

    public void save(Categoria categoriaModel){
        categoriaRepository.save(categoriaModel);
    }

    public List<Categoria> findAll(){ return categoriaRepository.findAll();

    }
}
