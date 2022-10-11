create database projetoPi;
use projetoPi;

create table Produtos (
id int primary key ,
nome_prod varchar (100),
descr_prod varchar (500),
valor decimal (9,2)

);

alter table Produtos add column Unidade int not null;
update Produtos set Unidade = 2 where id = 50;
alter table Produtos drop column Unidade;
alter table Produtos modify nome_prod varchar (100) Not null ;
alter table Produtos modify Unidade int;

insert into Produtos values (null,'Monitor','Monitor Dell 23.8"polegadas','1378.00',50 );
select* from Produtos;
insert into Produtos values (null,'Monitor','Monitor gamer Samsung odyssey 23.5"polegadas, led curvo 144 hz','1189.99',50 );
use projetoPi;
insert into Produtos values (null,'Monitor','Monitor gaming Asus 23.8"polegadas(HDMI,/DP/VGA/144 hz)','1849.00',50 );
insert into Produtos values (null,'Monitor','Monitor LG 19.5"polegadas(HDMI,/HD/LED), Ajuste de inclinação','779.90',50 );
insert into Produtos values (null,'Monitor','Monitor Philips 18.5"polegadas HDMI','899.99',50 );
insert into Produtos values (null,'Mouse','Mouse Gamer Razer Deathadder Optical Switch, 8 Botões, 20000DPI','541.00',70 );
insert into Produtos values (null,'Mouse','Mouse Gamer Redragon griffin, 7200DPI','99.99',70 );
insert into Produtos values (null,'Mouse','Mouse sem fio 2.4 ghz, 1200DPI','50.49',70 );
insert into Produtos values (null,'Mouse','Mouse com fio classic, preto, cabo 120cm','16.90',70 );
insert into Produtos values (null,'Mouse','Mouse sem fio e bluetooth logitech pebble m350','103.99',70 );
insert into Produtos values (null,'Fone de ouvido','Fone de ouvido intra-auricular gamer Hyperx Cloud Earbuds','352.80',100 );
insert into Produtos values (null,'Fone de ouvido','Fones de ouvido on-ear sem fios com cancelamento de ruídos','749.00',100 );
insert into Produtos values (null,'Fone de ouvido','Fone de ouvido AirPods pro','2599.99',100 );
insert into Produtos values (null,'Fone de ouvido','Fone de ouvido Philips tauh201 headphone com microfone','89.99',100 );
insert into Produtos values (null,'Teclado','Teclado com fio USB Logitech K120 resistente a água','101.50',100 );
insert into Produtos values (null,'Teclado','Teclado Movietec OTF-01 USB ABNT 2','39.90',100 );
insert into Produtos values (null,'Teclado','Teclado USB sem fio Kapbom ABNT 2 ','104.90',100 );
insert into Produtos values (null,'Teclado','Teclado mecânico gamer Hyperx Alloy Origins, RGB, ABNT 2','941.10',100 );
insert into Produtos values (null,'Teclado','Teclado gamer Sharkoon Shark Killer Mech SGK 3, RGB, ABNT 2','499.90',100 );
insert into Produtos values (null,'Pen Drive','Pen drive multi Titan USB 2.0, 8 GB','29.50',65 );
insert into Produtos values (null,'Pen Drive','Pen drive SanDisk Ultra Shift, 32 GB','55.90',65 );
insert into Produtos values (null,'Pen Drive','Pen drive multi nano, 16 GB, PD054','41.00',65 );
insert into Produtos values (null,'Pen Drive','Pen drive Maxprint Twist, 8 GB','39.90',65 );
insert into Produtos values (null,'Pen Drive','Pen drive SanDisk 128 GB, Ultra Dual Drive ','120.99',65 );

CREATE TABLE Clientes(
cpf  char (12) primary key Not null,
nome varchar(30) Not null,
dataDeNascimento datetime,
estadoCivil varchar(10),
sexo char(1),
cttTelefone varchar(12) Not null,
cttCelular varchar(12),
email varchar(100) Not null,
endereço varchar (200) Not null,
nºendereço varchar(8) Not null
);

show tables;
desc Produtos;
select * from Clientes;

drop table Produtos;
CREATE TABLE Produtos (
id int primary key auto_increment,
nome_prod varchar (100),
descr_prod varchar (500),
valor decimal (9,2),
unidade int Not Null
);
drop TABLE Clientes;

CREATE TABLE FormaDePagamento (
id int primary key auto_increment,
dinheiro float,
cartãoDébito float,
cartãoCrédito float
);

select*from FormaDePagamento;
select*from Produtos;









                                                                                                                                                                                              