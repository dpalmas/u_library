DROP DATABASE IF EXISTS Livraria;

CREATE DATABASE Livraria;

USE Livraria;

CREATE TABLE Autores
(
   AutorID INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY,
   Nome VARCHAR(255) NOT NULL
);

CREATE TABLE Livros
(
   LivroID INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY,
   Titulo VARCHAR(255) NOT NULL,
   Resumo VARCHAR(255),
   AutorID INTEGER NOT NULL,
   FOREIGN KEY (AutorID) REFERENCES Autores(AutorID),
   Edicao VARCHAR(255),
   ISBN VARCHAR(255) NOT NULL,
   Estado CHAR(1),
   Quantidade INTEGER
);

CREATE TABLE Alunos
(
   AlunoID INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY,
   Nome VARCHAR(255) NOT NULL,
   NumeroRA INTEGER NOT NULL,
   Curso VARCHAR(255),
   Estado CHAR(1)
);

CREATE TABLE Emprestimos
(
   Numero INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY,
   DataEmissao DATE NOT NULL,
   DataDevolucao DATE NOT NULL,
   DataValidade DATE NOT NULL,
   AlunoID INTEGER NOT NULL,
   LivroID INTEGER NOT NULL,
   #FOREIGN KEY (AlunoID) REFERENCES Alunos(AlunoID),
   #FOREIGN KEY (LivroID) REFERENCES Livros(LivroID),
   Estado CHAR(1) NOT NULL
);

INSERT INTO Autores (Nome) VALUES ('Nivio Ziviani');
INSERT INTO Autores (Nome) VALUES ('Victorine Viviane Mizrahi');
INSERT INTO Autores (Nome) VALUES ('Everton Coimbra de Araujo');
INSERT INTO Autores (Nome) VALUES ('Thomas Cormen');
INSERT INTO Autores (Nome) VALUES ('Nell Dale');

INSERT INTO Livros(Titulo, Resumo, AutorID, Edicao, ISBN, Estado, Quantidade) VALUES('Tutilo 1', 'Resumo 1', 1, 'Edicao 1', '1234567890', 'A', 1);
INSERT INTO Livros(Titulo, Resumo, AutorID, Edicao, ISBN, Estado, Quantidade) VALUES('Tutilo 2', 'Resumo 2', 2, 'Edicao 2', '1234567890', 'A', 1);
INSERT INTO Livros(Titulo, Resumo, AutorID, Edicao, ISBN, Estado, Quantidade) VALUES('Tutilo 3', 'Resumo 3', 1, 'Edicao 3', '1234567890', 'A', 1);

       /*'Treinamento em Linguagem C', 'Introdução a linguagem C e conceitos.',
      'Segunda','9788576050452','A',1,
      'Lógica de Programção', 'Abordagem de tratamentos de pensamento geral.',
      'Terceira', '9788576050453', 'A', 1,
      'Algoritmos', 'Ensino de algoritmos com ilustrações e exercícios.',
      'Quarta', '9788576050454', 'A', 1,
      'Ciência da Computação', 'Histórico e abordagem da computação.',
      'Quinta', '9788576050452', 'A', 1);*/

INSERT INTO Alunos (AlunoID, Nome, NumeroRA, Curso, Estado) VALUES (1,'Thomas', 1501506, 'Ciencia da Computacao', 'A');
INSERT INTO Alunos (AlunoID, Nome, NumeroRA, Curso, Estado) VALUES (2,'Jeff', 1511607, 'Engenharia Ambiental', 'A');
INSERT INTO Alunos (AlunoID, Nome, NumeroRA, Curso, Estado) VALUES (3,'Joshua', 1521708, 'Engenharia Alimentos', 'A');
INSERT INTO Alunos (AlunoID, Nome, NumeroRA, Curso, Estado) VALUES (4,'Anna', 1531809, 'Engenharia Eletrica', 'A');
INSERT INTO Alunos (AlunoID, Nome, NumeroRA, Curso, Estado) VALUES (5,'Beth', 1541910, 'Engenharia Software', 'A');     
			
INSERT INTO Emprestimos (DataEmissao, DataDevolucao, DataValidade, AlunoID, LivroID, Estado) VALUES ('2019-01-10', '2019-01-11', '2019-01-12', 1, 1,'E');
INSERT INTO Emprestimos (DataEmissao, DataDevolucao, DataValidade, AlunoID, LivroID, Estado) VALUES ('2019-02-13','2019-02-14', '2019-02-15', 2, 2,'E');
INSERT INTO Emprestimos (DataEmissao, DataDevolucao, DataValidade, AlunoID, LivroID, Estado) VALUES ('2019-03-16', '2019-03-17', '2019-03-18', 3, 3,'E');
INSERT INTO Emprestimos (DataEmissao, DataDevolucao, DataValidade, AlunoID, LivroID, Estado) VALUES ('2019-04-19', '2019-04-20', '2019-04-21', 4, 4,'E');
INSERT INTO Emprestimos (DataEmissao, DataDevolucao, DataValidade, AlunoID, LivroID, Estado) VALUES ('2019-05-22', '2019-05-23', '2019-05-24', 5, 5,'E');   
               
/*CREATE TABLE Livros
(
   ISBN VARCHAR(13) NOT NULL PRIMARY KEY,
   Titulo VARCHAR(255) NOT NULL,
   Edicao INTEGER NOT NULL,
   Copyright VARCHAR(4) NOT NULL
);*/

CREATE TABLE AutorISBN
(
   AutorID INTEGER NOT NULL,
   ISBN VARCHAR(13) NOT NULL
   #FOREIGN KEY (AutorID) REFERENCES Autores(AutorID),
   #FOREIGN KEY (ISBN) REFERENCES Livros(ISBN)
);

#INSERT INTO Livros (ISBN,Titulo,Edicao,Copyright) VALUES ('0132152134','Projeto de Algoritmos em C',2,'2004');
INSERT INTO AutorISBN (AutorID,ISBN) VALUES (1,'0132152134');
INSERT INTO AutorISBN (AutorID,ISBN) VALUES (2,'0132152134');

#INSERT INTO Livros (ISBN,Titulo,Edicao,Copyright) VALUES ('0132151421','Introdução a linguagem Pascal',3,'2006');
INSERT INTO AutorISBN (AutorID,ISBN) VALUES (1,'0132151421');
INSERT INTO AutorISBN (AutorID,ISBN) VALUES (2,'0132151421');

#INSERT INTO Livros (ISBN,Titulo,Edicao,Copyright) VALUES ('0132575663','Java como programar',4,'2008');
INSERT INTO AutorISBN (AutorID,ISBN) VALUES (1,'0132575663');
INSERT INTO AutorISBN (AutorID,ISBN) VALUES (2,'0132575663');

#INSERT INTO Livros (ISBN,Titulo,Edicao,Copyright) VALUES ('0132662361','Treinamento em linguagem C',5,'2010');
INSERT INTO AutorISBN (AutorID,ISBN) VALUES (1,'0132662361');
INSERT INTO AutorISBN (AutorID,ISBN) VALUES (2,'0132662361');

#INSERT INTO Livros (ISBN,Titulo,Edicao,Copyright) VALUES ('0132404168','Lógica de Programação',6,'2011');
INSERT INTO AutorISBN (AutorID,ISBN) VALUES (1,'0132404168');
INSERT INTO AutorISBN (AutorID,ISBN) VALUES (2,'0132404168');

#INSERT INTO Livros (ISBN,Titulo,Edicao,Copyright) VALUES ('013705842X','Algoritmos',3,'2012');
INSERT INTO AutorISBN (AutorID,ISBN) VALUES (1,'013705842X');
INSERT INTO AutorISBN (AutorID,ISBN) VALUES (2,'013705842X');
INSERT INTO AutorISBN (AutorID,ISBN) VALUES (3,'013705842X');
INSERT INTO AutorISBN (AutorID,ISBN) VALUES (4,'013705842X');
INSERT INTO AutorISBN (AutorID,ISBN) VALUES (5,'013705842X');

#INSERT INTO Livros (ISBN,Titulo,Edicao,Copyright) VALUES ('0132121360','Introdução a Ciência da Computação',8,'2013');
INSERT INTO AutorISBN (AutorID,ISBN) VALUES (1,'0132121360');
INSERT INTO AutorISBN (AutorID,ISBN) VALUES (2,'0132121360');
INSERT INTO AutorISBN (AutorID,ISBN) VALUES (3,'0132121360');
INSERT INTO AutorISBN (AutorID,ISBN) VALUES (4,'0132121360');
