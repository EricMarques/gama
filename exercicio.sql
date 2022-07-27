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

use PlanoSaude;

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
    id_Paciente int,
    constraint fk_paciente_dependente FOREIGN KEY (id_Dependente) references Paciente(id_Paciente)
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

create table Funcionario(
    id_Funcionario int primary key not null auto_increment,
    nome varchar(100) not null,
    data_nascimento date,
    cpf varchar(14) not null ,
    genero enum('M', 'F'),
    endereco varchar(100)
);

create table Consulta(
    id_consulta int primary key not null auto_increment,
    data_consulta date,
    valor_consulta double(7,2),
    id_Medico int,
    id_Paciente int,
    id_funcionario int,
    constraint fk_medico FOREIGN KEY (id_Medico) references Medico(id_Medico),
    constraint fk_paciente_consulta FOREIGN KEY (id_Paciente) references Paciente(id_Paciente),
    constraint fk_funcionario FOREIGN KEY (id_funcionario) references Funcionario(id_Funcionario)
);