create table produto(
	id serial not null,
	fornecedor varchar(40),
	preco numeric(9,2),
	constraint pk_produto primary key(id)
);

create table livro(
	id serial not null,
	idautor int not null,
	edicao int not null,
	paginas int not null,
	constraint pk_livro primary key(id)
)

create table autor(
	id serial not null,
	nomeautor varchar(40),
	constraint pk_autor primary key(id)
);