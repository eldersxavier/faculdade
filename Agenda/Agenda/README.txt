1 - Cole o script descrito e copie no terminal do mysql.

create database agenda;
use agenda;
create table contatos (
id BIGINT NOT NULL AUTO_INCREMENT,
nome VARCHAR(255),
telefone VARCHAR(255),
celular VARCHAR(255),
email VARCHAR(255),
endereco VARCHAR(255),
numero VARCHAR(15),
bairro VARCHAR(255),
cidade VARCHAR(255),
estado VARCHAR(50),
pais VARCHAR(50),
primary key (id)
);


2 - Configure a conexão Mysql na Classe ConnectionFactory no pacote conexão:

	String SERVER = "localhost"; // Alterar para o endereco do servidor
        String DATABASE = "agenda"; // Não alterar 
        String USUARIO = "root"; // Alterar para o nome do usuario do Mysql
        String SENHA = "";  //// Alterar para o senha do Mysql