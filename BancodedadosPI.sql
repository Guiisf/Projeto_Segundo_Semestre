create database projetoPi;
use projetoPi;

create table Produtos (
codProd INT NOT NULL AUTO_INCREMENT,
descricao varchar (100),
Qtde varchar (500),
preco decimal (9,2),
PRIMARY KEY(codProd)
);

select* from Produtos;
Select descricao, preco * Qtde as valor_total
From (Produtos)
group by codProd;

CREATE TABLE Clientes(
idCliente INT NOT NULL AUTO_INCREMENT,
nome varchar(245) Not null,
CPF VARCHAR(11) NOT NULL,
dataDeNascimento Date NOT NULL,
sexo varchar(100),
estadoCivil varchar(100),
rua varchar (200) Not null,  
cidade varchar (100) Not null,
estado varchar (100) Not null,
cep varchar (20) Not null,
cttTelefone DOUBLE NOT NULL,
cttCelular DOUBLE NOT NULL,
email varchar(100) Not null,
 PRIMARY KEY(idCliente)
);

select * from Clientes;

CREATE TABLE carrinho (
  IdCompra INT NOT NULL AUTO_INCREMENT,
  DataEmissao Date NOT NULL,
  nome varchar(245) Not null,
  codProd INT NOT NULL,
  produto varchar (100),
  Qtde varchar (500),
  ValorNota DOUBLE NOT NULL,
  PRIMARY KEY(idCompra)
);

select * from carrinho;

drop table Produtos;
drop table Clientes;
drop table carrinho;

































                                                                                                                                                                                              