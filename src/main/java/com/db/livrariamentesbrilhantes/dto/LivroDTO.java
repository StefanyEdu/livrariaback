package com.db.livrariamentesbrilhantes.dto;

import com.db.livrariamentesbrilhantes.model.Livro;
import lombok.Getter;

@Getter
public class LivroDTO {

    private Long id;

    private  String titulo;

    private String sumario;

    private  Double preco;

    private  Integer numero_de_paginas;

    private  String isbn ;

    private String data_publicacao;

    private String capa;

    @Deprecated
    protected LivroDTO() {
    }

    public LivroDTO(Long id, String titulo, String sumario, Double preco, Integer numero_de_paginas, String isbn, String data_publicacao, String capa) {
        this.id = id;
        this.titulo = titulo;
        this.sumario = sumario;
        this.preco = preco;
        this.numero_de_paginas = numero_de_paginas;
        this.isbn = isbn;
        this.data_publicacao = data_publicacao;
        this.capa = capa;
    }
    public LivroDTO(Livro livro){
        id = livro.getId();
        titulo = livro.getTitulo();
        sumario = livro.getSumario();
        preco = livro.getPreco();
        numero_de_paginas = livro.getNumero_de_paginas();
        isbn = livro.getIsbn();
        data_publicacao = livro.getData_publicacao();
        capa = livro.getCapa();
    }


}
