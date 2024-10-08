use spring;
create table anc_anuncio (
 anc_id bigint primary key auto_increment,
 anc_nome_produto varchar(100) not null,
 anc_descricao varchar(200),
 anc_data_hora_cadastro datetime not null,
 anc_preco float not null,
 anc_peso float 
);
insert into anc_anuncio (anc_nome_produto, anc_data_hora_cadastro, anc_preco, anc_peso)
 values ('Resistência 6800w', '2024-03-15 23:59:59', 41.5, 0.2),
 ('Liquidificador', current_timestamp(), 240, null);