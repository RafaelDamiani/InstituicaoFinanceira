-- Banco de Dados: POO

-- Usuario: postgres
-- Senha: senha123

-- Tabela de Clientes

create database instituicaofinanceira;
use instituicaofinanceira;
create table tb_cliente (
idcliente int auto_increment not null,
cpf varchar(11) not null,
nome varchar(255) not null,
sobrenome varchar(255) not null,
rg varchar (10) not null,
endereco varchar(255) not null,
constraint pkCliente primary key (idcliente)
);

-- Tabela de Contas

create table tb_conta (
idconta int auto_increment not null,
idcliente int not null,
num_conta bigint not null,
saldo decimal(10,2) not null,
tipo varchar(3) not null, -- CC (para Conta Corrente) ou INV (para Conta de Investimento)
deposito_inicial decimal(10,2) not null,
limite decimal(10,2) not null, -- Aplicável apenas para Conta de Corrente
montante_min decimal(10,2) not null, -- Aplicável apenas para Conta de Investimento
deposito_min decimal(10,2) not null, -- Aplicável apenas para Conta de Investimento
constraint pkConta primary key (idconta),
constraint fkClienteConta foreign key (idcliente) references tb_cliente(idcliente)
);
