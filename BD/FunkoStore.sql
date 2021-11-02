-- verificacion si la base de datos existe
drop database if exists FunkoStore;

-- creacion de la base de datos
create database FunkoStore;

use FunkoStore;



-- creacion de tablas
create table tb_cliente(
cod_cli int(5) not null,
nom_cli varchar(50) not null,
ape_cli varchar(50) not null,
fec_nac_cli date not null,
email_cli varchar(70) not null,
dni_cli char(8) not null,
tel_cli char(9) not null,
dir_cli varchar(150) not null,
distrito  varchar(50) not null
);

create table tb_tipo_pago(
cod_tip_pag char(5) not null,
nom_tip_pag varchar(50) not null,
desc_tip_pag varchar(100) not null,
estado char(1) not null
);

create table tb_categoria(
cod_cat varchar(5) not null,
nom_cat varchar(50) not null,
desc_cat varchar(100) not null
);

create table tb_producto(
cod_prod int (5) not null,
nom_prod varchar(50) not null,
desc_prod varchar(100) not null,
img_prod varchar(255) not null,
cod_cat char(5) not null,
stock int not null,
precio decimal(6,2) not null
);

create table tb_rol(
cod_rol char(5) not null,
nom_rol varchar(50) not null,
desc_rol varchar(100) not null
);

create table tb_personal(
cod_per char(5) not null,
nom_per varchar(50) not null,
ape_per varchar(50) not null,
fec_nac_per date not null,
email_per varchar(100) not null,
dni_per char(8) not null,
tel_per char(9) not null,
dir_per varchar(150) not null,
cod_rol char(5) not null
);

create table tb_usuario(
cod_per int (5) not null,
user char(10) not null,
pass char(10) not null,
cod_recu char(8) not null,
flg_recu char(1) not null,
estado char(1) not null,
fecha_reg datetime default now()
);

create table tb_boleta(
nro_bol int auto_increment primary key,
cod_per char(5) not null,
cod_cli char(5) not null,
cod_tip_pag char(5) not null,
total decimal(6,2) not null,
fecha_reg datetime not null
);

create table tb_deta_boleta(
nro_bol int not null,
cod_prod char(5) not null,
cantidad int not null,
precio decimal(6,2) not null,
total decimal(6,2) not null
);

create table tb_menu(
cod_menu char(5) not null,
nom_menu varchar(50) not null,
desc_menu varchar(100) not null,
icono_menu varchar(150) not null,
ord_menu int not null,
ruta_menu varchar(250) not null,
estado char(1) not null
);

create table tb_permiso_usuario(
cod_rol char(5) not null,
cod_menu char(5) not null,
estado char(1) not null 
);

-- contraints de tablas
alter table tb_cliente add constraint PK_tbcliente_cod_cli primary key (cod_cli);

alter table tb_tipo_pago add constraint PK_tb_tipo_pago_cod_cat primary key (cod_tip_pag);
alter table tb_tipo_pago add constraint CHK_tb_tipo_pago_estado check (estado in('A', 'I') );

alter table tb_categoria add constraint PK_tb_categoria_cod_cat primary key (cod_cat);


alter table tb_producto add constraint PK_tb_producto_cod_prod primary key (cod_prod);



alter table tb_rol add constraint PK_tb_rol_cod_rol primary key (cod_rol);


alter table tb_personal add constraint PK_tb_personal_cod_per primary key (cod_per);

alter table tb_personal add constraint FK_tb_personal_cod_rol foreign key (cod_rol) references tb_rol (cod_rol);

alter table tb_usuario add constraint CHK_tb_usuario_flg_recu check (flg_recu in('1', '0'));



-- alter table tb_boleta add constraint PK_tb_boleta_nro_bol primary key (nro_bol);

alter table tb_boleta add constraint FK_tb_boleta_cod_tip_pag foreign key (cod_tip_pag) references tb_tipo_pago (cod_tip_pag);


alter table tb_deta_boleta add constraint FK_tb_deta_boleta_nro_bol foreign key (nro_bol) references tb_boleta (nro_bol);


alter table tb_menu add constraint PK_tb_menu_cod_menu primary key (cod_menu);
alter table tb_menu add constraint CHK_tb_menu_estado check (estado in('A', 'I') );

alter table tb_permiso_usuario add constraint FK_tb_permiso_usuario_cod_rol foreign key (cod_rol) references tb_rol (cod_rol);
alter table tb_permiso_usuario add constraint FK_tb_permiso_usuario_cod_menu foreign key (cod_menu) references tb_menu (cod_menu);
alter table tb_permiso_usuario add constraint CHK_tb_permiso_usuario_estado check (estado in('A', 'I') );




-- insert tb_menu
insert into tb_menu values('MEN01', 'Mantenimiento', 'Pagina principal','fas fa-store-alt', 1, '', 'A');
insert into tb_menu values('MEN02', 'Ventas', 'Modulo de ventas', 'fas fa-cash-register', 2, 'vent', 'A');
insert into tb_menu values('MEN03', 'Boleta', 'Modulo de visualizar boletas', 'fas fa-receipt', 3, 'Bol?optPeticion=l', 'A');
insert into tb_menu values('MEN04', 'Reporte', 'Modulo de reporte', 'fas fa-book', 4, 'repo?optPeticion=l', 'A');
insert into tb_menu values('MEN05', 'Soporte', 'Modulo de soporte', 'fas fa-users', 5, 'Soporte.jsp', 'A');


-- insert tb_rol
insert into tb_rol values('ROL01', 'Administrador', 'Administra todos los modulos del dashboard');
insert into tb_rol values('ROL02', 'Vendedor', 'Encargado solo de vender');


-- insert tb_personal 
insert into tb_personal values('001', 'Alvaro James Anthony', 'Javier Reyes', '2001-11-08', 'anthony.tnt.024@gmail.com', '74543018', '928317977', 'Av. Benavides 1223, Primer Piso', 'ROL01');
insert into tb_personal values('002', 'Sunny', 'Jurado', '1999-11-08', 'sunny@gmail.com', '15975364', '987654321', 'Av. Benavides 1223, Primer Piso', 'ROL02');
insert into tb_personal values('003', 'Jose', 'Medina', '1999-11-08', 'jose@gmail.com', '45678908', '951357456', 'Av. Benavides 1223, Primer Piso', 'ROL01');


-- insert tb_usuario
insert into tb_usuario(cod_per, user, pass, cod_recu, flg_recu, estado) values(1, 'AJAVIER', '12345', 'A', '0', 'A');
insert into tb_usuario(cod_per, user, pass, cod_recu, flg_recu, estado) values(2, 'SJURADO', '12345', 'A', '0', 'A');
insert into tb_usuario(cod_per, user, pass, cod_recu, flg_recu, estado) values(3, 'JOSE', '12345', 'A', '0', 'A');


-- insert tb_permiso_usuario
insert into tb_permiso_usuario values('ROL01', 'MEN01', 'A');
insert into tb_permiso_usuario values('ROL01', 'MEN02', 'A');
insert into tb_permiso_usuario values('ROL01', 'MEN03', 'A');
insert into tb_permiso_usuario values('ROL01', 'MEN04', 'A');
insert into tb_permiso_usuario values('ROL01', 'MEN05', 'A');
insert into tb_permiso_usuario values('ROL02', 'MEN02', 'A');


-- insert tb_clientes
insert into tb_cliente values(01, 'Jose', 'Medina','2000-09-04','CLI01@hotmail.com','25896314', '961123456','AV_Sol','Chorrillos');
insert into tb_cliente values(02, 'Juan', 'Merino','1998-08-08','CLI02@hotmail.com','98774152', '912345678','AV_Miraflores','Miraflores');
insert into tb_cliente values(03, 'Luis', 'Perez','1999-07-08','CLI03@hotmail.com','74175378', '961654789','AV_Comas','Comas');
insert into tb_cliente values(04, 'Ana', 'Moreno','2000-08-09','CLI04@hotmail.com','78941537', '961269712','AV_El sol','Barranco');
insert into tb_cliente values(05, 'Karina', 'Sanchez','1999-12-05','CLI05@hotmail.com','78945621', '961123567','AV_solares','La Molina');
insert into tb_cliente values(06, 'Martin', 'Ramirez','1997-11-09','CLI06@hotmail.com','45628936', '961586123','AV_Andromeda','Surco');
insert into tb_cliente values(07, 'Pilar', 'Malca','2001-03-05','CLI07@hotmail.com','12398754', '961874125','AV_Miraflores','MIraflores');
insert into tb_cliente values(08, 'Geraldine', 'Garay','1999-09-10','CLI08@hotmail.com','15896394', '966235896','AV_Matellino','Chorrillos');
insert into tb_cliente values(09, 'Alejandra', 'Pinelo','2000-02-11','CLI09@hotmail.com','12896311', '981269312','AV_Chorrilos','Chorrillos');
insert into tb_cliente values(10, 'Andrea', 'Castro','2000-05-12','CLI10@hotmail.com','32896313', '912659766','AV_Gaviotas','San Isidro');


-- insert tb_categoria
insert into tb_categoria values(01, "Marvel", 'Superheroes');
insert into tb_categoria values(02, 'Naruto', 'Nijas');
insert into tb_categoria values(03, 'Dragon BAll', 'Guerreros Z');
insert into tb_categoria values(04, 'DC', 'Superheroes');


-- insert tb_producto
insert into tb_producto values( 01, 'FUNKO Capitan America', 'Superheroes','https://asgardstores.com/252-large_default/funko-pop-capitan-america.jpg',1,'2000','70.00');
insert into tb_producto values(02, 'FUNKO Iron Man', 'Superheroes','https://assets.frikily.com/wp-content/uploads/2021/02/Funko-Pop-Iron-Man-Guantelete.jpg',1,'2000','70.00');
insert into tb_producto values( 03, 'FUNKO Spiderman', 'Superheroes','https://asgardstores.com/261-large_default/funko-pop-spiderman.jpg',1,'2000','70.00');
insert into tb_producto values( 04, 'FUNKO Naruto', 'Nijas','https://phantom.pe/pub/media/catalog/product/cache/71a032b60710d907b279b6023a79a12b/f/u/funko-pop-naruto-shippuden-823-naruto-with-noodles-1_1607917279.jpg',2,'20','70.00');
insert into tb_producto values(05, 'FUNKO Sasuke', 'Nijas','https://images-na.ssl-images-amazon.com/images/I/41SORCAUA%2BL._SX500_SY500_CR,0,0,500,500_.jpg',2,'2000','70.00');
insert into tb_producto values(06, 'FUNKO Sakura', 'Nijas','https://images-na.ssl-images-amazon.com/images/I/51aI%2BrMgjoL._AC_SY879_.jpg',2,'2000','70.00');   
insert into tb_producto values( 07, 'FUNKO Goku', 'Guerreros Z','https://phantom.pe/pub/media/catalog/product/cache/71a032b60710d907b279b6023a79a12b/1/_/1_funko_pop_dragon_ball_1_16.jpg',3,'20','70.00');
insert into tb_producto values(08, 'FUNKO Gohan', 'Guerreros Z','https://http2.mlstatic.com/D_NQ_NP_667152-MPE42562998471_072020-O.jpg',3,'2000','70.00');
insert into tb_producto values(09, 'FUNKO Vegeta', 'Guerreros Z','https://cdn.lumingo.com/medias/0100540119-000000000004867879-0-c515Wx515H?context=bWFzdGVyfGltYWdlc3wzNDczMTR8aW1hZ2UvcG5nfGltYWdlcy9oMjAvaGE3Lzk0NTA0NTg0MTUxMzQucG5nfDE5ZDVlMjVmYzNhOTg2Yzg0NjMwZTI4Zjc1MjU1ZTVlNTU3NDBmODI0NTM5NDdiOTA2OWZkY2M0ODg1NDZlOGI',3,'20','70.00');
insert into tb_producto values(10, 'FUNKO Flash', 'Superheroes','https://cdn.shopify.com/s/files/1/2437/4099/products/7ecf516dd5ee4f959a654a6e114cc3ffxl_1200x1200.jpg?v=1611941496',4,'2000','70.00');
insert into tb_producto values(11, 'FUNKO Superman', 'Superheroes','https://i.pinimg.com/474x/30/fc/15/30fc156463f2b3a28e484b1b1418f76e.jpg',4,'2000','70.00');
insert into tb_producto values(12, 'FUNKO Aquaman ', 'Superheroes','https://http2.mlstatic.com/D_NQ_NP_653239-MPE32061568128_092019-O.jpg',4,'2000','70.00');

-- insert tb_tipo_pago
insert into tb_tipo_pago values('TP001', 'EFECTIVO', 'PAGO EN EFECTIVO', 'A');


drop procedure if exists `usp_validarAcceso`;
DELIMITER $$
create procedure `usp_validarAcceso`(user char(10), pass char(10))
begin
	select per.* from tb_usuario as usu 
    inner join tb_personal as per on usu.cod_per = per.cod_per 
    where usu.user = user and usu.pass = pass limit 1;
end$$
DELIMITER ;

drop procedure if exists `usp_listarMenuPorRol`;
DELIMITER $$
create procedure `usp_listarMenuPorRol`(codRol varchar(5))
begin
	select mn.* from tb_permiso_usuario as pu 
    inner join tb_menu as mn on pu.cod_menu = mn.cod_menu 
    where pu.estado = 'A' and mn.estado = 'A' and pu.cod_rol = codRol;
end$$
DELIMITER ;


drop procedure if exists `usp_listar_clientes`;
DELIMITER $$
create procedure `usp_listar_clientes`()
BEGIN
select cod_cli,nom_cli,ape_cli,dir_cli,distrito,email_cli,tel_cli  from tb_cliente;
END $$
DELIMITER ;


drop procedure if exists `usp_lista_producto`;
DELIMITER $$
create procedure `usp_lista_producto`()
BEGIN
select cod_prod, nom_prod, desc_prod, img_prod, cod_cat, stock, precio, estado from tb_producto ;
END $$
DELIMITER ;


drop procedure if exists `usp_lista_personal`;
DELIMITER $$
create procedure `usp_lista_personal`()
BEGIN
select cod_per, nom_per,ape_per,email_per,tel_per,cod_rol,estado from tb_personal ;
END $$
DELIMITER ;

call usp_lista_personal;


drop procedure if exists `usp_procesarVenta`;
DELIMITER $$
create procedure`usp_procesarVenta`(codCli varchar(20), codVend varchar(20), tipoPago varchar(20), total decimal(6,2))
begin
    SET SQL_SAFE_UPDATES = 0;
    
    insert tb_boleta values(null, codVend, codCli, tipoPago , total, now());
	select LAST_INSERT_ID();
end $$
DELIMITER ;

drop procedure if exists `usp_procesarVentaDetalle`;
DELIMITER $$
create procedure`usp_procesarVentaDetalle`(codVenta int,  codProd varchar(20), cant int, precio decimal(6.2))
begin
    SET SQL_SAFE_UPDATES = 0;
    
    insert tb_deta_boleta values(codVenta, codProd, cant, precio , (cant * precio));
    update tb_producto set stock = stock - cant where cod_prod = codProd;
	select LAST_INSERT_ID();
end $$
DELIMITER ;

select * from tb_usuario
;
