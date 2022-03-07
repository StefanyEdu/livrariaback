package com.db.livrariamentesbrilhantes.controller;

import com.db.livrariamentesbrilhantes.model.Autor;
import com.db.livrariamentesbrilhantes.repository.AutorRepository;
import com.db.livrariamentesbrilhantes.service.AutorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/autor")
public class AutorController {

    private AutorService service;
    private AutorRepository repository;

    public AutorController(AutorService service, AutorRepository repository) {
        this.service = service;
        this.repository = repository;
    }

    @PostMapping
    public ResponseEntity<Autor> saveAutor(@RequestBody @Valid Autor autor){
        service.save(autor);
        return new ResponseEntity<>(autor, HttpStatus.OK);
    }
    @GetMapping
    public ResponseEntity<?> ListarAutores(){
        List<Autor> listaAutores = service.findAll();
        if (!listaAutores.isEmpty()){
            return new ResponseEntity<>(listaAutores, HttpStatus.FOUND);
        }
        return new ResponseEntity<>("Lista Vazia", HttpStatus.FOUND.NOT_FOUND);
    }

}
