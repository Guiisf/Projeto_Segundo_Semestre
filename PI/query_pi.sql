-- DDL comandos primários
-- Comandos estruturais se referem aos dados do banco ( create, drop, alter ) comandos principais
-- Create > criar . Tudo que for criar algo relacionado a estrutura e não dados. 
-- Drop > deletar  
-- Alter > alteração 
-- Use > usar : apontando qual objeto usar
-- Camel Case > Quando forem duas palavras ou mais, pode colocar a inicial da segunda palavra em letra maiúscula : heronRamos
CREATE DATABASE sistemaEletrico;
USE sistemaEletrico;


CREATE TABLE usuario(
id int primary key,
nome varchar(30),
senha varchar(30)
);
SHOW TABLES;
Use sistemaEletrico;
-- DML comandos para manipular os dados (principais > insert, delete, update, select)
Insert into usuario values ( 1,'heron',2507 );
Select * from usuario;
-- * significa que está selecionando TUDO 
Insert into usuario values (2,'douglas',1234 );
CREATE TABLE formaDePagamento(
id int primary key auto_increment,
nome varchar(30),
usuario int,
data_ date
);
Insert into formaDePagamento values (null,'cheque',1,(select curdate()));
Select * from formaDePagamento;
--  NULL : toda vez que um campo for auto increment ( auto preenchido ) ou realmente for nulo.
-- CURDATE : selecionar a data do dia 
-- Toda função do sistema é acompanhada de parenteses
Select curdate();

Insert into formaDePagamento values (null,'dinheiro',1,(select curdate()));
Insert into formaDePagamento values (null, 'cartão de crédito',1,(select curdate()));
-- int : qualquer número inteiro , mesma coisa no app java 
-- float : números decimais ou inteiros , mesma coisa no app java
-- double : números decimais "infinitos" , mesma coisa no app java
-- varchar : cadeia de caracteres ( formando palavras ou numeros ) , ex : heron123, no java utilizado como String
-- char : cadeia de caracteres que eu ja sei o tamanho certo da palavra , ex : SP, RJ, MG (coisas específicas) 
-- if ( se ) , uma condicional que pode ser usada para dois caminhos ( true or false )
-- Dados são "pedaços" de uma informação, quando juntos , formam a própria informação
-- EX : 09/07 são os dados.... O pedro faz aniversario dia 09/07 , conlui-se que obtive uma informação.
-- Desc : comando alternativo para mostrar tabelas  * desc = descobrir
desc formadepagamento;
create table cliente(
id int Not null,
nome varchar(30) Not null,
sexo char (1) Not null,
cpf varchar(12) Not null,
telefone varchar(10) Not null,
email varchar(30),

usuario int Not null);
-- not nul= não nulo , tornando campos obrigatórios
desc cliente;
USE sistemaEletrico


