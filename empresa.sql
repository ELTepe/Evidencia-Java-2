create database empresa;
use empresa;

create table persona(
  idPersona int not null primary key AUTO_INCREMENT,
  nombre varchar(20),
  apellido1 varchar(20),
  direccion varchar(50)
);

insert into persona values 
(null,'Juana','Santiago','Dr. Alberto Roman 851'),
(null,'Pedro','Sanchez','Constitucion 1456'),
(null,'Marcelo','Cadena','Manuel Carpio 3666');

select * from persona;
