create table cliente 
(
	COD							bigint auto_increment not null primary key,
	NOME   						varchar(100) not null, 
	DOCUMENTO 					varchar(18),
	ENDERECO_ID 				bigint,
	TELEFONE					varchar(18),
	EMAIL 						varchar(100),
	RAMO_ATIVIDADE  			varchar(50),
	DATA_PAGAMENTO       		date,
	ULTIMA_ATUALIZACAO   		date,
	USUARIO_ULTIMA_ATUALIZACAO  varchar(100),
	USUARIO_CRIACAO      		varchar(100),
	DATA_CRIACAO         		date
);


create table LANCAMENTO 
(
   COD                  		bigint auto_increment not null primary key,
   CLIENTE_ID          		 	bigint not null,
   DESCRICAO           			varchar(1024) not null,
   VALOR               			decimal(10,2) not null,
   TIPO                 		varchar(10) not null,
   PAGO                 		bool not null,
   VENCIMENTO           		date,
   DATA_PAGAMENTO       		date,
   ULTIMA_ATUALIZACAO   		date,
   USUARIO_ULTIMA_ATUALIZACAO   varchar(100),
   USUARIO_CRIACAO      		varchar(100),
   DATA_CRIACAO         		date
   FOREIGN KEY (CLIENTE_ID) REFERENCES CLIENTE(COD)
);

INSERT INTO CLIENTE (NOME) VALUES ('John');
INSERT INTO CLIENTE (NOME) VALUES ('Bruno');
INSERT INTO CLIENTE (NOME) VALUES ('Vinicius');
INSERT INTO CLIENTE (NOME) VALUES ('Miguel');
