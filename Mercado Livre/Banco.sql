CREATE TABLE contatos (
nome VARCHAR(50) NOT NULL,
sobrenome VARCHAR(25) NOT NULL,
e-mail VARCHAR (70) NOT NULL,
senha VARCHAR (20) NOT NULL
);

insert into contatos values ("Anakin", "Skywalker","anakin.skywalker@jedi.com", AES_ENCRYPT("12345"));
insert into contatos values ("Darth", "Vader","darth,vader@imperio.com", AES_ENCRYPT("123456"));
insert into contatos values ("Leia", "Organa", "leia.organa@senado.com", AES_ENCRYPT("1233456"));
insert into contatos values ("Luck", "Skywalker", "luck.skkywalker@fazenda.com", AES_ENCRYPT ("123456")); 


