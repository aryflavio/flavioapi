CREATE table Contato(
    id bigint not null auto_increment primary key,
    descricao varchar(255),
    contato varchar(255),
    idcliente bigint not null
);
Alter table Contato  add CONSTRAINT FK_Contato_Cliente Foreign Key(idcliente) REFERENCES cliente(id);
INSERT into contato(descricao, contato, idcliente) VALUES('policial', '99856234',4);
INSERT into contato(descricao, contato, idcliente) VALUES('professora', '998745213',5);
INSERT into contato(descricao, contato, idcliente) VALUES('cozinheira', '91875412',2);
INSERT into contato(descricao, contato, idcliente) VALUES('influenciador', '78455421',3);
INSERT into contato(descricao, contato, idcliente) VALUES('programador', '98754236',1);