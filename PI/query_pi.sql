create database projetoPi;
use projetoPi;

create table Produtos (
id int primary key,
nome_prod varchar (100),
descr_prod varchar (500),
valor decimal (9,2)
);

insert into Produtos values (50,'Monitor','Monitor Dell 23.8"polegadas','1378.00' );
select* from Produtos;