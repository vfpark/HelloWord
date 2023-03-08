CREATE DATABASE db_rh;

USE db_rh;

CREATE TABLE tb_colaboradores(
	id BIGINT AUTO_INCREMENT,
    nome VARCHAR(255),
    salario DECIMAL(6,2),
    turno VARCHAR(255),
    cpf VARCHAR(255),
    
    PRIMARY KEY(id)
);

SELECT * FROM tb_colaboradores;

INSERT INTO tb_colaboradores(nome, salario, turno, cpf) VALUES ("Adriana", 2300.00, "Manhã", "25465254640"),
("Heloísa", 4000.00, "Manhã", "50244563154"),
("Marcelo", 2150.00, "Manhã", "20154683201"),
("Gabriela", 1800.50, "Tarde", "63021547852"),
("Luís", 1400.80, "Tarde", "14253201453");

SELECT * FROM tb_colaboradores WHERE salario > 2000.00;
SELECT * FROM tb_colaboradores WHERE salario < 2000.00;
UPDATE tb_colaboradores SET salario = 2000.00 WHERE id = 4;

SELECT * FROM tb_colaboradores;