package com.db.livrariamentesbrilhantes.modelTest;

import com.db.livrariamentesbrilhantes.exception.ExcecaoModel;
import com.db.livrariamentesbrilhantes.model.Autor;
import com.db.livrariamentesbrilhantes.model.Categoria;
import com.db.livrariamentesbrilhantes.model.Livro;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LivroTest {

    @Test
    public void deveSalvarComSucesso(){

        long id = 123;
        var livroModel = new Livro(id, "Desenvolvimento", "Sumario do livro desenvolvimento", 100.00, 80,"978-0-7334-2609-4","01/01/2020","linkdaImagem");

        Assertions.assertEquals("Desenvolvimento", livroModel.getTitulo());
        Assertions.assertEquals("Sumario do livro desenvolvimento", livroModel.getSumario());
        Assertions.assertEquals(100.00, livroModel.getPreco());
        Assertions.assertEquals(80, livroModel.getNumero_de_paginas());
        Assertions.assertEquals("978-0-7334-2609-4", livroModel.getIsbn());
        Assertions.assertEquals("01/01/2020", livroModel.getData_publicacao());
        Assertions.assertEquals("linkdaImagem", livroModel.getCapa());
    }

    @Test
    public void deveSalvarSemSucessoComNull(){

        long id = 123;
        try {
            Livro livro = new Livro(id, null, null,null,null, null, null, null);
        }catch (ExcecaoModel di){
            String mensagemEsperada = "[ titulo: Titulo não pode ser null, sumario: Sumario não pode ser null, preco: Preço não pode ser null, numero_de_paginas: Numero de Paginas não pode ser null, isbn: ISBN não pode ser null, data_publicacao: Data da Publicação não pode ser null, capa: Capa não pode ser null]";
            Assertions.assertEquals(mensagemEsperada, di.getMessage());
        }
    }
}
