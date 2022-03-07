package com.db.livrariamentesbrilhantes.controller;

import com.db.livrariamentesbrilhantes.model.Livro;
import com.db.livrariamentesbrilhantes.service.LivroService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.db.livrariamentesbrilhantes.repository.LivroRepository;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/livro")
public class LivroController {

    private LivroService livroService;
    private LivroRepository livroRepository;

    public LivroController(LivroService livroService, LivroRepository livroRepository) {
        this.livroService = livroService;
        this.livroRepository = livroRepository;
    }

    @PostMapping
    public ResponseEntity<Livro> saveLivro(@RequestBody @Valid Livro livro){
        livroService.save(livro);
        return new ResponseEntity<>(livro, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> ListarLivros(){
        List<Livro> listaDeLivro = livroService.findAll();
        if (!listaDeLivro.isEmpty()){
            return new ResponseEntity<>(listaDeLivro, HttpStatus.FOUND);
        }
        return new ResponseEntity<>("Lista Vazia", HttpStatus.FOUND.NOT_FOUND);
    }
}
