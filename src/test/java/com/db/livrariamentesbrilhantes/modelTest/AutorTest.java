package com.db.livrariamentesbrilhantes.modelTest;

import com.db.livrariamentesbrilhantes.exception.ExcecaoModel;
import com.db.livrariamentesbrilhantes.model.Autor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AutorTest {

    @Test
    public void deveSalvarComSucesso(){

        long id = 123;
        var autorModel = new Autor(id, "thomas", "thomas@gmail.com", "21/10/2007", "especialista em js");

        Assertions.assertEquals("thomas", autorModel.getNome());
        Assertions.assertEquals("thomas@gmail.com", autorModel.getEmail());
        Assertions.assertEquals("21/10/2007", autorModel.getData_de_criacao());
        Assertions.assertEquals("especialista em js", autorModel.getDescricao());
    }
    @Test
    public void deveSalvarSemSucessoComNull(){

        long id = 123;
        try {
            Autor autor = new Autor(id, null, null, null, null);
        }catch (ExcecaoModel di){
            String mensagemEsperada = "[data_de_criacao : Data de criação não pode ser null, descricao : Descrição não pode ser null, email : Email não pode ser null, nome : Nome não pode ser null]";
            Assertions.assertEquals(mensagemEsperada, di.getMessage());
        }
    }



}
