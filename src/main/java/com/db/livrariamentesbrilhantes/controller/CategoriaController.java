package com.db.livrariamentesbrilhantes.controller;


import com.db.livrariamentesbrilhantes.model.Categoria;
import com.db.livrariamentesbrilhantes.repository.CategoriaRepository;
import com.db.livrariamentesbrilhantes.service.CategoriaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {

    private CategoriaService categoriaService;
    private CategoriaRepository categoriaRepository;

    public CategoriaController(CategoriaService categoriaService, CategoriaRepository categoriaRepository) {
        this.categoriaService = categoriaService;
        this.categoriaRepository = categoriaRepository;
    }

    @PostMapping
    public ResponseEntity<Categoria> saveCategoria(@RequestBody @Valid Categoria categoria){
        categoriaService.save(categoria);
        return new ResponseEntity<>(categoria, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> ListarCategorias(){
        List<Categoria> listaDeCategoria = categoriaService.findAll();
        if (!listaDeCategoria.isEmpty()){
            return new ResponseEntity<>(listaDeCategoria, HttpStatus.FOUND);
        }
        return new ResponseEntity<>("Lista Vazia", HttpStatus.FOUND.NOT_FOUND);
    }
}
