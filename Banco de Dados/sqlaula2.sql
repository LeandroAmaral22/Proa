create database banco_teste2;
use banco_teste2;

create table funcionario(
	idFuncionario int,
    NomeFuncionario varchar(50),
    dataNascimento date,
    genero enum('m','f'),
    estadoCivil enum('solteiro','casado','divorciado','viuvo'),
    telefone1 varchar(14),
    salario decimal(10,2)
); /* criação da tabela(entidade), e a estrutura da tabela */

describe funcionario; /* descreve a estrutura da tabela */

insert into funcionario values(1,'joao','2000-01-01','m','casado','11966666666',8300);
insert into funcionario values(2,'ana','2000-01-01','f','casado','119666665555',9000);
insert into funcionario values(3,'alberto','2000-01-01','f','casado','119666665555',4000);
insert into funcionario values(4,'alberto','2000-01-01','f','casado','119666665555',3500);
insert into funcionario values(5,'alberto','2000-01-01','f','casado','119666665555',2500);

select * from funcionario;

insert into Funcionario
	(idFuncionario,nomeFuncionario,dataNascimento,genero,estadoCivil,telefone,salario)
	values
(3,'maria','1999-05-08', 'f', 'solteiro', '119666665555',4500),
(4,'sergio','1998-05-08', 'f', 'solteiro', '119666665555',3500),
(5,'lucia','1997-05-08', 'f', 'viuvo', '119666665555',2500); /* insert declarativo */

update funcionario 
set salario = salario * 1.1; /* é necessario liberar o uso do update e  delete sem Where */
delete from funcionario;

update funcionario 
set estadoCivil = 'viuvo'
where IdFuncionario = 1; /*atualizando valor do campo estadocivil com a condição where(direcionamento) */

delete from funcionario  where idFuncionario =2;

start transaction; /* habilita comandos de retorno */
delete from funcionario;
rollback; /* Ctrl + Z do delete */ 

commit; /* confirma a exclusão dos registros*/

alter table funcionario
add column cargo varchar(45);

update funcionario
set cargo = 'supervisor'
where IdFuncionario = 3;

update funcionario
set cargo = 'estagiario'
where Idfuncionario = 5;

select * from funcionario;

alter table funcionario /* alteração da tabela */
drop column cargo; /* excluindo um campo */

insert into endereco
(IdEndereco, Rua, Bairro, Numero, Cidade, Pais, Cep)
values 
(null,'Rua um', 'Bairro um', '1A', 'Cidade 1', 'Pais1', '111111-111'),
(null, 'Rua dois','Bairro dois', '2A','Cidade 2', 'Pais2', '222222-222'), 
(null, 'Rua tres','Bairro tres', '3A','Cidade 3', 'Pais3', '333333-333');

select * from endereco;

