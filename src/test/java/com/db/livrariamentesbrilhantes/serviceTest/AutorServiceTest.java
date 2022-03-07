package com.db.livrariamentesbrilhantes.serviceTest;

import com.db.livrariamentesbrilhantes.model.Autor;

import com.db.livrariamentesbrilhantes.repository.AutorRepository;
import com.db.livrariamentesbrilhantes.service.AutorService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.mockito.ArgumentMatchers.any;

public class AutorServiceTest {

    @Mock
    private AutorRepository repository;

    private AutorService service;

    @BeforeEach
    public void iniciar(){
        MockitoAnnotations.openMocks(this);
        service = new AutorService(repository);
    }

    @Test
    public void deveSalvarComSucesso(){

        long id = 123;
        var autorModel = new Autor(id, "thomas", "thomas@gmail.com", "21/10/2007", "Livro de javascript");

        repository.save(autorModel);
        Mockito.verify(repository, Mockito.times(1)).save(any(Autor.class));
    }
}
