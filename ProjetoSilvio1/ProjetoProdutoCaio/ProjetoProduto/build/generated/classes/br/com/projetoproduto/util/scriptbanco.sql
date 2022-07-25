create table produto(
	idproduto serial not null,
	descproduto varchar(40),
	marcaproduto varchar(40),
	modeloproduto varchar(40),
	valorproduto numeric(9,2),
	constraint pk_produto primary key(idproduto)
);

create table tipocarro(
	idtipocarro serial not null,
	nometipocarro varchar(30),
	constraint pk_tipocarro primary key(idtipocarro)
)

create table carro(
	idcarro serial not null,
	anocarro integer,
	modelocarro integer,
	nrportascarro integer,
	idproduto integer,
	idtipocarro integer,
	constraint pk_carro primary key(idcarro),
	constraint fk_carro_tipocarro foreign key(idtipocarro) references tipocarro(idtipocarro),
	constraint fk_carro_produto foreign key(idproduto) references produto(idproduto) ON DELETE CASCADE
);

insert into tipocarro (idtipocarro, nometipocarro) values (3, 'Vam');


select * from carro c inner join produto p on c.idproduto = p.idproduto where idcarro = 1