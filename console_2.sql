-- create database if not exists db_gama_exe;

use db_gama_exe;

create table if not exists Funcionario(
    matricula int,
    nome varchar(50),
    data_nasc date,
    salario float
);

create table if not exists Caixa_Postal(
    codigo numeric primary key not null auto_increment,
    localidade varchar(45)
);

create table if not exists Pessoa(
    codigo int primary key not null auto_increment,
    nome varchar(45),
    idade int,
    salario numeric(10,2),
    telefone varchar(12),
    codigo_postal varchar(9)
);

create table Empregado(
    codigo numeric primary key not null auto_increment,
    nome varchar(60),
    cargo varchar(40) check ( cargo not like '%GERENTE%'),
    ctps int UNIQUE,
    cpf char(15) UNIQUE,
    idade int not null check ( idade >=0 and idade <=150 ),
    sexo enum('M', 'F'),
    tempo_servico int check ( tempo_servico >=0 )
);