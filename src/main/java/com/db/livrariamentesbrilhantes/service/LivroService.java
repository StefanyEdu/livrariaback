package com.db.livrariamentesbrilhantes.service;

import com.db.livrariamentesbrilhantes.model.Livro;
import com.db.livrariamentesbrilhantes.repository.LivroRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {

    private LivroRepository livroRepository;

    public LivroService(LivroRepository repository) {
        this.livroRepository = livroRepository;
    }

    public void save(Livro livroModel){
        livroRepository.save(livroModel);
    }

    public List<Livro> findAll(){ return livroRepository.findAll();

    }
}
