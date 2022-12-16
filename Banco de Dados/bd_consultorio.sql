create database bd_consultorio;
use bd_consultorio;

create table tb_medico(
	id_medico int auto_increment,
    nome_medico varchar(45) not null,
    telefone_medico varchar(11),
    constraint pk_id_medico primary key (id_medico)
);

create table tb_consulta(
	id_consulta int auto_increment,
    dt_consulta datetime,
    id_medico int,
    id_paciente int,
    constraint fk_id_medico foreign key (id_medico) references tb_medico(id_medico),
    constraint fk_id_paciente foreign key (id_paciente) references tb_paciente(id_paciente)
);

create table tb_paciente(
	id_paciente int auto_increment,
    nome_paciente varchar(45),
    telefone_paciente varchar(9),
    convenio varchar(45),
    constraint pk_id_paciente primary key (id_paciente)
);

create table tb_receita_medica(
	id_receita_medica int auto_increment,
    descricao varchar(500),
    constraint pk_id_receita_medica primary key (id_receita_medica)
);
	
insert into tb_medico (nome_medico, telefone_medico) values ('Leandro', '11972189456');
delete from tb_medico where id_medico = 1;

