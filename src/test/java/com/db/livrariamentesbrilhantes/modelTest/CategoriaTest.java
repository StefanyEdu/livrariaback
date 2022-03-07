package com.db.livrariamentesbrilhantes.modelTest;


import com.db.livrariamentesbrilhantes.exception.ExcecaoModel;
import com.db.livrariamentesbrilhantes.model.Autor;
import com.db.livrariamentesbrilhantes.model.Categoria;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CategoriaTest {


    @Test
    public void deveSalvarComSucesso(){

        long id = 123;
        var categoriaModel = new Categoria(id, "Comédia","Comédia Romantica");

        Assertions.assertEquals("Comédia", categoriaModel.getNome());
        Assertions.assertEquals("Comédia Romantica", categoriaModel.getDescricao());
    }

    @Test
    public void deveSalvarSemSucessoComNull(){

        long id = 123;
        try {
            Categoria categoria = new Categoria(id, null, null);
        }catch (ExcecaoModel di){
            String mensagemEsperada = "[ descricao : Descrição não pode ser null, nome : Nome não pode ser null]";
            Assertions.assertEquals(mensagemEsperada, di.getMessage());
        }
    }
}

