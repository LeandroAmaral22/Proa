create database bd_teste;
use bd_teste;

create table tb_pessoas(
	id_pessoa int auto_increment not null,
    nome_pessoa varchar(255) not null,
    dt_nascimento date,
    constraint pk_idPessoa primary key (id_pessoa)
)
Engine = InnoDB;

create table tb_funcionario(
	id_funcionario int auto_increment not null,
    id_pessoa int not null,
    salario_funcionario decimal(10,2) not null,
    dt_admissao date,
    constraint pk_idFuncionario primary key (id_funcionario),
    constraint fk_Funcionario_pessoas foreign key (id_pessoa) references tb_pessoas(id_pessoa)
)
Engine = InnoDB;

insert into tb_pessoas values(null, 'João', '1980-02-08');
insert into tb_pessoas values(null, 'Maria', '1999-05-25');
insert into tb_funcionario values(null, 1, 5487.28, '2022-11-01');
insert into tb_funcionario values(null, 2, 7000, '2022-05-01');

select * from tb_pessoas;
select * from tb_funcionario;

select * from tb_funcionario inner join tb_pessoas using (id_pessoa);

