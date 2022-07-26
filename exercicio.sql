/*
Fazer modelo ER Lógico utilizando requisitos a baixo:

Sistema: Cadastro de Pacientes num plano de saúde (privado)

Entidades:
Paciente
Dependente(1 dependente no máximo)
Médico
Funcionário
Consulta
*/
-- create database PlanoSaude;

use planosaude;

create table Paciente(
    id_Paciente int primary key not null auto_increment,
    nome varchar(100) not null,
    data_nascimento date,
    cpf varchar(14) not null ,
    genero enum('M', 'F'),
    endereco varchar(100)
);

create table Dependente(
    id_Dependente int primary key not null auto_increment,
    nome varchar(100) not null,
    data_nascimento date,
    cpf varchar(14),
    genero enum('M', 'F'),
    constraint fk_paciente FOREIGN KEY (id_Dependente) references Paciente(id_Paciente)
);

create table Medico(
    id_Medico int primary key not null auto_increment,
    nome varchar(100) not null,
    data_nascimento date,
    cpf varchar(14) not null ,
    crm varchar(15) not null,
    especialidade varchar(30) not null,
    genero enum('M', 'F'),
    endereco varchar(100)
);