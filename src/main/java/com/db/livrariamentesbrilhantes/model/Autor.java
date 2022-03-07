package com.db.livrariamentesbrilhantes.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "autor")
public class Autor extends Entidade  {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;

        @OneToMany(cascade = CascadeType.ALL)
        @JoinTable(name = "autor_livro", joinColumns = @JoinColumn(name = "autor_id",
                referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "livro_id", referencedColumnName = "id"))

        private List<Livro> livros = new ArrayList<>();

        @Column(name = "nome", length = 100, nullable = false)
        @NotNull(message = "Nome não pode ser null")
        private String nome;

        @Column(name = "email", length = 100, nullable = false)
        @NotNull(message = "Email não pode ser null")
        private String email;

        @Column(name = "data_de_criacao", length = 12, nullable = false)
        @NotNull(message = "Data de criação não pode ser null")
        private String data_de_criacao;

        @Column(name = "descricao", length = 255, nullable = false)
        @NotNull(message = "Descrição não pode ser null")
        private String descricao;

        @Deprecated
        protected Autor() {
        }

        public Autor(Long id, String nome, String email, String dataDeCriação, String descricao) {
            this.id = id;
            this.nome = nome;
            this.email = email;
            this.data_de_criacao = dataDeCriação;
            this.descricao = descricao;
            isValid();
        }

    }

