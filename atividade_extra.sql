CREATE DATABASE db_youtube;

USE db_youtube;

CREATE TABLE tb_videos(
	id BIGINT AUTO_INCREMENT PRIMARY KEY,
    author VARCHAR(30),
    title VARCHAR(30),
    likes INT,
    dislikes  INT
);

INSERT INTO tb_videos(author,title,likes,dislikes) VALUES ("Maria", "MySQL", 20, 5),
("Sara", "CSS", 30, 7),
("Rafael", "HTML", 50, 2),
("Joana", "Java", 10, 6),
("Pedro", "Python", 25, 0);

SELECT * FROM tb_videos;

CREATE TABLE tb_author(
	id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nascimento DATE,
    author_id BIGINT,
    
	FOREIGN KEY(author_id) REFERENCES tb_videos (id)
);

INSERT INTO tb_author(nascimento,author_id) VALUES ('1993-01-01', 1),
('2000-03-17', 2),
('1997-02-05', 3),
('1999-10-01', 4),
('1987-05-22', 5);

SELECT * FROM tb_author
INNER JOIN tb_videos ON tb_videos.id = tb_author.author_id;

SELECT * FROM tb_author;
