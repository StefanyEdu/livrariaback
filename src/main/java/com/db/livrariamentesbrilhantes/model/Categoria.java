package com.db.livrariamentesbrilhantes.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "categoria")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "categoria_livro", joinColumns = @JoinColumn(name = "categoria_id",
            referencedColumnName ="id" ), inverseJoinColumns = @JoinColumn(name = "livro_id", referencedColumnName = "id"))

    private List <Livro> livros = new ArrayList<>();

    @Column(name = "nome", length = 255, nullable = false)
    private String nome;

    @Column(name = "descricao", length =255, nullable = false)
    private String descricao;

    @Deprecated
    protected Categoria() {}
    public Categoria(Long id, String nome,  String descricao) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
    }
}
