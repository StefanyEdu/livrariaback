INSERT INTO public.autor(
    id, data_de_criacao, descricao, email, nome)
VALUES (?, ?, ?, ?, ?);

INSERT INTO public.categoria(
    id, descricao, nome)
VALUES (?, ?, ?);


INSERT INTO public.livro(
    id, capa, data_publicacao, isbn, numero_de_paginas, preco, sumario, titulo)
VALUES (?, ?, ?, ?, ?, ?, ?, ?);