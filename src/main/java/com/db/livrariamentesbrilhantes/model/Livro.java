package com.db.livrariamentesbrilhantes.model;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Builder
@Data
@Entity
@Table(name = "livro")
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "titulo", length = 150, nullable = false)
    private  String titulo;


    @Column(name = "sumario", length = 600, nullable = false)
    private String sumario;

    @Column(name = "preco",length = 4 ,nullable = false)
    private  Double preco;

    @Column(name = "numero_de_paginas", length = 4 , nullable = false)
    private  Integer numero_de_paginas;

    @Column(name = "isbn",length = 20 , nullable = false)
    private  String isbn ;

    @Column(name = "data_publicacao", length = 12, nullable = false)
    private String data_publicacao;

    @Column(name = "capa", length = 400, nullable = false)
    private String capa;

    @Deprecated
    protected Livro() {}
    public Livro(Long id, String titulo, String sumario, Double preco, Integer numero_de_paginas, String isbn,String data_publicacao, String capa) {
        this.id = id;
        this.titulo = titulo;
        this.sumario = sumario;
        this.preco = preco;
        this.numero_de_paginas = numero_de_paginas;
        this.isbn = isbn;
        this.data_publicacao = data_publicacao;
        this.capa = capa;
    }

    }




