package com.db.livrariamentesbrilhantes.serviceTest;

import com.db.livrariamentesbrilhantes.model.Categoria;
import com.db.livrariamentesbrilhantes.repository.CategoriaRepository;
import com.db.livrariamentesbrilhantes.service.CategoriaService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.mockito.ArgumentMatchers.any;


public class CategoriaServiceTest {

    @Mock
    private CategoriaRepository categoriaRepository;

    private CategoriaService categoriaService;

    @BeforeEach
    public void iniciar(){
        MockitoAnnotations.openMocks(this);
        categoriaService = new CategoriaService(categoriaRepository);
    }

    @Test
    public void deveSalvarComSucesso(){

        long id = 123;
        var categoriaModel = new Categoria(id, "Comédia", "Comédia Romântica");

        categoriaRepository.save(categoriaModel);
        Mockito.verify(categoriaRepository, Mockito.times(1)).save(any(Categoria.class));
    }


}

