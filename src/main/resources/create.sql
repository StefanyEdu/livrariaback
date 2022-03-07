DROP table if exists autor_livro cascade;
DROP table if exists categoria_livro cascade;
DROP table if exists autor cascade;
DROP table if exists categoria cascade;
Drop table if exists livro cascade;

create table autor
(
    id              int8         not null,
    data_de_criacao varchar(12)  not null,
    descricao       varchar(255) not null,
    email           varchar(100) not null,
    nome            varchar(100) not null,
    primary key (id)
);


create table categoria
(
    id        int8         not null,
    descricao varchar(255) not null,
    nome      varchar(255) not null,
    primary key (id)
);

create table livro
(
    id                int8         not null,
    capa              varchar(400) not null,
    data_publicacao   varchar(12)  not null,
    isbn              varchar(20)  not null,
    numero_de_paginas int4         not null,
    preco             float8       not null,
    sumario           varchar(600) not null,
    titulo            varchar(150) not null,
    primary key (id)
);
create table categoria_livro
(
    categoria_id int8 not null,
    livro_id     int8 not null,
    CONSTRAINT FK_categoria_id foreign key (categoria_id) references categoria (id),
    constraint Fk_livro_id foreign key (livro_id) references livro (id)
);

create table autor_livro
(
    autor_id int8 not null,
    livro_id int8 not null,
        constraint Fk_livro_id foreign key (livro_id) references livro(id),
        constraint  FK_auto_id foreign key (autor_id) references autor(id)

);