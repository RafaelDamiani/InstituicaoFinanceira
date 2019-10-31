-- Banco de Dados: POO

-- Usuario: postgres
-- Senha: senha123

-- Tabela de Clientes

create table tb_cliente (
cpf bigint,
nome varchar(256),
sobrenome varchar(256),
salario decimal(10,2),
rg bigint,
constraint pkCliente primary key (cpf)
)

-- Tabela de Contas

create table tb_conta (
num_conta bigint,
cpf bigint,
saldo decimal(10,2),
tipo varchar(3), -- CC (para Conta Corrente) ou INV (para Conta de Investimento)
deposito_inicial decimal(10,2),
limite decimal(10,2), -- Aplicável apenas para Conta de Corrente
montante_min decimal(10,2), -- Aplicável apenas para Conta de Investimento
deposito_min decimal(10,2), -- Aplicável apenas para Conta de Investimento
constraint pkConta primary key (num_conta),
constraint fkClienteConta foreign key (cpf) references tb_cliente(cpf)
)