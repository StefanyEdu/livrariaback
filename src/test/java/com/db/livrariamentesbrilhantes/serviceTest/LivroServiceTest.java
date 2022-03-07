package com.db.livrariamentesbrilhantes.serviceTest;

import com.db.livrariamentesbrilhantes.model.Livro;
import com.db.livrariamentesbrilhantes.repository.LivroRepository;
import com.db.livrariamentesbrilhantes.service.LivroService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.mockito.ArgumentMatchers.any;

public class LivroServiceTest {

    @Mock
    private LivroRepository livroRepository;

    private LivroService livroService;

    @BeforeEach
    public void iniciar(){
        MockitoAnnotations.openMocks(this);
        livroService = new LivroService(livroRepository);
    }

    @Test
    public void deveSalvarComSucesso(){

        long id = 123;
        var livroModel = new Livro(id, "Desenvolvimento", "Sumario do livro desenvolvimento", 100.00, 80,"978-0-7334-2609-4","01/01/2020","linkdaImagem");


        livroRepository.save(livroModel);
        Mockito.verify(livroRepository, Mockito.times(1)).save(any(Livro.class));
    }
}
