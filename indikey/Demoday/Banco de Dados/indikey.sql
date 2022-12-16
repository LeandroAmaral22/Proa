create database bd_indikey;
use bd_indikey;

create table tb_cliente(
	id_cliente int auto_increment not null,
    nome_cliente varchar(255) not null,
    email_cliente varchar(100) not null,
    telefone varchar(15) not null,
    cpf varchar(14) not null,
    data_nascimento date not null,
    logadouro varchar(100) not null,
    numero varchar(8) not null,
    cep varchar(10) not null,
    cidade varchar(50) not null,
    uf char(2),
    genero enum('Masculino', 'Feminino', 'Prefiro não dizer'),
    constraint pk_idCliente primary key (id_cliente)
)Engine = InnoDB;

create table tb_categorias_comercio(
	id_categoria_comercio int auto_increment not null,
    nome_categoria varchar(255) not null,
    constraint pk_idCategoria primary key (id_categoria_comercio)
)Engine = InnoDB;

create table tb_comercio(
	id_comercio int auto_increment not null,
    id_categoria_comercio int not null,
    nome_comercio varchar(255) not null,
    cnpj varchar(18) not null,
    telefone varchar(15) not null,
    logadouro varchar(100) not null,
    numero varchar(8) not null,
    cep varchar(10) not null,
    cidade varchar(50) not null,
    uf char(2),
    constraint pk_idComercio primary key (id_comercio),
    constraint fk_idCategoria_Comercio foreign key (id_categoria_comercio) references tb_categorias_comercio(id_categoria_comercio)
)Engine = InnoDB;

create table tb_autonomo(
	id_autonomo int auto_increment not null,
    id_categoria_comercio int not null,
    nome_autonomo varchar(255) not null,
    cnpj varchar(18) not null,
    telefone varchar(15) not null,
    logadouro varchar(100) not null,
    numero varchar(8) not null,
    cep varchar(10) not null,
    cidade varchar(50) not null,
    uf char(2),
    constraint pk_idAutonomo primary key (id_autonomo),
    constraint fk_IdCategoria foreign key (id_categoria_comercio) references tb_categorias_comercio (id_categoria_comercio)
)Engine = InnoDB;

create table tb_contrato(
	id_contrato int auto_increment not null,
    id_cliente int not null,
    id_autonomo int not null,
    nome_servico varchar(255) not null,
    descricao varchar(500) not null,
    valor decimal(10, 2) not null,
    nome_empresa varchar(255) not null,
    data_contrato date not null,
    constraint pk_idContrato primary key (id_contrato),
    constraint fk_idCliente foreign key (id_cliente) references tb_cliente(id_cliente),
    constraint fk_idAutonomo foreign key (id_autonomo) references tb_autonomo(id_autonomo)
) Engine = InnoDB;

create table tb_ordem_servico(
	id_ordem_servico int auto_increment not null,
    id_contrato int not null,
    constraint pk_idOrdemServico primary key (id_ordem_servico),
    constraint fk_idContrato foreign key (id_contrato) references tb_contrato(id_contrato)
)Engine = InnoDB;

create table tb_indicacoes(
	id_indicacao int auto_increment not null,
    id_autonomo int not null,
    id_comercio int not null,
    constraint pk_idIndicacao primary key (id_indicacao),
    constraint fk_idAutonomo_indicacoes foreign key (id_autonomo) references tb_autonomo(id_autonomo),
    constraint fk_idComercio_indicacoes foreign key (id_comercio) references tb_comercio(id_comercio)
)Engine = InnoDB;

create table tb_avaliacoes(
	id_avaliacao int auto_increment not null,
    id_cliente int not null,
    id_autonomo int not null,
    id_comercio int not null,
    pontuacao float8 not null,
    comentario varchar(500) not null,
	constraint pk_idAvaliacao primary key (id_avaliacao),
    constraint fk_idCliente_avaliacoes foreign key (id_cliente) references tb_cliente(id_cliente),
    constraint fk_idAutonomo_avaliacoes foreign key (id_autonomo) references tb_autonomo(id_autonomo),
    constraint fk_idComercio_avaliacoes foreign key (id_comercio) references tb_comercio(id_comercio)
) Engine = InnoDB;

create table tb_categoria_produto(
	id_categoria_prod int auto_increment not null,
    id_comercio int not null,
    nome_categoria varchar(255) not null,
    constraint pk_idCategoria_prod primary key (id_categoria_prod),
    constraint fk_idComercio_categ_prod foreign key (id_comercio) references tb_comercio(id_comercio)
) Engine = InnoDB;

create table tb_produto(
	id_produto int auto_increment not null,
    id_categoria_prod int not null,
    nome_produto varchar(255) not null,
    valor_unt decimal(10, 2) not null,
    data_fab date not null,
    data_venc date not null,
    constraint pk_idProduto primary key (id_produto),
    constraint fk_idCategoria_prod foreign key (id_categoria_prod) references tb_categoria_produto(id_categoria_prod)
)Engine = InnoDB;

create table tb_pedido(
	id_pedido int auto_increment not null,
    id_cliente int not null,
    id_produto int not null,
    valor_total decimal(10, 2) not null,
    data_venda date not null,
    constraint pk_idPedido primary key (id_pedido),
    constraint fk_idCliente_vendas foreign key (id_cliente) references tb_cliente(id_cliente),
    constraint fk_idProduto foreign key (id_produto) references tb_produto(id_produto)
)Engine = InnoDB;

create table tb_forma_pag(
	id_forma_pgt int auto_increment not null,
    id_pedido int not null,
    forma_pgt enum('Dinheiro', 'Pix', 'Cartão Crédito', 'Cartão Débito', 'Boleto') not null,
	constraint pk_idFormaPgt primary key (id_forma_pgt),
	constraint fk_idPedido foreign key (id_pedido) references tb_vendas(id_pedido)
)Engine = InnoDB;

create table tb_nota_fiscal(
	id_nota_fiscal int auto_increment not null,
    id_forma_pgt int not null,
	constraint pk_idNotaFIscal primary key (id_nota_fiscal),
	constraint fk_FormaPgt foreign key (id_forma_pgt) references tb_forma_pag(id_forma_pgt)
)Engine = InnoDB;