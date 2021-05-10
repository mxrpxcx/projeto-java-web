CREATE DATABASE dbColegio;
USE dbColegio;

CREATE TABLE tbUsuario (
	idUsuario INT(5) NOT NULL AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    email VARCHAR(200) NOT NULL,
    paisDeOrigem VARCHAR(50) NOT NULL,
    PRIMARY KEY (idUsuario)
);