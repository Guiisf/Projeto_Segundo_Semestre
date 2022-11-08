create database projetoPi;
use projetoPi;

create table Produtos (
codProd int primary key ,
descricao varchar (100),
Qtde varchar (500),
preco decimal (9,2)


);


select* from Produtos;

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


show tables;
desc Produtos;
select * from Clientes;



CREATE TABLE notafiscaal (
  IdNota INT primary key NOT NULL AUTO_INCREMENT,
  NumeroNota INT NOT NULL,
  ValorNota DOUBLE NOT NULL,
  DataEmissao Date NOT NULL,
  DataEntrada Date NOT NULL
);

CREATE TABLE Venda (
IdVenda	int primary key not null auto_increment,
idCliente int not null,
foreign key (idCliente) references Clientes(id),
foreign key (idProduto) references Produtos(id)
);
show tables;



select*from FormaDePagamento;
select*from Produtos;
show tables;









                                                                                                                                                                                              
