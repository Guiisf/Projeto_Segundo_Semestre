create database projetoPi;
use projetoPi;

create table Produtos (
id int primary key ,
descricao varchar (100),
Qtde varchar (500),
preco decimal (9,2)
);

CREATE TABLE Clientes(
cpf  char (12)  Not null,
nome varchar(245) Not null,
dataDeNascimento datetime,
estadoCivil varchar(10),  
sexo varchar(10),
cttTelefone varchar(20) Not null,
cttCelular varchar(20),
email varchar(100) Not null,
endereço varchar (200) Not null,
id int primary key auto_increment
);

CREATE TABLE NotaFiscal (
  id INT primary key NOT NULL AUTO_INCREMENT,
  NumeroNota INT NOT NULL,
  ValorNota DOUBLE NOT NULL,
  DataEmissao Date NOT NULL,
  DataEntrada Date NOT NULL
);

CREATE TABLE Venda (
id	int primary key not null auto_increment,
idCliente int not null,
foreign key (idCliente) references Clientes(id),
foreign key (idProduto) references Produtos(id)
);

show tables;
select *from Produtos;
select *from Clientes;
select *from NotaFiscal;
select *from Venda;
select preco * Qtde as valor_total
From (Produtos)
Group by id;


