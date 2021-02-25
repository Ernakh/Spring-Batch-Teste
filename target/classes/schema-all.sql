DROP TABLE pessoa IF EXISTS;

CREATE TABLE pessoa  (
    pessoa_id BIGINT IDENTITY NOT NULL PRIMARY KEY,
    nome VARCHAR(20),
    sobrenome VARCHAR(20)
);