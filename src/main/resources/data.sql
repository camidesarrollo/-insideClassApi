USE [insideClass]

SET IDENTITY_INSERT [t_region] ON

INSERT INTO [dbo].[t_region]
           ([region_id]
		   ,[region_nombre]
		   ,[region_abreviatura]
           ,[region_capital])
     VALUES
	(1,'Arica y Parinacota','AP','Arica'),
	(2,'Tarapacá','TA','Iquique'),
	(3,'Antofagasta','AN','Antofagasta'),
	(4,'Atacama','AT','Copiapó'),
	(5,'Coquimbo','CO','La Serena'),
	(6,'Valparaiso','VA','valparaíso'),
	(7,'Metropolitana de Santiago','RM','Santiago'),
	(8,'Libertador General Bernardo OHiggins','OH','Rancagua'),
	(9,'Maule','MA','Talca'),
	(10,'Ñuble','NB','Chillán'),
	(11,'Biobío','BI','Concepción'),
	(12,'La Araucanía','IAR','Temuco'),
	(13,'Los Ríos','LR','Valdivia'),
	(14,'Los Lagos','LL','Puerto Montt'),
	(15,'Aysén del General Carlos Ibáñez del Campo','AI','Coyhaique'),
	(16,'Magallanes y de la Antártica Chilena','MG','Punta Arenas');

	SET IDENTITY_INSERT [t_region] OFF



	SET IDENTITY_INSERT [t_deprov] ON

    INSERT INTO [dbo].[t_deprov]
               ([deprov_id]
    		   ,[deprov_responsable]
    		   ,[deprov_correo]
               ,[deprov_direccion]) VALUES
    (1, 'Carlos Alberto Bahamondes Valdés', 'carlos.bahamondes@mineduc.cl', 'Arturo Prat N° 305 2do. Piso, Arica'),
    (2, 'Carmen Aurora Barrera Hennings  ', 'carmen.barrera@mineduc.cl', 'Zegers Nº 159, Iquique.'),
    (3, 'Paulina Javiera Veliz Suazo  ', 'paulina.veliz@mineduc.cl', 'Coquimbo Nº 847, Antofagasta'),
    (4, 'Walter Alex Aranzaes Guerrero ', 'walter.aranzaes@mineduc.cl', 'Bañados Espinoza Nº 1854, Calama'),
    (5, 'Oriana Escobar Delgado ', 'oriana.escobar@mineduc.cl', 'Chañarcillo n°550, Copiapó'),
    (6, 'Mauricio Antonio Lopez Silva  ', 'mauricio.lopez@mineduc.cl', 'Ramírez nº740, Vallenar'),
    (7, 'Francisco Rafael Alvear Novoa  ', 'francisco.alvear@mineduc.cl', 'Pedro Pablo Nuñez 664, La Serena.'),
    (8, 'Susana Rosa Torres Pérez  ', 'susana.torres@mineduc.cl', 'Miguel Aguirre Nº 651, Ovalle'),
    (9, 'Alfonso Erick Zelada López  ', 'erick.zelada@mineduc.cl', 'Buin nº 724, Illapel'),
    (10, 'María Alejandra Torres Jeldes  ', 'maria.torresj@mineduc.cl', 'Arlegui Nº 852, Viña del Mar'),
    (11, 'Miguel Enrique Caro Montecinos  ', 'miguel.caro@mineduc.cl', 'Toro Mazote nº 1232, San Felipe'),
    (12, 'Marta Mercedes Renard Vargas  ', 'marta.renard@mineduc.cl', 'Pudeto 356, Quillota.'),
    (13, 'Sergio Mauricio Baeza Cabello  ', 'sergio.baeza@mineduc.cl', 'Avenida Barros Lucos N° 1613, Piso N° 11, Oficina N° 1101, Barrancas, San Antonio'),
    (14, 'Andrea De Lourdes Maldonado Valdivia  ', 'andrea.maldonado@mineduc.cl', 'Bulnes N° 215, Rancagua'),
    (15, 'Andrea Carolina Mira Silva  ', 'andrea.mira@mineduc.cl', 'Valdivia n°810, San Fernando'),
    (16, 'José Celín Sánchez García  ', 'jose.sanchez@mineduc.cl', 'Anibal Pinto 507, Pichilemu'),
    (17, 'Rodrigo Alejandro Castro Trejo  ', 'rodrigo.castrot@mineduc.cl', 'Merced n°211, Curicó'),
    (18, 'Juan Pedro Muñoz Barrios  ', 'juan.munozb@mineduc.cl', '5 Norte nº 1360, Talca'),
    (19, 'Carolina Andrea Daigre Núñez  ', 'carolina.daigre@mineduc.cl', 'Yumbel n°698, Linares'),
    (20, 'Edna Margarita Jara Montecinos  ', 'edna.jara@mineduc.cl', 'Pérez n°350, Cauquenes'),
    (21, 'María Fernanda Rojas Obreque  ', 'mariaf.rojas@mineduc.cl', 'Avenida Libertad s/n, Edificios Públicos, Chillán'),
    (22, 'Ester de las Mercedes Cea Urra  ', 'ester.cea@mineduc.cl', 'Saavedra N°512, Lebu'),
    (23, 'Rossemarie Soledad Sanchez Ferrera  ', 'rossemarie.sanchez@mineduc.cl', 'Caupolicán S/N Piso 3 Edificio Público, Los Ángeles'),
    (24, 'Matias Andres Aravena Moraga  ', 'matias.aravena@mineduc.cl', 'Rengo N°26, Concepción'),
    (25, 'Edinson Roberto Contreras Canario  ', 'edinson.contreras@mineduc.cl', 'Claro Solar n°1075, Temuco'),
    (26, 'Diego Nicolás Vrsalovic Huenumilla  ', 'diego.vrsalovic@mineduc.cl', 'Claro Solar n°1075, Temuco'),
    (27, 'Marco Andrés Benedetti Morales  ', 'marco.benedetti@mineduc.cl', 'Pedro Aguirre Cerda n°212, Angol'),
    (28, 'Luis Enrique Barrios Acevedo  ', 'enrique.barrios@mineduc.cl', 'Carlos Andwandter N° 708, Valdivia'),
    (29, 'Luis Peroti Navarro  ', 'luis.peroti@mineduc.cl', 'Esmeralda n°412, La Unión'),
    (30, 'Giovani Hernan Aravena Oyarzun  ', 'giovani.aravena@mineduc.cl', 'Ramírez n°559, Osorno'),
    (31, 'José Gerardo Saldivia Ampuero  ', 'gerardo.saldivia@mineduc.cl', 'Rancagua N° 203, Puerto Montt'),
    (32, 'Lorena Soledad Romero Delgado  ', 'lorena.romero@mineduc.cl', 'O’Higgins n°523, Castro'),
    (33, 'Tamara Marisol Galindo Casanova  ', 'tamara.galindo@mineduc.cl', 'Juan Todesco°106, Chaitén'),
    (34, 'Yoal Rennuf Díaz Reyes  ', 'yoal.diaz@mineduc.cl', 'Pedro Dussen Nº 229, Coyhaique'),
    (35, 'Carolina Olvido Álvarez Antonin  ', 'carolina.alvarez@mineduc.cl', 'El Ovejero n°0285-B, Punta Arenas'),
    (36, 'Daniela Ríos Canales  ', 'daniela.rios@mineduc.cl', 'San Martin nº 642, Santiago'),
    (37, 'Jorge Antonio Figueroa Figueroa  ', 'jorgea.figueroa@mineduc.cl', 'San Martin nº 642, Santiago'),
    (38, 'Orlando Gabriel Vigorena González  ', 'orlando.vigorena@mineduc.cl', 'Rosita Renard n°1191, Ñuñoa'),
    (39, 'Hugo Ignacio Ovalle Ovalle  ', 'hugo.ovalle@mineduc.cl', 'San Martin nº 642, Santiago'),
    (40, 'Osvaldo Patricio Maldonado Pinto  ', 'osvaldo.maldonado@mineduc.cl', 'Balmaceda 371, (segundo piso), Puente Alto.'),
    (41, 'Cristián Ernesto Cartagena Vidal  ', 'cristian.cartagena@mineduc.cl', 'Balmaceda n°1133, Talagante'),
    (42, 'Ricardo Adrián Bustamante Cornejo ', ' ricardo.bustamante@mineduc.cl', 'Ricardo Morales N° 3369, San Miguel')

    SET IDENTITY_INSERT [t_deprov] OFF

		SET IDENTITY_INSERT [t_provincias] ON

	INSERT INTO [dbo].[t_provincias]
               ([provincia_id],
    		   [provincia_nombre]
               ,[provincia_region_id])
         VALUES
        (1,'Arica y Parinacota',1),
        (2,'Iquique',2),
        (3,'El Tamarugal',2),
        (4,'Tocopilla',3),
        (5,'El Loa',3),
        (6,'Antofagasta',3),
        (7,'Chañaral',4),
        (8,'Copiapó',4),
        (9,'Huasco',4),
        (10,'Elqui',5),
        (11,'Limarí',5),
        (12,'Choapa',5),
        (13,'Petorca',6),
        (14,'Los Andes',6),
        (15,'San Felipe de Aconcagua',6),
        (16,'Quillota',6),
        (17,'Valparaiso',6),
        (18,'San Antonio',6),
        (19,'Isla de Pascua',6),
        (20,'Marga Marga',6),
        (21,'Chacabuco',7),
        (22,'Santiago',7),
        (23,'Cordillera',7),
        (24,'Maipo',7),
        (25,'Melipilla',7),
        (26,'Talagante',7),
        (27,'Cachapoal',8),
        (28,'Colchagua',8),
        (29,'Cardenal Caro',8),
        (30,'Curicó',9),
        (31,'Talca',9),
        (32,'Linares',9),
        (33,'Cauquenes',9),
        (34,'Diguillín',10),
        (35,'Ñuble',10),
        (36,'Punilla',10),
        (37,'Bio Bío',11),
        (38,'Concepción',11),
        (39,'Arauco',11),
        (40,'Malleco',12),
        (41,'Cautín',12),
        (42,'Valdivia',13),
        (43,'Ranco',13),
        (44,'Osorno',14),
        (45,'Llanquihue',14),
        (46,'Chiloé',14),
        (47,'Palena',14),
        (48,'Coyhaique',15),
        (49,'Aysén',15),
        (50,'General Carrera',15),
        (51,'Capitán Prat',15),
        (52,'Última Esperanza',16),
        (53,'Magallanes',16),
        (54,'Tierra del Fuego',16),
        (55,'Antártica Chilena',16)

    SET IDENTITY_INSERT [t_provincias] OFF

USE [insideClass]

SET IDENTITY_INSERT [t_comunas] ON

INSERT INTO [dbo].[t_comunas]
(comunas_id, comunas_nombre, comunas_provincia_id,comunas_deprov_id)
     VALUES
	(1,'Arica',1,1),
    	(2,'Camarones',1,1),
    	(3,'General Lagos',2,1),
    	(4,'Putre',2,1),
    	(5,'Alto Hospicio',3,2),
    	(6,'Iquique',3,2),
    	(7,'Camiña',4,2),
    	(8,'Colchane',4,2),
    	(9,'Huara',4,2),
    	(10,'Pica',4,2),
    	(11,'Pozo Almonte',4,2),
      	(12,'Tocopilla',5,3),
      	(13,'María Elena',5,3),
    	(14,'Calama',6,4),
    	(15,'Ollague',6,4),
    	(16,'San Pedro de Atacama',6,4),
      	(17,'Antofagasta',7,3),
    	(18,'Mejillones',7,3),
    	(19,'Sierra Gorda',7,3),
    	(20,'Taltal',7,2),
    	(21,'Chañaral',8,4),
    	(22,'Diego de Almagro',8,5),
      	(23,'Copiapó',9,5),
    	(24,'Caldera',9,5),
    	(25,'Tierra Amarilla',9,5),
      	(26,'Vallenar',10,6),
    	(27,'Alto del Carmen',10,6),
    	(28,'Freirina',10,6),
    	(29,'Huasco',10,6),
    	(30,'La Serena',11,7),
      	(31,'Coquimbo',11,7),
      	(32,'Andacollo',11,7),
      	(33,'La Higuera',11,7),
      	(34,'Paihuano',11,7),
    	(35,'Vicuña',11,7),
    	(36,'Ovalle',12,8),
      	(37,'Combarbalá',12,8),
      	(38,'Monte Patria',12,8),
      	(39,'Punitaqui',12,8),
    	(40,'Río Hurtado',12,8),
    	(41,'Illapel',13,9),
    	(42,'Canela',13,9),
    	(43,'Los Vilos',13,9),
    	(44,'Salamanca',13,9),
    	(45,'La Ligua',14,12),
      	(46,'Cabildo',14,12),
    	(47,'Zapallar',14,12),
      	(48,'Papudo',14,12),
    	(49,'Petorca',14,12),
    	(50,'Los Andes',15,11),
    	(51,'San Esteban',15,11),
      	(52,'Calle Larga',15,11),
      	(53,'Rinconada',15,11),
    	(54,'San Felipe',16,11),
      	(55,'Llaillay',16,11),
      	(56,'Putaendo',16,11),
    	(57,'Santa María',16,11),
    	(58,'Catemu',16,11),
    	(59,'Panquehue',16,11),
      	(60,'Quillota',17,12),
      	(61,'La Cruz',17,12),
    	(62,'La Calera',17,12),
    	(63,'Nogales',17,12),
      	(64,'Hijuelas',17,12),
    	(65,'Valparaíso',18,10),
      	(66,'Viña del Mar',18,10),
    	(67,'Concón',18,10),
     	(68,'Quintero',18,10),
      	(69,'Puchuncaví',18,10),
    	(70,'Casablanca',18,10),
    	(71,'Juan Fernández',18,10),
    	(72,'San Antonio',19,13),
      	(73,'Cartagena',19,13),
    	(74,'El Tabo',19,13),
    	(75,'El Quisco',19,13),
    	(76,'Algarrobo',19,13),
    	(77,'Santo Domingo',19,13),
    	(78,'Isla de Pascua',20,10),
    	(79,'Quilpué',21,10),
    	(80,'Limache',21,12),
    	(81,'Olmué',21,12),
    	(82,'Villa Alemana',21,10),
    	(83,'Colina',22,36),
    	(84,'Lampa',22,36),
    	(85,'Tiltil',22,36),
    	(86,'Santiago',23,39),
    	(87,'Vitacura',23,38),
      	(88,'San Ramón',23,42),
    	(89,'San Miguel',23,39),
    	(90,'San Joaquín',23,39),
      	(91,'Renca',23,36),
    	(92,'Recoleta',23,36),
      	(93,'Quinta Normal',23,37),
    	(94,'Quilicura',23,36),
      	(95,'Pudahuel',23,37),
      	(96,'Providencia',23,38),
    	(97,'Peñalolén',23,38),
      	(98,'Pedro Aguirre Cerda',23,39),
    	(99,'Ñuñoa',23,38),
    	(100,'Maipú',23,37),
    	(101,'Macul',23,38),
    	(102,'Lo Prado',23,37),
    	(103,'Lo Espejo',23,42),
    	(104,'Lo Barnechea',23,38),
    	(105,'Las Condes',23,38),
    	(106,'La Reina',23,38),
    	(107,'La Pintana',23,40),
    	(108,'La Granja',23,42),
    	(109,'La Florida',23,40),
      	(110,'La Cisterna',23,42),
      	(111,'Independencia',23,36),
      	(112,'Huechuraba',23,36),
    	(113,'Estación Central',23,37),
      	(114,'El Bosque',23,42),
      	(115,'Conchalí',23,36),
      	(116,'Cerro Navia',23,37),
      	(117,'Cerrillos',23,37),
    	(118,'Puente Alto',24,38),
    	(119,'San José de Maipo',24,38),
      	(120,'Pirque',24,38),
    	(121,'San Bernardo',25,42),
    	(122,'Buin',25,42),
      	(123,'Paine',25,42),
    	(124,'Calera de Tango',25,42),
    	(125,'Melipilla',26,41),
    	(126,'Alhué',26,41),
    	(127,'Curacaví',26,41),
    	(128,'María Pinto',26,41),
    	(129,'San Pedro',26,41),
    	(130,'Isla de Maipo',27,41),
      	(131,'El Monte',27,41),
    	(132,'Padre Hurtado',27,41),
    	(133,'Peñaflor',27,41),
    	(134,'Talagante',27,41),
    	(135,'Codegua',28,14),
    	(136,'Coínco',28,14),
    	(137,'Coltauco',28,14),
    	(138,'Doñihue',28,14),
    	(139,'Graneros',28,14),
    	(140,'Las Cabras',28,14),
    	(141,'Machalí',28,14),
    	(142,'Malloa',28,14),
    	(143,'Mostazal',28,14),
    	(144,'Olivar',28,14),
    	(145,'Peumo',28,14),
    	(146,'Pichidegua',28,16),
    	(147,'Quinta de Tilcoco',28,14),
    	(148,'Rancagua',28,14),
    	(149,'Rengo',28,14),
    	(150,'Requínoa',28,14),
    	(151,'San Vicente de Tagua Tagua',28,14),
    	(152,'Chépica',29,15),
    	(153,'Chimbarongo',29,15),
    	(154,'Lolol',29,15),
      	(155,'Nancagua',29,15),
      	(156,'Palmilla',29,15),
      	(157,'Peralillo',29,15),
    	(158,'Placilla',29,15),
     	(159,'Pumanque',29,15),
    	(160,'San Fernando',29,15),
    	(161,'Santa Cruz',29,15),
    	(162,'La Estrella',30,16),
    	(163,'Litueche',30,16),
    	(164,'Marchigüe',30,16),
    	(165,'Navidad',30,16),
    	(166,'Paredones',30,16),
    	(167,'Pichilemu',30,16),
    	(168,'Curicó',31,17),
    	(169,'Hualañé',31,17),
    	(170,'Licantén',31,17),
     	(171,'Molina',31,17),
    	(172,'Rauco',31,17),
    	(173,'Romeral',31,17),
    	(174,'Sagrada Familia',31,17),
    	(175,'Teno',31,17),
    	(176,'Vichuquén',31,17),
    	(177,'Talca',32,18),
    	(178,'San Clemente',32,18),
    	(179,'Pelarco',32,18),
    	(180,'Pencahue',32,18),
    	(181,'Maule',32,18),
    	(182,'San Rafael',32,18),
    	(183,'Curepto',33,18),
    	(184,'Constitución',32,18),
    	(185,'Empedrado',32,18),
    	(186,'Río Claro',32,18),
      	(187,'Linares',33,19),
    	(188,'San Javier',33,19),
    	(189,'Parral',33,19),
    	(190,'Villa Alegre',33,19),
    	(191,'Longaví',33,19),
    	(192,'Colbún',33,19),
    	(193,'Retiro',33,19),
    	(194,'Yerbas Buenas',33,19),
      	(195,'Cauquenes',34,20),
    	(196,'Chanco',34,20),
    	(197,'Pelluhue',34,20),
    	(198,'Bulnes',35,21),
    	(199,'Chillán',35,21),
    	(200,'Chillán Viejo',35,21),
    	(201,'El Carmen',35,21),
    	(202,'Pemuco',35,21),
    	(203,'Pinto',35,21),
    	(204,'Quillón',35,21),
    	(205,'San Ignacio',35,21),
    	(206,'Yungay',35,21),
    	(207,'Cobquecura',35,21),
    	(208,'Coelemu',35,21),
    	(209,'Ninhue',35,21),
    	(210,'Portezuelo',35,21),
    	(211,'Quirihue',35,21),
    	(212,'Ránquil',35,21),
    	(213,'Treguaco',35,21),
    	(214,'San Carlos',35,21),
    	(215,'Coihueco',35,21),
    	(216,'San Nicolás',35,21),
    	(217,'Ñiquén',35,21),
    	(218,'San Fabián',35,21),
    	(219,'Alto Biobío',37,23),
    	(220,'Antuco',37,23),
    	(221,'Cabrero',37,23),
    	(222,'Laja',37,23),
    	(223,'Los Ángeles',37,23),
    	(224,'Mulchén',37,23),
    	(225,'Nacimiento',37,23),
    	(226,'Negrete',37,23),
    	(227,'Quilaco',37,23),
    	(228,'Quilleco',37,23),
    	(229,'San Rosendo',37,23),
    	(230,'Santa Bárbara',37,23),
    	(231,'Tucapel',37,23),
    	(232,'Yumbel',37,23),
    	(233,'Concepción',38,24),
    	(234,'Coronel',38,24),
    	(235,'Chiguayante',38,24),
    	(236,'Florida',38,24),
    	(237,'Hualpén',38,24),
    	(238,'Hualqui',38,24),
    	(239,'Lota',38,24),
    	(240,'Penco',38,24),
    	(241,'San Pedro de La Paz',38,24),
    	(242,'Santa Juana',38,24),
    	(243,'Talcahuano',38,24),
    	(244,'Tomé',38,24),
    	(245,'Arauco',35,22),
    	(246,'Cañete',35,22),
    	(247,'Contulmo',35,22),
    	(248,'Curanilahue',35,22),
    	(249,'Lebu',35,22),
    	(250,'Los Álamos',35,22),
    	(251,'Tirúa',35,22),
    	(252,'Angol',40,27),
    	(253,'Collipulli',40,27),
    	(254,'Curacautín',40,27),
    	(255,'Ercilla',40,27),
    	(256,'Lonquimay',40,27),
    	(257,'Los Sauces',40,27),
    	(258,'Lumaco',40,27),
    	(259,'Purén',40,27),
    	(260,'Renaico',40,27),
    	(261,'Traiguén',40,27),
    	(262,'Victoria',40,27),
    	(263,'Temuco',41,26),
    	(264,'Carahue',41,26),
    	(265,'Cholchol',41,26),
    	(266,'Cunco',41,26),
    	(267,'Curarrehue',41,25),
    	(268,'Freire',41,25),
    	(269,'Galvarino',41,26),
    	(270,'Gorbea',41,25),
    	(271,'Lautaro',41,26),
    	(272,'Loncoche',41,25),
    	(273,'Melipeuco',41,26),
    	(274,'Nueva Imperial',41,26),
    	(275,'Padre Las Casas',41,25),
    	(276,'Perquenco',41,26),
    	(277,'Pitrufquén',41,25),
    	(278,'Pucón',41,25),
    	(279,'Saavedra',41,26),
    	(280,'Teodoro Schmidt',41,25),
    	(281,'Toltén',41,25),
    	(282,'Vilcún',41,26),
    	(283,'Villarrica',41,25),
    	(284,'Valdivia',42,28),
    	(285,'Corral',42,28),
    	(286,'Lanco',42,28),
    	(287,'Los Lagos',42,28),
    	(288,'Máfil',42,28),
    	(289,'Mariquina',42,28),
    	(290,'Paillaco',42,28),
    	(291,'Panguipulli',42,28),
    	(292,'La Unión',43,29),
    	(293,'Futrono',43,29),
    	(294,'Lago Ranco',43,29),
    	(295,'Río Bueno',43,29),
    	(296,'Osorno',44,30),
    	(297,'Puerto Octay',44,30),
    	(298,'Purranque',44,30),
    	(299,'Puyehue',44,30),
    	(300,'Río Negro',44,30),
    	(301,'San Juan de la Costa',44,30),
    	(302,'San Pablo',44,30),
    	(303,'Calbuco',45,31),
    	(304,'Cochamó',45,31),
    	(305,'Fresia',45,31),
    	(306,'Frutillar',45,31),
    	(307,'Llanquihue',45,31),
    	(308,'Los Muermos',45,31),
    	(309,'Maullín',45,31),
    	(310,'Puerto Montt',45,31),
    	(311,'Puerto Varas',45,31),
    	(312,'Ancud',46,32),
    	(313,'Castro',46,32),
    	(314,'Chonchi',46,32),
    	(315,'Curaco de Vélez',46,32),
    	(316,'Dalcahue',46,32),
    	(317,'Puqueldón',46,32),
    	(318,'Queilén',46,32),
    	(319,'Quellón',46,32),
    	(320,'Quemchi',46,32),
    	(321,'Quinchao',46,32),
    	(322,'Chaitén',46,32),
    	(323,'Futaleufú',47,33),
    	(324,'Hualaihué',47,33),
    	(325,'Palena',47,33),
    	(326,'Lago Verde',48,34),
    	(327,'Coihaique',48,34),
    	(328,'Aysén',48,34),
    	(329,'Cisnes',48,34),
    	(330,'Guaitecas',48,34),
    	(331,'Río Ibáñez',48,34),
    	(332,'Chile Chico',48,34),
    	(333,'Cochrane',48,34),
    	(334,'OHiggins',48,34),
    	(335,'Tortel',48,34),
    	(336,'Natales',48,34),
    	(337,'Torres del Paine',53,35),
    	(338,'Laguna Blanca',53,35),
    	(339,'Punta Arenas',53,35),
    	(340,'Río Verde',53,35),
    	(341,'San Gregorio',53,35),
    	(342,'Porvenir',53,35),
    	(343,'Primavera',53,35),
    	(344,'Timaukel',53,35),
    	(345,'Cabo de Hornos',53,35),
    	(346,'Antártica',53,35);

    SET IDENTITY_INSERT [t_comunas] OFF


INSERT INTO [dbo].[t_depend]
           ([depend_nombre])
     VALUES
           ('Municipal DAEM'),
             ('Municipal Corporación'),
           ('Particular Subvencionado'),
           ('Particular'),
           ('Servicio Local de Educación');

SET IDENTITY_INSERT [t_cod_ense] ON

INSERT INTO [dbo].[t_cod_ense]
           (cod_ense_id, cod_ense_nombre)
     VALUES
  ('461','Educación Media Técnico Profesional, de Adultos, rama Comercial, con hasta 25 horas semanales presénciales de clases.'),
('167','Básica Adultos Con Oficio Dto. 239'),
('165','Básica Adultos sin Oficio Dto. 239'),
('263','Educ. General Básica Especial Diferencial, con integración de 7° ú 8° agno básico'),
('264','Educ. General Básica Especial Diferencial, con integración en Educación Media Científico Humanista'),
('260','Educ. General Básica Especial Diferencial, con integración en párvulos'),
('660','Educ.Media Técnico Profesional, de Adultos, rama'),
('560','Educ.Media Técnico Profesional, de Adultos, rama Industrial, con 26 o más horas semanales presénciales de clases.'),
('561','Educ.Media Técnico Profesional, de Adultos, rama Industrial, con hasta 25 horas semanales presénciales de clases.'),
('110','Educación General Básica (1ro. a 8vo. agno)'),
('160','Educación General Básica de Adultos'),
('280','Educación General Básica Especial Diferencial, alumnos con discapacidad visual, auditiva o multidéficit, que perciben un aumento de subvención, en conformidad a lo establecido en el artículo 9° bis, del DFL. N° 2, de Educación, de 1998 y su reglamento.'),
('261','Educación General Básica Especial Diferencial, con integración de 1° a 4° agno básico'),
('262','Educación General Básica Especial Diferencial, con integración de 5° ó 6° agno básico'),
('268','Educación General Básica Especial Diferencial, con integración en Educación Básica de Adultos.'),
('269','Educación General Básica Especial Diferencial, con integración en Educación Media de Adultos.'),
('265','Educación General Básica Especial Diferencial, con integración en Educación Media Técnico Profesional Agrícola y Marítima'),
('267','Educación General Básica Especial Diferencial, con integración en Educación Media Técnico Profesional Comercial o Técnica'),
('266','Educación General Básica Especial Diferencial, con integración en Educación Media Técnico Profesional Industrial.'),
('361','Educación Media Humanístico Científica de Adultos, con hasta 25 horas semanales de clases.'),
('360','Educación Media Humanístico Científica de Adultos, con más de 26 horas semanales presénciales de clases.'),
('310','Educación Media Humanístico Científica.'),
('460','Educación Media Técnico Profesional, de Adultos, rama Comercial, con 26 o más horas semanales presénciales de clases.'),
('410','Educación Media Técnico Profesional, rama Comercial.'),
('510','Educación Media Técnico Profesional, rama Industrial.'),
('610','Educación Media Técnico Profesional, rama Técnica.'),
('9','Educación Parvularia 1do. Nivel de transición'),
('10','Educación Parvularia 2do. Nivel de transición'),
('291','Esp. Dif. Aulas Hospitalarias Básica'),
('292','Esp. Dif. Aulas Hospitalarias Media'),
('290','Esp. Dif. Aulas Hospitalarias PreBásica'),
('181','Esp. Dif. Déficit Auditivo Básica'),
('182','Esp. Dif. Déficit Auditivo Laboral'),
('180','Esp. Dif. Déficit Auditivo PreBásica'),
('251','Esp. Dif. Déficit Autista Básica'),
('252','Esp. Dif. Déficit Autista Laboral'),
('250','Esp. Dif. Déficit Autista PreBásica'),
('231','Esp. Dif. Déficit Grave Alter Relac y Comun. Básica'),
('232','Esp. Dif. Déficit Grave Alter Relac y Comun. Laboral '),
('230','Esp. Dif. Déficit Grave Alter Relac y Comun. PreBásica'),
('191','Esp. Dif. Déficit Mental Básica'),
('192','Esp. Dif. Déficit Mental Laboral'),
('190','Esp. Dif. Déficit Mental PreBásica'),
('241','Esp. Dif. Déficit Trastornos Motores Básica'),
('242','Esp. Dif. Déficit Trastornos Motores Laboral'),
('240','Esp. Dif. Déficit Trastornos Motores PreBásica'),
('201','Esp. Dif. Déficit Visual Básica'),
('200','Esp. Dif. Déficit Visual PreBásica'),
('202','Esp. Dif. Déficit Visula Laboral'),
('272','Integración Nec.Educ.Esp.Car.Tran- 1º a 4º Básico T.E.L. '),
('270','Integración Nec.Educ.Esp.Car.Tran- 1º N.T. T.E.L.'),
('271','Integración Nec.Educ.Esp.Car.Tran- 2º N.T. T.E.L.'),
('365','Media Adult H.C. Adultos Dto 239'),
('465','Media Adult. Tec-Prof. Comercial Dto 239'),
('565','Media Adult. Tec-Prof. Industrial Dto. 239'),
('220','Nec.Educ.Esp.Car.Tran- T.E.L.');

SET IDENTITY_INSERT [t_cod_ense] OFF


INSERT INTO [dbo].[t_curso]
           ([curso_nivel]
           ,[curso_nombre])
     VALUES
			('Preescolas', 'Pre-Kinder'),
			('Preescolas', 'Kinder'),
			('Básica', '1°A'),
			('Básica', '1°B'),
			('Básica', '2°A'),
			('Básica', '2°B'),
			('Básica', '3°A'),
			('Básica', '3°B'),
			('Básica', '4°A'),
			('Básica', '4°B'),
			('Básica', '5°A'),
			('Básica', '5°B'),
			('Básica', '6°A'),
			('Básica', '6°B'),
			('Básica', '7°A'),
			('Básica', '7°B'),
			('Básica', '8°A'),
			('Básica', '8°B'),
			('Básica', 'I°M A'),
			('Básica', 'I°M B'),
			('Básica', 'II°M A'),
			('Básica', 'II°M B'),
			('Básica', 'III°M A'),
			('Básica', 'III°M B'),
			('Básica', 'IV°M A'),
			('Básica', 'IV°M B');


INSERT INTO [dbo].[t_persona]
           ([persona_run]
           ,[persona_apellido_materno]
           ,[persona_apellido_paterno]
           ,[persona_fecha_nacimiento]
           ,[persona_nombre]
           ,[persona_numero_celular]
           ,[persona_numero_telefonico]
           ,[persona_sexo])
         VALUES
( '10007672-1 ', ' ', 'Daza ', '1987-5-17 ', 'Carlota ','+56913328986', '(2) 24986 3823 ', 'F '),
( '10020197-6 ', ' ', 'Calleja ', '1987-11-6 ', 'Álvaro ','+56971612156', '(2) 23758 6292 ', 'M '),
( '10023418-1 ', ' ', 'Perea ', '1987-2-11 ', 'Filomena ','+56945106822', '(2) 22037 2393 ', 'F '),
( '10028406-5 ', ' ', 'Valcárcel ', '1987-11-1 ', 'Lourdes ','+56973788658', '(2) 21943 3541 ', 'M '),
( '10030941-6 ', ' ', 'Camino ', '1987-8-14 ', 'Pacífica ','+56962542790', '(2) 23783 3946 ', 'F '),
( '10033211-6 ', 'Cuadrado ', 'Blanco ', '1987-11-16 ', 'Natalia ','+56921287722', '(2) 26213 6879 ', 'F '),
( '10042303-0 ', ' ', 'Solsona ', '1987-2-27 ', 'Isaura ','+56957824360', '(2) 28514 6498 ', 'F '),
( '10045179-4 ', ' ', 'Romero ', '1987-10-17 ', 'Cleto ','+56934623652', '(2) 22882 7529 ', 'M '),
( '10069276-7 ', ' ', 'Ferrando ', '1987-3-16 ', 'Edu ','+56921501547', '(2) 28832 3630 ', 'M '),
( '10078762-8 ', ' ', 'Castrillo ', '1987-3-15 ', 'Gaspar ','+56987583472', '(2) 22003 7828 ', 'M '),
( '10087828-3 ', ' ', 'Miró ', '1987-1-6 ', 'Baldomero ','+56962401920', '(2) 22829 7643 ', 'M '),
( '10141047-1 ', ' ', 'Jódar ', '1987-1-5 ', 'Teófilo ','+56946833917', '(2) 25453 3836 ', 'M '),
( '10145326-k ', ' ', 'Millán ', '1987-7-28 ', 'Vanesa ','+56942692177', '(2) 24506 8765 ', 'F '),
( '10156977-2 ', ' ', 'Alonso ', '1987-1-11 ', 'Edelmiro ','+56961617888', '(2) 21276 4645 ', 'M '),
( '10158382-1 ', ' ', ' ', '1987-3-22 ', 'Narcisa ','+56926677562', '(2) 28138 5189 ', 'F '),
( '10170629-k ', ' ', 'Arce ', '1987-6-12 ', 'Poncio ','+56910319020', '(2) 26791 3190 ', 'M '),
( '10207401-7 ', ' ', ' ', '1987-6-3 ', 'Ileana ','+56913848988', '(2) 22007 8158 ', 'F '),
( '10224802-3 ', ' ', 'Sanz ', '1987-2-25 ', 'Ainoa ','+56986547479', '(2) 27229 2550 ', 'F '),
( '10241265-6 ', 'Casal ', 'Pacheco ', '1987-9-11 ', 'Merche ','+56986817120', '(2) 23751 6953 ', 'M '),
( '10253981-8 ', ' ', 'Godoy ', '1987-4-16 ', 'Flavia ','+56950716437', '(2) 28682 7069 ', 'F '),
( '10258276-4 ', ' ', 'Corral ', '1987-6-6 ', 'Eusebio ','+56976378757', '(2) 22739 5969 ', 'M '),
( '10282003-7 ', ' ', 'Rodríguez ', '1987-1-12 ', 'Natalia ','+56952548258', '(2) 22483 2290 ', 'F '),
( '10283850-5 ', ' ', 'Vizcaíno ', '1987-3-25 ', 'Valeria ','+56972113759', '(2) 26625 1968 ', 'F '),
( '10284435-1 ', ' ', 'Andrés ', '1987-7-27 ', 'Matilde ','+56961748512', '(2) 22926 1305 ', 'M '),
( '10289034-5 ', ' ', 'Esteve ', '1987-1-2 ', 'Anselmo ','+56946523646', '(2) 24817 4768 ', 'M '),
( '10294702-9 ', ' ', 'Mayol ', '1987-3-14 ', 'Jerónimo ','+56918513775', '(2) 22594 5896 ', 'M '),
( '10307783-4 ', ' ', 'Jódar ', '1987-7-24 ', 'Eva ','+56913193417', '(2) 24724 4880 ', 'F '),
( '10309856-4 ', ' ', 'Oliva ', '1987-10-1 ', 'Luz ','+56984642780', '(2) 28444 1319 ', 'M '),
( '10335354-8 ', ' ', 'Mateos ', '1987-10-15 ', 'Héctor ','+56977147418', '(2) 22055 6288 ', 'M '),
( '10337268-2 ', ' ', 'Blasco ', '1987-3-20 ', 'Lucía ','+56910336655', '(2) 28479 7077 ', 'F '),
( '10341783-k ', ' ', 'Lozano ', '1987-8-20 ', 'Paz ','+56918186562', '(2) 25300 6177 ', 'M '),
( '10343931-0 ', ' ', 'Vall ', '1987-9-2 ', 'Carmelita ','+56913864319', '(2) 22309 4701 ', 'F '),
( '10344239-7 ', ' ', ' ', '1987-3-6 ', 'Emma ','+56937597451', '(2) 28474 7630 ', 'F '),
( '10371655-1 ', ' ', 'Cueto ', '1987-11-8 ', 'Elba ','+56939377136', '(2) 27447 5688 ', 'F '),
( '10372585-2 ', ' ', 'Carrasco ', '1987-12-20 ', 'Ramiro ','+56917347090', '(2) 28794 5803 ', 'M '),
( '10383412-0 ', ' ', 'Báez ', '1987-7-11 ', 'Gabriela ','+56921876217', '(2) 24512 2479 ', 'F '),
( '10419644-6 ', ' ', 'Cases ', '1987-11-20 ', 'Candela ','+56958841054', '(2) 28042 6411 ', 'F '),
( '10426377-1 ', ' ', 'Sola ', '1987-6-21 ', 'Macarena ','+56959484675', '(2) 26735 3416 ', 'F '),
( '10440686-6 ', ' ', 'Puig ', '1987-12-26 ', 'Cosme ','+56944212569', '(2) 22634 3677 ', 'M '),
( '10442532-1 ', ' ', 'Bermúdez ', '1987-5-8 ', 'Sandra ','+56973725451', '(2) 26833 4126 ', 'F '),
( '10452525-3 ', ' ', 'Taboada ', '1987-10-16 ', 'Isaías ','+56990217921', '(2) 23728 3847 ', 'M '),
( '10461021-8 ', ' ', 'Soto ', '1987-5-25 ', 'Nuria ','+56918521622', '(2) 24008 2212 ', 'F '),
( '10462201-1 ', ' ', ' ', '1987-10-27 ', 'Matilde ','+56976424060', '(2) 25373 2440 ', 'M '),
( '10474580-6 ', ' ', 'Rovira ', '1987-12-13 ', 'Tiburcio ','+56927431116', '(2) 23314 1771 ', 'M '),
( '10477159-9 ', ' ', 'Manjón ', '1987-12-19 ', 'Verónica ','+56948868424', '(2) 22849 1722 ', 'F '),
( '10504838-6 ', ' ', ' ', '1987-12-4 ', 'Marcelino ','+56919343879', '(2) 23426 6822 ', 'M '),
( '10508665-2 ', 'Hernandez ', 'Garriga ', '1986-6-5 ', 'María ','+56956702983', '(2) 21686 3473 ', 'F '),
( '10510257-7 ', ' ', ' ', '1986-9-15 ', 'Bonifacio ','+56941224538', '(2) 26644 3229 ', 'M '),
( '10511035-9 ', ' ', ' ', '1986-8-12 ', 'Lucho ','+56928181649', '(2) 21911 2445 ', 'M '),
( '10536148-3 ', ' ', 'Andreu ', '1986-3-27 ', 'Nuria ','+56914526962', '(2) 21134 2326 ', 'F '),
( '10539485-3 ', ' ', 'Canales ', '1986-8-3 ', 'Salvador ','+56968336718', '(2) 27216 7156 ', 'M '),
( '10547385-0 ', 'Montes ', 'Sureda ', '1986-10-6 ', 'Gustavo ','+56934626042', '(2) 28917 8474 ', 'M '),
( '10553589-9 ', ' ', 'Ortiz ', '1986-2-9 ', 'Marianela ','+56973168959', '(2) 21842 8190 ', 'F '),
( '10556456-2 ', ' ', 'Ferrero ', '1986-7-8 ', 'Tatiana ','+56970142577', '(2) 22827 2052 ', 'F '),
( '10575408-6 ', ' ', 'Real ', '1986-6-16 ', 'Micaela ','+56930394213', '(2) 23462 4895 ', 'F '),
( '10584120-5 ', ' ', 'Cabanillas ', '1986-10-12 ', 'Griselda ','+56950762759', '(2) 21514 8634 ', 'F '),
( '10593687-7 ', ' ', 'Piñol ', '1986-1-26 ', 'Ramón ','+56929323990', '(2) 23941 4921 ', 'M '),
( '10617869-0 ', ' ', ' ', '1986-10-14 ', 'Emiliano ','+56927592783', '(2) 23049 7849 ', 'M '),
( '10628551-9 ', ' ', 'Frías ', '1986-3-26 ', 'Sonia ','+56970546432', '(2) 26108 4958 ', 'F '),
( '10633287-8 ', 'Abascal ', 'Roselló ', '1986-12-3 ', 'Alejandra ','+56911253323', '(2) 27571 7221 ', 'F '),
( '10659332-9 ', ' ', 'Pozuelo ', '1986-6-6 ', 'Ciro ','+56932155380', '(2) 28511 2607 ', 'M '),
( '10672491-1 ', ' ', 'Roca ', '1986-8-6 ', 'Andrea ','+56922256817', '(2) 26117 6534 ', 'F '),
( '10695109-8 ', ' ', ' ', '1986-12-8 ', 'Amaya ','+56946786153', '(2) 22474 2702 ', 'F '),
( '10700522-6 ', ' ', 'Sarmiento ', '1986-8-18 ', 'Edelmiro ','+56964818527', '(2) 25822 2992 ', 'M '),
( '10705549-5 ', ' ', 'Aguado ', '1986-3-13 ', 'Bernabé ','+56986271311', '(2) 24162 5154 ', 'M '),
( '10706331-5 ', ' ', ' ', '1986-4-18 ', 'Gisela ','+56944633427', '(2) 26273 4210 ', 'F '),
( '10721723-1 ', ' ', 'Posada ', '1986-8-6 ', 'Yago ','+56955898142', '(2) 24280 5198 ', 'M '),
( '10733695-8 ', ' ', 'Barbero ', '1986-7-15 ', 'Cristóbal ','+56979107769', '(2) 28453 2609 ', 'M '),
( '10738748-k ', ' ', 'Gálvez ', '1986-7-21 ', 'Nacho ','+56928542650', '(2) 21959 3321 ', 'M '),
( '10740172-5 ', ' ', 'Gutierrez ', '1986-12-14 ', 'Arsenio ','+56939872015', '(2) 21578 5909 ', 'M '),
( '10744132-8 ', ' ', ' ', '1986-5-28 ', 'Jacinto ','+56910101132', '(2) 27049 5989 ', 'M '),
( '10763343-k ', 'Barceló ', 'Sotelo ', '1986-8-12 ', 'Teodora ','+56922668956', '(2) 26531 5939 ', 'F '),
( '10773848-7 ', ' ', ' ', '1986-7-4 ', 'Diana ','+56979533729', '(2) 27375 4169 ', 'F '),
( '10779229-5 ', ' ', 'Sans ', '1986-12-16 ', 'Soledad ','+56980391752', '(2) 25130 2896 ', 'M '),
( '10788953-1 ', ' ', 'Badía ', '1986-9-24 ', 'Nadia ','+56940271560', '(2) 25443 1236 ', 'F '),
( '10802648-0 ', ' ', 'Lastra ', '1986-2-4 ', 'Tadeo ','+56927608236', '(2) 22978 4672 ', 'M '),
( '10814200-6 ', ' ', ' ', '1986-4-19 ', 'Severo ','+56967506150', '(2) 28826 8772 ', 'M '),
( '10830649-1 ', 'Pozo ', 'Lumbreras ', '1986-3-9 ', 'Amanda ','+56928587730', '(2) 22250 8738 ', 'F '),
( '10830895-8 ', ' ', 'Cerdán ', '1986-5-26 ', 'Cesar ','+56981662959', '(2) 21687 1911 ', 'M '),
( '10836337-1 ', ' ', 'Moya ', '1986-3-3 ', 'Eusebio ','+56946735165', '(2) 21687 4993 ', 'M '),
( '10861765-9 ', ' ', 'Higueras ', '1986-11-23 ', 'Nadia ','+56956302174', '(2) 27287 6210 ', 'F '),
( '10866223-9 ', ' ', 'Plana ', '1986-3-3 ', 'Haroldo ','+56956486890', '(2) 28373 2252 ', 'M '),
( '10883566-4 ', ' ', 'Olivares ', '1986-1-1 ', 'Blas ','+56920572123', '(2) 28431 2521 ', 'M '),
( '10897741-8 ', ' ', 'Villaverde ', '1986-9-17 ', 'Angelina ','+56979531870', '(2) 25245 5883 ', 'F '),
( '10905674-k ', ' ', 'Villa ', '1986-2-5 ', 'Isa ','+56957125220', '(2) 22326 3201 ', 'F '),
( '10938191-8 ', ' ', 'Gámez ', '1986-2-16 ', 'Fernanda ','+56913791433', '(2) 28440 6048 ', 'F '),
( '10942645-8 ', ' ', 'Ávila ', '1986-3-22 ', 'Eusebia ','+56936743931', '(2) 21269 8832 ', 'F '),
( '10949037-7 ', ' ', 'Somoza ', '1986-2-2 ', 'Saturnino ','+56919225051', '(2) 21948 7286 ', 'M '),
( '10955920-2 ', ' ', ' ', '1986-5-5 ', 'Joan ','+56974864552', '(2) 22644 5557 ', 'M '),
( '10956528-8 ', ' ', ' ', '1986-8-11 ', 'Elías ','+56969884989', '(2) 24661 2266 ', 'M '),
( '10962131-5 ', ' ', 'Aguilar ', '1986-11-28 ', 'Luciana ','+56947405881', '(2) 26036 4011 ', 'F '),
( '10967060-k ', ' ', 'Sandoval ', '1985-1-1 ', 'Hilda ','+56958346124', '(2) 24841 3398 ', 'F '),
( '10967188-6 ', ' ', 'Quesada ', '1985-3-26 ', 'María ','+56948138626', '(2) 24141 5003 ', 'F '),
( '10987992-4 ', ' ', 'Montes ', '1985-9-20 ', 'Alex ','+56957707742', '(2) 23801 6868 ', 'M '),
( '11007556-1 ', 'Montenegro ', 'Ortuño ', '1985-12-24 ', 'Susanita ','+56938403566', '(2) 21899 3714 ', 'F '),
( '11008805-1 ', ' ', 'Garmendia ', '1985-7-22 ', 'Eutropio ','+56925674511', '(2) 28404 5469 ', 'M '),
( '11036749-k ', ' ', ' ', '1985-3-28 ', 'Patricia ','+56950857633', '(2) 21669 1966 ', 'F '),
( '11050974-k ', ' ', 'Escudero ', '1985-9-19 ', 'Rosa ','+56966183610', '(2) 22157 2975 ', 'F '),
( '11054915-6 ', 'Zaragoza ', 'Pozuelo ', '1985-8-11 ', 'Paz ','+56954261686', '(2) 21047 3753 ', 'M '),
( '11059095-4 ', ' ', ' ', '1985-3-11 ', 'Diana ','+56957565666', '(2) 26114 7424 ', 'F '),
( '11062704-1 ', 'Aparicio ', 'Manuel ', '1985-1-21 ', 'Dan ','+56967527310', '(2) 24397 4685 ', 'M '),
( '11082022-4 ', ' ', ' ', '1985-4-8 ', 'Augusto ','+56985735024', '(2) 25985 4265 ', 'M '),
( '11084619-3 ', ' ', 'Gras ', '1985-8-2 ', 'Anselmo ','+56985765423', '(2) 22015 6585 ', 'M '),
( '11098895-8 ', ' ', ' ', '1985-2-3 ', 'Ágata ','+56989782069', '(2) 28703 7007 ', 'F '),
( '11123065-k ', ' ', 'Vicente ', '1985-9-12 ', 'Asunción ','+56924446528', '(2) 28769 1825 ', 'M '),
( '11126113-k ', 'Cabeza ', 'Garrido ', '1985-2-21 ', 'Tadeo ','+56981881649', '(2) 22023 5807 ', 'M '),
( '11145086-2 ', ' ', 'Company ', '1985-7-8 ', 'Pastora ','+56990188482', '(2) 24909 7062 ', 'F '),
( '11145641-0 ', ' ', 'Puente ', '1985-12-10 ', 'Curro ','+56980304210', '(2) 21598 4791 ', 'M '),
( '11164951-0 ', 'Galiano ', 'Puente ', '1985-5-28 ', 'Albina ','+56946375457', '(2) 22280 6135 ', 'F '),
( '11168517-7 ', ' ', 'Zabala ', '1985-10-25 ', 'Olalla ','+56942672469', '(2) 28135 2568 ', 'F '),
( '11173549-2 ', ' ', 'Rojas ', '1985-4-24 ', 'Germán ','+56934326859', '(2) 24841 1083 ', 'M '),
( '11176016-0 ', ' ', 'Verdejo ', '1985-11-14 ', 'América ','+56961687836', '(2) 21721 6774 ', 'F '),
( '11176056-k ', ' ', 'Vives ', '1985-1-10 ', 'Eladio ','+56919323614', '(2) 23850 2833 ', 'M '),
( '11182218-2 ', ' ', 'Bustos ', '1985-4-18 ', 'Brígida ','+56967503360', '(2) 28519 5640 ', 'F '),
( '11185639-7 ', ' ', 'Pinto ', '1985-12-19 ', 'Bernarda ','+56948145049', '(2) 25383 8327 ', 'F '),
( '11188577-k ', ' ', 'Cases ', '1985-8-3 ', 'Delfina ','+56913283079', '(2) 23981 4938 ', 'F '),
( '11198467-0 ', 'Casals ', 'Padilla ', '1985-1-27 ', 'Chucho ','+56944286160', '(2) 21619 8810 ', 'M '),
( '11199081-6 ', ' ', ' ', '1985-9-4 ', 'Aroa ','+56984785639', '(2) 26738 7344 ', 'F '),
( '11208457-6 ', ' ', ' ', '1985-4-24 ', 'Glauco ','+56959844153', '(2) 23145 6584 ', 'M '),
( '11216921-0 ', 'Orozco ', 'Ibañez ', '1985-10-9 ', 'Juan ','+56939474328', '(2) 23811 6297 ', 'M '),
( '11217170-3 ', 'Manuel ', 'Marin ', '1985-7-21 ', 'Maricruz ','+56940191383', '(2) 26730 1457 ', 'M '),
( '11219994-2 ', ' ', 'Pellicer ', '1985-5-19 ', 'Isabela ','+56912606483', '(2) 21677 3154 ', 'F '),
( '11227400-6 ', ' ', 'Hervás ', '1985-12-5 ', 'Bibiana ','+56949268944', '(2) 22044 8209 ', 'F '),
( '11253393-1 ', ' ', 'Sanmartín ', '1985-5-10 ', 'Daniel ','+56986549075', '(2) 24454 7906 ', 'M '),
( '11284745-6 ', ' ', 'Conesa ', '1985-8-25 ', 'Ligia ','+56912382142', '(2) 25442 3528 ', 'F '),
( '11297502-0 ', ' ', ' ', '1985-2-25 ', 'Sol ','+56956139071', '(2) 25962 3250 ', 'M '),
( '11303471-8 ', 'Arnaiz ', 'Laguna ', '1985-5-2 ', 'Etelvina ','+56961515921', '(2) 25743 2067 ', 'F '),
( '11309691-8 ', ' ', 'Estévez ', '1985-8-17 ', 'Moreno ','+56984853523', '(2) 21354 6798 ', 'M '),
( '11315203-6 ', 'Bru ', 'Salomón ', '1985-8-20 ', 'Miguel ','+56934192641', '(2) 26475 2559 ', 'M '),
( '11316271-6 ', ' ', 'Saldaña ', '1985-7-13 ', 'Ileana ','+56959144334', '(2) 28748 5068 ', 'F '),
( '11322539-4 ', ' ', 'Sedano ', '1985-12-6 ', 'Emelina ','+56939836750', '(2) 22313 1273 ', 'F '),
( '11322765-6 ', ' ', 'Coello ', '1985-5-17 ', 'Bernardino ','+56990111135', '(2) 21049 6830 ', 'M '),
( '11334648-5 ', ' ', ' ', '1984-12-14 ', 'Carmen ','+56936693926', '(2) 27398 4326 ', 'M '),
( '11352824-9 ', ' ', 'Solé ', '1984-3-17 ', 'Elisa ','+56947671327', '(2) 26934 5797 ', 'F '),
( '11353432-k ', ' ', 'Calvet ', '1984-6-22 ', 'Valerio ','+56986801935', '(2) 25973 5769 ', 'M '),
( '11358792-k ', ' ', 'Terrón ', '1984-3-24 ', 'Fabián ','+56954297157', '(2) 26125 7589 ', 'M '),
( '11408393-3 ', ' ', 'Figuerola ', '1984-4-21 ', 'Eusebio ','+56965481561', '(2) 24698 2798 ', 'M '),
( '11430437-9 ', 'Valverde ', 'Isern ', '1984-5-17 ', 'Gil ','+56926676230', '(2) 26196 6929 ', 'M '),
( '11431877-9 ', ' ', 'Pavón ', '1984-4-6 ', 'Dora ','+56962764424', '(2) 22464 3583 ', 'F '),
( '11433382-4 ', ' ', 'Cisneros ', '1984-3-27 ', 'Úrsula ','+56982115942', '(2) 24881 6269 ', 'F '),
( '11434461-3 ', ' ', 'Gárate ', '1984-10-1 ', 'Morena ','+56975101218', '(2) 23166 2474 ', 'F '),
( '11444595-9 ', ' ', 'Pedrosa ', '1984-3-3 ', 'Yolanda ','+56980271237', '(2) 25642 2268 ', 'F '),
( '11451351-2 ', ' ', 'Cañellas ', '1984-3-25 ', 'Juana ','+56936416730', '(2) 26630 5007 ', 'F '),
( '11455765-k ', ' ', ' ', '1984-9-23 ', 'Eligio ','+56918544289', '(2) 26513 2486 ', 'M '),
( '11469397-9 ', ' ', 'Sureda ', '1984-7-14 ', 'Tania ','+56978808238', '(2) 26972 8744 ', 'F '),
( '11471072-5 ', ' ', 'Sosa ', '1984-3-7 ', 'Emma ','+56987758436', '(2) 24519 4247 ', 'F '),
( '11480725-7 ', ' ', 'Anguita ', '1984-6-23 ', 'Jafet ','+56941872440', '(2) 25600 5250 ', 'M '),
( '11499957-1 ', 'Baquero ', 'Ripoll ', '1984-6-11 ', 'Jose ','+56975803766', '(2) 23521 8067 ', 'M '),
( '11517664-1 ', ' ', ' ', '1984-3-19 ', 'Pastora ','+56948754730', '(2) 22655 6409 ', 'F '),
( '11524508-2 ', ' ', ' ', '1984-8-13 ', 'Isa ','+56924766322', '(2) 27279 8088 ', 'F '),
( '11527425-2 ', ' ', 'Quero ', '1984-6-2 ', 'Wálter ','+56977473567', '(2) 22807 1017 ', 'M '),
( '11577212-0 ', ' ', 'Amat ', '1984-10-11 ', 'Juan ','+56956545621', '(2) 21687 6154 ', 'M '),
( '11598215-k ', ' ', ' ', '1984-8-19 ', 'Juliana ','+56965594665', '(2) 24259 1323 ', 'F '),
( '11601329-0 ', ' ', 'Llano ', '1984-7-19 ', 'Eligia ','+56928468565', '(2) 21808 1250 ', 'F '),
( '11605505-8 ', ' ', ' ', '1984-5-26 ', 'Eufemia ','+56915876031', '(2) 25897 3228 ', 'F '),
( '11616524-4 ', ' ', 'Román ', '1984-6-20 ', 'Bienvenida ','+56934891117', '(2) 21403 2782 ', 'F '),
( '11624333-4 ', ' ', 'Bauzà ', '1984-3-26 ', 'Alicia ','+56966865262', '(2) 25220 8790 ', 'F '),
( '11633547-6 ', ' ', 'Anaya ', '1984-9-24 ', 'Fabiana ','+56926355013', '(2) 25814 6636 ', 'F '),
( '11660317-9 ', 'Valls ', 'Páez ', '1984-9-10 ', 'Cleto ','+56928508313', '(2) 27357 2746 ', 'M '),
( '11666439-9 ', ' ', ' ', '1984-5-28 ', 'Ramiro ','+56948596378', '(2) 26364 3263 ', 'M '),
( '11671016-1 ', ' ', 'Oliver ', '1984-1-26 ', 'María ','+56987218179', '(2) 25959 3900 ', 'F '),
( '11674014-1 ', ' ', 'Pazos ', '1984-12-28 ', 'Leocadia ','+56964415471', '(2) 25398 2930 ', 'F '),
( '11683737-4 ', ' ', 'Capdevila ', '1984-6-13 ', 'Cristian ','+56924242855', '(2) 24022 4593 ', 'M '),
( '11708304-7 ', ' ', 'Morera ', '1984-10-27 ', 'Merche ','+56951303135', '(2) 26435 1072 ', 'M '),
( '11711168-7 ', 'Mármol ', 'Posada ', '1984-4-22 ', 'Luis ','+56936511142', '(2) 27531 2380 ', 'M '),
( '11722146-6 ', ' ', 'Jódar ', '1984-9-23 ', 'Domitila ','+56914817763', '(2) 21080 8406 ', 'F '),
( '11733502-k ', ' ', 'Noguera ', '1984-1-3 ', 'Graciana ','+56944387283', '(2) 23018 4241 ', 'F '),
( '11740188-k ', ' ', 'Sola ', '1984-6-19 ', 'Isabel ','+56917441042', '(2) 23786 8812 ', 'M '),
( '11744859-2 ', ' ', 'Céspedes ', '1984-11-3 ', 'Noa ','+56980728158', '(2) 28473 2843 ', 'F '),
( '11759443-2 ', ' ', 'Castejón ', '1984-4-10 ', 'Olga ','+56957241143', '(2) 23262 7391 ', 'F '),
( '11761847-1 ', ' ', 'Giner ', '1984-10-15 ', 'Gerónimo ','+56935325533', '(2) 25163 8743 ', 'M '),
( '11776869-4 ', ' ', 'Rincón ', '1984-7-27 ', 'Isaura ','+56974297636', '(2) 24292 7921 ', 'F '),
( '11794615-0 ', ' ', 'Dominguez ', '1984-6-16 ', 'Eva ','+56946183921', '(2) 26092 4590 ', 'F '),
( '11810267-3 ', 'Rueda ', 'Corral ', '1984-7-2 ', 'Maxi ','+56989648512', '(2) 28726 2339 ', 'M '),
( '11819750-k ', ' ', 'Morales ', '1984-7-28 ', 'Úrsula ','+56929302161', '(2) 25156 5044 ', 'F '),
( '11833788-3 ', ' ', 'Carrillo ', '1984-7-16 ', 'Consuela ','+56933147872', '(2) 21024 8029 ', 'F '),
( '11836666-2 ', ' ', 'Pacheco ', '1984-7-11 ', 'Humberto ','+56972804828', '(2) 21840 6880 ', 'M '),
( '11850206-k ', ' ', 'Lucas ', '1983-9-6 ', 'Gracia ','+56925385779', '(2) 22641 5715 ', 'F '),
( '11868373-0 ', ' ', ' ', '1983-4-10 ', 'África ','+56972736983', '(2) 23926 6923 ', 'F '),
( '11873643-5 ', ' ', 'Báez ', '1983-7-15 ', 'Leire ','+56916275976', '(2) 25994 7845 ', 'M '),
( '11881844-k ', ' ', 'Sánchez ', '1983-6-26 ', 'Reyes ','+56948706558', '(2) 28586 2375 ', 'M '),
( '11904379-4 ', ' ', 'Pujol ', '1983-12-7 ', 'Marina ','+56977536765', '(2) 25389 4722 ', 'F '),
( '11906416-3 ', ' ', 'Sala ', '1983-11-8 ', 'Encarna ','+56924733960', '(2) 23813 4966 ', 'F '),
( '11917875-4 ', ' ', 'Navarro ', '1983-9-25 ', 'Imelda ','+56986411845', '(2) 23189 8490 ', 'F '),
( '11946591-5 ', ' ', 'Briones ', '1983-2-27 ', 'Remigio ','+56958337811', '(2) 23448 3684 ', 'M '),
( '11958784-0 ', ' ', ' ', '1983-12-14 ', 'Saturnina ','+56956683315', '(2) 26533 7551 ', 'F '),
( '11959645-9 ', 'Guerrero ', 'Sanz ', '1983-5-27 ', 'Ariadna ','+56915494054', '(2) 27729 1327 ', 'F '),
( '11959835-4 ', ' ', ' ', '1983-8-18 ', 'Borja ','+56964442779', '(2) 25835 6852 ', 'F '),
( '11974383-4 ', ' ', 'Gutierrez ', '1983-4-6 ', 'Baldomero ','+56948687178', '(2) 25821 5744 ', 'M '),
( '12001609-1 ', ' ', 'Barba ', '1983-7-14 ', 'Bautista ','+56988356574', '(2) 22002 6260 ', 'F '),
( '12004414-1 ', 'Berrocal ', 'Iborra ', '1983-9-13 ', 'Rosa ','+56936431870', '(2) 26887 7100 ', 'F '),
( '12026928-3 ', ' ', ' ', '1983-6-14 ', 'Conrado ','+56988767316', '(2) 27474 1472 ', 'M '),
( '12033070-5 ', ' ', 'Perera ', '1983-4-10 ', 'Juanito ','+56916768176', '(2) 25010 3383 ', 'M '),
( '12035695-k ', ' ', 'Jordá ', '1983-2-14 ', 'Elisa ','+56976757860', '(2) 26074 5741 ', 'F '),
( '12051453-9 ', ' ', 'Méndez ', '1983-5-27 ', 'José ','+56946864978', '(2) 27280 3498 ', 'M '),
( '12057597-k ', ' ', 'Velázquez ', '1983-2-12 ', 'Lucio ','+56961375944', '(2) 22870 2606 ', 'M '),
( '12070423-0 ', ' ', ' ', '1983-10-10 ', 'Carlito ','+56957606469', '(2) 21132 3495 ', 'M '),
( '12077732-7 ', ' ', 'Armas ', '1983-1-10 ', 'Crescencia ','+56961764179', '(2) 27528 6754 ', 'F '),
( '12078844-2 ', ' ', 'Acedo ', '1983-11-6 ', 'Felix ','+56911565612', '(2) 21597 1671 ', 'M '),
( '12086533-1 ', ' ', 'Torrent ', '1983-8-26 ', 'Antonio ','+56931688713', '(2) 25180 2723 ', 'M '),
( '12089722-5 ', ' ', 'Valls ', '1983-5-26 ', 'Susana ','+56954685327', '(2) 23382 6593 ', 'F '),
( '12102298-2 ', ' ', 'Rosell ', '1983-1-2 ', 'Blanca ','+56910307643', '(2) 27089 2421 ', 'F '),
( '12108304-3 ', ' ', 'Zorrilla ', '1983-10-17 ', 'Isidoro ','+56989162781', '(2) 28032 4783 ', 'M '),
( '12123814-4 ', ' ', 'Castellanos-Marqués ', '1983-6-10 ', 'María ','+56933373980', '(2) 26401 5758 ', 'F '),
( '12135980-4 ', ' ', 'Heras-Martin ', '1983-2-27 ', 'María ','+56911802832', '(2) 27973 7343 ', 'F '),
( '12136075-6 ', 'Valenciano ', 'Trujillo ', '1983-6-23 ', 'Ricarda ','+56988273731', '(2) 28206 1100 ', 'F '),
( '12136289-9 ', ' ', 'Gomez ', '1983-2-14 ', 'Tomás ','+56951782862', '(2) 24563 5561 ', 'M '),
( '12143946-8 ', ' ', 'España ', '1983-9-23 ', 'Nilda ','+56956224542', '(2) 24617 8573 ', 'F '),
( '12158243-0 ', ' ', 'Tolosa ', '1983-6-5 ', 'Tatiana ','+56976193750', '(2) 21932 3483 ', 'F '),
( '12160085-4 ', ' ', 'Velázquez ', '1983-10-23 ', 'Desiderio ','+56933365735', '(2) 21547 8725 ', 'M '),
( '12161455-3 ', ' ', 'Mancebo ', '1983-2-8 ', 'José ','+56965101047', '(2) 23109 4901 ', 'M '),
( '12187703-1 ', ' ', ' ', '1983-12-1 ', 'Imelda ','+56921808673', '(2) 28076 4679 ', 'F '),
( '12198763-5 ', ' ', 'Hoyos ', '1983-4-13 ', 'África ','+56942841543', '(2) 28381 2706 ', 'F '),
( '12199624-3 ', ' ', 'Pujadas ', '1983-12-5 ', 'Geraldo ','+56981677820', '(2) 21573 2616 ', 'M '),
( '12203790-8 ', ' ', 'Valencia ', '1983-9-16 ', 'Reyna ','+56937747634', '(2) 22747 5897 ', 'F '),
( '12224585-3 ', ' ', 'Nicolás ', '1983-1-23 ', 'Paloma ','+56933431068', '(2) 23020 8151 ', 'F '),
( '12233991-2 ', ' ', 'Ferrando ', '1983-1-3 ', 'Isaías ','+56931201011', '(2) 25859 6061 ', 'M '),
( '12247052-0 ', ' ', 'Saldaña ', '1983-6-10 ', 'Nereida ','+56934872485', '(2) 26407 6423 ', 'F '),
( '12249675-9 ', 'Bolaños ', 'Calleja ', '1983-10-11 ', 'Ambrosio ','+56984108737', '(2) 26217 8819 ', 'M '),
( '12253177-5 ', 'Enríquez ', 'Echevarría ', '1983-10-3 ', 'José ','+56984547478', '(2) 27630 1267 ', 'M '),
( '12256834-2 ', ' ', 'Quesada ', '1983-5-4 ', 'Dora ','+56920711557', '(2) 27025 5312 ', 'F '),
( '12267765-6 ', ' ', ' ', '1983-3-11 ', 'Dorita ','+56957206637', '(2) 27668 5231 ', 'F '),
( '12274620-8 ', ' ', 'Moraleda ', '1983-1-27 ', 'Nieves ','+56982301223', '(2) 24513 2061 ', 'M '),
( '12302949-6 ', ' ', 'Carrión ', '1983-3-2 ', 'Custodia ','+56971568577', '(2) 26563 4359 ', 'F '),
( '12304987-k ', ' ', 'Jara ', '1983-11-11 ', 'Ricardo ','+56961466064', '(2) 22057 6637 ', 'M '),
( '12321870-1 ', ' ', 'Juliá ', '1983-10-28 ', 'Ágata ','+56977134285', '(2) 26890 5157 ', 'F '),
( '12322583-k ', ' ', 'Ruano ', '1983-12-23 ', 'Agapito ','+56932741437', '(2) 23954 2839 ', 'M '),
( '12326211-5 ', ' ', 'Mas ', '1983-4-23 ', 'Mireia ','+56973748839', '(2) 25292 8927 ', 'F '),
( '12331008-k ', ' ', 'Valero ', '1983-8-21 ', 'Manuel ','+56926234084', '(2) 21018 6368 ', 'M '),
( '12345194-5 ', ' ', 'Sáez ', '1983-10-9 ', 'Corona ','+56989396166', '(2) 26602 8989 ', 'F '),
( '12353202-3 ', 'Gordillo ', 'Gallo ', '1982-2-22 ', 'Juan ','+56938396372', '(2) 21293 5761 ', 'M '),
( '12357698-5 ', ' ', 'Galván ', '1982-11-14 ', 'Paola ','+56934472719', '(2) 24755 1304 ', 'F '),
( '12400096-3 ', ' ', 'Lillo ', '1982-4-18 ', 'Aarón ','+56953633610', '(2) 21329 2189 ', 'M '),
( '12402978-3 ', ' ', ' ', '1982-8-6 ', 'Aurelia ','+56966332132', '(2) 27536 3801 ', 'F '),
( '12404518-5 ', ' ', 'Izaguirre ', '1982-8-2 ', 'Baudelio ','+56923116580', '(2) 27531 3450 ', 'M '),
( '12408398-2 ', ' ', 'Grau ', '1982-12-6 ', 'Lucila ','+56948782023', '(2) 24889 5594 ', 'F '),
( '12412784-k ', 'Elías ', 'Alba ', '1982-6-16 ', 'Martin ','+56968622780', '(2) 23075 6291 ', 'M '),
( '12415134-1 ', ' ', 'Marín ', '1982-8-24 ', 'Zaida ','+56988622133', '(2) 24144 3600 ', 'F '),
( '12425989-4 ', 'Agustín ', 'de ', '1982-3-7 ', 'María ','+56965178520', '(2) 27186 3191 ', 'F '),
( '12429692-7 ', ' ', 'Blázquez ', '1982-6-23 ', 'Elena ','+56956404473', '(2) 22188 8869 ', 'F '),
( '12442756-8 ', ' ', 'Peñas ', '1982-7-24 ', 'Glauco ','+56968846873', '(2) 25204 7704 ', 'M '),
( '12462396-0 ', ' ', ' ', '1982-4-15 ', 'Ricarda ','+56973616341', '(2) 25294 4941 ', 'F '),
( '12463586-1 ', 'Ramón ', 'del ', '1982-3-1 ', 'Eva ','+56943893450', '(2) 28283 7567 ', 'F '),
( '12482661-6 ', ' ', 'Ferrero ', '1982-2-16 ', 'Sabina ','+56924742022', '(2) 23588 5141 ', 'F '),
( '12489531-6 ', ' ', 'Ochoa ', '1982-2-8 ', 'Hector ','+56949425984', '(2) 26741 5390 ', 'M '),
( '12503946-4 ', ' ', ' ', '1982-3-16 ', 'Eutropio ','+56971307148', '(2) 22251 6966 ', 'M '),
( '12507657-2 ', ' ', ' ', '1982-5-8 ', 'Laura ','+56990447234', '(2) 28441 6601 ', 'F '),
( '12526155-8 ', ' ', 'Mata ', '1982-5-24 ', 'Visitación ','+56949322023', '(2) 21092 1942 ', 'M '),
( '12546347-9 ', ' ', 'Pastor ', '1982-3-26 ', 'Sofía ','+56955365632', '(2) 27903 1401 ', 'F '),
( '12567318-k ', ' ', 'Benavent ', '1982-11-1 ', 'Victorino ','+56982635959', '(2) 28087 2518 ', 'M '),
( '12577750-3 ', ' ', ' ', '1982-8-25 ', 'Angelita ','+56931631113', '(2) 23465 5176 ', 'F '),
( '12579409-2 ', ' ', 'Salom ', '1982-6-4 ', 'Bibiana ','+56936383286', '(2) 27334 5852 ', 'F '),
( '12580480-2 ', ' ', ' ', '1982-7-17 ', 'Florinda ','+56957377384', '(2) 25247 8843 ', 'F '),
( '12582057-3 ', ' ', 'Caparrós ', '1982-10-9 ', 'Rita ','+56925315130', '(2) 25821 5212 ', 'F '),
( '12606604-k ', 'Juliá ', 'Mercedes ', '1982-11-4 ', 'Rosa ','+56966284226', '(2) 24226 8112 ', 'F '),
( '12608347-5 ', ' ', 'Asenjo ', '1982-3-8 ', 'Amalia ','+56933435790', '(2) 26352 8077 ', 'F '),
( '12611214-9 ', ' ', 'Martorell ', '1982-9-18 ', 'Baldomero ','+56928655610', '(2) 22414 4721 ', 'M '),
( '12628491-8 ', 'Durán ', 'Dueñas ', '1982-5-8 ', 'Juan ','+56986512478', '(2) 23123 7762 ', 'M '),
( '12632919-9 ', ' ', 'Escribano ', '1982-8-10 ', 'Federico ','+56941477047', '(2) 27043 2313 ', 'M '),
( '12672315-6 ', 'Jimenez ', 'Español ', '1982-3-26 ', 'Azahara ','+56926894949', '(2) 28517 8012 ', 'F '),
( '12680923-9 ', 'Guerra ', 'Juliá ', '1982-12-5 ', 'Juan ','+56943656068', '(2) 27539 7087 ', 'M '),
( '12717457-1 ', ' ', 'Galvez ', '1982-12-15 ', 'Noelia ','+56970162383', '(2) 27973 6753 ', 'F '),
( '12720040-8 ', ' ', 'Hoyos ', '1982-12-10 ', 'Emma ','+56983195743', '(2) 26409 4312 ', 'F '),
( '12743380-1 ', ' ', 'Camps ', '1982-1-18 ', 'Atilio ','+56981168185', '(2) 23473 4732 ', 'M '),
( '12749398-7 ', ' ', 'Arellano ', '1982-10-12 ', 'Félix ','+56911124344', '(2) 27387 2686 ', 'M '),
( '12767532-5 ', ' ', 'Benavente ', '1982-1-9 ', 'Toribio ','+56982382233', '(2) 22508 6439 ', 'M '),
( '12777742-k ', ' ', 'Duarte ', '1982-5-14 ', 'Olegario ','+56951705127', '(2) 22482 1441 ', 'M '),
( '12804380-2 ', ' ', 'Alfonso ', '1982-3-4 ', 'Maura ','+56952674364', '(2) 22189 3554 ', 'F '),
( '12833818-7 ', 'Padilla ', 'Rebollo ', '1982-6-13 ', 'Nicolás ','+56923397368', '(2) 28299 7376 ', 'M '),
( '12839134-7 ', ' ', 'Villaverde ', '1982-1-18 ', 'Zaira ','+56966333578', '(2) 25033 5608 ', 'F '),
( '12854262-0 ', ' ', ' ', '1982-6-28 ', 'Concha ','+56984396942', '(2) 28411 4279 ', 'F '),
( '12856748-8 ', ' ', 'Santamaria ', '1982-12-9 ', 'Priscila ','+56959787122', '(2) 27740 8912 ', 'F '),
( '12859330-6 ', ' ', 'Peral ', '1982-8-26 ', 'Ignacia ','+56978307779', '(2) 26989 1674 ', 'F '),
( '12878102-1 ', ' ', 'Ibañez ', '1982-6-15 ', 'Áurea ','+56957142736', '(2) 23508 4313 ', 'F '),
( '12893775-7 ', ' ', 'Borrás ', '1981-5-23 ', 'Salomé ','+56913722838', '(2) 25452 8297 ', 'M '),
( '12941720-k ', 'Rojas ', 'de ', '1981-11-25 ', 'Jose ','+56947163781', '(2) 22484 4948 ', 'M '),
( '12960555-3 ', ' ', 'Tejero ', '1981-4-21 ', 'Sosimo ','+56982361276', '(2) 28613 4780 ', 'M '),
( '12998143-1 ', ' ', 'Mateo ', '1981-5-8 ', 'Marina ','+56947325040', '(2) 21959 3450 ', 'F '),
( '13007742-0 ', 'Matas ', 'Pomares ', '1981-1-2 ', 'Valerio ','+56929152128', '(2) 21511 5109 ', 'M '),
( '13012660-k ', ' ', 'Valera ', '1981-8-1 ', 'Germán ','+56911813446', '(2) 26278 3913 ', 'M '),
( '13014361-k ', ' ', ' ', '1981-11-9 ', 'Angélica ','+56961627049', '(2) 25444 4525 ', 'F '),
( '13022922-0 ', ' ', 'Neira ', '1981-2-1 ', 'Ruth ','+56938867827', '(2) 23561 2223 ', 'M '),
( '13036082-3 ', ' ', 'Toro ', '1981-7-5 ', 'Lorenzo ','+56957308113', '(2) 26861 4519 ', 'M '),
( '13053465-1 ', ' ', 'León ', '1981-7-26 ', 'Jonatan ','+56978121890', '(2) 28986 2701 ', 'M '),
( '13071620-2 ', ' ', ' ', '1981-5-27 ', 'Joaquina ','+56979565315', '(2) 24805 8492 ', 'F '),
( '13074835-k ', 'Quevedo ', 'Garzón ', '1981-8-13 ', 'Mohamed ','+56934552436', '(2) 26845 5992 ', 'M '),
( '13104816-5 ', ' ', ' ', '1981-8-8 ', 'Adelardo ','+56935427446', '(2) 24254 6139 ', 'M '),
( '13127102-6 ', ' ', 'Herranz ', '1981-5-10 ', 'Paulina ','+56917596440', '(2) 23101 7533 ', 'F '),
( '13164403-5 ', ' ', 'Colomer ', '1981-11-26 ', 'Timoteo ','+56935442280', '(2) 28863 1369 ', 'M '),
( '13164845-6 ', ' ', 'Valverde ', '1981-4-5 ', 'Marcio ','+56913505476', '(2) 28961 3592 ', 'M '),
( '13166555-5 ', ' ', 'Baró ', '1981-10-22 ', 'Joaquina ','+56914112883', '(2) 26815 7341 ', 'F '),
( '13169178-5 ', ' ', 'Piña ', '1981-3-24 ', 'Sabina ','+56940321243', '(2) 26682 1723 ', 'F '),
( '13169897-6 ', ' ', ' ', '1981-10-1 ', 'Ramón ','+56941511984', '(2) 23699 3138 ', 'M '),
( '13172585-k ', ' ', 'Peñas ', '1981-5-13 ', 'Guadalupe ','+56932316431', '(2) 24980 6940 ', 'M '),
( '13176516-9 ', ' ', 'Reguera ', '1981-5-21 ', 'Fortunata ','+56957315917', '(2) 21944 4174 ', 'F '),
( '13180112-2 ', ' ', 'Juan ', '1981-10-22 ', 'Nacho ','+56990467915', '(2) 25334 5666 ', 'M '),
( '13187874-5 ', ' ', 'Benito ', '1981-9-18 ', 'Sergio ','+56984611444', '(2) 24806 5994 ', 'M '),
( '13189569-0 ', ' ', 'Albero ', '1981-11-23 ', 'Reyes ','+56914421543', '(2) 27654 6573 ', 'M '),
( '13229854-8 ', ' ', ' ', '1981-11-6 ', 'Pastor ','+56985378527', '(2) 27809 4131 ', 'M '),
( '13230860-8 ', ' ', 'Duarte ', '1981-12-2 ', 'Raúl ','+56948904513', '(2) 25756 6184 ', 'M '),
( '13236896-1 ', ' ', 'Menendez ', '1981-8-11 ', 'Paulina ','+56973334830', '(2) 25189 7488 ', 'F '),
( '13250207-2 ', ' ', 'Colom ', '1981-3-10 ', 'Gustavo ','+56961724885', '(2) 28251 4108 ', 'M '),
( '13255996-1 ', ' ', ' ', '1981-5-28 ', 'Benjamín ','+56940422815', '(2) 26381 5421 ', 'M '),
( '13257517-7 ', ' ', 'Echeverría ', '1981-5-13 ', 'Lorenzo ','+56944521514', '(2) 21759 5204 ', 'M '),
( '13258827-9 ', ' ', ' ', '1981-7-2 ', 'Bienvenida ','+56941235626', '(2) 28587 2444 ', 'F '),
( '13263791-1 ', ' ', 'Valverde ', '1981-7-27 ', 'Sarita ','+56980783844', '(2) 21358 3096 ', 'F '),
( '13263940-k ', 'Palomares ', 'Fernandez ', '1981-9-15 ', 'Rafa ','+56942788860', '(2) 26913 1128 ', 'F '),
( '13269124-k ', ' ', 'Carbajo ', '1980-3-1 ', 'Celestina ','+56954487814', '(2) 26471 8535 ', 'F '),
( '13276952-4 ', 'Mata ', 'Mendoza ', '1980-11-12 ', 'Francisco ','+56986321713', '(2) 22446 7074 ', 'M '),
( '13283228-5 ', 'Araujo ', 'Casals ', '1980-10-17 ', 'Alex ','+56923643454', '(2) 27258 3774 ', 'M '),
( '13287555-3 ', ' ', 'Pintor ', '1980-5-14 ', 'Josep ','+56945387210', '(2) 27503 6235 ', 'M '),
( '13287638-k ', ' ', ' ', '1980-3-26 ', 'Jordán ','+56961684240', '(2) 21221 3266 ', 'M '),
( '13293393-6 ', 'Pazos ', 'Tamayo ', '1980-6-13 ', 'María ','+56921574963', '(2) 21383 2250 ', 'F '),
( '13296241-3 ', ' ', ' ', '1980-11-13 ', 'Eva ','+56941871926', '(2) 28309 5356 ', 'F '),
( '13317341-2 ', ' ', 'Polo ', '1980-11-16 ', 'Álvaro ','+56920271564', '(2) 26497 3908 ', 'M '),
( '13322547-1 ', 'Rey ', 'del ', '1980-2-9 ', 'Juan ','+56962251155', '(2) 24456 3008 ', 'M '),
( '13362228-4 ', ' ', 'Cabañas ', '1980-2-26 ', 'Víctor ','+56977693665', '(2) 21154 7958 ', 'M '),
( '13363861-k ', ' ', 'Milla ', '1980-12-24 ', 'Gervasio ','+56914732524', '(2) 27623 8642 ', 'M '),
( '13363944-6 ', ' ', 'Burgos ', '1980-2-13 ', 'Emma ','+56985107046', '(2) 27434 7907 ', 'F '),
( '13372558-k ', ' ', 'Navarrete ', '1980-7-27 ', 'Aitana ','+56947507426', '(2) 27492 8245 ', 'F '),
( '13374749-4 ', ' ', 'Montesinos ', '1980-4-11 ', 'Ovidio ','+56955274323', '(2) 25910 6587 ', 'M '),
( '13388365-7 ', ' ', 'Pol ', '1980-8-28 ', 'Chelo ','+56981244211', '(2) 27754 8662 ', 'M '),
( '13410580-1 ', ' ', 'Martín ', '1980-2-10 ', 'Lucía ','+56925653434', '(2) 25651 6175 ', 'F '),
( '13411638-2 ', ' ', 'Céspedes ', '1980-7-6 ', 'Nélida ','+56983165882', '(2) 23702 6009 ', 'F '),
( '13417558-3 ', ' ', 'Baeza ', '1980-6-8 ', 'Paco ','+56984523669', '(2) 21623 3759 ', 'M '),
( '13423811-9 ', ' ', ' ', '1980-5-8 ', 'Maxi ','+56981358844', '(2) 27987 4698 ', 'M '),
( '13443180-6 ', ' ', ' ', '1980-5-11 ', 'Estela ','+56987428618', '(2) 27640 3916 ', 'F '),
( '13448142-0 ', ' ', 'Gimeno ', '1980-5-17 ', 'Maite ','+56969166968', '(2) 24592 4795 ', 'M '),
( '13455567-k ', ' ', 'Pinilla ', '1980-6-7 ', 'Edgardo ','+56911386410', '(2) 22987 1437 ', 'M '),
( '13462736-0 ', ' ', ' ', '1980-3-26 ', 'Fátima ','+56945322517', '(2) 26851 2576 ', 'F '),
( '13465574-7 ', 'Echeverría ', 'Mohamed ', '1980-9-7 ', 'Jose ','+56956692138', '(2) 28704 3112 ', 'M '),
( '13466545-9 ', ' ', 'Saavedra ', '1980-6-18 ', 'Angelina ','+56941324059', '(2) 25066 2613 ', 'F '),
( '13474067-1 ', ' ', ' ', '1980-1-10 ', 'Bernarda ','+56927281774', '(2) 27742 1708 ', 'F '),
( '13474325-5 ', 'Moreno ', 'Tello ', '1980-2-16 ', 'Elba ','+56941593014', '(2) 25321 7504 ', 'F '),
( '13478959-k ', ' ', 'Bolaños ', '1980-5-10 ', 'Manuelita ','+56937501345', '(2) 21320 3780 ', 'F '),
( '13490604-9 ', ' ', 'Pardo ', '1980-4-24 ', 'Adalberto ','+56914585383', '(2) 23715 5168 ', 'M '),
( '13493857-9 ', ' ', 'Múgica ', '1980-3-2 ', 'Evita ','+56985881825', '(2) 25077 6664 ', 'F '),
( '13506199-9 ', ' ', 'Gallardo ', '1980-5-17 ', 'Rosalía ','+56942603968', '(2) 25614 6572 ', 'F '),
( '13511651-3 ', ' ', 'Vaquero ', '1980-6-19 ', 'Alejo ','+56923465690', '(2) 23392 1389 ', 'M '),
( '13529640-6 ', ' ', 'Nogueira ', '1980-3-4 ', 'Lupe ','+56944165275', '(2) 25465 6776 ', 'M '),
( '13532532-5 ', ' ', 'Ponce ', '1980-4-28 ', 'Eugenio ','+56963681866', '(2) 25974 4409 ', 'M '),
( '13539393-2 ', ' ', ' ', '1980-10-27 ', 'Teófila ','+56983625516', '(2) 27081 2993 ', 'F '),
( '13539789-k ', 'Tenorio ', 'Caro ', '1980-12-12 ', 'Sigfrido ','+56916312361', '(2) 22238 5982 ', 'M '),
( '13543595-3 ', ' ', 'Ríos ', '1980-11-28 ', 'Tito ','+56986291621', '(2) 21256 8329 ', 'M '),
( '13547242-5 ', ' ', 'Larrañaga ', '1980-1-17 ', 'Jorge ','+56944303168', '(2) 23657 8577 ', 'M '),
( '13549704-5 ', ' ', 'Lumbreras ', '1980-6-25 ', 'Andrés ','+56978281819', '(2) 22596 5919 ', 'M '),
( '13558917-9 ', ' ', 'Juliá ', '1980-5-11 ', 'Encarnacion ','+56934711684', '(2) 26033 1414 ', 'M '),
( '13565523-6 ', ' ', 'Manrique ', '1980-5-6 ', 'Jessica ','+56930827188', '(2) 28160 6567 ', 'F '),
( '13567240-8 ', ' ', 'Jerez ', '1980-6-14 ', 'Pía ','+56915704050', '(2) 27617 5602 ', 'F '),
( '13567255-6 ', 'Muñoz ', 'de ', '1980-4-21 ', 'Francisco ','+56979885111', '(2) 26598 4648 ', 'M '),
( '13602705-0 ', ' ', 'Barrena ', '1979-8-13 ', 'Seve ','+56985252813', '(2) 21031 1289 ', 'M '),
( '13622701-7 ', ' ', 'Bayo ', '1979-12-7 ', 'Prudencia ','+56924778886', '(2) 24307 6552 ', 'F '),
( '13630884-k ', ' ', 'Palmer ', '1979-5-13 ', 'Rosenda ','+56929848188', '(2) 24116 7363 ', 'F '),
( '13632855-7 ', ' ', 'Toledo ', '1979-7-9 ', 'Ximena ','+56946683582', '(2) 28412 7370 ', 'F '),
( '13639690-0 ', ' ', 'Gracia ', '1979-10-18 ', 'Chema ','+56964302260', '(2) 21982 6679 ', 'F '),
( '13648490-7 ', ' ', 'Chaves ', '1979-1-15 ', 'Daniela ','+56914768728', '(2) 26076 2755 ', 'F '),
( '13660551-8 ', 'Folch ', 'Seguí ', '1979-5-18 ', 'Miguel ','+56958238462', '(2) 24709 1800 ', 'M '),
( '13674283-3 ', ' ', 'Coca ', '1979-2-3 ', 'Cipriano ','+56974806957', '(2) 22165 3799 ', 'M '),
( '13675794-6 ', 'Somoza ', 'Ródenas ', '1979-3-21 ', 'Arturo ','+56931874656', '(2) 23579 5769 ', 'M '),
( '13686122-0 ', ' ', 'Girón ', '1979-6-27 ', 'Virginia ','+56941184647', '(2) 24441 2624 ', 'F '),
( '13688966-4 ', ' ', ' ', '1979-5-28 ', 'Saturnino ','+56914798243', '(2) 24325 1784 ', 'M '),
( '13719528-3 ', ' ', 'Benitez ', '1979-11-3 ', 'Martirio ','+56925244153', '(2) 23281 5329 ', 'M '),
( '13725066-7 ', 'Castells ', 'Barrio ', '1979-8-28 ', 'Ramón ','+56926451233', '(2) 25778 7560 ', 'M '),
( '13742329-4 ', ' ', 'Herrera ', '1979-8-10 ', 'Cloe ','+56927596478', '(2) 26276 6621 ', 'M '),
( '13754872-0 ', ' ', 'Peralta ', '1979-8-15 ', 'Juan ','+56952262533', '(2) 23825 8426 ', 'M '),
( '13755681-2 ', 'Milla ', 'Cerro ', '1979-9-2 ', 'Rodrigo ','+56960305785', '(2) 22512 4487 ', 'M '),
( '13761711-0 ', 'Leal ', 'Méndez ', '1979-1-21 ', 'Fausto ','+56922681832', '(2) 22540 4676 ', 'M '),
( '13790481-0 ', ' ', 'Martinez ', '1979-7-27 ', 'Javi ','+56974334861', '(2) 22671 7018 ', 'M '),
( '13792757-8 ', ' ', 'Tomas ', '1979-7-3 ', 'José ','+56975871314', '(2) 21403 3577 ', 'M '),
( '13795755-8 ', ' ', ' ', '1979-6-28 ', 'Cruz ','+56986297879', '(2) 24156 7045 ', 'M '),
( '13812346-4 ', ' ', ' ', '1979-11-20 ', 'Beatriz ','+56975618175', '(2) 25504 7787 ', 'M '),
( '13822330-2 ', 'Aparicio ', 'Garcés ', '1979-9-19 ', 'Ascensión ','+56925298762', '(2) 22017 4854 ', 'M '),
( '13822989-0 ', ' ', 'Gascón ', '1979-10-27 ', 'Rebeca ','+56945337839', '(2) 27296 2492 ', 'F '),
( '13824547-0 ', ' ', 'Casas ', '1979-7-14 ', 'Candela ','+56964843676', '(2) 22204 6881 ', 'F '),
( '13833729-4 ', ' ', 'Calderón ', '1979-1-1 ', 'David ','+56965741134', '(2) 23731 5362 ', 'M '),
( '13834142-9 ', ' ', 'Boix ', '1979-11-8 ', 'Josep ','+56921454110', '(2) 23437 1618 ', 'M '),
( '13846172-6 ', ' ', 'Criado ', '1979-6-17 ', 'Juliana ','+56981508442', '(2) 22689 7847 ', 'F '),
( '13852329-2 ', ' ', 'Ballesteros ', '1979-4-20 ', 'Baudelio ','+56937815257', '(2) 23216 1913 ', 'M '),
( '13866551-8 ', 'Mascaró ', 'Escobar ', '1979-8-27 ', 'Piedad ','+56927221158', '(2) 23670 1229 ', 'M '),
( '13886495-2 ', ' ', 'Barbero ', '1979-5-7 ', 'Luis ','+56948683350', '(2) 27334 8967 ', 'M '),
( '13912617-3 ', ' ', 'Maestre-Arribas ', '1979-5-2 ', 'María ','+56962796238', '(2) 21801 7994 ', 'F '),
( '13913725-6 ', ' ', 'Gallego ', '1979-10-26 ', 'Narciso ','+56932108429', '(2) 24256 6685 ', 'M '),
( '13970857-1 ', ' ', 'Benet ', '1979-4-1 ', 'Calista ','+56983594076', '(2) 22140 2024 ', 'F '),
( '13979267-k ', ' ', ' ', '1979-9-26 ', 'Elba ','+56910562555', '(2) 25934 3522 ', 'F '),
( '13983572-7 ', ' ', ' ', '1979-2-5 ', 'Jonatan ','+56935102072', '(2) 24404 3439 ', 'M '),
( '13985194-3 ', ' ', 'Polo ', '1979-9-6 ', 'Feliciana ','+56936824934', '(2) 23635 1311 ', 'F '),
( '14003611-0 ', 'Escalona ', 'Luna ', '1979-4-3 ', 'Pío ','+56949484038', '(2) 21322 2260 ', 'M '),
( '14004197-1 ', ' ', 'Rebollo ', '1979-3-27 ', 'Dolores ','+56984758769', '(2) 26488 3000 ', 'M '),
( '14004836-4 ', ' ', 'Belda ', '1979-4-18 ', 'Griselda ','+56951813781', '(2) 28926 4054 ', 'F '),
( '14011311-5 ', ' ', 'Pons ', '1979-4-21 ', 'Paca ','+56929492022', '(2) 24278 3230 ', 'F '),
( '14017776-8 ', ' ', ' ', '1979-5-1 ', 'Alondra ','+56979132433', '(2) 28433 2948 ', 'F '),
( '14041899-4 ', ' ', 'Ricart ', '1979-2-6 ', 'Kike ','+56986108154', '(2) 24263 7231 ', 'M '),
( '14068550-k ', ' ', 'Perea ', '1979-3-18 ', 'Wilfredo ','+56959661057', '(2) 21033 6842 ', 'M '),
( '14074955-9 ', ' ', 'Pellicer ', '1979-11-13 ', 'Mireia ','+56933392937', '(2) 28050 3845 ', 'F '),
( '14078233-5 ', 'Bellido ', 'Amores ', '1979-3-3 ', 'Moisés ','+56960646184', '(2) 21826 5024 ', 'M '),
( '14134348-3 ', ' ', ' ', '1978-4-8 ', 'Sigfrido ','+56974581775', '(2) 27482 6994 ', 'M '),
( '14149250-0 ', ' ', ' ', '1978-3-25 ', 'Espiridión ','+56984451934', '(2) 23087 7553 ', 'M '),
( '14156047-6 ', ' ', 'Gallart ', '1978-12-8 ', 'Fortunata ','+56979476542', '(2) 22145 3054 ', 'F '),
( '14168155-9 ', ' ', 'Prada ', '1978-4-1 ', 'Fernando ','+56921238262', '(2) 22721 3020 ', 'M '),
( '14197219-7 ', ' ', 'Páez ', '1978-12-11 ', 'Reynaldo ','+56961635118', '(2) 24250 1540 ', 'M '),
( '14209858-k ', ' ', 'Garriga ', '1978-12-9 ', 'Saturnina ','+56932191364', '(2) 28177 5030 ', 'F '),
( '14218894-5 ', ' ', 'Peral ', '1978-6-12 ', 'Adelina ','+56988196667', '(2) 27544 2603 ', 'F '),
( '14224136-6 ', ' ', 'Calatayud ', '1978-11-10 ', 'Raquel ','+56937291132', '(2) 23435 3715 ', 'M '),
( '14225191-4 ', ' ', ' ', '1978-5-17 ', 'Iván ','+56963621469', '(2) 21071 8160 ', 'M '),
( '14249583-k ', ' ', ' ', '1978-2-18 ', 'Danilo ','+56962637989', '(2) 24741 4585 ', 'M '),
( '14256080-1 ', ' ', 'Sans ', '1978-11-18 ', 'Adelina ','+56975874969', '(2) 28822 5325 ', 'F '),
( '14257703-8 ', ' ', 'Cabrera ', '1978-11-6 ', 'Visitación ','+56942516588', '(2) 21034 4695 ', 'M '),
( '14275763-k ', ' ', 'Sierra ', '1978-3-9 ', 'Fernando ','+56976387876', '(2) 25935 6919 ', 'M '),
( '14281043-3 ', ' ', 'Aguado ', '1978-11-9 ', 'Florina ','+56937408478', '(2) 21780 2630 ', 'F '),
( '14287344-3 ', ' ', 'Ortega ', '1978-12-14 ', 'Jimena ','+56916573718', '(2) 26661 5318 ', 'F '),
( '14296021-4 ', ' ', 'Godoy ', '1978-10-23 ', 'Hermenegildo ','+56926694359', '(2) 28583 8961 ', 'M '),
( '14305011-4 ', 'Llanos ', 'Frutos ', '1978-11-27 ', 'Fulgencio ','+56981635289', '(2) 22323 3499 ', 'M '),
( '14305013-0 ', ' ', ' ', '1978-8-12 ', 'Aureliano ','+56983893669', '(2) 22853 5335 ', 'M '),
( '14317456-5 ', ' ', 'Donoso ', '1978-11-18 ', 'Marcial ','+56926873488', '(2) 24237 7665 ', 'M '),
( '14323291-3 ', ' ', 'Arco ', '1978-9-18 ', 'Fidela ','+56924696641', '(2) 26299 4627 ', 'F '),
( '14335545-4 ', ' ', 'Piquer ', '1978-5-20 ', 'Fabricio ','+56982483946', '(2) 25881 7469 ', 'M '),
( '14341357-8 ', ' ', 'Escalona ', '1978-1-12 ', 'Tecla ','+56927723361', '(2) 26291 6288 ', 'F '),
( '14363025-0 ', ' ', 'Oliver ', '1978-4-13 ', 'Teodoro ','+56928106886', '(2) 22198 4327 ', 'M '),
( '14370588-9 ', ' ', ' ', '1978-2-20 ', 'Lucas ','+56918883631', '(2) 27395 5363 ', 'M '),
( '14379776-7 ', ' ', ' ', '1978-12-16 ', 'Eligia ','+56958898982', '(2) 24881 8106 ', 'F '),
( '14386647-5 ', ' ', 'Jódar ', '1978-4-23 ', 'Cesar ','+56961794018', '(2) 28442 7619 ', 'M '),
( '14420070-5 ', ' ', ' ', '1978-12-25 ', 'Dora ','+56930613762', '(2) 27395 2765 ', 'F '),
( '14422764-6 ', ' ', 'Aparicio ', '1978-2-28 ', 'Hugo ','+56915603852', '(2) 21268 5815 ', 'M '),
( '14457172-k ', ' ', 'Andreu ', '1978-1-14 ', 'Norberto ','+56910384353', '(2) 24602 7256 ', 'M '),
( '14462369-k ', 'Lasa ', 'Arce ', '1978-8-1 ', 'Juan ','+56954353877', '(2) 25771 2557 ', 'M '),
( '14472366-k ', ' ', 'Girona ', '1978-11-14 ', 'Adelina ','+56929606443', '(2) 24450 6013 ', 'F '),
( '14486694-0 ', ' ', 'Lucena ', '1978-10-20 ', 'Chuy ','+56989258436', '(2) 23568 4737 ', 'M '),
( '14491813-4 ', ' ', 'Álvarez ', '1978-7-20 ', 'Graciana ','+56935883624', '(2) 27125 4184 ', 'F '),
( '14501107-8 ', ' ', 'Barceló ', '1978-4-16 ', 'Jaime ','+56984572332', '(2) 27085 3470 ', 'M '),
( '14509486-0 ', ' ', 'Maza ', '1978-5-11 ', 'Abraham ','+56927622920', '(2) 28941 4424 ', 'M '),
( '14510271-5 ', 'Casado ', 'Alarcón ', '1978-7-14 ', 'María ','+56919397565', '(2) 23089 8112 ', 'F '),
( '14539285-3 ', ' ', 'Pelayo ', '1978-6-4 ', 'Gisela ','+56922425963', '(2) 27182 6261 ', 'F '),
( '14549981-k ', ' ', 'Pedrero ', '1978-12-27 ', 'Jordán ','+56910691385', '(2) 22826 2231 ', 'M '),
( '14554230-8 ', ' ', 'Mercader ', '1978-5-2 ', 'Marisela ','+56932252744', '(2) 24360 7735 ', 'F '),
( '14554251-0 ', ' ', 'Higueras ', '1978-6-15 ', 'Oriana ','+56912106922', '(2) 25426 3442 ', 'F '),
( '14567934-6 ', ' ', 'Uriarte ', '1978-9-28 ', 'Perlita ','+56946666473', '(2) 26641 2456 ', 'F '),
( '14574849-6 ', 'Flor ', 'José ', '1978-8-8 ', 'Ámbar ','+56956193929', '(2) 28345 6588 ', 'M '),
( '14598145-k ', ' ', 'Ribas ', '1978-3-28 ', 'Olga ','+56920531143', '(2) 28590 3674 ', 'F '),
( '14605101-4 ', ' ', 'Corral ', '1978-9-28 ', 'Isaac ','+56928671179', '(2) 26721 3409 ', 'M '),
( '14627082-4 ', ' ', ' ', '1978-9-20 ', 'Roque ','+56978496238', '(2) 28633 4794 ', 'M '),
( '14628456-6 ', ' ', 'Bayo ', '1978-2-4 ', 'Marcia ','+56973446864', '(2) 25900 6674 ', 'F '),
( '14633324-9 ', ' ', 'Pinilla ', '1978-7-21 ', 'Mireia ','+56962687714', '(2) 23123 2911 ', 'F '),
( '14645067-9 ', ' ', 'Larrañaga ', '1978-3-26 ', 'Hilario ','+56939461355', '(2) 27855 4781 ', 'M '),
( '14645492-5 ', ' ', 'Lorenzo ', '1978-11-9 ', 'Camilo ','+56937311318', '(2) 26346 8269 ', 'M '),
( '14656786-k ', ' ', 'Plaza ', '1978-10-3 ', 'Dorotea ','+56977743265', '(2) 24738 5396 ', 'F '),
( '14661529-5 ', ' ', ' ', '1978-7-3 ', 'Jaime ','+56989385734', '(2) 27129 1815 ', 'M '),
( '14671112-k ', ' ', 'Valderrama ', '1978-1-28 ', 'Edmundo ','+56974585418', '(2) 23922 7340 ', 'M '),
( '14671421-8 ', ' ', ' ', '1978-11-27 ', 'Mohamed ','+56962362432', '(2) 27343 4531 ', 'M '),
( '14678670-7 ', ' ', 'Duarte ', '1977-2-19 ', 'Félix ','+56956678750', '(2) 23802 1635 ', 'M '),
( '14680619-8 ', ' ', 'Tenorio ', '1977-2-6 ', 'Ángel ','+56923534226', '(2) 25785 2838 ', 'M '),
( '14686507-0 ', ' ', 'Royo ', '1977-7-10 ', 'Leticia ','+56971502734', '(2) 25796 5754 ', 'F '),
( '14694086-2 ', 'Pagès ', 'Quiroga ', '1977-8-9 ', 'Paca ','+56918162938', '(2) 27964 3903 ', 'F '),
( '14696505-9 ', ' ', 'Franco ', '1977-9-4 ', 'Espiridión ','+56958308376', '(2) 21550 2590 ', 'M '),
( '14709163-k ', ' ', 'Lopez ', '1977-4-19 ', 'Jacobo ','+56946344181', '(2) 28011 4494 ', 'M '),
( '14715101-2 ', ' ', ' ', '1977-11-8 ', 'Domitila ','+56981206112', '(2) 22812 4139 ', 'F '),
( '14753433-7 ', ' ', 'Ferreras ', '1977-8-24 ', 'Ruy ','+56930882159', '(2) 25876 6381 ', 'M '),
( '14759187-k ', ' ', 'Rico ', '1977-8-14 ', 'Dionisia ','+56980717441', '(2) 26730 4319 ', 'F '),
( '14760260-k ', ' ', ' ', '1977-4-8 ', 'Felicidad ','+56938408343', '(2) 24584 4026 ', 'M '),
( '14760767-9 ', ' ', ' ', '1977-4-22 ', 'Marco ','+56945651441', '(2) 21731 2120 ', 'M '),
( '14770207-8 ', ' ', 'Nicolau ', '1977-3-14 ', 'Zoraida ','+56987324237', '(2) 22668 3308 ', 'F '),
( '14782495-5 ', ' ', 'Hoyos ', '1977-6-20 ', 'Macaria ','+56936556379', '(2) 22312 3983 ', 'F '),
( '14800687-3 ', 'Valenzuela ', 'Mena ', '1977-5-4 ', 'Hermenegildo ','+56960206611', '(2) 27236 5267 ', 'M '),
( '14804677-8 ', ' ', 'Cañas ', '1977-6-9 ', 'Merche ','+56968561360', '(2) 26058 5983 ', 'M '),
( '14809441-1 ', ' ', ' ', '1977-11-20 ', 'Rosario ','+56937206478', '(2) 25297 4476 ', 'M '),
( '14814543-1 ', ' ', 'Esparza ', '1977-6-28 ', 'Vicente ','+56941421480', '(2) 28709 3406 ', 'M '),
( '14822144-8 ', ' ', 'Llobet ', '1977-9-28 ', 'Zaira ','+56942176971', '(2) 25713 3111 ', 'F '),
( '14828016-9 ', ' ', 'Bosch ', '1977-1-7 ', 'Fernanda ','+56939837683', '(2) 27364 6730 ', 'F '),
( '14830496-3 ', ' ', 'Zabala ', '1977-1-17 ', 'Blas ','+56957228015', '(2) 27282 8707 ', 'M '),
( '14838403-7 ', ' ', ' ', '1977-2-13 ', 'Águeda ','+56928787545', '(2) 26309 8672 ', 'F '),
( '14851657-k ', ' ', ' ', '1977-4-18 ', 'Noemí ','+56934364822', '(2) 22529 5627 ', 'M '),
( '14860166-6 ', ' ', ' ', '1977-4-1 ', 'Erasmo ','+56984405247', '(2) 23890 3090 ', 'M '),
( '14883937-9 ', ' ', ' ', '1977-2-2 ', 'Itziar ','+56973428122', '(2) 24564 5918 ', 'M '),
( '14917382-k ', ' ', 'Caparrós ', '1977-9-10 ', 'Graciana ','+56921817977', '(2) 25847 1893 ', 'F '),
( '14923274-5 ', ' ', 'Ochoa ', '1977-5-14 ', 'Clotilde ','+56929595813', '(2) 24523 3622 ', 'M '),
( '14926790-5 ', ' ', 'Quintana ', '1977-4-14 ', 'Samuel ','+56927107760', '(2) 21047 2740 ', 'M '),
( '14927880-k ', ' ', ' ', '1977-2-28 ', 'Emperatriz ','+56941217115', '(2) 23944 2762 ', 'M '),
( '14929309-4 ', ' ', 'Patiño ', '1977-12-7 ', 'Miguel ','+56948683158', '(2) 22090 2509 ', 'M '),
( '14934729-1 ', ' ', ' ', '1977-7-15 ', 'Carlota ','+56975866975', '(2) 27205 4018 ', 'F '),
( '14936387-4 ', 'Jover ', 'Pazos ', '1977-10-8 ', 'Jose ','+56927578710', '(2) 22048 4741 ', 'M '),
( '14936591-5 ', ' ', 'Mur ', '1977-8-12 ', 'Priscila ','+56959497876', '(2) 27952 1840 ', 'F '),
( '14938591-6 ', 'Verdejo ', 'del ', '1977-6-28 ', 'Juan ','+56959838839', '(2) 23382 7261 ', 'M '),
( '14941244-1 ', 'Ponce ', 'Ignacio ', '1977-12-1 ', 'Andrés ','+56934228214', '(2) 25786 6161 ', 'M '),
( '14964175-0 ', ' ', 'Marco ', '1977-10-18 ', 'Elodia ','+56953155844', '(2) 28840 1900 ', 'F '),
( '14965443-7 ', ' ', 'Salvador ', '1977-5-7 ', 'Daniel ','+56928624437', '(2) 28672 7495 ', 'M '),
( '14988821-7 ', ' ', 'Soto ', '1977-5-23 ', 'Ascensión ','+56914206584', '(2) 28690 3503 ', 'M '),
( '14999507-2 ', ' ', 'Pons ', '1977-1-28 ', 'Julián ','+56985873147', '(2) 23977 7893 ', 'M '),
( '15009257-4 ', 'Villar ', 'Bartolomé ', '1977-9-4 ', 'Cayetano ','+56987138743', '(2) 22422 7053 ', 'M '),
( '15013289-4 ', 'Reig ', 'Alba ', '1977-3-5 ', 'Roxana ','+56976372482', '(2) 23861 1220 ', 'F '),
( '15016763-9 ', ' ', 'Leon ', '1977-11-3 ', 'Armando ','+56967252236', '(2) 22055 1759 ', 'M '),
( '15021905-1 ', ' ', 'Pont ', '1976-2-17 ', 'Lupe ','+56983846658', '(2) 22419 7239 ', 'M '),
( '15023801-3 ', ' ', 'Domingo ', '1976-6-8 ', 'Sosimo ','+56973172881', '(2) 22727 5548 ', 'M '),
( '15028253-5 ', 'Arce ', 'del ', '1976-8-23 ', 'María ','+56925141087', '(2) 24576 6416 ', 'F '),
( '15043360-6 ', ' ', 'Batalla ', '1976-4-27 ', 'Moisés ','+56948542664', '(2) 23500 6743 ', 'M '),
( '15062275-1 ', ' ', 'Carpio ', '1976-1-9 ', 'Mireia ','+56956762840', '(2) 22383 7330 ', 'F '),
( '15071585-7 ', 'Benavente ', 'Porras ', '1976-10-25 ', 'Basilio ','+56967905385', '(2) 28400 5551 ', 'M '),
( '15084210-7 ', ' ', ' ', '1976-9-19 ', 'Reyna ','+56975343957', '(2) 28734 2377 ', 'F '),
( '15087728-8 ', 'Ballester ', 'Acuña ', '1976-12-22 ', 'Ascensión ','+56969102081', '(2) 27455 4562 ', 'M '),
( '15091385-3 ', ' ', 'Ibañez ', '1976-6-25 ', 'Hortensia ','+56989671778', '(2) 27108 7143 ', 'F '),
( '15093745-0 ', ' ', 'Cerezo ', '1976-9-10 ', 'Segismundo ','+56964601052', '(2) 27781 4956 ', 'M '),
( '15098921-3 ', ' ', 'Díaz ', '1976-11-1 ', 'Olivia ','+56990674210', '(2) 28066 2686 ', 'F '),
( '15103188-9 ', ' ', 'Bellido ', '1976-6-8 ', 'Ignacia ','+56976794571', '(2) 24994 1363 ', 'F '),
( '15110295-6 ', 'Cano ', 'Mateo ', '1976-5-9 ', 'Víctor ','+56926843879', '(2) 26985 2343 ', 'M '),
( '15120096-6 ', ' ', 'Larrañaga ', '1976-9-22 ', 'Luis ','+56971652614', '(2) 22202 5925 ', 'M '),
( '15124284-7 ', ' ', 'Iborra ', '1976-1-28 ', 'Charo ','+56989732029', '(2) 21671 6329 ', 'M '),
( '15135848-9 ', ' ', 'Morillo ', '1976-4-10 ', 'Tomasa ','+56914836430', '(2) 24093 6490 ', 'F '),
( '15149866-3 ', ' ', ' ', '1976-4-27 ', 'Micaela ','+56936503320', '(2) 23560 5590 ', 'F '),
( '15153256-k ', ' ', 'Chaves ', '1976-2-10 ', 'Diego ','+56963327864', '(2) 21758 2283 ', 'M '),
( '15158590-6 ', ' ', 'Borrás ', '1976-2-15 ', 'Ximena ','+56982542784', '(2) 23031 7947 ', 'F '),
( '15160344-0 ', ' ', 'Bolaños ', '1976-2-15 ', 'Berto ','+56934774456', '(2) 23978 6535 ', 'M '),
( '15161490-6 ', ' ', ' ', '1976-9-11 ', 'Modesto ','+56962115218', '(2) 25623 3905 ', 'M '),
( '15166715-5 ', ' ', 'Blanch ', '1976-2-13 ', 'Bernabé ','+56943156328', '(2) 21722 5710 ', 'M '),
( '15172797-2 ', ' ', ' ', '1976-2-16 ', 'Asunción ','+56916537185', '(2) 23717 8304 ', 'M '),
( '15199194-7 ', ' ', 'Duque ', '1976-2-13 ', 'Pascual ','+56956343776', '(2) 22202 4966 ', 'M '),
( '15201587-9 ', ' ', 'Amat ', '1976-1-1 ', 'Régulo ','+56969475386', '(2) 25924 5418 ', 'M '),
( '15212839-8 ', ' ', 'Arévalo ', '1976-6-22 ', 'Edelmiro ','+56960777220', '(2) 21312 8543 ', 'M '),
( '15229771-8 ', ' ', 'Cazorla ', '1976-8-15 ', 'Ale ','+56957803519', '(2) 21926 7360 ', 'M '),
( '15240538-3 ', ' ', 'Angulo ', '1976-4-20 ', 'Manu ','+56960415756', '(2) 28414 4732 ', 'M '),
( '15248739-8 ', ' ', ' ', '1976-7-5 ', 'Fidela ','+56936174910', '(2) 21992 5721 ', 'F '),
( '15264344-6 ', 'Feijoo ', 'Pons ', '1976-12-15 ', 'Jose ','+56950341384', '(2) 25062 4731 ', 'M '),
( '15268105-4 ', ' ', 'Tolosa ', '1976-5-17 ', 'María ','+56927703165', '(2) 27363 6066 ', 'F '),
( '15268163-1 ', ' ', 'Múñiz ', '1976-11-8 ', 'Isabel ','+56989452264', '(2) 24268 4088 ', 'M '),
( '15273230-9 ', ' ', 'Fuster ', '1976-9-18 ', 'Perlita ','+56981451910', '(2) 22997 8300 ', 'F '),
( '15299339-0 ', ' ', 'Borja ', '1976-6-12 ', 'Marciano ','+56970186178', '(2) 25835 5296 ', 'M '),
( '15303918-6 ', ' ', 'Bolaños ', '1976-9-20 ', 'Cleto ','+56979444347', '(2) 22854 8693 ', 'M '),
( '15332885-4 ', ' ', 'Sanmiguel ', '1976-8-8 ', 'Emilio ','+56970816843', '(2) 27965 5555 ', 'M '),
( '15348005-2 ', ' ', 'Izquierdo ', '1976-11-6 ', 'Gustavo ','+56976526582', '(2) 23170 2568 ', 'M '),
( '15354132-9 ', 'Carnero ', 'Ballester ', '1976-12-13 ', 'María ','+56976836516', '(2) 21388 2727 ', 'F '),
( '15354372-0 ', ' ', 'Luna ', '1976-2-21 ', 'Eloísa ','+56986519039', '(2) 27326 1836 ', 'F '),
( '15368061-2 ', ' ', 'Mora ', '1976-1-19 ', 'Ángel ','+56985761458', '(2) 24603 6145 ', 'M '),
( '15370774-k ', 'Báez ', 'Salgado ', '1976-7-20 ', 'Lupita ','+56943215860', '(2) 26340 2413 ', 'F '),
( '15383436-9 ', ' ', ' ', '1976-12-24 ', 'Iris ','+56990808779', '(2) 23372 7672 ', 'M '),
( '15400857-8 ', 'Bermúdez ', 'Talavera ', '1976-8-2 ', 'Filomena ','+56965745448', '(2) 26146 1311 ', 'F '),
( '15405104-k ', ' ', ' ', '1976-9-2 ', 'Vera ','+56935752746', '(2) 26753 8833 ', 'F '),
( '15411010-0 ', ' ', 'Puig ', '1976-7-15 ', 'Máximo ','+56915355051', '(2) 22474 2015 ', 'M '),
( '15426643-7 ', ' ', 'Martorell ', '1976-3-13 ', 'Aarón ','+56941773267', '(2) 26818 7085 ', 'M '),
( '15431892-5 ', 'Cobo ', 'de ', '1976-11-6 ', 'José ','+56931395783', '(2) 23369 8044 ', 'M '),
( '15454085-7 ', ' ', ' ', '1976-12-28 ', 'Anastasio ','+56924553819', '(2) 25015 1249 ', 'M '),
( '15469561-3 ', ' ', ' ', '1976-4-10 ', 'Flavia ','+56911434573', '(2) 23091 2321 ', 'F '),
( '15475600-0 ', ' ', 'Hoyos ', '1976-10-4 ', 'Margarita ','+56987486811', '(2) 25696 1482 ', 'F '),
( '15477960-4 ', ' ', 'Moraleda ', '1975-3-10 ', 'Casandra ','+56980655974', '(2) 23875 3776 ', 'F '),
( '15478142-0 ', ' ', 'Lerma ', '1975-3-13 ', 'Amelia ','+56953183571', '(2) 21125 1570 ', 'F '),
( '15478674-0 ', 'Noguera ', 'Diego ', '1975-7-21 ', 'Armando ','+56921585047', '(2) 26746 3993 ', 'M '),
( '15486035-5 ', ' ', 'Arroyo ', '1975-7-5 ', 'Omar ','+56973387569', '(2) 26707 1122 ', 'M '),
( '15496912-8 ', 'Vazquez ', 'Ribera ', '1975-5-4 ', 'Candelario ','+56964637651', '(2) 28727 2929 ', 'M '),
( '15497259-5 ', ' ', 'Sarabia ', '1975-5-27 ', 'Isidro ','+56920564472', '(2) 24435 8931 ', 'M '),
( '15516987-7 ', ' ', 'Gordillo ', '1975-7-11 ', 'Catalina ','+56941374513', '(2) 28225 2682 ', 'F '),
( '15521004-4 ', ' ', 'Torrent ', '1975-10-14 ', 'Flor ','+56966893486', '(2) 28132 6925 ', 'M '),
( '15532803-7 ', ' ', 'Busquets ', '1975-4-22 ', 'Delfina ','+56921473337', '(2) 22441 5539 ', 'F '),
( '15534518-7 ', ' ', 'Quintero ', '1975-7-1 ', 'Pelayo ','+56936858983', '(2) 23782 8160 ', 'M '),
( '15535291-4 ', ' ', ' ', '1975-3-5 ', 'Leyre ','+56918211534', '(2) 26281 7723 ', 'M '),
( '15535399-6 ', ' ', 'Vélez ', '1975-7-18 ', 'Nazaret ','+56989212914', '(2) 22951 7041 ', 'M '),
( '15543512-7 ', 'Chamorro ', 'Calderon ', '1975-5-23 ', 'Teodoro ','+56957132876', '(2) 24150 3443 ', 'M '),
( '15556118-1 ', ' ', 'Berenguer ', '1975-10-28 ', 'Aníbal ','+56944798431', '(2) 22580 7734 ', 'M '),
( '15560302-k ', ' ', 'Carrera ', '1975-9-27 ', 'Pepita ','+56979706745', '(2) 27017 3421 ', 'F '),
( '15565853-3 ', ' ', 'Querol ', '1975-5-11 ', 'Noelia ','+56971726013', '(2) 22298 2098 ', 'F '),
( '15567123-8 ', 'Roman ', 'Anaya ', '1975-1-27 ', 'Magdalena ','+56989496746', '(2) 22711 8195 ', 'F '),
( '15575064-2 ', ' ', 'Hidalgo ', '1975-4-17 ', 'Rosario ','+56943706414', '(2) 21451 8861 ', 'M '),
( '15586228-9 ', ' ', 'Correa ', '1975-9-5 ', 'Guillermo ','+56964103537', '(2) 26550 6151 ', 'M '),
( '15593079-9 ', ' ', ' ', '1975-11-11 ', 'Otilia ','+56982656845', '(2) 21915 2543 ', 'F '),
( '15601153-3 ', ' ', 'Guardiola ', '1975-9-6 ', 'Jesusa ','+56916752331', '(2) 22194 4964 ', 'F '),
( '15609722-5 ', ' ', 'Terrón ', '1975-12-4 ', 'Paula ','+56947236050', '(2) 26851 6934 ', 'F '),
( '15614408-8 ', ' ', 'Monreal ', '1975-7-25 ', 'César ','+56958783666', '(2) 23711 7626 ', 'M '),
( '15617091-7 ', ' ', 'Cabezas ', '1975-6-3 ', 'Aroa ','+56982444441', '(2) 27122 6022 ', 'F '),
( '15630700-9 ', ' ', 'Ferrández ', '1975-10-2 ', 'Anunciación ','+56982626676', '(2) 21645 3971 ', 'M '),
( '15640102-1 ', ' ', 'Cantero ', '1975-7-23 ', 'Mirta ','+56970181156', '(2) 22119 1303 ', 'F '),
( '15652002-0 ', ' ', 'Orozco ', '1975-12-3 ', 'Salvador ','+56979902047', '(2) 21628 3885 ', 'M '),
( '15671466-6 ', ' ', 'Arnal ', '1975-9-23 ', 'Xavier ','+56925798611', '(2) 28352 1965 ', 'M '),
( '15673055-6 ', ' ', 'Exposito ', '1975-11-1 ', 'Lina ','+56983505058', '(2) 24937 2903 ', 'F '),
( '15691444-4 ', ' ', 'Oliva ', '1975-11-5 ', 'Teo ','+56988643123', '(2) 23566 7396 ', 'M '),
( '15706420-7 ', 'Cabañas ', 'Sofía ', '1975-8-7 ', 'Evita ','+56942456767', '(2) 23275 5493 ', 'F '),
( '15709080-1 ', ' ', 'Gracia ', '1975-4-23 ', 'Tristán ','+56988105234', '(2) 23968 6293 ', 'M '),
( '15709726-1 ', ' ', 'Ferrero ', '1975-6-27 ', 'Nadia ','+56978226955', '(2) 24656 5301 ', 'F '),
( '15727523-2 ', ' ', 'Tirado ', '1975-8-10 ', 'Trinidad ','+56986664457', '(2) 28529 7979 ', 'M '),
( '15728824-5 ', ' ', 'Gelabert ', '1975-6-23 ', 'José ','+56944424010', '(2) 22114 7141 ', 'M '),
( '15735595-3 ', ' ', 'Mata ', '1975-9-1 ', 'Concepción ','+56932388086', '(2) 28502 5993 ', 'M '),
( '15759200-9 ', ' ', ' ', '1975-8-10 ', 'Lupe ','+56938855030', '(2) 28958 2646 ', 'M '),
( '15770343-9 ', ' ', 'Collado ', '1975-12-24 ', 'Natividad ','+56968784138', '(2) 23909 3018 ', 'M '),
( '15783910-1 ', ' ', ' ', '1975-10-23 ', 'René ','+56911648052', '(2) 21853 6530 ', 'M '),
( '15804963-5 ', ' ', 'Aragón ', '1975-8-21 ', 'Lidia ','+56954498436', '(2) 21396 4054 ', 'F '),
( '15815361-0 ', 'Palacios ', 'Victor ', '1975-2-15 ', 'Luis ','+56935863790', '(2) 25321 4771 ', 'M '),
( '15817798-6 ', ' ', 'Ripoll ', '1975-11-12 ', 'Adora ','+56960832766', '(2) 24653 8982 ', 'F '),
( '15827041-2 ', 'Huerta ', 'Mari ', '1975-8-26 ', 'Jordi ','+56945237344', '(2) 26636 7657 ', 'M '),
( '15833885-8 ', ' ', 'Pagès ', '1975-9-13 ', 'Tiburcio ','+56942726767', '(2) 24036 3080 ', 'M '),
( '15845559-5 ', ' ', ' ', '1975-3-9 ', 'Raimundo ','+56987713149', '(2) 28735 7563 ', 'M '),
( '15852575-5 ', ' ', 'Borrego ', '1974-8-20 ', 'Liliana ','+56971218313', '(2) 27160 1524 ', 'F '),
( '15897578-5 ', ' ', 'Molina ', '1974-2-9 ', 'Vicenta ','+56956391824', '(2) 26650 4288 ', 'F '),
( '15918157-k ', ' ', 'Guillén ', '1974-6-9 ', 'Natalia ','+56966584865', '(2) 21081 7329 ', 'F '),
( '15921217-3 ', ' ', 'Iñiguez ', '1974-6-14 ', 'Ovidio ','+56934415112', '(2) 22157 5440 ', 'M '),
( '15931750-1 ', ' ', 'Sevillano ', '1974-5-25 ', 'Teodora ','+56978513817', '(2) 23090 6256 ', 'F '),
( '15931800-1 ', ' ', 'Gargallo ', '1974-4-28 ', 'Sebastián ','+56960407720', '(2) 23781 8341 ', 'M '),
( '15933801-0 ', 'Barba ', 'Girona ', '1974-12-26 ', 'Edelmiro ','+56927885112', '(2) 24708 1707 ', 'M '),
( '15949539-6 ', ' ', 'Pellicer ', '1974-12-23 ', 'Severino ','+56915904669', '(2) 25102 2765 ', 'M '),
( '15961213-9 ', ' ', 'Iñiguez ', '1974-9-24 ', 'Jorge ','+56925296682', '(2) 28238 8318 ', 'M '),
( '15973612-1 ', ' ', ' ', '1974-4-3 ', 'Heliodoro ','+56930764889', '(2) 21245 1875 ', 'M '),
( '15981886-1 ', ' ', 'Pallarès ', '1974-3-22 ', 'Reyes ','+56931266381', '(2) 27914 8470 ', 'M '),
( '15986829-k ', ' ', 'Tamayo ', '1974-4-1 ', 'Rosalina ','+56937651455', '(2) 28402 4326 ', 'F '),
( '15994883-8 ', ' ', 'Uriarte ', '1974-9-25 ', 'Plácido ','+56973538979', '(2) 27532 1708 ', 'M '),
( '16002603-0 ', ' ', 'Mata ', '1974-10-27 ', 'Ovidio ','+56981898753', '(2) 21314 6559 ', 'M '),
( '16020148-7 ', ' ', 'Águila ', '1974-9-12 ', 'Dora ','+56913277158', '(2) 28627 2020 ', 'F '),
( '16027923-0 ', ' ', ' ', '1974-3-1 ', 'Ildefonso ','+56940134418', '(2) 28505 8125 ', 'M '),
( '16046570-0 ', ' ', ' ', '1974-2-21 ', 'Manu ','+56985743915', '(2) 26898 2468 ', 'M '),
( '16046712-6 ', 'Murillo ', 'Reyes ', '1974-7-13 ', 'Lisandro ','+56923701389', '(2) 26428 3443 ', 'M '),
( '16052260-7 ', ' ', 'Antúnez ', '1974-9-10 ', 'Rolando ','+56970893986', '(2) 28188 4321 ', 'M '),
( '16090908-0 ', ' ', 'Hoz ', '1974-12-2 ', 'Juan ','+56987661177', '(2) 27845 7967 ', 'M '),
( '16110739-5 ', ' ', 'Ribas ', '1974-3-10 ', 'Anunciación ','+56916732277', '(2) 27021 5605 ', 'M '),
( '16140312-1 ', ' ', 'Gallart ', '1974-11-16 ', 'Luisa ','+56919495919', '(2) 25613 5827 ', 'F '),
( '16152457-3 ', ' ', 'Beltran ', '1974-11-25 ', 'Rolando ','+56961425041', '(2) 22386 2730 ', 'M '),
( '16157921-1 ', ' ', 'Madrigal ', '1974-5-22 ', 'Eugenio ','+56957157744', '(2) 23005 5139 ', 'M '),
( '16158212-3 ', ' ', ' ', '1974-2-13 ', 'Martirio ','+56952281974', '(2) 26368 4527 ', 'M '),
( '16200275-9 ', ' ', 'Uriarte ', '1974-1-26 ', 'Timoteo ','+56981446466', '(2) 25472 4316 ', 'M '),
( '16200926-5 ', ' ', 'Roura ', '1974-12-28 ', 'Ezequiel ','+56962691644', '(2) 21565 6030 ', 'M '),
( '16208187-k ', ' ', 'Codina ', '1974-9-4 ', 'Guillermo ','+56964852237', '(2) 25161 4372 ', 'M '),
( '16219843-2 ', ' ', 'Verdú ', '1974-10-13 ', 'Espiridión ','+56952544047', '(2) 24906 4153 ', 'M '),
( '16243986-3 ', ' ', ' ', '1974-9-14 ', 'Irene ','+56989762563', '(2) 21593 8036 ', 'M '),
( '16254652-k ', ' ', 'Ricart ', '1974-8-8 ', 'Micaela ','+56965254658', '(2) 27571 5805 ', 'F '),
( '16265458-6 ', ' ', 'Ruano ', '1974-6-7 ', 'Gema ','+56961705382', '(2) 26675 7287 ', 'F '),
( '16269763-3 ', ' ', 'Benitez ', '1974-6-1 ', 'Agustina ','+56988847038', '(2) 21120 8439 ', 'F '),
( '16275663-k ', ' ', 'Torrijos ', '1974-3-10 ', 'Vasco ','+56910888916', '(2) 28493 2397 ', 'M '),
( '16283289-1 ', ' ', 'Goicoechea ', '1974-8-19 ', 'Visitación ','+56942305482', '(2) 24509 6299 ', 'M '),
( '16293629-8 ', ' ', 'Uribe ', '1973-10-14 ', 'Perlita ','+56944881857', '(2) 26029 5375 ', 'F '),
( '16301869-1 ', ' ', 'Sainz ', '1973-8-13 ', 'Andrea ','+56979128638', '(2) 24262 7771 ', 'F '),
( '16306398-0 ', ' ', 'Ródenas ', '1973-6-25 ', 'Bartolomé ','+56959392928', '(2) 27181 4724 ', 'M '),
( '16320808-3 ', ' ', 'Gallego ', '1973-6-12 ', 'Bonifacio ','+56952773787', '(2) 22366 6254 ', 'M '),
( '16327714-k ', ' ', 'Gallardo ', '1973-11-13 ', 'Samuel ','+56972845650', '(2) 24921 4008 ', 'M '),
( '16340925-9 ', ' ', 'Cuesta ', '1973-4-17 ', 'Malena ','+56933151574', '(2) 23902 5789 ', 'F '),
( '16343046-0 ', 'Piña ', 'Arranz ', '1973-11-8 ', 'Liliana ','+56972271867', '(2) 27212 3676 ', 'F '),
( '16365693-0 ', ' ', 'Río ', '1973-1-7 ', 'Manolo ','+56913822782', '(2) 27189 7360 ', 'M '),
( '16380698-3 ', ' ', ' ', '1973-4-12 ', 'Guadalupe ','+56946231140', '(2) 27434 4652 ', 'M '),
( '16382201-6 ', ' ', 'Alvarado ', '1973-12-23 ', 'Pánfilo ','+56977511666', '(2) 27095 5056 ', 'M '),
( '16387064-9 ', ' ', 'Villar ', '1973-6-14 ', 'Faustino ','+56954483184', '(2) 27950 6134 ', 'M '),
( '16399091-1 ', ' ', 'Galiano ', '1973-9-17 ', 'Joaquín ','+56961261442', '(2) 24183 5658 ', 'M '),
( '16411398-1 ', ' ', 'Bueno ', '1973-10-16 ', 'Evaristo ','+56985565964', '(2) 23031 7213 ', 'M '),
( '16413787-2 ', 'Montserrat ', 'Bautista ', '1973-5-12 ', 'Andrea ','+56942683014', '(2) 21660 7502 ', 'F '),
( '16416810-7 ', ' ', 'Domínguez ', '1973-1-19 ', 'Eufemia ','+56977282036', '(2) 25223 3928 ', 'F '),
( '16418565-6 ', ' ', 'Pintor ', '1973-12-19 ', 'Pelayo ','+56973291574', '(2) 24414 1459 ', 'M '),
( '16419175-3 ', 'Ariza ', 'Fernandez ', '1973-9-18 ', 'Araceli ','+56951887742', '(2) 23998 2517 ', 'M '),
( '16420673-4 ', 'Priego ', 'Mármol ', '1973-3-26 ', 'Juan ','+56939147080', '(2) 24308 6189 ', 'M '),
( '16422889-4 ', ' ', 'Saura ', '1973-5-17 ', 'Celestina ','+56975575584', '(2) 26035 7180 ', 'F '),
( '16429457-9 ', ' ', 'Cortes ', '1973-3-2 ', 'Manuela ','+56939615920', '(2) 28656 4662 ', 'F '),
( '16432337-4 ', ' ', 'Sanz ', '1973-1-14 ', 'Ágata ','+56966788118', '(2) 24394 3932 ', 'F '),
( '16442929-6 ', ' ', 'Madrigal ', '1973-10-12 ', 'Macario ','+56942668373', '(2) 25522 1282 ', 'M '),
( '16452081-1 ', 'Quintanilla ', 'Peñas ', '1973-7-28 ', 'Griselda ','+56981526985', '(2) 26917 8008 ', 'F '),
( '16469701-0 ', 'Ponce ', 'Aguilar ', '1973-4-1 ', 'Aníbal ','+56912243757', '(2) 22831 1821 ', 'M '),
( '16477207-1 ', 'Alcolea ', 'Emiliano ', '1973-10-28 ', 'Jose ','+56951226123', '(2) 24155 4490 ', 'M '),
( '16484467-6 ', ' ', 'Morata ', '1973-10-8 ', 'Goyo ','+56961354149', '(2) 26884 6605 ', 'M '),
( '16503858-4 ', ' ', 'Martínez ', '1973-10-26 ', 'Nazaret ','+56977533243', '(2) 22368 3411 ', 'M '),
( '16527013-4 ', ' ', 'Dueñas ', '1973-5-10 ', 'Erasmo ','+56913105012', '(2) 25434 8065 ', 'M '),
( '16536843-6 ', ' ', ' ', '1973-11-12 ', 'Alcides ','+56931242136', '(2) 21406 7762 ', 'M '),
( '16540074-7 ', ' ', 'Espejo ', '1973-3-8 ', 'Horacio ','+56979287070', '(2) 25446 8030 ', 'M '),
( '16554719-5 ', ' ', 'Morata ', '1973-2-28 ', 'Leandra ','+56950684860', '(2) 21497 8187 ', 'F '),
( '16563570-1 ', ' ', 'Vigil ', '1973-9-28 ', 'Clímaco ','+56922578619', '(2) 22733 8770 ', 'M '),
( '16574801-8 ', ' ', 'Fajardo-Benito ', '1973-6-26 ', 'Juan ','+56956171124', '(2) 24280 8469 ', 'M '),
( '16579103-7 ', ' ', 'Monreal ', '1973-9-3 ', 'Ariel ','+56957617161', '(2) 24913 5343 ', 'M '),
( '16588908-8 ', ' ', 'Solana ', '1973-3-28 ', 'Leocadio ','+56982225248', '(2) 21986 1971 ', 'M '),
( '16589970-9 ', ' ', 'Ojeda ', '1973-6-12 ', 'Maricela ','+56989124236', '(2) 23918 8937 ', 'F '),
( '16590901-1 ', 'Escobar ', 'Bayón ', '1973-1-17 ', 'Ofelia ','+56989562181', '(2) 21431 3587 ', 'F '),
( '16594034-2 ', ' ', 'Villalobos ', '1973-6-8 ', 'Zoraida ','+56971707157', '(2) 23204 3482 ', 'F '),
( '16603922-3 ', 'Diaz ', 'Avilés ', '1973-1-8 ', 'Íñigo ','+56918608357', '(2) 21426 2724 ', 'M '),
( '16621397-5 ', ' ', 'Amigó ', '1973-11-22 ', 'Inocencio ','+56974443390', '(2) 25686 8626 ', 'M '),
( '16631499-2 ', ' ', ' ', '1973-5-20 ', 'Gil ','+56925612737', '(2) 25990 1948 ', 'M '),
( '16637488-k ', ' ', 'Parra ', '1973-6-3 ', 'Marina ','+56926806378', '(2) 21492 6156 ', 'F '),
( '16643805-5 ', ' ', ' ', '1973-5-24 ', 'Bautista ','+56932903913', '(2) 23859 7787 ', 'F '),
( '16654445-9 ', ' ', 'Lluch ', '1973-3-15 ', 'Charo ','+56938216917', '(2) 28982 5597 ', 'M '),
( '16660886-4 ', ' ', ' ', '1973-5-6 ', 'Hernando ','+56943298629', '(2) 25864 4675 ', 'M '),
( '16665782-2 ', ' ', 'Chamorro ', '1973-5-6 ', 'Timoteo ','+56955357926', '(2) 28366 4363 ', 'M '),
( '16665899-3 ', ' ', 'Escamilla ', '1973-10-15 ', 'Lucho ','+56962764241', '(2) 26729 8484 ', 'M '),
( '16666436-5 ', ' ', 'Valenciano ', '1973-9-9 ', 'Toño ','+56977227557', '(2) 27144 2937 ', 'M '),
( '16669072-2 ', ' ', 'Fonseca ', '1973-12-26 ', 'Heriberto ','+56972312326', '(2) 24138 8838 ', 'M '),
( '16672251-9 ', ' ', 'Egea ', '1973-11-3 ', 'Alonso ','+56986303821', '(2) 24057 8542 ', 'M '),
( '16685640-k ', ' ', 'Calderon ', '1972-6-27 ', 'Manuela ','+56946806269', '(2) 28408 1527 ', 'F '),
( '16698356-8 ', 'Estevez ', 'Guardia ', '1972-2-7 ', 'Vicente ','+56937409073', '(2) 21549 8403 ', 'M '),
( '16711678-7 ', ' ', ' ', '1972-10-15 ', 'María ','+56911568470', '(2) 28995 6297 ', 'F '),
( '16716231-2 ', ' ', 'Azorin ', '1972-5-15 ', 'Íñigo ','+56912571717', '(2) 23869 7416 ', 'M '),
( '16717181-8 ', ' ', 'Piñol ', '1972-2-7 ', 'Marcial ','+56945796316', '(2) 22089 1483 ', 'M '),
( '16720319-1 ', ' ', 'García ', '1972-2-16 ', 'Goyo ','+56940807714', '(2) 22191 7359 ', 'M '),
( '16721160-7 ', ' ', ' ', '1972-2-1 ', 'Leoncio ','+56920155883', '(2) 24929 2441 ', 'M '),
( '16729935-0 ', ' ', 'Palomino ', '1972-4-22 ', 'Arsenio ','+56936116319', '(2) 26841 3551 ', 'M '),
( '16743869-5 ', ' ', 'Torrecilla ', '1972-4-23 ', 'Leticia ','+56911637916', '(2) 23100 5690 ', 'F '),
( '16744461-k ', ' ', ' ', '1972-9-20 ', 'Juan ','+56922835588', '(2) 26686 4203 ', 'M '),
( '16745402-k ', ' ', 'Pedrero ', '1972-11-7 ', 'Rocío ','+56944785611', '(2) 24198 4728 ', 'M '),
( '16759381-k ', ' ', 'Morán ', '1972-8-21 ', 'Marcio ','+56936802325', '(2) 24357 3357 ', 'M '),
( '16772015-3 ', ' ', 'Nieto-Franch ', '1972-1-12 ', 'María ','+56979754787', '(2) 25230 3118 ', 'F '),
( '16776725-7 ', ' ', 'Arévalo ', '1972-11-5 ', 'Chus ','+56978726568', '(2) 23173 5444 ', 'M '),
( '16785855-4 ', ' ', ' ', '1972-8-19 ', 'Fabián ','+56948827671', '(2) 24891 8781 ', 'M '),
( '16815535-2 ', ' ', 'Saavedra ', '1972-3-19 ', 'Dimas ','+56957545429', '(2) 25957 2812 ', 'M '),
( '16822010-3 ', ' ', 'Abella ', '1972-12-1 ', 'Lucía ','+56941466183', '(2) 26914 6660 ', 'F '),
( '16827933-7 ', ' ', 'Solé ', '1972-10-24 ', 'Juanito ','+56917835628', '(2) 25890 6179 ', 'M '),
( '16831263-6 ', ' ', 'Hernández ', '1972-3-22 ', 'Fabiola ','+56970477675', '(2) 27282 8457 ', 'F '),
( '16837363-5 ', ' ', 'Bernad ', '1972-9-6 ', 'Rosalina ','+56950216736', '(2) 26660 4893 ', 'F '),
( '16840694-0 ', 'Boix ', 'Cisneros ', '1972-10-10 ', 'Jacobo ','+56912235667', '(2) 25686 2332 ', 'M '),
( '16845249-7 ', ' ', 'Estevez ', '1972-11-16 ', 'Iris ','+56942643288', '(2) 26373 6004 ', 'M '),
( '16847347-8 ', 'Vallejo ', 'Cerezo ', '1972-8-21 ', 'Alma ','+56940877970', '(2) 27194 3473 ', 'F '),
( '16848191-8 ', ' ', 'Cordero ', '1972-1-4 ', 'Ema ','+56936166322', '(2) 22851 7807 ', 'F '),
( '16852945-7 ', ' ', 'Fernandez ', '1972-5-2 ', 'Alex ','+56946883362', '(2) 28858 1394 ', 'M '),
( '16856729-4 ', ' ', 'Osuna ', '1972-10-4 ', 'Ildefonso ','+56956908865', '(2) 21271 8740 ', 'M '),
( '16873869-2 ', ' ', 'Batalla ', '1972-9-4 ', 'Febe ','+56959833690', '(2) 24255 6539 ', 'M '),
( '16885505-2 ', ' ', 'Ibarra ', '1972-2-9 ', 'Irma ','+56949477163', '(2) 26386 4973 ', 'F '),
( '16911128-6 ', ' ', 'Morante ', '1972-5-21 ', 'Eloy ','+56948554124', '(2) 24868 7091 ', 'M '),
( '16930522-6 ', 'Blázquez ', 'Galiano ', '1972-4-9 ', 'Eva ','+56919884775', '(2) 23747 5849 ', 'F '),
( '16943453-0 ', ' ', 'Pineda ', '1972-2-2 ', 'Isaac ','+56975218340', '(2) 24074 3526 ', 'M '),
( '16953607-4 ', ' ', 'Cabeza ', '1972-7-8 ', 'Roque ','+56961415577', '(2) 27771 6639 ', 'M '),
( '16985866-7 ', 'Moraleda ', 'Jódar ', '1972-12-24 ', 'Sigfrido ','+56924535175', '(2) 27028 6252 ', 'M '),
( '16991425-7 ', ' ', 'Ramos ', '1972-12-25 ', 'Nazaret ','+56970246438', '(2) 24962 3725 ', 'M '),
( '16992222-5 ', ' ', ' ', '1972-9-6 ', 'Valero ','+56910463629', '(2) 22220 5356 ', 'M '),
( '16992885-1 ', ' ', ' ', '1972-5-25 ', 'Consuela ','+56938798510', '(2) 28500 2512 ', 'F '),
( '17015583-1 ', 'Morán ', 'Girona ', '1972-11-4 ', 'Selena ','+56962745765', '(2) 24528 2936 ', 'F '),
( '17022813-8 ', ' ', ' ', '1972-7-17 ', 'Camilo ','+56935443877', '(2) 23041 7532 ', 'M '),
( '17024758-2 ', ' ', 'Ramis ', '1972-12-28 ', 'Noé ','+56975497649', '(2) 22443 1184 ', 'M '),
( '17028114-4 ', ' ', 'Nadal ', '1972-9-4 ', 'Atilio ','+56940268039', '(2) 21755 5646 ', 'M '),
( '17038957-3 ', ' ', ' ', '1972-4-26 ', 'Victoria ','+56911851222', '(2) 21301 6622 ', 'F '),
( '17042778-5 ', ' ', 'Villalonga ', '1972-4-21 ', 'Chus ','+56912193811', '(2) 26383 2948 ', 'M '),
( '17057088-k ', ' ', ' ', '1972-5-13 ', 'Consuelo ','+56977284110', '(2) 21415 5456 ', 'M '),
( '17086907-9 ', ' ', ' ', '1972-1-16 ', 'Consuelo ','+56952619018', '(2) 24220 3475 ', 'M '),
( '17089467-7 ', ' ', 'Pagès ', '1971-10-16 ', 'Dora ','+56983238612', '(2) 24366 1535 ', 'F '),
( '17091096-6 ', ' ', 'Pascual ', '1971-7-11 ', 'Amada ','+56955105784', '(2) 23620 3006 ', 'F '),
( '17102846-9 ', 'Aragón ', 'Sanz ', '1971-6-8 ', 'Haroldo ','+56929512534', '(2) 23303 4626 ', 'M '),
( '17105152-5 ', ' ', 'Acevedo ', '1971-2-13 ', 'Jacinto ','+56935446222', '(2) 28872 4916 ', 'M '),
( '17108948-4 ', ' ', 'Gibert ', '1971-7-22 ', 'Jose ','+56973678967', '(2) 28268 8642 ', 'M '),
( '17122886-7 ', ' ', 'Peralta ', '1971-1-1 ', 'Arsenio ','+56919875673', '(2) 25990 8723 ', 'M '),
( '17125581-3 ', ' ', ' ', '1971-3-18 ', 'Aarón ','+56931643760', '(2) 24420 5810 ', 'M '),
( '17134387-9 ', 'Vélez ', 'Anguita ', '1971-11-4 ', 'Yésica ','+56962424166', '(2) 26953 6979 ', 'F '),
( '17145040-3 ', ' ', 'Mateos ', '1971-5-3 ', 'Julie ','+56941667968', '(2) 28626 3018 ', 'M '),
( '17156977-k ', 'Poza ', 'Gonzalo ', '1971-9-18 ', 'Efraín ','+56944278123', '(2) 23074 1672 ', 'M '),
( '17160551-2 ', 'Tamarit ', 'Victorino ', '1971-6-27 ', 'Juan ','+56983163625', '(2) 28664 8220 ', 'M '),
( '17166705-4 ', ' ', 'Pastor ', '1971-10-17 ', 'Adán ','+56984235568', '(2) 25666 1598 ', 'M '),
( '17167932-k ', ' ', 'Fabra ', '1971-10-7 ', 'Casandra ','+56990655179', '(2) 24918 6600 ', 'F '),
( '17190657-1 ', ' ', 'Mayol ', '1971-5-24 ', 'Pilar ','+56957591912', '(2) 26861 1287 ', 'M '),
( '17198003-8 ', ' ', 'Castells ', '1971-8-4 ', 'Sonia ','+56917187725', '(2) 24863 6968 ', 'F '),
( '17206784-0 ', ' ', 'Echeverría ', '1971-4-20 ', 'Marisela ','+56947842860', '(2) 23549 7125 ', 'F '),
( '17209289-6 ', ' ', 'Alemany ', '1971-9-8 ', 'Emigdio ','+56969668653', '(2) 22533 8564 ', 'M '),
( '17215797-1 ', ' ', 'Lladó ', '1971-11-4 ', 'Delia ','+56990527138', '(2) 26360 5915 ', 'F '),
( '17217511-2 ', ' ', 'Avilés ', '1971-2-27 ', 'René ','+56974763937', '(2) 23378 6492 ', 'M '),
( '17245857-2 ', ' ', 'Rios ', '1971-8-27 ', 'Abraham ','+56950658920', '(2) 23169 6213 ', 'M '),
( '17255051-7 ', ' ', 'Garcés ', '1971-9-12 ', 'Fernanda ','+56935377870', '(2) 23084 7582 ', 'F '),
( '17257333-9 ', ' ', 'Bello ', '1971-8-13 ', 'Perla ','+56939205726', '(2) 25791 5284 ', 'F '),
( '17261510-4 ', ' ', 'Oller ', '1971-10-13 ', 'Evaristo ','+56959253642', '(2) 26623 6823 ', 'M '),
( '17272719-0 ', ' ', 'Alfonso ', '1971-6-20 ', 'Virgilio ','+56970711311', '(2) 26746 1853 ', 'M '),
( '17288657-4 ', ' ', ' ', '1971-2-19 ', 'Sabas ','+56926506449', '(2) 23379 5866 ', 'M '),
( '17306575-2 ', ' ', 'Coloma ', '1971-6-6 ', 'Luciana ','+56986417345', '(2) 24350 7088 ', 'F '),
( '17306582-5 ', ' ', 'Belmonte ', '1971-2-26 ', 'Georgina ','+56964895855', '(2) 21434 3071 ', 'F '),
( '17340339-9 ', ' ', 'Peralta ', '1971-1-14 ', 'Matías ','+56973746674', '(2) 24497 1996 ', 'M '),
( '17340745-9 ', ' ', 'Solé ', '1971-8-12 ', 'Cristian ','+56946751068', '(2) 27434 2310 ', 'M '),
( '17345780-4 ', ' ', ' ', '1971-10-20 ', 'Jennifer ','+56967385211', '(2) 28187 2006 ', 'M '),
( '17349210-3 ', ' ', 'Agullo ', '1971-7-1 ', 'Áurea ','+56953264664', '(2) 28977 1039 ', 'F '),
( '17365106-6 ', ' ', 'Suarez ', '1971-11-23 ', 'Cándido ','+56920253332', '(2) 24251 6657 ', 'M '),
( '17378283-7 ', ' ', 'Guzmán ', '1971-8-6 ', 'Silvestre ','+56965555627', '(2) 24502 1447 ', 'M '),
( '17382963-9 ', ' ', ' ', '1971-6-13 ', 'Marcos ','+56966455068', '(2) 22887 1159 ', 'M '),
( '17386909-6 ', ' ', 'Adadia ', '1971-7-19 ', 'Heraclio ','+56910668061', '(2) 26156 6473 ', 'M '),
( '17389967-k ', ' ', 'Trujillo ', '1971-1-6 ', 'Matías ','+56922693182', '(2) 21575 6396 ', 'M '),
( '17410219-8 ', 'Requena ', 'Galván ', '1971-10-21 ', 'Isaura ','+56939104516', '(2) 23137 2038 ', 'F '),
( '17415920-3 ', ' ', 'Sandoval ', '1971-2-12 ', 'Cristina ','+56965751222', '(2) 25529 6272 ', 'F '),
( '17427726-5 ', ' ', 'Fonseca ', '1971-3-15 ', 'Ruy ','+56917718210', '(2) 26595 4622 ', 'M '),
( '17434178-8 ', ' ', ' ', '1971-5-19 ', 'Gaspar ','+56944404110', '(2) 27912 1812 ', 'M '),
( '17488738-1 ', ' ', 'Lastra ', '1971-1-28 ', 'Violeta ','+56981443676', '(2) 24422 2778 ', 'F '),
( '17496764-4 ', 'Gilabert ', 'Ribes ', '1970-3-9 ', 'Jessica ','+56965743218', '(2) 22919 3720 ', 'F '),
( '17496959-0 ', ' ', ' ', '1970-7-8 ', 'Damián ','+56940214413', '(2) 24950 5519 ', 'M '),
( '17504306-3 ', ' ', ' ', '1970-5-8 ', 'Amada ','+56922774145', '(2) 23016 5774 ', 'F '),
( '17510703-7 ', ' ', 'Pedrero ', '1970-3-10 ', 'Luisa ','+56930595653', '(2) 26443 7827 ', 'F '),
( '17510923-4 ', ' ', 'Pi ', '1970-9-10 ', 'Nicanor ','+56916904553', '(2) 23025 8959 ', 'M '),
( '17513847-1 ', ' ', ' ', '1970-3-23 ', 'Ángeles ','+56956205155', '(2) 22211 4067 ', 'M '),
( '17515016-1 ', ' ', 'Almeida ', '1970-8-23 ', 'Bernardo ','+56916497680', '(2) 23785 4028 ', 'M '),
( '17516176-7 ', ' ', ' ', '1970-1-19 ', 'Raúl ','+56920294642', '(2) 28436 7910 ', 'M '),
( '17517892-9 ', ' ', 'Cabello ', '1970-1-13 ', 'Estefanía ','+56915168639', '(2) 27601 2742 ', 'F '),
( '17523182-k ', ' ', 'Carreras ', '1970-5-17 ', 'Amanda ','+56922801539', '(2) 26533 6452 ', 'F '),
( '17526299-7 ', ' ', 'Muñoz ', '1970-12-14 ', 'Bárbara ','+56940578666', '(2) 26230 6228 ', 'F '),
( '17528329-3 ', ' ', ' ', '1970-1-11 ', 'Imelda ','+56929603137', '(2) 21622 1422 ', 'F '),
( '17544384-3 ', 'Hernández ', 'Rivera ', '1970-2-19 ', 'Delfina ','+56916368059', '(2) 23610 8975 ', 'F '),
( '17548626-7 ', ' ', 'Martin ', '1970-11-14 ', 'Alfonso ','+56963527526', '(2) 27037 2827 ', 'M '),
( '17551533-k ', ' ', 'Jove ', '1970-2-6 ', 'Mamen ','+56912868447', '(2) 28395 5666 ', 'M '),
( '17574582-3 ', ' ', ' ', '1970-6-18 ', 'Hipólito ','+56928613386', '(2) 25599 5947 ', 'M '),
( '17578021-1 ', ' ', 'Miguel-Gutierrez ', '1970-8-3 ', 'Ana ','+56933573552', '(2) 27586 7452 ', 'F '),
( '17591429-3 ', ' ', ' ', '1970-7-26 ', 'Emilio ','+56955534366', '(2) 21230 4658 ', 'M '),
( '17599794-6 ', ' ', ' ', '1970-5-25 ', 'Aitana ','+56915384773', '(2) 22916 7640 ', 'F '),
( '17612335-4 ', ' ', ' ', '1970-9-13 ', 'Américo ','+56921518161', '(2) 27893 8859 ', 'M '),
( '17627037-3 ', ' ', 'Contreras ', '1970-10-25 ', 'Lisandro ','+56970882316', '(2) 27477 7865 ', 'M '),
( '17630615-7 ', ' ', 'Canet ', '1970-12-19 ', 'Jenaro ','+56912834579', '(2) 22530 5580 ', 'M '),
( '17643244-6 ', ' ', ' ', '1970-8-4 ', 'Mireia ','+56938903918', '(2) 23618 5615 ', 'F '),
( '17647355-k ', ' ', ' ', '1970-6-14 ', 'Faustino ','+56948731831', '(2) 27669 5944 ', 'M '),
( '17648399-7 ', ' ', ' ', '1970-7-5 ', 'Eric ','+56964307780', '(2) 26274 4925 ', 'M '),
( '17651138-9 ', ' ', 'Rubio ', '1970-4-24 ', 'Duilio ','+56941255073', '(2) 28915 8815 ', 'M '),
( '17672481-1 ', ' ', 'Royo ', '1970-8-15 ', 'Constanza ','+56929878026', '(2) 28294 5916 ', 'F '),
( '17676307-8 ', ' ', 'Márquez ', '1970-6-8 ', 'Rómulo ','+56947196757', '(2) 22700 7901 ', 'M '),
( '17696112-0 ', ' ', 'Amor ', '1970-10-4 ', 'Evangelina ','+56932163574', '(2) 25810 1328 ', 'F '),
( '17707464-0 ', 'Piquer ', 'Benavides ', '1970-4-7 ', 'Leonardo ','+56955392364', '(2) 26240 3034 ', 'M '),
( '17716337-6 ', ' ', 'Mendoza ', '1970-4-11 ', 'Gilberto ','+56914366864', '(2) 22529 1971 ', 'M '),
( '17720800-0 ', ' ', 'Amores ', '1970-2-11 ', 'Faustino ','+56927367774', '(2) 22021 5775 ', 'M '),
( '17728887-k ', ' ', 'Grau ', '1970-4-27 ', 'Román ','+56923634964', '(2) 27201 6672 ', 'M '),
( '17747682-k ', ' ', 'Campos ', '1970-8-4 ', 'Joaquina ','+56965326254', '(2) 27511 1832 ', 'F '),
( '17747986-1 ', ' ', 'Almansa ', '1970-6-5 ', 'Pablo ','+56979538461', '(2) 23028 5156 ', 'M '),
( '17777532-0 ', ' ', ' ', '1969-5-18 ', 'Noé ','+56966142979', '(2) 26368 5612 ', 'M '),
( '17779762-6 ', ' ', 'Ferrándiz ', '1969-4-24 ', 'Ciriaco ','+56954654968', '(2) 27585 3346 ', 'M '),
( '17798706-9 ', ' ', ' ', '1969-10-16 ', 'Roldán ','+56970378249', '(2) 26881 6640 ', 'M '),
( '17802810-3 ', ' ', 'Alcolea ', '1969-5-11 ', 'Azahar ','+56913198642', '(2) 21095 8782 ', 'M '),
( '17810544-2 ', ' ', 'Díez-Carretero ', '1969-1-11 ', 'María ','+56970247937', '(2) 26938 1075 ', 'F '),
( '17817613-7 ', ' ', 'Villegas ', '1969-4-7 ', 'Julia ','+56966541686', '(2) 26959 1240 ', 'F '),
( '17819072-5 ', ' ', 'Huertas ', '1969-4-23 ', 'Marina ','+56920226780', '(2) 22319 7853 ', 'F '),
( '17825245-3 ', ' ', 'Poza ', '1969-12-25 ', 'Aarón ','+56960698416', '(2) 28579 2756 ', 'M '),
( '17846200-8 ', ' ', 'Aparicio ', '1969-12-4 ', 'Ovidio ','+56946903920', '(2) 25674 5472 ', 'M '),
( '17846240-7 ', ' ', 'Parejo ', '1969-3-17 ', 'Eduardo ','+56922652763', '(2) 28907 7812 ', 'M '),
( '17858210-0 ', 'Expósito ', 'Fábregas ', '1969-8-21 ', 'Francisco ','+56922198756', '(2) 27801 8597 ', 'M '),
( '17878199-5 ', ' ', 'Gual ', '1969-3-14 ', 'Jonatan ','+56983545852', '(2) 25940 5037 ', 'M '),
( '17888190-6 ', ' ', 'Talavera ', '1969-1-11 ', 'Ovidio ','+56952191429', '(2) 22886 3962 ', 'M '),
( '17901164-6 ', ' ', ' ', '1969-12-17 ', 'Ascensión ','+56921767516', '(2) 26586 2926 ', 'M '),
( '17908788-k ', ' ', 'Gálvez ', '1969-2-7 ', 'Jenaro ','+56934823490', '(2) 21893 1029 ', 'M '),
( '17917469-3 ', ' ', 'Portero ', '1969-2-21 ', 'Borja ','+56920476817', '(2) 27323 2967 ', 'F '),
( '17921289-7 ', ' ', 'Garrido ', '1969-8-16 ', 'Adrián ','+56941478851', '(2) 22013 1815 ', 'M '),
( '17933448-8 ', ' ', ' ', '1969-9-9 ', 'Rosario ','+56966185437', '(2) 22437 7919 ', 'M '),
( '17950136-8 ', 'Planas ', 'León ', '1969-12-15 ', 'Aránzazu ','+56958672219', '(2) 21799 7228 ', 'M '),
( '17960002-1 ', ' ', 'Bas ', '1969-5-9 ', 'Roxana ','+56985648646', '(2) 27044 3406 ', 'F '),
( '17981124-3 ', ' ', 'Durán ', '1969-8-1 ', 'Juanito ','+56985558440', '(2) 24874 8686 ', 'M '),
( '17996112-1 ', ' ', 'Coca ', '1969-10-5 ', 'Modesta ','+56987195662', '(2) 28060 2356 ', 'F '),
( '18023817-4 ', ' ', 'Riba ', '1969-4-6 ', 'Miguel ','+56975451247', '(2) 22664 2586 ', 'M '),
( '18024443-3 ', ' ', 'Gallo ', '1969-8-25 ', 'Lucio ','+56983877647', '(2) 21978 2736 ', 'M '),
( '18027932-6 ', 'Macías ', 'Matas ', '1969-2-3 ', 'Trinidad ','+56930439061', '(2) 22868 1315 ', 'M '),
( '18029066-4 ', ' ', 'Porras ', '1969-7-22 ', 'Alfredo ','+56954138970', '(2) 28503 2767 ', 'M '),
( '18058884-1 ', ' ', ' ', '1969-3-4 ', 'Roque ','+56927718330', '(2) 28826 7014 ', 'M '),
( '18059881-2 ', ' ', 'Estevez ', '1969-10-7 ', 'Édgar ','+56921622237', '(2) 23285 3589 ', 'M '),
( '18087272-8 ', ' ', 'Hoyos ', '1968-12-4 ', 'Domingo ','+56945812841', '(2) 24879 1763 ', 'M '),
( '18107022-6 ', ' ', ' ', '1968-3-18 ', 'Marianela ','+56967208140', '(2) 21080 8612 ', 'F '),
( '18113046-6 ', ' ', 'Montserrat ', '1968-3-21 ', 'Valero ','+56986602972', '(2) 25449 1948 ', 'M '),
( '18121760-k ', ' ', 'Carretero ', '1968-4-14 ', 'Moreno ','+56951447170', '(2) 23268 1488 ', 'M '),
( '18126350-4 ', ' ', ' ', '1968-10-1 ', 'Rolando ','+56916196838', '(2) 28507 4987 ', 'M '),
( '18131392-7 ', ' ', 'Andres ', '1968-3-6 ', 'Raúl ','+56918314239', '(2) 28148 2609 ', 'M '),
( '18136863-2 ', ' ', 'Perales ', '1968-7-1 ', 'Jonatan ','+56940754630', '(2) 22382 4030 ', 'M '),
( '18137035-1 ', ' ', 'Martin ', '1968-12-12 ', 'Eusebia ','+56910416813', '(2) 24305 4011 ', 'F '),
( '18137603-1 ', ' ', 'Cobos ', '1968-2-13 ', 'Nilo ','+56936212712', '(2) 21321 3285 ', 'M '),
( '18142901-1 ', ' ', 'Marti ', '1968-6-10 ', 'Maura ','+56964682144', '(2) 28085 1134 ', 'F '),
( '18149685-1 ', ' ', 'Santana ', '1968-8-2 ', 'Lucio ','+56938284756', '(2) 23276 5065 ', 'M '),
( '18167463-6 ', ' ', 'Calatayud ', '1968-5-14 ', 'Piedad ','+56960218755', '(2) 23435 7310 ', 'M '),
( '18170302-4 ', ' ', 'Roura ', '1968-4-11 ', 'Luisina ','+56951697519', '(2) 28974 8519 ', 'F '),
( '18182094-2 ', ' ', 'Anaya ', '1968-1-4 ', 'Candelas ','+56973716689', '(2) 21449 5278 ', 'M '),
( '18183784-5 ', ' ', 'Iniesta ', '1968-12-3 ', 'Mateo ','+56927266279', '(2) 28201 8406 ', 'M '),
( '18202329-9 ', ' ', 'Blasco ', '1968-5-13 ', 'Eustaquio ','+56986306317', '(2) 27793 1125 ', 'M '),
( '18209421-8 ', ' ', 'Márquez ', '1968-1-12 ', 'Pepe ','+56967494575', '(2) 23988 7877 ', 'M '),
( '18223184-3 ', 'Aparicio ', 'Ferreras ', '1968-5-24 ', 'María ','+56983531363', '(2) 21524 5209 ', 'F '),
( '18233494-4 ', ' ', 'Angulo ', '1968-9-24 ', 'Obdulia ','+56926177079', '(2) 21278 6191 ', 'F '),
( '18246071-0 ', ' ', 'Riera ', '1968-6-8 ', 'Nayara ','+56914461737', '(2) 21616 2099 ', 'F '),
( '18253279-7 ', ' ', 'Marti ', '1968-10-25 ', 'Néstor ','+56947808021', '(2) 22100 5952 ', 'M '),
( '18262298-2 ', ' ', 'Lladó ', '1968-1-9 ', 'Feliciana ','+56967801671', '(2) 26184 8047 ', 'F '),
( '18270475-k ', ' ', 'Barroso ', '1968-11-9 ', 'Emilia ','+56927205977', '(2) 25182 2860 ', 'F '),
( '18278471-0 ', ' ', 'Carrillo ', '1968-3-24 ', 'Marco ','+56949868177', '(2) 28241 4435 ', 'M '),
( '18281705-8 ', ' ', 'Cervantes ', '1968-1-11 ', 'Maximiliano ','+56918181677', '(2) 26387 4854 ', 'M '),
( '18285397-6 ', ' ', 'Cueto ', '1968-11-2 ', 'Duilio ','+56955834373', '(2) 27153 8831 ', 'M '),
( '18302636-4 ', ' ', ' ', '1968-12-20 ', 'Inmaculada ','+56947475076', '(2) 28467 6257 ', 'F '),
( '18321456-k ', ' ', ' ', '1968-6-8 ', 'Priscila ','+56963784887', '(2) 28232 3220 ', 'F '),
( '18323651-2 ', ' ', ' ', '1968-1-21 ', 'Lucía ','+56971716167', '(2) 23185 3420 ', 'F '),
( '18334910-4 ', ' ', 'Vives ', '1968-8-2 ', 'Calista ','+56978188263', '(2) 28412 1298 ', 'F '),
( '18356107-3 ', ' ', 'Vidal ', '1968-4-2 ', 'Erasmo ','+56965254418', '(2) 21533 6535 ', 'M '),
( '18358153-8 ', ' ', 'Amador ', '1968-11-18 ', 'Azahara ','+56936905780', '(2) 22779 7749 ', 'F '),
( '18360082-6 ', ' ', 'Vidal ', '1968-7-22 ', 'Mariano ','+56978655377', '(2) 27843 2869 ', 'M '),
( '18363517-4 ', ' ', 'Rovira ', '1968-5-2 ', 'Modesta ','+56959447311', '(2) 24026 4591 ', 'F '),
( '18379022-6 ', 'Muñoz ', 'Castrillo ', '1968-10-5 ', 'Natalio ','+56969243333', '(2) 23744 4684 ', 'M '),
( '18397725-3 ', ' ', 'Alegria ', '1968-11-23 ', 'Nacho ','+56970143678', '(2) 26954 3478 ', 'M '),
( '18401996-5 ', ' ', 'Posada ', '1968-11-1 ', 'Bienvenida ','+56942667052', '(2) 24142 1931 ', 'F '),
( '18430407-4 ', 'Amigó ', 'Oliveras ', '1968-6-15 ', 'Alejandra ','+56953804632', '(2) 28685 5855 ', 'F '),
( '18440268-8 ', ' ', 'Cabañas ', '1968-3-14 ', 'Agustín ','+56911331712', '(2) 27707 5974 ', 'M '),
( '18481991-0 ', ' ', 'Vila ', '1968-2-16 ', 'Esperanza ','+56963234450', '(2) 21555 2936 ', 'F '),
( '18486531-9 ', 'Puente ', 'Isern ', '1968-7-12 ', 'Ariel ','+56957612762', '(2) 23011 4631 ', 'M '),
( '18487169-6 ', 'Sureda ', 'Purificación ', '1968-8-10 ', 'María ','+56988279027', '(2) 21983 3124 ', 'F '),
( '18491573-1 ', ' ', ' ', '1968-9-14 ', 'Hermenegildo ','+56949145143', '(2) 22215 1052 ', 'M '),
( '18495766-3 ', ' ', 'Morante ', '1968-2-20 ', 'Filomena ','+56988164274', '(2) 23609 2038 ', 'F '),
( '18532071-5 ', ' ', ' ', '1968-9-19 ', 'Tere ','+56918558510', '(2) 26899 5667 ', 'M '),
( '18543862-7 ', ' ', ' ', '1967-12-13 ', 'Moisés ','+56934356420', '(2) 22897 7580 ', 'M '),
( '18575156-2 ', ' ', ' ', '1967-4-7 ', 'Camilo ','+56987805439', '(2) 25708 6450 ', 'M '),
( '18595030-1 ', ' ', 'Villalobos ', '1967-9-18 ', 'Tania ','+56975451563', '(2) 24951 1190 ', 'F '),
( '18598960-7 ', ' ', 'Molins ', '1967-7-25 ', 'Adolfo ','+56929194652', '(2) 28672 2334 ', 'M '),
( '18599136-9 ', ' ', 'Pizarro ', '1967-5-23 ', 'Nydia ','+56928271058', '(2) 26984 1726 ', 'F '),
( '18604493-2 ', ' ', 'Giralt ', '1967-1-20 ', 'Rodolfo ','+56951855220', '(2) 25259 5934 ', 'M '),
( '18619682-1 ', 'Niño ', 'Pinilla ', '1967-2-11 ', 'Oriana ','+56969448812', '(2) 27649 3910 ', 'F '),
( '18631423-9 ', ' ', 'Feijoo ', '1967-1-12 ', 'Elodia ','+56934856348', '(2) 25745 4993 ', 'F '),
( '18638684-1 ', ' ', 'Soler ', '1967-6-22 ', 'Marciano ','+56960726229', '(2) 21380 8049 ', 'M '),
( '18645135-k ', ' ', 'Chico ', '1967-2-23 ', 'Lázaro ','+56933698518', '(2) 25427 4600 ', 'M '),
( '18653731-9 ', ' ', ' ', '1967-2-11 ', 'Reyes ','+56970117422', '(2) 28360 1114 ', 'M '),
( '18660568-3 ', ' ', 'Arroyo ', '1967-9-20 ', 'Magdalena ','+56981531530', '(2) 23873 4625 ', 'F '),
( '18686963-k ', 'Ferrer ', 'Ródenas ', '1967-7-27 ', 'Jose ','+56919404776', '(2) 27062 7399 ', 'M '),
( '18691861-4 ', ' ', ' ', '1967-5-15 ', 'Carlito ','+56923182046', '(2) 21601 3672 ', 'M '),
( '18700817-4 ', ' ', 'Fortuny ', '1967-7-22 ', 'Josué ','+56959738281', '(2) 28098 8489 ', 'M '),
( '18721005-4 ', ' ', 'Garzón ', '1967-5-18 ', 'Fidela ','+56938283455', '(2) 24327 2431 ', 'F '),
( '18728155-5 ', ' ', 'Cabanillas ', '1967-7-17 ', 'Cleto ','+56958465861', '(2) 23462 8169 ', 'M '),
( '18738186-k ', ' ', ' ', '1967-6-24 ', 'Modesta ','+56914407730', '(2) 28718 7451 ', 'F '),
( '18744001-7 ', ' ', ' ', '1967-12-14 ', 'Eligio ','+56986841687', '(2) 25017 8737 ', 'M '),
( '18749256-4 ', ' ', 'Raya ', '1967-1-19 ', 'Juliana ','+56963681754', '(2) 24113 3673 ', 'F '),
( '18756477-8 ', ' ', 'Iñiguez ', '1967-5-21 ', 'Lupe ','+56937392582', '(2) 26067 7888 ', 'M '),
( '18762861-k ', ' ', 'Vicente ', '1967-6-16 ', 'Reynaldo ','+56950543242', '(2) 22580 5791 ', 'M '),
( '18766791-7 ', ' ', ' ', '1967-10-23 ', 'Abraham ','+56925369030', '(2) 25909 4446 ', 'M '),
( '18767755-6 ', ' ', 'Casares-Ruano ', '1967-12-10 ', 'Andrés ','+56930703749', '(2) 24778 6415 ', 'M '),
( '18783520-8 ', ' ', 'Moraleda ', '1967-12-14 ', 'Encarnación ','+56945608376', '(2) 22075 6497 ', 'M '),
( '18798124-7 ', ' ', 'Coronado ', '1967-1-2 ', 'Fermín ','+56970818369', '(2) 21785 6025 ', 'M '),
( '18814692-9 ', ' ', ' ', '1967-11-21 ', 'Florentino ','+56960344046', '(2) 22303 1720 ', 'M '),
( '18816018-2 ', ' ', 'Arévalo ', '1967-2-7 ', 'Lupita ','+56942163750', '(2) 21030 6329 ', 'F '),
( '18844964-6 ', ' ', 'Gelabert ', '1967-9-21 ', 'Leoncio ','+56975866048', '(2) 28370 7790 ', 'M '),
( '18845209-4 ', ' ', 'Palomo ', '1967-8-1 ', 'Sebastián ','+56983312030', '(2) 25258 1004 ', 'M '),
( '18852359-5 ', ' ', 'Capdevila ', '1967-4-20 ', 'Fulgencio ','+56932685320', '(2) 25313 5327 ', 'M '),
( '18855282-k ', ' ', 'Bertrán ', '1967-11-17 ', 'Soraya ','+56986181251', '(2) 21097 1255 ', 'F '),
( '18855611-6 ', ' ', 'Granados ', '1967-9-16 ', 'Teo ','+56990124286', '(2) 28094 2441 ', 'M '),
( '18858185-4 ', ' ', 'Morales ', '1967-9-13 ', 'Maricela ','+56946477476', '(2) 22379 4145 ', 'F '),
( '18874107-k ', ' ', 'Coello ', '1967-8-9 ', 'Maxi ','+56946138448', '(2) 26749 2305 ', 'M '),
( '18875515-1 ', ' ', 'Alberto ', '1967-9-3 ', 'Segismundo ','+56968235036', '(2) 28940 8077 ', 'M '),
( '18893694-6 ', ' ', 'Ferrer ', '1967-9-8 ', 'Zaira ','+56934378714', '(2) 23598 4729 ', 'F '),
( '18900246-7 ', ' ', ' ', '1966-8-10 ', 'Noelia ','+56948285374', '(2) 22784 6588 ', 'F '),
( '18911726-4 ', ' ', 'Marcos ', '1966-7-3 ', 'Palmira ','+56957246184', '(2) 26763 5755 ', 'F '),
( '18922942-9 ', 'Rivera ', 'Heredia ', '1966-10-12 ', 'Jose ','+56950123177', '(2) 28639 3974 ', 'M '),
( '18926834-3 ', ' ', 'Ramón ', '1966-9-25 ', 'Susanita ','+56918104327', '(2) 28185 1609 ', 'F '),
( '18927008-9 ', ' ', 'Ramis ', '1966-1-11 ', 'Gonzalo ','+56918851066', '(2) 26215 8893 ', 'M '),
( '18935628-5 ', ' ', 'Gil ', '1966-7-6 ', 'Apolinar ','+56981357189', '(2) 27637 3962 ', 'M '),
( '18936163-7 ', ' ', 'Alberto ', '1966-2-24 ', 'Balduino ','+56916534873', '(2) 22188 7085 ', 'M '),
( '18949920-5 ', ' ', 'Romero ', '1966-11-27 ', 'Arsenio ','+56936201916', '(2) 24342 2402 ', 'M '),
( '18953288-1 ', ' ', 'Fortuny ', '1966-9-7 ', 'Alma ','+56933305641', '(2) 24854 2035 ', 'F '),
( '18956474-0 ', ' ', 'Estrada ', '1966-10-8 ', 'María ','+56911173379', '(2) 23711 5713 ', 'F '),
( '18978016-8 ', ' ', ' ', '1966-6-3 ', 'Úrsula ','+56919614186', '(2) 27146 2011 ', 'F '),
( '18979688-9 ', ' ', 'Adán ', '1966-10-10 ', 'Natalio ','+56959677188', '(2) 26201 3818 ', 'M '),
( '18982627-3 ', ' ', ' ', '1966-4-3 ', 'Candelas ','+56920453642', '(2) 24266 1003 ', 'M '),
( '18999464-8 ', ' ', ' ', '1966-11-1 ', 'Loreto ','+56990557372', '(2) 25848 4000 ', 'M '),
( '19006555-3 ', ' ', 'Castejón ', '1966-4-26 ', 'Ulises ','+56924766342', '(2) 21741 7903 ', 'M '),
( '19018136-7 ', ' ', 'Uribe ', '1966-7-11 ', 'Armida ','+56916321382', '(2) 26660 5647 ', 'F '),
( '19026280-4 ', ' ', 'Barros ', '1966-11-7 ', 'Marcela ','+56955386486', '(2) 28284 6013 ', 'F '),
( '19036268-k ', ' ', 'Tormo ', '1966-1-22 ', 'Fausto ','+56950245042', '(2) 24326 4576 ', 'M '),
( '19058643-k ', ' ', 'Galindo ', '1966-4-28 ', 'Teresa ','+56940586710', '(2) 26161 2246 ', 'F '),
( '19096620-8 ', ' ', 'Balaguer ', '1966-2-14 ', 'Ildefonso ','+56961524039', '(2) 22882 7444 ', 'M '),
( '19105493-8 ', ' ', 'Lledó ', '1966-10-1 ', 'Carolina ','+56950191880', '(2) 26528 5197 ', 'F '),
( '19115407-k ', ' ', 'Acedo ', '1966-6-3 ', 'Edu ','+56944316864', '(2) 22418 5582 ', 'M '),
( '19120436-0 ', ' ', ' ', '1966-10-3 ', 'Rosa ','+56977445921', '(2) 21925 2402 ', 'F '),
( '19128881-5 ', ' ', 'Carbó ', '1966-11-10 ', 'Carmela ','+56970598413', '(2) 27260 5728 ', 'F '),
( '19135515-6 ', ' ', 'Gomez ', '1966-9-11 ', 'Encarnacion ','+56969642033', '(2) 28683 1427 ', 'M '),
( '19155144-3 ', ' ', 'Pardo ', '1966-4-4 ', 'Rosario ','+56966271516', '(2) 28882 6339 ', 'M '),
( '19163059-9 ', ' ', ' ', '1966-2-28 ', 'Evaristo ','+56988658625', '(2) 27761 2830 ', 'M '),
( '19176601-6 ', ' ', ' ', '1966-3-15 ', 'Natalio ','+56953453775', '(2) 22592 2296 ', 'M '),
( '19184328-2 ', ' ', 'Llopis ', '1966-6-12 ', 'Cándida ','+56946685376', '(2) 27181 6110 ', 'F '),
( '19198923-6 ', ' ', ' ', '1966-7-16 ', 'Clímaco ','+56948905316', '(2) 28056 1110 ', 'M '),
( '19199357-8 ', ' ', 'Verdugo ', '1966-7-10 ', 'Luciana ','+56948473572', '(2) 21106 1161 ', 'F '),
( '19204242-9 ', 'Andrade ', 'Heras ', '1966-10-18 ', 'Otilia ','+56933288921', '(2) 25597 6376 ', 'F '),
( '19233618-k ', ' ', ' ', '1966-12-16 ', 'Andrés ','+56960204479', '(2) 26320 7737 ', 'M '),
( '19237267-4 ', ' ', 'Roca ', '1966-2-9 ', 'Samanta ','+56926701539', '(2) 26456 5014 ', 'F '),
( '19250569-0 ', ' ', ' ', '1966-4-21 ', 'Ariel ','+56982195683', '(2) 24546 4621 ', 'M '),
( '19253791-6 ', ' ', 'Huerta ', '1966-5-3 ', 'Serafina ','+56914734946', '(2) 28335 8396 ', 'F '),
( '19255256-7 ', 'Campos ', 'Armando ', '1966-12-27 ', 'Jose ','+56927727643', '(2) 28051 3851 ', 'M '),
( '19270650-5 ', ' ', ' ', '1966-1-10 ', 'José ','+56948121090', '(2) 27064 5404 ', 'M '),
( '19292152-k ', ' ', 'Bejarano ', '1966-10-10 ', 'Celia ','+56928508874', '(2) 27558 1540 ', 'F '),
( '19308270-k ', 'Vazquez ', 'Garcés ', '1966-5-4 ', 'Juan ','+56950492869', '(2) 22396 5979 ', 'M '),
( '19311341-9 ', 'Lobo ', 'Villena ', '1966-4-22 ', 'Gregorio ','+56985125966', '(2) 23510 5525 ', 'M '),
( '19324641-9 ', ' ', 'Morales ', '1966-8-20 ', 'Sonia ','+56984291423', '(2) 27711 8441 ', 'F '),
( '19335925-6 ', ' ', ' ', '1966-1-5 ', 'Rebeca ','+56986584834', '(2) 27769 7571 ', 'F '),
( '19341550-4 ', ' ', 'Gutiérrez ', '1966-7-22 ', 'Perlita ','+56926756355', '(2) 25491 6837 ', 'F '),
( '19369379-2 ', ' ', 'Sarmiento ', '1966-7-5 ', 'Susana ','+56921111552', '(2) 27496 4039 ', 'F '),
( '19382159-6 ', ' ', ' ', '1966-12-9 ', 'Palmira ','+56957897626', '(2) 25436 2546 ', 'F '),
( '19384334-4 ', ' ', 'Cánovas ', '1966-2-28 ', 'Eliseo ','+56990783627', '(2) 23136 6143 ', 'M '),
( '19385443-5 ', ' ', 'Pozo ', '1966-4-15 ', 'Lisandro ','+56962263739', '(2) 25015 8243 ', 'M '),
( '19386900-9 ', 'Donaire ', 'Solsona ', '1966-12-3 ', 'Jose ','+56975652335', '(2) 25100 4526 ', 'M '),
( '19400209-2 ', ' ', ' ', '1966-9-4 ', 'Dorotea ','+56968814820', '(2) 27486 1139 ', 'F '),
( '19402121-6 ', ' ', ' ', '1966-3-15 ', 'Yéssica ','+56948295024', '(2) 26656 7373 ', 'F '),
( '19411124-k ', ' ', 'Berrocal ', '1966-11-10 ', 'Eutimio ','+56933753938', '(2) 26593 8812 ', 'M '),
( '19432846-k ', ' ', ' ', '1966-10-14 ', 'Heliodoro ','+56985807751', '(2) 24274 7783 ', 'M '),
( '19438767-9 ', ' ', 'Gimenez ', '1966-6-27 ', 'Valeria ','+56981217153', '(2) 27137 3442 ', 'F '),
( '19448250-7 ', 'Arnaiz ', 'Díaz ', '1965-3-2 ', 'Jose ','+56928441114', '(2) 23120 7198 ', 'M '),
( '19454640-8 ', ' ', 'Castañeda ', '1965-2-19 ', 'Joaquina ','+56971371665', '(2) 26674 2091 ', 'F '),
( '19457785-0 ', ' ', 'Martínez ', '1965-11-7 ', 'Alejo ','+56974661474', '(2) 27901 6243 ', 'M '),
( '19473318-6 ', ' ', ' ', '1965-9-12 ', 'Noé ','+56937361552', '(2) 26613 4837 ', 'M '),
( '19484957-5 ', ' ', 'Perelló-Haro ', '1965-9-19 ', 'María ','+56987104332', '(2) 22115 6540 ', 'F '),
( '19528644-2 ', ' ', 'Codina ', '1965-4-14 ', 'Wálter ','+56932155829', '(2) 27694 1560 ', 'M '),
( '19547817-1 ', ' ', 'Pardo ', '1965-2-6 ', 'Lorenzo ','+56926238990', '(2) 21484 6736 ', 'M '),
( '19548611-5 ', ' ', 'Neira ', '1965-12-8 ', 'Bibiana ','+56947145910', '(2) 22597 5828 ', 'F '),
( '19557515-0 ', ' ', ' ', '1965-7-25 ', 'David ','+56988365530', '(2) 23710 8966 ', 'M '),
( '19559641-7 ', ' ', 'Rocamora ', '1965-10-22 ', 'Flora ','+56926597448', '(2) 26010 4526 ', 'F '),
( '19569203-3 ', ' ', 'Sainz ', '1965-1-20 ', 'Azeneth ','+56979756083', '(2) 22883 5089 ', 'M '),
( '19583718-k ', 'Pineda ', 'Madrid ', '1965-6-3 ', 'Nicolás ','+56932418656', '(2) 26995 6794 ', 'M '),
( '19585533-1 ', ' ', 'Alberola ', '1965-11-19 ', 'Crescencia ','+56945112769', '(2) 27334 8016 ', 'F '),
( '19586515-9 ', ' ', 'Garay ', '1965-3-24 ', 'Emilia ','+56958268667', '(2) 22832 8422 ', 'F '),
( '19631044-4 ', 'Mayol ', 'Borrego ', '1965-10-17 ', 'Miguel ','+56915363329', '(2) 22543 8513 ', 'M '),
( '19634706-2 ', 'Téllez ', 'Torrens ', '1965-12-25 ', 'Miguel ','+56914728363', '(2) 27483 8851 ', 'M '),
( '19656943-k ', ' ', ' ', '1965-2-1 ', 'Bienvenida ','+56926441363', '(2) 24086 6720 ', 'F '),
( '19659359-4 ', ' ', 'Agullo ', '1965-10-23 ', 'Nicanor ','+56969854634', '(2) 24948 6567 ', 'M '),
( '19664081-9 ', ' ', 'Sanchez ', '1965-10-13 ', 'Elba ','+56946345789', '(2) 28670 7083 ', 'F '),
( '19669963-5 ', ' ', 'Ibañez ', '1965-1-1 ', 'Cosme ','+56984637011', '(2) 26050 4622 ', 'M '),
( '19670967-3 ', ' ', 'Casanovas ', '1965-11-21 ', 'Vicenta ','+56977412274', '(2) 28515 3014 ', 'F '),
( '19676501-8 ', ' ', ' ', '1965-9-11 ', 'Marcelo ','+56915895984', '(2) 23600 6330 ', 'M '),
( '19687629-4 ', 'Llorens ', 'Gonzalez ', '1965-8-18 ', 'Mateo ','+56987741153', '(2) 27497 4797 ', 'M '),
( '19700750-8 ', ' ', 'Cano ', '1965-9-24 ', 'Trinidad ','+56967814062', '(2) 24240 1609 ', 'M '),
( '19714290-1 ', ' ', 'Criado ', '1965-5-14 ', 'Reyes ','+56927134045', '(2) 28974 5950 ', 'M '),
( '19743620-4 ', ' ', ' ', '1965-1-24 ', 'Melisa ','+56920693855', '(2) 21704 1186 ', 'F '),
( '19748195-1 ', 'Arcos ', 'Tomás ', '1965-7-18 ', 'Francisco ','+56949296740', '(2) 23772 7715 ', 'M '),
( '19752704-8 ', ' ', 'Piñeiro ', '1965-5-26 ', 'Benita ','+56920864721', '(2) 22370 3526 ', 'F '),
( '19755898-9 ', ' ', 'Cabrera ', '1965-10-15 ', 'Amada ','+56982748635', '(2) 24420 2523 ', 'F '),
( '19783662-8 ', 'Fuentes ', 'Recio ', '1965-3-12 ', 'Gaspar ','+56935447982', '(2) 28120 6427 ', 'M '),
( '19815608-6 ', ' ', ' ', '1965-2-3 ', 'Reyes ','+56980605781', '(2) 22664 1309 ', 'M '),
( '19823600-4 ', ' ', 'Ojeda ', '1965-5-14 ', 'Genoveva ','+56934372532', '(2) 27712 6994 ', 'F '),
( '19840621-k ', ' ', 'Arnau ', '1965-2-19 ', 'Marcio ','+56965887688', '(2) 23303 7183 ', 'M '),
( '19848581-0 ', ' ', 'Azcona ', '1965-6-2 ', 'Luciano ','+56965756466', '(2) 26150 3860 ', 'M '),
( '19850820-9 ', ' ', 'Aguirre ', '1965-9-9 ', 'Godofredo ','+56929306232', '(2) 27313 5391 ', 'M '),
( '19853989-9 ', ' ', 'Uría ', '1965-3-20 ', 'Encarnita ','+56923673041', '(2) 24641 7870 ', 'F '),
( '19860422-4 ', ' ', 'Barreda ', '1965-10-21 ', 'Quique ','+56914597716', '(2) 26292 6597 ', 'M '),
( '19866433-2 ', ' ', ' ', '1965-9-3 ', 'Fabián ','+56940314084', '(2) 25443 6680 ', 'M '),
( '19878870-8 ', 'Castilla ', 'Jódar ', '1965-6-12 ', 'María ','+56921611844', '(2) 24272 7422 ', 'F '),
( '19886592-3 ', ' ', ' ', '1965-5-27 ', 'Aristides ','+56921803276', '(2) 27665 5939 ', 'M '),
( '19910380-6 ', ' ', 'Alberto ', '1964-6-7 ', 'Chelo ','+56973422331', '(2) 23255 4145 ', 'M '),
( '19918987-5 ', 'Cañete ', 'Navarro ', '1964-10-26 ', 'Hernando ','+56951111417', '(2) 26824 8148 ', 'M '),
( '19932684-8 ', ' ', 'Roca ', '1964-1-21 ', 'Asdrubal ','+56967626587', '(2) 27749 8693 ', 'M '),
( '19935501-5 ', ' ', ' ', '1964-5-19 ', 'Cruz ','+56959564266', '(2) 21783 4332 ', 'M '),
( '19947745-5 ', ' ', 'Almansa ', '1964-5-10 ', 'Bienvenida ','+56932254770', '(2) 23572 6833 ', 'F '),
( '19948887-2 ', ' ', 'Garcia ', '1964-7-19 ', 'Chema ','+56949496227', '(2) 22926 4007 ', 'F '),
( '19958763-3 ', ' ', 'Zorrilla ', '1964-9-12 ', 'Tiburcio ','+56952162132', '(2) 24069 3498 ', 'M ');



INSERT INTO [dbo].[t_rep_legal]
           ([rep_legal_persona_run])
     VALUES
( '10007672-1 '),
( '10020197-6 '),
( '10023418-1 '),
( '10028406-5 '),
( '10030941-6 '),
( '10033211-6 '),
( '10042303-0 '),
( '10045179-4 '),
( '10069276-7 '),
( '10078762-8 '),
( '10087828-3 '),
( '10141047-1 '),
( '10145326-k '),
( '10156977-2 '),
( '10158382-1 '),
( '10170629-k '),
( '10207401-7 '),
( '10224802-3 '),
( '10241265-6 ');

INSERT INTO [dbo].[t_sost]
           ([sost_rep_legal_id],[sost_nombre])
     VALUES
		('1','ACUMAR'),
		('2','CAMILO HENRIQUEZ'),
		('3','DINABEC COLLEGE'),
		('4','E.I.E. COLEGIO TÉCNICO PROFESIONAL SANTA TERESA DE LOS ANDES DE OSORNO'),
		('5','FORM-ARTE CORPORACIÓN EDUCACIONAL'),
		('6','GODOY  & ROJAS CORPORACIÓN  EDUCACIONAL'),
		('7','HERMANAS FRANCISCANAS DE GANTE'),
		('8','IGLESIA DE CRISTO IBEROAMERICANA'),
		('9','JAVIERA CARRERA DE LINARES E.I.E.'),
		('10','KENNEDY SCHOOL'),
		('11','LA MAGIA DE APRENDER C.E.'),
		('12','MARCELA PAZ CONCEPCION'),
		('13','NAGUILAN'),
		('14','OBRA DON GUANELLA'),
		('15','PARROQUIA SAGRADO CORAZON DE JESUS DE CHINCOLCO'),
		('16','QUILLAIMAVIDA'),
		('17','R.PALACIOSP E.I.E'),
		('18','SABIDURIA ENTIDAD INDIVIDUAL DE EDUCACION'),
		('19','TERESA YON JORQUERA E.I.E.');

INSERT INTO [dbo].[t_tipo_area]
           ([tipo_area_nombre])
     VALUES
           ('Rural'),
           ('Urbano');

INSERT INTO [dbo].[t_direccion]
          ([direccion_calle]
          ,[direccion_geo_x]
          ,[direccion_geo_y]
          ,[direccion_info_adicional]
          ,[direccion_comuna_id]
          ,[direccion_tipo_area])
    VALUES
('`PARCELA ``EL PINO`` CAMINO SAN MIGUEL` S/N','','-374662257','-723875091',224,1),
('AV LIBERTADOR B. O¨HIGGINS 2973','','-334494291','-706775856',17,1),
('AV.JERUSALEN 3901 SECTOR EL BORO 3901','','-20246623','-701007518',226,1),
('BALMACEDA 400','','-341622857','-707329432',49,1),
('BAQUEDANO 804','','-405705625','-731393886',37,1),
('CAMINO CABRERO KM. 36 S/N','','-334494290','-731393887',148,2),
('DIEGO PORTALES 980','','-334494289','-731393887',5,2),
('ESMERALDA 190','','-334494288','-731393887',148,2),
('FREIRE 965','','-334494287','-731393887',296,2),
('GALVARINO 1310','','-334494286','-731393887',214,2),
('LIBERTAD 244','','-334494285','-731393887',175,2),
('MANTOS BLANCOS 2267, VILLA SAN LUIS 5. S/N','','-334494284','-731393887',327,2),
('MANUEL RODRIGUEZ 1044','','-334494283','-731393887',223,2),
('MICHIMALONCO 3855 S/N','','-334494282','-731393887',235,2),
('MONTEPIO 357','','-334494281','-731393887',100,2),
('O`HIGGINS 763 S/N','','-334494280','-731393887',233,2),
('PAMPA BAJA SITIO 40','','-334494279','-731393887',241,2),
('PARCELA 2 B SANTA AMELIA S/N','','-334494278','-731393887',44,2),
('PEDRO MONTT S/N CHINCOLCO S/N','','-334494277','-731393887',187,2),
('PELANTARO 1091','','-334494276','-731393887',30,2),
('PORTALES 132','','-334494275','-731393887',233,2),
('UNICA S/N S/N','','-334494274','-731393887',233,2);

INSERT INTO [dbo].[t_establ]
           ([establ_cod_area]
           ,[establ_nombre]
           ,[establ_numero_telefonico]
           ,[establ_depend_id]
           ,[establ_direccion_id]
           ,[establ_sost_id])
     VALUES
(41,'ESCUELA ACUMAR',2380391,3,1,1),
(41,'COLEGIO ACUMAR',2380391,3,18,1),
(41,'PARVULARIO EL NAZARENO',2380391,3,21,1),
(41,'COLEGIO CAMILO HENRIQUEZ',2220834,3,20,2),
(43,'LICEO COMERCIAL CAMILO HENRIQUEZ',345450,3,10,2),
(42,'DINABEC COLLEGE',2836670,3,7,3),
(64,'COLEGIO TECNICO PROFESIONAL SANTA TERESA DE LOS ANDES',2203400,3,5,4),
(51,'COLEGIO ARTISTICO CULTURAL FORM-ARTE',2406193,3,17,5),
(53,'ESCUELA PARTICULAR EL DURAZNO',2741405,3,22,6),
(2,'COLEGIO PARTICULAR SAN FRANCISCO DE ASIS',27976816,3,15,7),
(2,'ESCUELA BASICA PART. CRISTIANO DE LOS HEROES',25141596,3,12,8),
(73,'INST. EDUC. DE ADULTOS JAVIERA CARRERA',2213208,3,16,9),
(41,'COLEGIO PARTICULAR KENNEDY SCHOOL',2362151,3,11,10),
(75,'JARDIN INFANTIL MAGIC CASTLE',411394,3,8,11),
(41,'COLEGIO MARCELA PAZ',2240243,3,13,12),
(41,'COLEGIO PAULO FREIRE',3213450,3,14,13),
(72,'ESCUELA PARTICULAR JULIO VALENZUELA',2228310,3,4,14),
(33,'COLEGIO SAGRADO CORAZON',781489,3,19,15),
(41,'ESCUELA PARTICULAR UNICORNIO',0,3,6,16),
(67,'COLEGIO ANTOINE DE SAINT EXUPERY',2232020,3,9,17),
(72,'JARDIN INFANTIL SEMILLITA DE SABIDURIA',2534535,3,2,18),
(57,'ESCUELA SANTA LAURA',2625384,3,3,19);

INSERT INTO [dbo].[t_establ_cod_ense]
           ([establ_cod_ense_cod_ense_id]
           ,[establ_cod_ense_establ_id])
     VALUES
(9,1),
(10,2),
(110,3),
(160,4),
(165,5),
(167,6),
(180,7),
(181,8),
(182,9),
(190,10),
(191,11),
(192,12),
(200,13),
(201,14),
(202,15),
(220,16),
(230,17),
(231,18),
(232,19),
(240,20),
(241,21),
(242,22),
(250,1),
(251,2),
(252,3),
(260,4),
(261,5),
(262,6),
(263,7),
(264,8),
(265,9),
(266,10),
(267,11),
(268,12),
(269,13),
(270,14),
(271,15),
(272,16),
(280,17),
(290,18),
(291,19),
(292,20),
(310,21),
(360,22),
(361,1),
(365,2),
(410,3),
(460,4),
(461,5),
(465,6),
(510,7),
(560,8),
(561,9),
(565,10),
(610,11),
(660,12);

INSERT INTO [dbo].[t_asignatura]
           ([asignatura_nombre])
     VALUES
   ('Artes visuales'),
	('Ciencias naturales'),
	('Educación física y salud'),
	('Historia, geografía y ciencias sociales'),
	('Inglés'),
	('Lengua indígena'),
	('Lenguaje y comunicación'),
	('Lengua y literatura'),
	('Lengua y Cultura de los Pueblos Originarios Ancestrales'),
	('Matemática'),
	('Música'),
	('Orientación'),
	('Religión'),
	('Tecnología');

INSERT INTO [dbo].[t_docente]
           ([docente_persona_run])
     VALUES
('10253981-8'),
('10258276-4'),
('10282003-7'),
('10283850-5'),
('10284435-1'),
('10289034-5'),
('10294702-9'),
('10307783-4'),
('10309856-4'),
('10335354-8'),
('10337268-2'),
('10341783-k'),
('10343931-0'),
('10344239-7'),
('10371655-1'),
('10372585-2'),
('10383412-0'),
('10419644-6'),
('10426377-1'),
('10440686-6'),
('10442532-1'),
('10452525-3'),
('10461021-8'),
('10462201-1'),
('10474580-6'),
('10477159-9'),
('10504838-6'),
('10508665-2'),
('10510257-7'),
('10511035-9'),
('10536148-3'),
('10539485-3'),
('10547385-0'),
('10553589-9'),
('10556456-2'),
('10575408-6'),
('10584120-5'),
('10593687-7'),
('10617869-0'),
('10628551-9'),
('10633287-8'),
('10659332-9'),
('10672491-1'),
('10695109-8'),
('10700522-6'),
('10705549-5'),
('10706331-5'),
('10721723-1'),
('10733695-8'),
('10738748-k'),
('10740172-5'),
('10744132-8'),
('10763343-k'),
('10773848-7'),
('10779229-5'),
('10788953-1'),
('10802648-0'),
('10814200-6'),
('10830649-1'),
('10830895-8'),
('10836337-1'),
('10861765-9'),
('10866223-9'),
('10883566-4'),
('10897741-8'),
('10905674-k'),
('10938191-8'),
('10942645-8'),
('10949037-7'),
('10955920-2'),
('10956528-8'),
('10962131-5'),
('10967060-k'),
('10967188-6'),
('10987992-4'),
('11007556-1'),
('11008805-1'),
('11036749-k'),
('11050974-k'),
('11054915-6'),
('11059095-4'),
('11062704-1'),
('11082022-4'),
('11084619-3'),
('11098895-8'),
('11123065-k'),
('11126113-k'),
('11145086-2'),
('11145641-0'),
('11164951-0'),
('11168517-7'),
('11173549-2'),
('11176016-0'),
('11176056-k'),
('11182218-2'),
('11185639-7'),
('11188577-k'),
('11198467-0'),
('11199081-6'),
('11208457-6'),
('11216921-0'),
('11217170-3'),
('11219994-2'),
('11227400-6'),
('11253393-1'),
('11284745-6'),
('11297502-0'),
('11303471-8'),
('11309691-8'),
('11315203-6'),
('11316271-6'),
('11322539-4'),
('11322765-6'),
('11334648-5'),
('11352824-9'),
('11353432-k'),
('11358792-k'),
('11408393-3'),
('11430437-9'),
('11431877-9'),
('11433382-4'),
('11434461-3'),
('11444595-9'),
('11451351-2'),
('11455765-k'),
('11469397-9'),
('11471072-5'),
('11480725-7'),
('11499957-1'),
('11517664-1'),
('11524508-2'),
('11527425-2'),
('11577212-0'),
('11598215-k'),
('11601329-0'),
('11605505-8'),
('11616524-4'),
('11624333-4'),
('11633547-6'),
('11660317-9'),
('11666439-9'),
('11671016-1'),
('11674014-1'),
('11683737-4'),
('11708304-7'),
('11711168-7'),
('11722146-6'),
('11733502-k'),
('11740188-k'),
('11744859-2'),
('11759443-2'),
('11761847-1'),
('11776869-4'),
('11794615-0'),
('11810267-3'),
('11819750-k'),
('11833788-3'),
('11836666-2'),
('11850206-k'),
('11868373-0'),
('11873643-5'),
('11881844-k'),
('11904379-4'),
('11906416-3'),
('11917875-4'),
('11946591-5'),
('11958784-0'),
('11959645-9'),
('11959835-4'),
('11974383-4'),
('12001609-1'),
('12004414-1'),
('12026928-3'),
('12033070-5'),
('12035695-k'),
('12051453-9'),
('12057597-k'),
('12070423-0'),
('12077732-7'),
('12078844-2'),
('12086533-1'),
('12089722-5'),
('12102298-2'),
('12108304-3'),
('12123814-4'),
('12135980-4'),
('12136075-6'),
('12136289-9'),
('12143946-8'),
('12158243-0'),
('12160085-4'),
('12161455-3'),
('12187703-1'),
('12198763-5'),
('12199624-3'),
('12203790-8'),
('12224585-3'),
('12233991-2'),
('12247052-0'),
('12249675-9'),
('12253177-5'),
('12256834-2'),
('12267765-6'),
('12274620-8'),
('12302949-6'),
('12304987-k'),
('12321870-1'),
('12322583-k'),
('12326211-5'),
('12331008-k'),
('12345194-5'),
('12353202-3'),
('12357698-5'),
('12400096-3'),
('12402978-3'),
('12404518-5'),
('12408398-2'),
('12412784-k'),
('12415134-1'),
('12425989-4'),
('12429692-7'),
('12442756-8'),
('12462396-0'),
('12463586-1'),
('12482661-6'),
('12489531-6'),
('12503946-4'),
('12507657-2'),
('12526155-8'),
('12546347-9'),
('12567318-k'),
('12577750-3'),
('12579409-2'),
('12580480-2'),
('12582057-3'),
('12606604-k'),
('12608347-5'),
('12611214-9'),
('12628491-8'),
('12632919-9'),
('12672315-6'),
('12680923-9'),
('12717457-1'),
('12720040-8'),
('12743380-1'),
('12749398-7'),
('12767532-5'),
('12777742-k'),
('12804380-2'),
('12833818-7'),
('12839134-7'),
('12854262-0'),
('12856748-8'),
('12859330-6'),
('12878102-1'),
('12893775-7'),
('12941720-k'),
('12960555-3'),
('12998143-1'),
('13007742-0'),
('13012660-k'),
('13014361-k'),
('13022922-0'),
('13036082-3'),
('13053465-1'),
('13071620-2'),
('13074835-k'),
('13104816-5'),
('13127102-6'),
('13164403-5'),
('13164845-6'),
('13166555-5'),
('13169178-5'),
('13169897-6'),
('13172585-k'),
('13176516-9'),
('13180112-2'),
('13187874-5'),
('13189569-0'),
('13229854-8'),
('13230860-8'),
('13236896-1'),
('13250207-2'),
('13255996-1'),
('13257517-7'),
('13258827-9'),
('13263791-1'),
('13263940-k'),
('13269124-k'),
('13276952-4'),
('13283228-5'),
('13287555-3'),
('13287638-k'),
('13293393-6'),
('13296241-3'),
('13317341-2'),
('13322547-1'),
('13362228-4'),
('13363861-k'),
('13363944-6'),
('13372558-k'),
('13374749-4'),
('13388365-7'),
('13410580-1'),
('13411638-2'),
('13417558-3'),
('13423811-9'),
('13443180-6'),
('13448142-0'),
('13455567-k'),
('13462736-0'),
('13465574-7'),
('13466545-9'),
('13474067-1'),
('13474325-5'),
('13478959-k'),
('13490604-9'),
('13493857-9'),
('13506199-9'),
('13511651-3'),
('13529640-6'),
('13532532-5'),
('13539393-2'),
('13539789-k'),
('13543595-3'),
('13547242-5'),
('13549704-5'),
('13558917-9'),
('13565523-6'),
('13567240-8'),
('13567255-6'),
('13602705-0'),
('13622701-7'),
('13630884-k'),
('13632855-7'),
('13639690-0'),
('13648490-7'),
('13660551-8'),
('13674283-3'),
('13675794-6'),
('13686122-0'),
('13688966-4'),
('13719528-3'),
('13725066-7'),
('13742329-4'),
('13754872-0'),
('13755681-2'),
('13761711-0'),
('13790481-0'),
('13792757-8'),
('13795755-8'),
('13812346-4'),
('13822330-2'),
('13822989-0'),
('13824547-0'),
('13833729-4'),
('13834142-9'),
('13846172-6'),
('13852329-2'),
('13866551-8'),
('13886495-2'),
('13912617-3'),
('13913725-6'),
('13970857-1'),
('13979267-k'),
('13983572-7'),
('13985194-3'),
('14003611-0'),
('14004197-1'),
('14004836-4'),
('14011311-5'),
('14017776-8'),
('14041899-4'),
('14068550-k'),
('14074955-9'),
('14078233-5'),
('14134348-3'),
('14149250-0'),
('14156047-6'),
('14168155-9'),
('14197219-7'),
('14209858-k'),
('14218894-5'),
('14224136-6'),
('14225191-4'),
('14249583-k'),
('14256080-1'),
('14257703-8'),
('14275763-k'),
('14281043-3'),
('14287344-3'),
('14296021-4'),
('14305011-4'),
('14305013-0'),
('14317456-5'),
('14323291-3'),
('14335545-4'),
('14341357-8'),
('14363025-0'),
('14370588-9'),
('14379776-7');

INSERT INTO [dbo].[t_curso_establ]
           ([curso_establ_curso_id]
           ,[curso_establ_establ_id]
		   ,[vigencia])
     VALUES
(1,1,1),
(2,1,1),
(3,1,1),
(4,1,1),
(5,1,1),
(6,1,1),
(7,1,1),
(8,1,1),
(9,1,1),
(10,1,1),
(11,1,1),
(12,1,1),
(13,1,1),
(14,1,1),
(15,1,1),
(16,1,1),
(17,1,1),
(18,1,1),
(19,1,1),
(20,1,1),
(21,1,1),
(22,1,1),
(23,1,1),
(24,1,1),
(25,1,1),
(26,1,1),
(1,2,1),
(2,2,1),
(3,2,1),
(4,2,1),
(5,2,1),
(6,2,1),
(7,2,1),
(8,2,1),
(9,2,1),
(10,2,1),
(11,2,1),
(12,2,1),
(13,2,1),
(14,2,1),
(15,2,1),
(16,2,1),
(17,2,1),
(18,2,1),
(19,2,1),
(20,2,1),
(21,2,1),
(22,2,1),
(23,2,1),
(24,2,1),
(25,2,1),
(26,2,1),
(1,3,1),
(2,3,1),
(3,3,1),
(4,3,1),
(5,3,1),
(6,3,1),
(7,3,1),
(8,3,1),
(9,3,1),
(10,3,1),
(11,3,1),
(12,3,1),
(13,3,1),
(14,3,1),
(15,3,1),
(16,3,1),
(17,3,1),
(18,3,1),
(19,3,1),
(20,3,1),
(21,3,1),
(22,3,1),
(23,3,1),
(24,3,1),
(25,3,1),
(26,3,1),
(1,4,1),
(2,4,1),
(3,4,1),
(4,4,1),
(5,4,1),
(6,4,1),
(7,4,1),
(8,4,1),
(9,4,1),
(10,4,1),
(11,4,1),
(12,4,1),
(13,4,1),
(14,4,1),
(15,4,1),
(16,4,1),
(17,4,1),
(18,4,1),
(19,4,1),
(20,4,1),
(21,4,1),
(22,4,1),
(23,4,1),
(24,4,1),
(25,4,1),
(26,4,1),
(1,5,1),
(2,5,1),
(3,5,1),
(4,5,1),
(5,5,1),
(6,5,1),
(7,5,1),
(8,5,1),
(9,5,1),
(10,5,1),
(11,5,1),
(12,5,1),
(13,5,1),
(14,5,1),
(15,5,1),
(16,5,1),
(17,5,1),
(18,5,1),
(19,5,1),
(20,5,1),
(21,5,1),
(22,5,1),
(23,5,1),
(24,5,1),
(25,5,1),
(26,5,1),
(1,6,1),
(2,6,1),
(3,6,1),
(4,6,1),
(5,6,1),
(6,6,1),
(7,6,1),
(8,6,1),
(9,6,1),
(10,6,1),
(11,6,1),
(12,6,1),
(13,6,1),
(14,6,1),
(15,6,1),
(16,6,1),
(17,6,1),
(18,6,1),
(19,6,1),
(20,6,1),
(21,6,1),
(22,6,1),
(23,6,1),
(24,6,1),
(25,6,1),
(26,6,1),
(1,7,1),
(2,7,1),
(3,7,1),
(4,7,1),
(5,7,1),
(6,7,1),
(7,7,1),
(8,7,1),
(9,7,1),
(10,7,1),
(11,7,1),
(12,7,1),
(13,7,1),
(14,7,1),
(15,7,1),
(16,7,1),
(17,7,1),
(18,7,1),
(19,7,1),
(20,7,1),
(21,7,1),
(22,7,1),
(23,7,1),
(24,7,1),
(25,7,1),
(26,7,1),
(1,8,1),
(2,8,1),
(3,8,1),
(4,8,1),
(5,8,1),
(6,8,1),
(7,8,1),
(8,8,1),
(9,8,1),
(10,8,1),
(11,8,1),
(12,8,1),
(13,8,1),
(14,8,1),
(15,8,1),
(16,8,1),
(17,8,1),
(18,8,1),
(19,8,1),
(20,8,1),
(21,8,1),
(22,8,1),
(23,8,1),
(24,8,1),
(25,8,1),
(26,8,1),
(1,9,1),
(2,9,1),
(3,9,1),
(4,9,1),
(5,9,1),
(6,9,1),
(7,9,1),
(8,9,1),
(9,9,1),
(10,9,1),
(11,9,1),
(12,9,1),
(13,9,1),
(14,9,1),
(15,9,1),
(16,9,1),
(17,9,1),
(18,9,1),
(19,9,1),
(20,9,1),
(21,9,1),
(22,9,1),
(23,9,1),
(24,9,1),
(25,9,1),
(26,9,1),
(1,10,1),
(2,10,1),
(3,10,1),
(4,10,1),
(5,10,1),
(6,10,1),
(7,10,1),
(8,10,1),
(9,10,1),
(10,10,1),
(11,10,1),
(12,10,1),
(13,10,1),
(14,10,1),
(15,10,1),
(16,10,1),
(17,10,1),
(18,10,1),
(19,10,1),
(20,10,1),
(21,10,1),
(22,10,1),
(23,10,1),
(24,10,1),
(25,10,1),
(26,10,1),
(1,11,1),
(2,11,1),
(3,11,1),
(4,11,1),
(5,11,1),
(6,11,1),
(7,11,1),
(8,11,1),
(9,11,1),
(10,11,1),
(11,11,1),
(12,11,1),
(13,11,1),
(14,11,1),
(15,11,1),
(16,11,1),
(17,11,1),
(18,11,1),
(19,11,1),
(20,11,1),
(21,11,1),
(22,11,1),
(23,11,1),
(24,11,1),
(25,11,1),
(26,11,1),
(1,12,1),
(2,12,1),
(3,12,1),
(4,12,1),
(5,12,1),
(6,12,1),
(7,12,1),
(8,12,1),
(9,12,1),
(10,12,1),
(11,12,1),
(12,12,1),
(13,12,1),
(14,12,1),
(15,12,1),
(16,12,1),
(17,12,1),
(18,12,1),
(19,12,1),
(20,12,1),
(21,12,1),
(22,12,1),
(23,12,1),
(24,12,1),
(25,12,1),
(26,12,1),
(1,12,1),
(2,12,1),
(3,12,1),
(4,12,1),
(5,12,1),
(6,12,1),
(7,12,1),
(8,12,1),
(9,12,1),
(10,12,1),
(11,12,1),
(12,12,1),
(13,12,1),
(14,12,1),
(15,12,1),
(16,12,1),
(17,12,1),
(18,12,1),
(19,12,1),
(20,12,1),
(21,12,1),
(22,12,1),
(23,12,1),
(24,12,1),
(25,12,1),
(26,12,1),
(1,13,1),
(2,13,1),
(3,13,1),
(4,13,1),
(5,13,1),
(6,13,1),
(7,13,1),
(8,13,1),
(9,13,1),
(10,13,1),
(11,13,1),
(12,13,1),
(13,13,1),
(14,13,1),
(15,13,1),
(16,13,1),
(17,13,1),
(18,13,1),
(19,13,1),
(20,13,1),
(21,13,1),
(22,13,1),
(23,13,1),
(24,13,1),
(25,13,1),
(26,13,1),
(1,14,1),
(2,14,1),
(3,14,1),
(4,14,1),
(5,14,1),
(6,14,1),
(7,14,1),
(8,14,1),
(9,14,1),
(10,14,1),
(11,14,1),
(12,14,1),
(13,14,1),
(14,14,1),
(15,14,1),
(16,14,1),
(17,14,1),
(18,14,1),
(19,14,1),
(20,14,1),
(21,14,1),
(22,14,1),
(23,14,1),
(24,14,1),
(25,14,1),
(26,14,1),
(1,15,1),
(2,15,1),
(3,15,1),
(4,15,1),
(5,15,1),
(6,15,1),
(7,15,1),
(8,15,1),
(9,15,1),
(10,15,1),
(11,15,1),
(12,15,1),
(13,15,1),
(14,15,1),
(15,15,1),
(16,15,1),
(17,15,1),
(18,15,1),
(19,15,1),
(20,15,1),
(21,15,1),
(22,15,1),
(23,15,1),
(24,15,1),
(25,15,1),
(26,15,1),
(1,16,1),
(2,16,1),
(3,16,1),
(4,16,1),
(5,16,1),
(6,16,1),
(7,16,1),
(8,16,1),
(9,16,1),
(10,16,1),
(11,16,1),
(12,16,1),
(13,16,1),
(14,16,1),
(15,16,1),
(16,16,1),
(17,16,1),
(18,16,1),
(19,16,1),
(20,16,1),
(21,16,1),
(22,16,1),
(23,16,1),
(24,16,1),
(25,16,1),
(26,16,1),
(1,17,1),
(2,17,1),
(3,17,1),
(4,17,1),
(5,17,1),
(6,17,1),
(7,17,1),
(8,17,1),
(9,17,1),
(10,17,1),
(11,17,1),
(12,17,1),
(13,17,1),
(14,17,1),
(15,17,1),
(16,17,1),
(17,17,1),
(18,17,1),
(19,17,1),
(20,17,1),
(21,17,1),
(22,17,1),
(23,17,1),
(24,17,1),
(25,17,1),
(26,17,1),
(1,18,1),
(2,18,1),
(3,18,1),
(4,18,1),
(5,18,1),
(6,18,1),
(7,18,1),
(8,18,1),
(9,18,1),
(10,18,1),
(11,18,1),
(12,18,1),
(13,18,1),
(14,18,1),
(15,18,1),
(16,18,1),
(17,18,1),
(18,18,1),
(19,18,1),
(20,18,1),
(21,18,1),
(22,18,1),
(23,18,1),
(24,18,1),
(25,18,1),
(26,18,1),
(1,20,1),
(2,20,1),
(3,20,1),
(4,20,1),
(5,20,1),
(6,20,1),
(7,20,1),
(8,20,1),
(9,20,1),
(10,20,1),
(11,20,1),
(12,20,1),
(13,20,1),
(14,20,1),
(15,20,1),
(16,20,1),
(17,20,1),
(18,20,1),
(19,20,1),
(20,20,1),
(21,20,1),
(22,20,1),
(23,20,1),
(24,20,1),
(25,20,1),
(26,20,1),
(1,21,1),
(2,21,1),
(3,21,1),
(4,21,1),
(5,21,1),
(6,21,1),
(7,21,1),
(8,21,1),
(9,21,1),
(10,21,1),
(11,21,1),
(12,21,1),
(13,21,1),
(14,21,1),
(15,21,1),
(16,21,1),
(17,21,1),
(18,21,1),
(19,21,1),
(20,21,1),
(21,21,1),
(22,21,1),
(23,21,1),
(24,21,1),
(25,21,1),
(26,21,1),
(1,22,1),
(2,22,1),
(3,22,1),
(4,22,1),
(5,22,1),
(6,22,1),
(7,22,1),
(8,22,1),
(9,22,1),
(10,22,1),
(11,22,1),
(12,22,1),
(13,22,1),
(14,22,1),
(15,22,1),
(16,22,1),
(17,22,1),
(18,22,1),
(19,22,1),
(20,22,1),
(21,22,1),
(22,22,1),
(23,22,1),
(24,22,1),
(25,22,1),
(26,22,1),
(1,19,1),
(2,19,1),
(3,19,1),
(4,19,1),
(5,19,1),
(6,19,1),
(7,19,1),
(8,19,1),
(9,19,1),
(10,19,1),
(11,19,1),
(12,19,1),
(13,19,1),
(14,19,1),
(15,19,1),
(16,19,1),
(17,19,1),
(18,19,1),
(19,19,1),
(20,19,1),
(21,19,1),
(22,19,1),
(23,19,1),
(24,19,1),
(25,19,1),
(26,19,1);

INSERT INTO [dbo].[t_docente_curso]
           ([docente_cuso_fecha_fin]
           ,[docente_curso_fecha_inicio]
           ,[docente_curso_establ_id]
           ,[docente_curso_docente_id]
		   ,[docente_jefe])
     VALUES
('2038-12-8','2015-4-24',1,1,0),
('2028-5-2','2012-4-25',2,2,0),
('2033-8-11','2009-9-23',3,3,0),
('2035-8-19','2006-8-25',4,4,0),
('2025-3-18','2020-12-1',5,5,0),
('2040-6-9','2004-12-13',6,6,0),
('2034-7-18','2019-10-4',7,7,0),
('2039-6-12','2008-2-13',8,8,0),
('2037-3-10','2002-10-9',9,9,0),
('2039-11-13','2016-11-20',10,10,0),
('2030-4-14','2012-6-9',11,11,0),
('2028-11-20','2012-9-1',12,12,0),
('2033-9-8','2020-3-3',13,13,0),
('2038-4-23','2001-7-11',14,14,0),
('2023-5-2','2001-8-15',15,15,0),
('2023-2-2','2017-11-19',16,16,0),
('2033-7-27','2014-10-21',17,17,0),
('2025-1-4','2003-2-18',18,18,0),
('2035-5-26','2015-7-7',19,19,0),
('2027-6-25','2014-11-4',20,20,0),
('2022-6-23','2021-2-27',21,21,0),
('2038-5-9','2000-4-2',22,22,0),
('2024-7-16','2012-1-8',23,23,0),
('2024-7-4','2014-9-10',24,24,0),
('2034-6-15','2002-3-6',25,25,0),
('2025-2-24','2006-11-13',26,26,0),
('2036-3-8','2020-4-17',27,27,0),
('2023-4-27','2013-2-10',28,28,0),
('2036-5-24','2001-8-23',29,29,0),
('2022-7-3','2008-2-20',30,30,0),
('2034-6-13','2010-3-15',31,31,0),
('2024-4-19','2010-4-9',32,32,0),
('2030-12-13','2006-8-4',33,33,0),
('2034-8-17','2002-12-5',34,34,0),
('2033-6-15','2013-8-9',35,35,0),
('2027-12-14','2012-2-13',36,36,0),
('2024-7-22','2022-3-6',37,37,0),
('2026-6-22','2003-8-20',38,38,0),
('2029-6-12','2003-2-12',39,39,0),
('2022-10-7','2003-5-23',40,40,0),
('2025-3-20','2017-9-22',41,41,0),
('2040-7-20','2001-9-22',42,42,0),
('2036-7-11','2002-10-12',43,43,0),
('2040-1-22','2010-5-20',44,44,0),
('2034-4-23','2006-9-21',45,45,0),
('2026-8-7','2017-10-8',46,46,0),
('2034-7-21','2000-9-15',47,47,0),
('2032-3-2','2017-11-27',48,48,0),
('2034-1-8','2019-2-24',49,49,0),
('2040-4-5','2015-1-3',50,50,0),
('2028-11-14','2018-11-21',51,51,0),
('2028-10-14','2003-2-13',52,52,0),
('2027-11-3','2020-5-7',53,53,0),
('2035-4-12','2001-3-23',54,54,0),
('2040-7-16','2021-7-27',55,55,0),
('2038-9-12','2005-10-16',56,56,0),
('2033-9-25','2011-5-12',57,57,0),
('2036-6-9','2019-9-8',58,58,0),
('2031-2-12','2011-10-10',59,59,0),
('2029-4-12','2006-2-17',60,60,0),
('2039-5-16','2002-10-16',61,61,0),
('2035-8-26','2022-6-16',62,62,0),
('2034-12-26','2003-9-20',63,63,0),
('2035-9-25','2021-6-11',64,64,0),
('2023-10-3','2016-11-25',65,65,0),
('2026-5-17','2007-11-1',66,66,0),
('2038-4-7','2009-9-26',67,67,0),
('2037-5-17','2018-2-20',68,68,0),
('2040-9-8','2006-6-15',69,69,0),
('2038-9-22','2008-10-23',70,70,0),
('2028-11-13','2000-4-3',71,71,0),
('2030-12-25','2001-12-14',72,72,0),
('2032-7-26','2017-8-5',73,73,0),
('2040-8-11','2008-5-22',74,74,0),
('2035-5-17','2004-11-27',75,75,0),
('2028-9-22','2001-12-19',76,76,0),
('2035-6-17','2019-6-18',77,77,0),
('2035-9-18','2004-4-19',78,78,0),
('2038-4-27','2004-11-5',79,79,0),
('2030-8-8','2022-7-21',80,80,0),
('2022-7-4','2011-11-9',81,81,0),
('2023-10-7','2020-7-23',82,82,0),
('2032-2-3','2007-8-11',83,83,0),
('2026-4-18','2017-8-24',84,84,0),
('2032-12-27','2010-2-27',85,85,0),
('2033-10-13','2007-10-2',86,86,0),
('2028-6-6','2008-7-9',87,87,0),
('2026-1-25','2012-9-7',88,88,0),
('2032-6-16','2018-9-10',89,89,0),
('2027-10-4','2019-9-21',90,90,0),
('2022-8-14','2019-11-15',91,91,0),
('2032-4-8','2011-6-19',92,92,0),
('2032-2-18','2007-5-2',93,93,0),
('2037-2-21','2009-10-15',94,94,0),
('2026-10-4','2006-2-7',95,95,0),
('2025-6-20','2007-11-26',96,96,0),
('2036-1-5','2013-9-21',97,97,0),
('2040-9-19','2003-7-5',98,98,0),
('2035-6-22','2009-7-25',99,99,0),
('2026-10-8','2000-3-16',100,100,0),
('2034-3-2','2004-4-5',101,101,0),
('2024-2-4','2005-11-5',102,102,0),
('2028-8-6','2008-6-3',103,103,0),
('2035-10-5','2012-8-13',104,104,0),
('2029-3-7','2007-8-6',105,105,0),
('2038-6-18','2000-3-8',106,106,0),
('2037-2-25','2020-10-24',107,107,0),
('2037-9-10','2015-9-19',108,108,0),
('2033-7-9','2007-9-19',109,109,0),
('2034-9-9','2011-8-15',110,110,0),
('2036-12-11','2016-10-2',111,111,0),
('2031-4-27','2019-6-18',112,112,0),
('2024-4-19','2019-5-20',113,113,0),
('2025-7-10','2008-8-12',114,114,0),
('2027-1-5','2016-2-10',115,115,0),
('2031-7-13','2007-10-21',116,116,0),
('2024-8-27','2011-4-27',117,117,0),
('2023-11-23','2006-2-23',118,118,0),
('2031-4-21','2004-9-9',119,119,0),
('2034-1-26','2003-11-10',120,120,0),
('2028-11-26','2021-10-11',121,121,0),
('2026-3-25','2006-12-6',122,122,0),
('2029-12-18','2017-8-2',123,123,0),
('2030-7-27','2009-6-18',124,124,0),
('2023-9-19','2006-7-12',125,125,0),
('2026-2-20','2009-6-19',126,126,0),
('2030-4-26','2016-7-25',127,127,0),
('2030-6-14','2009-10-15',128,128,0),
('2038-5-12','2011-4-8',129,129,0),
('2025-9-20','2001-4-21',130,130,0),
('2025-4-22','2007-2-10',131,131,0),
('2022-1-15','2005-3-4',132,132,0),
('2033-8-13','2015-4-18',133,133,0),
('2030-2-6','2011-4-24',134,134,0),
('2023-6-15','2013-12-10',135,135,0),
('2037-7-22','2001-6-25',136,136,0),
('2040-1-25','2012-1-18',137,137,0),
('2034-5-27','2014-3-21',138,138,0),
('2040-3-6','2004-1-27',139,139,0),
('2024-4-10','2019-8-2',140,140,0),
('2025-4-23','2014-8-18',141,141,0),
('2025-1-22','2017-6-2',142,142,0),
('2036-1-27','2003-6-4',143,143,0),
('2022-8-20','2002-1-24',144,144,0),
('2024-9-4','2012-7-27',145,145,0),
('2022-7-8','2022-6-12',146,146,0),
('2031-9-9','2004-1-22',147,147,0),
('2040-2-18','2014-11-27',148,148,0),
('2029-10-25','2004-4-5',149,149,0),
('2028-2-14','2010-3-4',150,150,0),
('2023-2-22','2020-7-27',151,151,0),
('2037-4-4','2006-5-2',152,152,0),
('2032-5-14','2021-4-8',153,153,0),
('2025-10-24','2022-11-19',154,154,0),
('2025-3-2','2001-11-15',155,155,0),
('2030-1-5','2020-4-25',156,156,0),
('2039-2-25','2017-2-9',157,157,0),
('2031-12-4','2001-5-24',158,158,0),
('2038-8-9','2009-11-6',159,159,0),
('2029-12-9','2013-11-15',160,160,0),
('2024-6-6','2002-12-17',161,161,0),
('2025-10-15','2007-10-25',162,162,0),
('2040-1-22','2005-11-24',163,163,0),
('2025-11-20','2017-7-9',164,164,0),
('2030-12-19','2002-12-7',165,165,0),
('2037-6-7','2006-10-4',166,166,0),
('2033-1-5','2014-6-4',167,167,0),
('2033-12-1','2015-6-27',168,168,0),
('2028-6-25','2004-4-19',169,169,0),
('2024-9-21','2006-7-24',170,170,0),
('2040-1-12','2016-3-26',171,171,0),
('2032-4-17','2004-12-25',172,172,0),
('2032-4-20','2019-7-14',173,173,0),
('2029-10-24','2014-10-4',174,174,0),
('2026-7-6','2018-11-27',175,175,0),
('2038-1-10','2019-3-8',176,176,0),
('2028-4-24','2010-1-22',177,177,0),
('2036-11-4','2001-6-4',178,178,0),
('2027-2-13','2017-10-6',179,179,0),
('2027-6-22','2015-10-4',180,180,0),
('2040-7-20','2008-4-5',181,181,0),
('2036-3-27','2018-2-22',182,182,0),
('2024-8-14','2005-1-22',183,183,0),
('2028-4-2','2009-3-19',184,184,0),
('2031-7-21','2003-1-10',185,185,0),
('2025-2-4','2003-8-24',186,186,0),
('2030-2-15','2020-9-20',187,187,0),
('2022-3-25','2021-3-3',188,188,0),
('2038-10-6','2013-2-12',189,189,0),
('2029-7-27','2014-8-19',190,190,0),
('2031-1-10','2019-1-22',191,191,0),
('2025-9-17','2016-6-15',192,192,0),
('2032-2-6','2004-5-22',193,193,0),
('2040-9-9','2001-12-15',194,194,0),
('2034-11-8','2012-12-16',195,195,0),
('2024-10-18','2013-12-21',196,196,0),
('2023-7-27','2001-4-27',197,197,0),
('2034-1-23','2000-2-26',198,198,0),
('2024-4-6','2002-6-8',199,199,0),
('2039-11-9','2015-8-3',200,200,0),
('2026-8-5','2004-12-21',201,201,0),
('2038-12-26','2022-8-1',202,202,0),
('2029-8-14','2012-9-16',203,203,0),
('2033-8-25','2001-11-21',204,204,0),
('2040-4-27','2016-8-19',205,205,0),
('2027-12-6','2003-6-5',206,206,0),
('2035-8-15','2007-5-26',207,207,0),
('2036-2-13','2017-12-1',208,208,0),
('2032-4-25','2022-11-13',209,209,0),
('2029-9-2','2012-8-6',210,210,0),
('2037-1-17','2008-11-16',211,211,0),
('2033-10-18','2019-3-13',212,212,0),
('2034-7-23','2011-8-6',213,213,0),
('2031-2-5','2018-12-3',214,214,0),
('2032-3-18','2004-9-27',215,215,0),
('2027-10-12','2012-2-9',216,216,0),
('2024-12-15','2005-12-15',217,217,0),
('2037-11-22','2013-12-19',218,218,0),
('2037-10-2','2007-10-7',219,219,0),
('2023-12-22','2013-7-16',220,220,0),
('2038-12-20','2008-1-27',221,221,0),
('2036-4-2','2003-4-18',222,222,0),
('2035-12-12','2019-11-22',223,223,0),
('2031-6-27','2022-6-8',224,224,0),
('2040-10-13','2001-1-22',225,225,0),
('2025-3-7','2010-7-23',226,226,0),
('2032-2-11','2014-5-26',227,227,0),
('2025-11-15','2005-5-21',228,228,0),
('2025-8-3','2006-9-8',229,229,0),
('2030-3-9','2006-3-17',230,230,0),
('2023-5-13','2015-2-2',231,231,0),
('2026-2-7','2002-11-23',232,232,0),
('2038-5-3','2016-10-23',233,233,0),
('2025-4-27','2015-5-23',234,234,0),
('2037-6-7','2015-11-21',235,235,0),
('2023-5-24','2007-6-13',236,236,0),
('2038-7-26','2014-5-1',237,237,0),
('2036-11-16','2012-8-10',238,238,0),
('2022-6-17','2000-4-2',239,239,0),
('2038-10-21','2016-4-24',240,240,0),
('2036-5-21','2010-5-27',241,241,0),
('2030-6-9','2021-10-18',242,242,0),
('2032-2-12','2012-10-23',243,243,0),
('2025-10-26','2014-1-3',244,244,0),
('2023-4-24','2011-10-10',245,245,0),
('2040-5-14','2015-3-11',246,246,0),
('2033-4-24','2001-1-13',247,247,0),
('2024-2-5','2009-5-22',248,248,0),
('2030-1-26','2020-8-23',249,249,0),
('2031-9-17','2005-11-15',250,250,0),
('2039-5-23','2012-3-24',251,251,0),
('2028-9-4','2004-8-2',252,252,0),
('2027-3-13','2018-11-21',253,253,0),
('2038-4-18','2003-1-7',254,254,0),
('2027-5-26','2017-10-6',255,255,0),
('2026-7-11','2007-2-22',256,256,0),
('2036-2-18','2020-12-10',257,257,0),
('2031-4-8','2017-7-8',258,258,0),
('2030-6-13','2021-1-14',259,259,0),
('2038-9-24','2011-1-9',260,260,0),
('2032-6-25','2003-2-26',261,261,0),
('2028-3-12','2021-1-26',262,262,0),
('2031-2-1','2014-8-13',263,263,0),
('2040-1-21','2004-8-17',264,264,0),
('2032-8-12','2012-1-11',265,265,0),
('2030-9-2','2018-7-5',266,266,0),
('2040-2-11','2006-4-16',267,267,0),
('2029-10-20','2000-9-25',268,268,0),
('2029-5-18','2002-9-13',269,269,0),
('2032-12-3','2007-2-6',270,270,0),
('2030-1-13','2002-10-25',271,271,0),
('2026-3-24','2018-7-8',272,272,0),
('2039-6-26','2006-4-13',273,273,0),
('2040-6-5','2007-5-8',274,274,0),
('2031-7-9','2001-10-7',275,275,0),
('2039-8-23','2009-11-23',276,276,0),
('2030-7-1','2005-10-27',277,277,0),
('2034-3-14','2016-9-3',278,278,0),
('2036-8-13','2014-1-24',279,279,0),
('2035-6-5','2014-2-25',280,280,0),
('2032-11-5','2002-1-1',281,281,0),
('2038-1-11','2011-11-7',282,282,0),
('2034-9-19','2015-4-12',283,283,0),
('2029-11-3','2015-12-18',284,284,0),
('2028-12-22','2013-1-11',285,285,0),
('2023-6-20','2020-8-7',286,286,0),
('2038-9-27','2007-9-20',287,287,0),
('2036-11-22','2022-12-26',288,288,0),
('2035-1-3','2010-2-27',289,289,0),
('2023-2-7','2007-7-2',290,290,0),
('2022-12-7','2002-8-23',291,291,0),
('2026-12-14','2004-3-21',292,292,0),
('2031-5-7','2018-10-3',293,293,0),
('2033-8-14','2011-7-24',294,294,0),
('2038-8-23','2001-11-16',295,295,0),
('2022-10-14','2001-2-20',296,296,0),
('2032-6-22','2008-6-2',297,297,0),
('2035-6-20','2014-10-2',298,298,0),
('2038-1-2','2013-4-13',299,299,0),
('2030-10-4','2002-7-8',300,300,0),
('2024-12-6','2014-6-23',301,301,0),
('2032-9-8','2001-6-15',302,302,0),
('2023-6-27','2015-10-7',303,303,0),
('2031-5-4','2000-6-13',304,304,0),
('2028-5-4','2012-11-26',305,305,0),
('2023-10-8','2009-11-25',306,306,0),
('2039-3-4','2004-1-10',307,307,0),
('2034-1-17','2005-5-15',308,308,0),
('2027-10-4','2022-2-1',309,309,0),
('2040-3-25','2008-11-27',310,310,0),
('2040-8-8','2010-8-3',311,311,0),
('2022-3-15','2007-1-1',312,312,0),
('2032-6-14','2014-8-25',313,313,0),
('2030-11-12','2001-11-10',314,314,0),
('2031-8-20','2001-3-27',315,315,0),
('2028-5-2','2013-4-27',316,316,0),
('2034-3-8','2015-12-9',317,317,0),
('2025-9-7','2000-7-24',318,318,0),
('2025-5-4','2000-9-12',319,319,0),
('2030-1-5','2018-5-10',320,320,0),
('2023-7-18','2004-7-25',321,321,0),
('2035-6-8','2019-4-12',322,322,0),
('2030-3-20','2008-3-11',323,323,0),
('2022-6-7','2020-12-18',324,324,0),
('2023-6-21','2018-6-25',325,325,0),
('2032-12-11','2007-3-7',326,326,0),
('2037-8-10','2002-6-12',327,327,0),
('2023-1-21','2003-12-23',328,328,0),
('2026-11-5','2014-3-21',329,329,0),
('2033-6-8','2012-6-1',330,330,0),
('2029-5-8','2010-1-20',331,331,0),
('2023-1-9','2001-10-1',332,332,0),
('2024-3-16','2003-11-1',333,333,0),
('2022-3-21','2002-11-7',334,334,0),
('2031-2-5','2009-2-7',335,335,0),
('2025-8-1','2014-5-15',336,336,0),
('2035-11-23','2004-10-8',337,337,0),
('2036-8-5','2015-5-7',338,338,0),
('2022-6-13','2013-4-12',339,339,0),
('2028-9-27','2000-12-13',340,340,0),
('2025-7-4','2013-7-1',341,341,0),
('2027-1-16','2007-8-11',342,342,0),
('2026-6-4','2019-11-23',343,343,0),
('2030-3-21','2003-3-24',344,344,1),
('2032-11-11','2019-5-13',345,345,1),
('2027-5-2','2020-4-11',346,346,1),
('2039-9-14','2008-8-23',347,347,1),
('2030-2-14','2012-12-27',348,348,1),
('2027-1-14','2016-8-25',349,349,1),
('2026-4-2','2011-1-14',350,350,1),
('2039-11-7','2000-8-7',351,351,1),
('2040-5-24','2019-11-22',352,352,1),
('2039-1-9','2009-3-15',353,353,1),
('2026-8-10','2011-11-4',354,354,1),
('2024-7-1','2002-1-2',355,355,1),
('2022-8-21','2004-7-16',356,356,1),
('2022-4-16','2017-3-3',357,357,1),
('2035-7-10','2012-5-9',358,358,1),
('2027-1-7','2004-10-7',359,359,1),
('2025-11-6','2002-12-8',360,360,1),
('2030-11-13','2000-2-12',361,361,1),
('2036-12-3','2000-3-24',362,362,1),
('2028-9-21','2005-2-12',363,363,1),
('2040-4-24','2022-10-21',364,364,1),
('2023-12-13','2014-12-7',365,365,1),
('2040-7-26','2021-8-5',366,366,1),
('2030-11-24','2007-10-2',367,367,1),
('2023-1-22','2017-10-2',368,368,1),
('2025-3-24','2020-9-25',369,369,1),
('2037-5-14','2007-4-21',370,370,1),
('2030-12-23','2009-5-17',371,371,1),
('2022-1-14','2000-11-23',372,372,1),
('2037-12-20','2010-2-15',373,373,1),
('2027-8-19','2012-10-23',374,374,1),
('2036-7-11','2021-6-2',375,375,1),
('2039-8-23','2010-12-11',376,376,1),
('2037-6-11','2003-6-16',377,377,1),
('2036-7-7','2007-1-14',378,378,1),
('2029-5-11','2003-12-17',379,379,1),
('2027-8-11','2000-4-27',380,380,1),
('2029-11-2','2011-5-23',381,381,1),
('2039-5-23','2021-6-6',382,382,1),
('2032-4-8','2007-3-4',383,383,1),
('2039-8-21','2002-12-18',384,384,1),
('2035-6-24','2011-7-16',385,385,1),
('2033-6-10','2000-9-16',386,386,1),
('2031-9-8','2005-7-6',387,387,1),
('2038-7-18','2008-4-10',388,388,1),
('2035-8-17','2012-6-13',389,389,1),
('2032-2-3','2016-9-21',390,390,1),
('2040-6-4','2001-9-14',391,391,1),
('2033-6-14','2016-9-2',392,392,1),
('2029-3-6','2006-11-13',393,393,1),
('2022-7-6','2007-8-24',394,394,1),
('2037-9-25','2009-4-4',395,395,1),
('2038-6-8','2004-2-1',396,396,1),
('2032-11-13','2006-1-19',397,397,1),
('2024-10-19','2004-7-23',398,398,1),
('2022-10-3','2005-1-10',399,399,1),
('2028-2-5','2008-8-23',400,400,1),
('2025-3-6','2012-6-6',401,401,1),
('2027-1-14','2016-8-25',402,1,1),
('2026-4-2','2011-1-14',403,2,1),
('2039-11-7','2000-8-7',404,3,1),
('2040-5-24','2019-11-22',405,4,1),
('2039-1-9','2009-3-15',406,5,1),
('2026-8-10','2011-11-4',407,6,1),
('2024-7-1','2002-1-2',408,7,1),
('2022-8-21','2004-7-16',409,8,1),
('2022-4-16','2017-3-3',410,9,1),
('2035-7-10','2012-5-9',411,10,1),
('2027-1-7','2004-10-7',412,11,1),
('2025-11-6','2002-12-8',413,12,1),
('2030-11-13','2000-2-12',414,13,1),
('2036-12-3','2000-3-24',415,14,1),
('2028-9-21','2005-2-12',416,15,1),
('2040-4-24','2022-10-21',417,16,1),
('2023-12-13','2014-12-7',418,17,1),
('2040-7-26','2021-8-5',419,18,1),
('2030-11-24','2007-10-2',420,19,1),
('2023-1-22','2017-10-2',421,20,1),
('2025-3-24','2020-9-25',422,21,1),
('2037-5-14','2007-4-21',423,22,1),
('2030-12-23','2009-5-17',424,23,1),
('2022-1-14','2000-11-23',425,24,1),
('2037-12-20','2010-2-15',426,25,1),
('2027-8-19','2012-10-23',427,26,1),
('2036-7-11','2021-6-2',428,27,1),
('2039-8-23','2010-12-11',429,28,1),
('2037-6-11','2003-6-16',430,29,1),
('2036-7-7','2007-1-14',431,30,1),
('2029-5-11','2003-12-17',432,31,1),
('2027-8-11','2000-4-27',433,32,1),
('2029-11-2','2011-5-23',434,33,1),
('2039-5-23','2021-6-6',435,34,1),
('2032-4-8','2007-3-4',436,35,1),
('2039-8-21','2002-12-18',437,36,1),
('2035-6-24','2011-7-16',438,37,1),
('2033-6-10','2000-9-16',439,38,1),
('2031-9-8','2005-7-6',440,39,1),
('2038-7-18','2008-4-10',441,40,1),
('2035-8-17','2012-6-13',442,41,1),
('2032-2-3','2016-9-21',443,42,1),
('2040-6-4','2001-9-14',444,43,1),
('2033-6-14','2016-9-2',445,44,1),
('2029-3-6','2006-11-13',446,45,1),
('2022-7-6','2007-8-24',447,46,1),
('2037-9-25','2009-4-4',448,47,1),
('2038-6-8','2004-2-1',449,48,1),
('2032-11-13','2006-1-19',450,49,1),
('2024-10-19','2004-7-23',451,50,1),
('2022-10-3','2005-1-10',452,51,1),
('2028-2-5','2008-8-23',453,52,1),
('2025-3-6','2012-6-6',454,53,1),
('2027-1-14','2016-8-25',455,54,1),
('2026-4-2','2011-1-14',456,55,1),
('2039-11-7','2000-8-7',457,56,1),
('2040-5-24','2019-11-22',458,57,1),
('2039-1-9','2009-3-15',459,58,1),
('2026-8-10','2011-11-4',460,59,1),
('2024-7-1','2002-1-2',461,60,1),
('2022-8-21','2004-7-16',462,61,1),
('2022-4-16','2017-3-3',463,62,1),
('2035-7-10','2012-5-9',464,63,1),
('2027-1-7','2004-10-7',465,64,1),
('2025-11-6','2002-12-8',466,65,1),
('2030-11-13','2000-2-12',467,66,1),
('2036-12-3','2000-3-24',468,67,1),
('2028-9-21','2005-2-12',469,68,1),
('2040-4-24','2022-10-21',470,69,1),
('2023-12-13','2014-12-7',471,70,1),
('2040-7-26','2021-8-5',472,71,1),
('2030-11-24','2007-10-2',473,72,1),
('2023-1-22','2017-10-2',474,73,1),
('2025-3-24','2020-9-25',475,74,1),
('2037-5-14','2007-4-21',476,75,1),
('2030-12-23','2009-5-17',477,76,1),
('2022-1-14','2000-11-23',478,77,1),
('2037-12-20','2010-2-15',479,78,1),
('2027-8-19','2012-10-23',480,79,1),
('2036-7-11','2021-6-2',481,80,1),
('2039-8-23','2010-12-11',482,81,1),
('2037-6-11','2003-6-16',483,82,1),
('2036-7-7','2007-1-14',484,83,1),
('2029-5-11','2003-12-17',485,84,1),
('2027-8-11','2000-4-27',486,85,1),
('2029-11-2','2011-5-23',487,86,1),
('2039-5-23','2021-6-6',488,87,1),
('2032-4-8','2007-3-4',489,88,1),
('2039-8-21','2002-12-18',490,89,1),
('2035-6-24','2011-7-16',491,90,1),
('2033-6-10','2000-9-16',492,91,1),
('2031-9-8','2005-7-6',493,92,1),
('2038-7-18','2008-4-10',494,93,1),
('2035-8-17','2012-6-13',495,94,1),
('2032-2-3','2016-9-21',496,95,1),
('2040-6-4','2001-9-14',497,96,1),
('2033-6-14','2016-9-2',498,97,1),
('2029-3-6','2006-11-13',499,98,1),
('2022-7-6','2007-8-24',500,99,1),
('2037-9-25','2009-4-4',501,100,1),
('2038-6-8','2004-2-1',502,101,1),
('2032-11-13','2006-1-19',503,102,1),
('2024-10-19','2004-7-23',504,103,1),
('2022-10-3','2005-1-10',505,104,1),
('2028-2-5','2008-8-23',506,105,1),
('2025-3-6','2012-6-6',507,106,1),
('2027-1-14','2016-8-25',508,107,1),
('2026-4-2','2011-1-14',509,108,1),
('2039-11-7','2000-8-7',510,109,1),
('2040-5-24','2019-11-22',511,110,1),
('2039-1-9','2009-3-15',512,111,1),
('2026-8-10','2011-11-4',513,112,1),
('2024-7-1','2002-1-2',514,113,1),
('2022-8-21','2004-7-16',515,114,1),
('2022-4-16','2017-3-3',516,115,1),
('2035-7-10','2012-5-9',517,116,1),
('2027-1-7','2004-10-7',518,117,1),
('2025-11-6','2002-12-8',519,118,1),
('2030-11-13','2000-2-12',520,119,1),
('2036-12-3','2000-3-24',521,120,1),
('2028-9-21','2005-2-12',522,121,1),
('2040-4-24','2022-10-21',523,122,1),
('2023-12-13','2014-12-7',524,123,1),
('2040-7-26','2021-8-5',525,124,1),
('2030-11-24','2007-10-2',526,125,1),
('2023-1-22','2017-10-2',527,126,1),
('2025-3-24','2020-9-25',528,127,1),
('2037-5-14','2007-4-21',529,128,1),
('2030-12-23','2009-5-17',530,129,1),
('2022-1-14','2000-11-23',531,130,1),
('2037-12-20','2010-2-15',532,131,1),
('2027-8-19','2012-10-23',533,132,1),
('2036-7-11','2021-6-2',534,133,1),
('2039-8-23','2010-12-11',535,134,1),
('2037-6-11','2003-6-16',536,135,1),
('2036-7-7','2007-1-14',537,136,1),
('2029-5-11','2003-12-17',538,137,1),
('2027-8-11','2000-4-27',539,138,1),
('2029-11-2','2011-5-23',540,139,1),
('2039-5-23','2021-6-6',541,140,1),
('2032-4-8','2007-3-4',542,141,1),
('2039-8-21','2002-12-18',543,142,1),
('2035-6-24','2011-7-16',544,143,1),
('2033-6-10','2000-9-16',545,144,1),
('2031-9-8','2005-7-6',546,145,1),
('2038-7-18','2008-4-10',547,146,1),
('2035-8-17','2012-6-13',548,147,1),
('2032-2-3','2016-9-21',549,148,1),
('2040-6-4','2001-9-14',550,149,1),
('2033-6-14','2016-9-2',551,150,1),
('2029-3-6','2006-11-13',552,151,1),
('2022-7-6','2007-8-24',553,152,1),
('2037-9-25','2009-4-4',554,153,1),
('2038-6-8','2004-2-1',555,154,1),
('2032-11-13','2006-1-19',556,155,1),
('2024-10-19','2004-7-23',557,156,1),
('2022-10-3','2005-1-10',558,157,1),
('2028-2-5','2008-8-23',559,158,1),
('2025-3-6','2012-6-6',560,159,1),
('2027-1-14','2016-8-25',561,160,1),
('2026-4-2','2011-1-14',562,161,1),
('2039-11-7','2000-8-7',563,162,1),
('2040-5-24','2019-11-22',564,163,1),
('2039-1-9','2009-3-15',565,164,1),
('2026-8-10','2011-11-4',566,165,1),
('2024-7-1','2002-1-2',567,166,1),
('2022-8-21','2004-7-16',568,167,1),
('2022-4-16','2017-3-3',569,168,1),
('2035-7-10','2012-5-9',570,169,1),
('2027-1-7','2004-10-7',571,170,1),
('2025-11-6','2002-12-8',572,171,1),
('2030-11-13','2000-2-12',573,172,1),
('2036-12-3','2000-3-24',574,173,1),
('2028-9-21','2005-2-12',575,174,1),
('2040-4-24','2022-10-21',576,175,1),
('2023-12-13','2014-12-7',577,176,1),
('2040-7-26','2021-8-5',578,177,1),
('2030-11-24','2007-10-2',579,178,1),
('2023-1-22','2017-10-2',580,179,1),
('2025-3-24','2020-9-25',581,180,1),
('2037-5-14','2007-4-21',582,181,1),
('2030-12-23','2009-5-17',583,182,1),
('2022-1-14','2000-11-23',584,183,1),
('2037-12-20','2010-2-15',585,184,1),
('2027-8-19','2012-10-23',586,185,1),
('2036-7-11','2021-6-2',587,186,1),
('2039-8-23','2010-12-11',588,187,1),
('2037-6-11','2003-6-16',589,188,1),
('2036-7-7','2007-1-14',590,189,1),
('2029-5-11','2003-12-17',591,190,1),
('2027-8-11','2000-4-27',592,191,1),
('2029-11-2','2011-5-23',593,192,1),
('2039-5-23','2021-6-6',594,193,1),
('2032-4-8','2007-3-4',595,194,1),
('2039-8-21','2002-12-18',596,195,1),
('2035-6-24','2011-7-16',597,196,1),
('2033-6-10','2000-9-16',598,197,1);

INSERT INTO [dbo].[t_asignatura_docente]
           ([asignatura_doc_fin]
           ,[asignatura_doc_inicio]
           ,[asignatura_doc_asignatura_id]
           ,[asignatura_doc_docente_establ_id])
     VALUES
('2038-12-8','2015-4-24',13,1),
('2028-5-2','2012-4-25',14,2),
('2033-8-11','2009-9-23',9,3),
('2035-8-19','2006-8-25',7,4),
('2025-3-18','2020-12-1',11,5),
('2040-6-9','2004-12-13',12,6),
('2034-7-18','2019-10-4',2,7),
('2039-6-12','2008-2-13',12,8),
('2037-3-10','2002-10-9',12,9),
('2039-11-13','2016-11-20',1,10),
('2030-4-14','2012-6-9',14,11),
('2028-11-20','2012-9-1',4,12),
('2033-9-8','2020-3-3',6,13),
('2038-4-23','2001-7-11',12,14),
('2023-5-2','2001-8-15',13,15),
('2023-2-2','2017-11-19',7,16),
('2033-7-27','2014-10-21',7,17),
('2025-1-4','2003-2-18',4,18),
('2035-5-26','2015-7-7',10,19),
('2027-6-25','2014-11-4',9,20),
('2022-6-23','2021-2-27',7,21),
('2038-5-9','2000-4-2',11,22),
('2024-7-16','2012-1-8',6,23),
('2024-7-4','2014-9-10',10,24),
('2034-6-15','2002-3-6',11,25),
('2025-2-24','2006-11-13',14,26),
('2036-3-8','2020-4-17',1,27),
('2023-4-27','2013-2-10',12,28),
('2036-5-24','2001-8-23',6,29),
('2022-7-3','2008-2-20',3,30),
('2034-6-13','2010-3-15',4,31),
('2024-4-19','2010-4-9',11,32),
('2030-12-13','2006-8-4',9,33),
('2034-8-17','2002-12-5',12,34),
('2033-6-15','2013-8-9',3,35),
('2027-12-14','2012-2-13',9,36),
('2024-7-22','2022-3-6',9,37),
('2026-6-22','2003-8-20',7,38),
('2029-6-12','2003-2-12',14,39),
('2022-10-7','2003-5-23',6,40),
('2025-3-20','2017-9-22',2,41),
('2040-7-20','2001-9-22',11,42),
('2036-7-11','2002-10-12',7,43),
('2040-1-22','2010-5-20',9,44),
('2034-4-23','2006-9-21',10,45),
('2026-8-7','2017-10-8',7,46),
('2034-7-21','2000-9-15',5,47),
('2032-3-2','2017-11-27',7,48),
('2034-1-8','2019-2-24',5,49),
('2040-4-5','2015-1-3',4,50),
('2028-11-14','2018-11-21',5,51),
('2028-10-14','2003-2-13',1,52),
('2027-11-3','2020-5-7',13,53),
('2035-4-12','2001-3-23',10,54),
('2040-7-16','2021-7-27',11,55),
('2038-9-12','2005-10-16',8,56),
('2033-9-25','2011-5-12',5,57),
('2036-6-9','2019-9-8',2,58),
('2031-2-12','2011-10-10',11,59),
('2029-4-12','2006-2-17',6,60),
('2039-5-16','2002-10-16',4,61),
('2035-8-26','2022-6-16',6,62),
('2034-12-26','2003-9-20',1,63),
('2035-9-25','2021-6-11',11,64),
('2023-10-3','2016-11-25',2,65),
('2026-5-17','2007-11-1',5,66),
('2038-4-7','2009-9-26',12,67),
('2037-5-17','2018-2-20',13,68),
('2040-9-8','2006-6-15',2,69),
('2038-9-22','2008-10-23',1,70),
('2028-11-13','2000-4-3',2,71),
('2030-12-25','2001-12-14',1,72),
('2032-7-26','2017-8-5',13,73),
('2040-8-11','2008-5-22',6,74),
('2035-5-17','2004-11-27',4,75),
('2028-9-22','2001-12-19',5,76),
('2035-6-17','2019-6-18',6,77),
('2035-9-18','2004-4-19',9,78),
('2038-4-27','2004-11-5',4,79),
('2030-8-8','2022-7-21',5,80),
('2022-7-4','2011-11-9',6,81),
('2023-10-7','2020-7-23',13,82),
('2032-2-3','2007-8-11',12,83),
('2026-4-18','2017-8-24',3,84),
('2032-12-27','2010-2-27',1,85),
('2033-10-13','2007-10-2',7,86),
('2028-6-6','2008-7-9',9,87),
('2026-1-25','2012-9-7',10,88),
('2032-6-16','2018-9-10',7,89),
('2027-10-4','2019-9-21',10,90),
('2022-8-14','2019-11-15',8,91),
('2032-4-8','2011-6-19',5,92),
('2032-2-18','2007-5-2',1,93),
('2037-2-21','2009-10-15',3,94),
('2026-10-4','2006-2-7',3,95),
('2025-6-20','2007-11-26',4,96),
('2036-1-5','2013-9-21',7,97),
('2040-9-19','2003-7-5',9,98),
('2035-6-22','2009-7-25',6,99),
('2026-10-8','2000-3-16',14,100),
('2034-3-2','2004-4-5',5,101),
('2024-2-4','2005-11-5',7,102),
('2028-8-6','2008-6-3',8,103),
('2035-10-5','2012-8-13',3,104),
('2029-3-7','2007-8-6',13,105),
('2038-6-18','2000-3-8',5,106),
('2037-2-25','2020-10-24',2,107),
('2037-9-10','2015-9-19',6,108),
('2033-7-9','2007-9-19',1,109),
('2034-9-9','2011-8-15',14,110),
('2036-12-11','2016-10-2',13,111),
('2031-4-27','2019-6-18',3,112),
('2024-4-19','2019-5-20',11,113),
('2025-7-10','2008-8-12',7,114),
('2027-1-5','2016-2-10',9,115),
('2031-7-13','2007-10-21',5,116),
('2024-8-27','2011-4-27',8,117),
('2023-11-23','2006-2-23',8,118),
('2031-4-21','2004-9-9',13,119),
('2034-1-26','2003-11-10',1,120),
('2028-11-26','2021-10-11',14,121),
('2026-3-25','2006-12-6',5,122),
('2029-12-18','2017-8-2',13,123),
('2030-7-27','2009-6-18',11,124),
('2023-9-19','2006-7-12',12,125),
('2026-2-20','2009-6-19',8,126),
('2030-4-26','2016-7-25',7,127),
('2030-6-14','2009-10-15',7,128),
('2038-5-12','2011-4-8',11,129),
('2025-9-20','2001-4-21',11,130),
('2025-4-22','2007-2-10',9,131),
('2022-1-15','2005-3-4',8,132),
('2033-8-13','2015-4-18',11,133),
('2030-2-6','2011-4-24',8,134),
('2023-6-15','2013-12-10',12,135),
('2037-7-22','2001-6-25',11,136),
('2040-1-25','2012-1-18',1,137),
('2034-5-27','2014-3-21',11,138),
('2040-3-6','2004-1-27',6,139),
('2024-4-10','2019-8-2',9,140),
('2025-4-23','2014-8-18',2,141),
('2025-1-22','2017-6-2',10,142),
('2036-1-27','2003-6-4',6,143),
('2022-8-20','2002-1-24',13,144),
('2024-9-4','2012-7-27',11,145),
('2022-7-8','2022-6-12',14,146),
('2031-9-9','2004-1-22',6,147),
('2040-2-18','2014-11-27',11,148),
('2029-10-25','2004-4-5',2,149),
('2028-2-14','2010-3-4',1,150),
('2023-2-22','2020-7-27',13,151),
('2037-4-4','2006-5-2',2,152),
('2032-5-14','2021-4-8',11,153),
('2025-10-24','2022-11-19',12,154),
('2025-3-2','2001-11-15',2,155),
('2030-1-5','2020-4-25',11,156),
('2039-2-25','2017-2-9',8,157),
('2031-12-4','2001-5-24',4,158),
('2038-8-9','2009-11-6',6,159),
('2029-12-9','2013-11-15',8,160),
('2024-6-6','2002-12-17',10,161),
('2025-10-15','2007-10-25',11,162),
('2040-1-22','2005-11-24',9,163),
('2025-11-20','2017-7-9',2,164),
('2030-12-19','2002-12-7',10,165),
('2037-6-7','2006-10-4',7,166),
('2033-1-5','2014-6-4',11,167),
('2033-12-1','2015-6-27',11,168),
('2028-6-25','2004-4-19',7,169),
('2024-9-21','2006-7-24',14,170),
('2040-1-12','2016-3-26',8,171),
('2032-4-17','2004-12-25',13,172),
('2032-4-20','2019-7-14',13,173),
('2029-10-24','2014-10-4',4,174),
('2026-7-6','2018-11-27',7,175),
('2038-1-10','2019-3-8',12,176),
('2028-4-24','2010-1-22',11,177),
('2036-11-4','2001-6-4',4,178),
('2027-2-13','2017-10-6',7,179),
('2027-6-22','2015-10-4',8,180),
('2040-7-20','2008-4-5',8,181),
('2036-3-27','2018-2-22',10,182),
('2024-8-14','2005-1-22',1,183),
('2028-4-2','2009-3-19',13,184),
('2031-7-21','2003-1-10',11,185),
('2025-2-4','2003-8-24',3,186),
('2030-2-15','2020-9-20',3,187),
('2022-3-25','2021-3-3',4,188),
('2038-10-6','2013-2-12',12,189),
('2029-7-27','2014-8-19',1,190),
('2031-1-10','2019-1-22',2,191),
('2025-9-17','2016-6-15',14,192),
('2032-2-6','2004-5-22',1,193),
('2040-9-9','2001-12-15',9,194),
('2034-11-8','2012-12-16',11,195),
('2024-10-18','2013-12-21',3,196),
('2023-7-27','2001-4-27',14,197),
('2034-1-23','2000-2-26',7,198),
('2024-4-6','2002-6-8',14,199),
('2039-11-9','2015-8-3',10,200),
('2026-8-5','2004-12-21',1,201),
('2038-12-26','2022-8-1',1,202),
('2029-8-14','2012-9-16',14,203),
('2033-8-25','2001-11-21',9,204),
('2040-4-27','2016-8-19',6,205),
('2027-12-6','2003-6-5',8,206),
('2035-8-15','2007-5-26',7,207),
('2036-2-13','2017-12-1',2,208),
('2032-4-25','2022-11-13',9,209),
('2029-9-2','2012-8-6',10,210),
('2037-1-17','2008-11-16',11,211),
('2033-10-18','2019-3-13',13,212),
('2034-7-23','2011-8-6',12,213),
('2031-2-5','2018-12-3',8,214),
('2032-3-18','2004-9-27',12,215),
('2027-10-12','2012-2-9',12,216),
('2024-12-15','2005-12-15',10,217),
('2037-11-22','2013-12-19',11,218),
('2037-10-2','2007-10-7',14,219),
('2023-12-22','2013-7-16',5,220),
('2038-12-20','2008-1-27',9,221),
('2036-4-2','2003-4-18',9,222),
('2035-12-12','2019-11-22',1,223),
('2031-6-27','2022-6-8',9,224),
('2040-10-13','2001-1-22',5,225),
('2025-3-7','2010-7-23',11,226),
('2032-2-11','2014-5-26',6,227),
('2025-11-15','2005-5-21',10,228),
('2025-8-3','2006-9-8',12,229),
('2030-3-9','2006-3-17',8,230),
('2023-5-13','2015-2-2',9,231),
('2026-2-7','2002-11-23',7,232),
('2038-5-3','2016-10-23',11,233),
('2025-4-27','2015-5-23',2,234),
('2037-6-7','2015-11-21',9,235),
('2023-5-24','2007-6-13',13,236),
('2038-7-26','2014-5-1',7,237),
('2036-11-16','2012-8-10',12,238),
('2022-6-17','2000-4-2',5,239),
('2038-10-21','2016-4-24',6,240),
('2036-5-21','2010-5-27',8,241),
('2030-6-9','2021-10-18',10,242),
('2032-2-12','2012-10-23',4,243),
('2025-10-26','2014-1-3',7,244),
('2023-4-24','2011-10-10',11,245),
('2040-5-14','2015-3-11',6,246),
('2033-4-24','2001-1-13',8,247),
('2024-2-5','2009-5-22',13,248),
('2030-1-26','2020-8-23',1,249),
('2031-9-17','2005-11-15',9,250),
('2039-5-23','2012-3-24',9,251),
('2028-9-4','2004-8-2',13,252),
('2027-3-13','2018-11-21',13,253),
('2038-4-18','2003-1-7',4,254),
('2027-5-26','2017-10-6',5,255),
('2026-7-11','2007-2-22',8,256),
('2036-2-18','2020-12-10',8,257),
('2031-4-8','2017-7-8',4,258),
('2030-6-13','2021-1-14',10,259),
('2038-9-24','2011-1-9',14,260),
('2032-6-25','2003-2-26',2,261),
('2028-3-12','2021-1-26',10,262),
('2031-2-1','2014-8-13',1,263),
('2040-1-21','2004-8-17',14,264),
('2032-8-12','2012-1-11',5,265),
('2030-9-2','2018-7-5',14,266),
('2040-2-11','2006-4-16',9,267),
('2029-10-20','2000-9-25',2,268),
('2029-5-18','2002-9-13',8,269),
('2032-12-3','2007-2-6',7,270),
('2030-1-13','2002-10-25',10,271),
('2026-3-24','2018-7-8',2,272),
('2039-6-26','2006-4-13',9,273),
('2040-6-5','2007-5-8',8,274),
('2031-7-9','2001-10-7',13,275),
('2039-8-23','2009-11-23',14,276),
('2030-7-1','2005-10-27',5,277),
('2034-3-14','2016-9-3',9,278),
('2036-8-13','2014-1-24',7,279),
('2035-6-5','2014-2-25',5,280),
('2032-11-5','2002-1-1',13,281),
('2038-1-11','2011-11-7',7,282),
('2034-9-19','2015-4-12',7,283),
('2029-11-3','2015-12-18',14,284),
('2028-12-22','2013-1-11',12,285),
('2023-6-20','2020-8-7',10,286),
('2038-9-27','2007-9-20',13,287),
('2036-11-22','2022-12-26',3,288),
('2035-1-3','2010-2-27',8,289),
('2023-2-7','2007-7-2',13,290),
('2022-12-7','2002-8-23',9,291),
('2026-12-14','2004-3-21',12,292),
('2031-5-7','2018-10-3',3,293),
('2033-8-14','2011-7-24',12,294),
('2038-8-23','2001-11-16',11,295),
('2022-10-14','2001-2-20',14,296),
('2032-6-22','2008-6-2',8,297),
('2035-6-20','2014-10-2',13,298),
('2038-1-2','2013-4-13',3,299),
('2030-10-4','2002-7-8',4,300),
('2024-12-6','2014-6-23',8,301),
('2032-9-8','2001-6-15',3,302),
('2023-6-27','2015-10-7',14,303),
('2031-5-4','2000-6-13',8,304),
('2028-5-4','2012-11-26',2,305),
('2023-10-8','2009-11-25',4,306),
('2039-3-4','2004-1-10',11,307),
('2034-1-17','2005-5-15',4,308),
('2027-10-4','2022-2-1',8,309),
('2040-3-25','2008-11-27',13,310),
('2040-8-8','2010-8-3',1,311),
('2022-3-15','2007-1-1',4,312),
('2032-6-14','2014-8-25',5,313),
('2030-11-12','2001-11-10',6,314),
('2031-8-20','2001-3-27',14,315),
('2028-5-2','2013-4-27',6,316),
('2034-3-8','2015-12-9',6,317),
('2025-9-7','2000-7-24',12,318),
('2025-5-4','2000-9-12',7,319),
('2030-1-5','2018-5-10',8,320),
('2023-7-18','2004-7-25',3,321),
('2035-6-8','2019-4-12',1,322),
('2030-3-20','2008-3-11',10,323),
('2022-6-7','2020-12-18',7,324),
('2023-6-21','2018-6-25',12,325),
('2032-12-11','2007-3-7',14,326),
('2037-8-10','2002-6-12',8,327),
('2023-1-21','2003-12-23',13,328),
('2026-11-5','2014-3-21',7,329),
('2033-6-8','2012-6-1',9,330),
('2029-5-8','2010-1-20',13,331),
('2023-1-9','2001-10-1',2,332),
('2024-3-16','2003-11-1',13,333),
('2022-3-21','2002-11-7',3,334),
('2031-2-5','2009-2-7',4,335),
('2025-8-1','2014-5-15',13,336),
('2035-11-23','2004-10-8',9,337),
('2036-8-5','2015-5-7',4,338),
('2022-6-13','2013-4-12',12,339),
('2028-9-27','2000-12-13',9,340),
('2025-7-4','2013-7-1',14,341),
('2027-1-16','2007-8-11',10,342),
('2026-6-4','2019-11-23',3,343),
('2030-3-21','2003-3-24',4,344),
('2032-11-11','2019-5-13',5,345),
('2027-5-2','2020-4-11',13,346),
('2039-9-14','2008-8-23',2,347),
('2030-2-14','2012-12-27',5,348),
('2027-1-14','2016-8-25',13,349),
('2026-4-2','2011-1-14',10,350),
('2039-11-7','2000-8-7',10,351),
('2040-5-24','2019-11-22',3,352),
('2039-1-9','2009-3-15',1,353),
('2026-8-10','2011-11-4',9,354),
('2024-7-1','2002-1-2',1,355),
('2022-8-21','2004-7-16',10,356),
('2022-4-16','2017-3-3',6,357),
('2035-7-10','2012-5-9',14,358),
('2027-1-7','2004-10-7',4,359),
('2025-11-6','2002-12-8',7,360),
('2030-11-13','2000-2-12',6,361),
('2036-12-3','2000-3-24',14,362),
('2028-9-21','2005-2-12',3,363),
('2040-4-24','2022-10-21',14,364),
('2023-12-13','2014-12-7',7,365),
('2040-7-26','2021-8-5',10,366),
('2030-11-24','2007-10-2',1,367),
('2023-1-22','2017-10-2',2,368),
('2025-3-24','2020-9-25',10,369),
('2037-5-14','2007-4-21',3,370),
('2030-12-23','2009-5-17',7,371),
('2022-1-14','2000-11-23',1,372),
('2037-12-20','2010-2-15',4,373),
('2027-8-19','2012-10-23',10,374),
('2036-7-11','2021-6-2',11,375),
('2039-8-23','2010-12-11',13,376),
('2037-6-11','2003-6-16',14,377),
('2036-7-7','2007-1-14',2,378),
('2029-5-11','2003-12-17',13,379),
('2027-8-11','2000-4-27',7,380),
('2029-11-2','2011-5-23',2,381),
('2039-5-23','2021-6-6',9,382),
('2032-4-8','2007-3-4',5,383),
('2039-8-21','2002-12-18',5,384),
('2035-6-24','2011-7-16',12,385),
('2033-6-10','2000-9-16',3,386),
('2031-9-8','2005-7-6',11,387),
('2038-7-18','2008-4-10',10,388),
('2035-8-17','2012-6-13',3,389),
('2032-2-3','2016-9-21',12,390),
('2040-6-4','2001-9-14',12,391),
('2033-6-14','2016-9-2',10,392),
('2029-3-6','2006-11-13',9,393),
('2022-7-6','2007-8-24',14,394),
('2037-9-25','2009-4-4',9,395),
('2038-6-8','2004-2-1',5,396),
('2032-11-13','2006-1-19',1,397),
('2024-10-19','2004-7-23',9,398),
('2022-10-3','2005-1-10',10,399),
('2028-2-5','2008-8-23',9,400),
('2025-3-6','2012-6-6',4,401),
('2027-1-14','2016-8-25',2,402),
('2026-4-2','2011-1-14',4,403),
('2039-11-7','2000-8-7',12,404),
('2040-5-24','2019-11-22',7,405),
('2039-1-9','2009-3-15',14,406),
('2026-8-10','2011-11-4',12,407),
('2024-7-1','2002-1-2',5,408),
('2022-8-21','2004-7-16',12,409),
('2022-4-16','2017-3-3',8,410),
('2035-7-10','2012-5-9',14,411),
('2027-1-7','2004-10-7',8,412),
('2025-11-6','2002-12-8',2,413),
('2030-11-13','2000-2-12',14,414),
('2036-12-3','2000-3-24',4,415),
('2028-9-21','2005-2-12',5,416),
('2040-4-24','2022-10-21',11,417),
('2023-12-13','2014-12-7',5,418),
('2040-7-26','2021-8-5',11,419),
('2030-11-24','2007-10-2',1,420),
('2023-1-22','2017-10-2',12,421),
('2025-3-24','2020-9-25',8,422),
('2037-5-14','2007-4-21',8,423),
('2030-12-23','2009-5-17',11,424),
('2022-1-14','2000-11-23',7,425),
('2037-12-20','2010-2-15',12,426),
('2027-8-19','2012-10-23',10,427),
('2036-7-11','2021-6-2',10,428),
('2039-8-23','2010-12-11',3,429),
('2037-6-11','2003-6-16',2,430),
('2036-7-7','2007-1-14',12,431),
('2029-5-11','2003-12-17',7,432),
('2027-8-11','2000-4-27',9,433),
('2029-11-2','2011-5-23',12,434),
('2039-5-23','2021-6-6',3,435),
('2032-4-8','2007-3-4',8,436),
('2039-8-21','2002-12-18',10,437),
('2035-6-24','2011-7-16',6,438),
('2033-6-10','2000-9-16',3,439),
('2031-9-8','2005-7-6',6,440),
('2038-7-18','2008-4-10',14,441),
('2035-8-17','2012-6-13',13,442),
('2032-2-3','2016-9-21',11,443),
('2040-6-4','2001-9-14',8,444),
('2033-6-14','2016-9-2',9,445),
('2029-3-6','2006-11-13',3,446),
('2022-7-6','2007-8-24',12,447),
('2037-9-25','2009-4-4',8,448),
('2038-6-8','2004-2-1',4,449),
('2032-11-13','2006-1-19',1,450),
('2024-10-19','2004-7-23',5,451),
('2022-10-3','2005-1-10',11,452),
('2028-2-5','2008-8-23',14,453),
('2025-3-6','2012-6-6',5,454),
('2027-1-14','2016-8-25',10,455),
('2026-4-2','2011-1-14',4,456),
('2039-11-7','2000-8-7',3,457),
('2040-5-24','2019-11-22',13,458),
('2039-1-9','2009-3-15',2,459),
('2026-8-10','2011-11-4',10,460),
('2024-7-1','2002-1-2',6,461),
('2022-8-21','2004-7-16',8,462),
('2022-4-16','2017-3-3',6,463),
('2035-7-10','2012-5-9',8,464),
('2027-1-7','2004-10-7',3,465),
('2025-11-6','2002-12-8',11,466),
('2030-11-13','2000-2-12',4,467),
('2036-12-3','2000-3-24',1,468),
('2028-9-21','2005-2-12',12,469),
('2040-4-24','2022-10-21',11,470),
('2023-12-13','2014-12-7',8,471),
('2040-7-26','2021-8-5',13,472),
('2030-11-24','2007-10-2',8,473),
('2023-1-22','2017-10-2',13,474),
('2025-3-24','2020-9-25',3,475),
('2037-5-14','2007-4-21',9,476),
('2030-12-23','2009-5-17',3,477),
('2022-1-14','2000-11-23',12,478),
('2037-12-20','2010-2-15',5,479),
('2027-8-19','2012-10-23',9,480),
('2036-7-11','2021-6-2',2,481),
('2039-8-23','2010-12-11',13,482),
('2037-6-11','2003-6-16',8,483),
('2036-7-7','2007-1-14',1,484),
('2029-5-11','2003-12-17',5,485),
('2027-8-11','2000-4-27',14,486),
('2029-11-2','2011-5-23',11,487),
('2039-5-23','2021-6-6',9,488),
('2032-4-8','2007-3-4',3,489),
('2039-8-21','2002-12-18',4,490),
('2035-6-24','2011-7-16',5,491),
('2033-6-10','2000-9-16',11,492),
('2031-9-8','2005-7-6',10,493),
('2038-7-18','2008-4-10',8,494),
('2035-8-17','2012-6-13',6,495),
('2032-2-3','2016-9-21',9,496),
('2040-6-4','2001-9-14',6,497),
('2033-6-14','2016-9-2',12,498),
('2029-3-6','2006-11-13',13,499),
('2022-7-6','2007-8-24',6,500),
('2037-9-25','2009-4-4',7,501),
('2038-6-8','2004-2-1',2,502),
('2032-11-13','2006-1-19',3,503),
('2024-10-19','2004-7-23',11,504),
('2022-10-3','2005-1-10',3,505),
('2028-2-5','2008-8-23',14,506),
('2025-3-6','2012-6-6',2,507),
('2027-1-14','2016-8-25',3,508),
('2026-4-2','2011-1-14',4,509),
('2039-11-7','2000-8-7',1,510),
('2040-5-24','2019-11-22',10,511),
('2039-1-9','2009-3-15',1,512),
('2026-8-10','2011-11-4',6,513),
('2024-7-1','2002-1-2',11,514),
('2022-8-21','2004-7-16',6,515),
('2022-4-16','2017-3-3',14,516),
('2035-7-10','2012-5-9',11,517),
('2027-1-7','2004-10-7',2,518),
('2025-11-6','2002-12-8',14,519),
('2030-11-13','2000-2-12',3,520),
('2036-12-3','2000-3-24',7,521),
('2028-9-21','2005-2-12',3,522),
('2040-4-24','2022-10-21',2,523),
('2023-12-13','2014-12-7',9,524),
('2040-7-26','2021-8-5',8,525),
('2030-11-24','2007-10-2',9,526),
('2023-1-22','2017-10-2',4,527),
('2025-3-24','2020-9-25',1,528),
('2037-5-14','2007-4-21',5,529),
('2030-12-23','2009-5-17',3,530),
('2022-1-14','2000-11-23',6,531),
('2037-12-20','2010-2-15',12,532),
('2027-8-19','2012-10-23',12,533),
('2036-7-11','2021-6-2',4,534),
('2039-8-23','2010-12-11',6,535),
('2037-6-11','2003-6-16',10,536),
('2036-7-7','2007-1-14',1,537),
('2029-5-11','2003-12-17',11,538),
('2027-8-11','2000-4-27',6,539),
('2029-11-2','2011-5-23',8,540),
('2039-5-23','2021-6-6',9,541),
('2032-4-8','2007-3-4',3,542),
('2039-8-21','2002-12-18',8,543),
('2035-6-24','2011-7-16',2,544),
('2033-6-10','2000-9-16',4,545),
('2031-9-8','2005-7-6',12,546),
('2038-7-18','2008-4-10',8,547),
('2035-8-17','2012-6-13',8,548),
('2032-2-3','2016-9-21',4,549),
('2040-6-4','2001-9-14',1,550),
('2033-6-14','2016-9-2',11,551),
('2029-3-6','2006-11-13',2,552),
('2022-7-6','2007-8-24',3,553),
('2037-9-25','2009-4-4',4,554),
('2038-6-8','2004-2-1',6,555),
('2032-11-13','2006-1-19',6,556),
('2024-10-19','2004-7-23',1,557),
('2022-10-3','2005-1-10',14,558),
('2028-2-5','2008-8-23',3,559),
('2025-3-6','2012-6-6',5,560),
('2027-1-14','2016-8-25',11,561),
('2026-4-2','2011-1-14',9,562),
('2039-11-7','2000-8-7',12,563),
('2040-5-24','2019-11-22',6,564),
('2039-1-9','2009-3-15',7,565),
('2026-8-10','2011-11-4',7,566),
('2024-7-1','2002-1-2',1,567),
('2022-8-21','2004-7-16',8,568),
('2022-4-16','2017-3-3',3,569),
('2035-7-10','2012-5-9',2,570),
('2027-1-7','2004-10-7',10,571),
('2025-11-6','2002-12-8',5,572),
('2030-11-13','2000-2-12',10,573),
('2036-12-3','2000-3-24',2,574),
('2028-9-21','2005-2-12',4,575),
('2040-4-24','2022-10-21',11,576),
('2023-12-13','2014-12-7',4,577),
('2040-7-26','2021-8-5',14,578),
('2030-11-24','2007-10-2',3,579),
('2023-1-22','2017-10-2',8,580),
('2025-3-24','2020-9-25',6,581),
('2037-5-14','2007-4-21',12,582),
('2030-12-23','2009-5-17',2,583),
('2022-1-14','2000-11-23',1,584),
('2037-12-20','2010-2-15',6,585),
('2027-8-19','2012-10-23',2,586),
('2036-7-11','2021-6-2',12,587),
('2039-8-23','2010-12-11',5,588),
('2037-6-11','2003-6-16',4,589),
('2036-7-7','2007-1-14',6,590),
('2029-5-11','2003-12-17',6,591),
('2027-8-11','2000-4-27',6,592),
('2029-11-2','2011-5-23',6,593),
('2039-5-23','2021-6-6',4,594),
('2032-4-8','2007-3-4',2,595),
('2039-8-21','2002-12-18',8,596),
('2035-6-24','2011-7-16',12,597),
('2033-6-10','2000-9-16',10,598);

INSERT INTO [dbo].[t_director]
           ([director_establ_id]
           ,[director_persona_id])
     VALUES
(1,'14218894-5'),
(2,'14224136-6'),
(3,'14225191-4'),
(4,'14249583-k'),
(5,'14256080-1'),
(6,'14257703-8'),
(7,'14275763-k'),
(8,'14281043-3'),
(9,'14287344-3'),
(10,'14296021-4'),
(11,'14305011-4'),
(12,'14305013-0'),
(13,'14317456-5'),
(14,'14323291-3'),
(15,'14335545-4'),
(16,'14341357-8'),
(17,'14363025-0'),
(18,'14370588-9'),
(19,'14379776-7'),
(20,'14386647-5'),
(21,'14420070-5'),
(22,'14422764-6');

INSERT INTO [dbo].[t_utp]
           ([utp_establ_id]
           ,[utp_persona_id])
     VALUES
		(1,'14462369-k'),
		(2,'14472366-k'),
		(3,'14486694-0'),
		(4,'14491813-4'),
		(5,'14501107-8'),
		(6,'14509486-0'),
		(7,'14510271-5'),
		(8,'14539285-3'),
		(9,'14549981-k'),
		(10,'14554230-8'),
		(11,'14554251-0'),
		(12,'14567934-6'),
		(13,'14574849-6'),
		(14,'14598145-k'),
		(15,'14605101-4'),
		(16,'14627082-4'),
		(17,'14628456-6'),
		(18,'14633324-9'),
		(19,'14645067-9'),
		(20,'14645492-5'),
		(21,'14656786-k'),
		(22,'14661529-5');

INSERT INTO [dbo].[t_persona]
           ([persona_run]
           ,[persona_apellido_materno]
           ,[persona_apellido_paterno]
           ,[persona_fecha_nacimiento]
           ,[persona_nombre]
           ,[persona_numero_celular]
           ,[persona_numero_telefonico]
           ,[persona_sexo])
     VALUES
('10108517-1','Gómez','González','2006-2-5','ANTONIO','+56967777357','(2) 212300169','M'),
('10161263-5','Cortés','Muñoz','2018-3-8','MANUEL','+56914995595','(2) 223783328','M'),
('10191041-5','Herrera','Rojas','2008-4-21','JOSE','+56994959184','(2) 256644921','M'),
('10322147-1','Núñez','Díaz','2006-5-26','FRANCISCO','+56977429739','(2) 243985280','M'),
('10349264-5','Jara','Pérez','2016-2-14','DAVID','+56925545218','(2) 270360870','M'),
('10415592-8','Vergara','Soto','2018-2-27','JUAN','+56967222110','(2) 260915609','M'),
('10431039-7','Rivera','Contreras','2008-10-26','JAVIER','+56951693334','(2) 229009477','M'),
('10439433-7','Figueroa','Silva','2007-10-4','JOSE ANTONIO','+56940457786','(2) 253672849','M'),
('10512527-5','Riquelme','Martínez','2013-12-14','DANIEL','+56972994294','(2) 295756825','M'),
('10519484-6','García','Sepúlveda','2012-11-12','FRANCISCO JAVIER','+56980979542','(2) 267764678','M'),
('10806020-4','Miranda','Morales','2016-11-13','JOSE LUIS','+56999719517','(2) 252578643','M'),
('10881752-6','Bravo','Rodríguez','2005-11-3','CARLOS','+56922734363','(2) 239154391','M'),
('10918373-3','Vera','López','2010-8-22','JESUS','+56916313254','(2) 232108752','M'),
('10969608-0','Molina','Fuentes','2004-8-2','ALEJANDRO','+56970237747','(2) 252085148','M'),
('10978469-9','Vega','Hernández','2004-3-8','MIGUEL','+56954763512','(2) 241818478','M'),
('11162961-7','Campos','Torres','2004-1-15','JOSE MANUEL','+56957553137','(2) 296636785','M'),
('11228936-4','Sandoval','Araya','2010-10-11','RAFAEL','+56919847143','(2) 227342954','M'),
('11268329-1','Orellana','Flores','2016-8-21','MIGUEL ANGEL','+56942281787','(2) 273484057','M'),
('11280428-5','Cárdenas','Espinoza','2016-3-20','PABLO','+56988668571','(2) 251849504','M'),
('11298099-7','Olivares','Valenzuela','2010-3-13','PEDRO','+56923338181','(2) 250819772','M'),
('11315606-6','Alarcón','Castillo','2012-8-12','ANGEL','+56971103531','(2) 221467842','M'),
('11421576-7','Gallardo','Tapia','2012-12-26','SERGIO','+56912991621','(2) 215882681','M'),
('11615093-k','Ortiz','Reyes','2013-7-6','JOSE MARIA','+56934506984','(2) 231707395','M'),
('11617630-0','Garrido','Gutiérrez','2009-3-15','FERNANDO','+56918392753','(2) 276511307','M'),
('11639183-k','Salazar','Castro','2018-1-23','JORGE','+56992364637','(2) 256287234','M'),
('11648173-1','Guzmán','Pizarro','2010-6-3','LUIS','+56923846879','(2) 236205771','M'),
('11766341-8','Henríquez','Álvarez','2006-4-6','ALBERTO','+56930823631','(2) 215357489','M'),
('11826949-7','Saavedra','Vásquez','2012-1-22','ALVARO','+56915552642','(2) 267832706','M'),
('11981578-9','Navarro','Sánchez','2007-6-10','JUAN CARLOS','+56994317162','(2) 292772728','M'),
('12162815-5','Aguilera','Fernández','2008-11-2','ADRIAN','+56953857134','(2) 254407037','M'),
('12191239-2','Parra','Ramírez','2013-9-11','DIEGO','+56932875096','(2) 292675391','M'),
('12307468-8','Romero','Carrasco','2010-4-26','JUAN JOSE','+56958959878','(2) 253580998','M'),
('12451029-5','Aravena','Gómez','2016-5-7','RAUL','+56978293330','(2) 251750443','M'),
('12454407-6','Vargas','Cortés','2005-10-27','IVAN','+56930509895','(2) 258421643','M'),
('12507487-1','Vázquez','Herrera','2008-1-21','JUAN ANTONIO','+56957761470','(2) 237722323','M'),
('12695554-5','Cáceres','Núñez','2004-8-24','RUBEN','+56916967361','(2) 254017391','M'),
('12755841-8','Yáñez','Jara','2009-4-3','ENRIQUE','+56964757266','(2) 284925358','M'),
('12823570-1','Leiva','Vergara','2014-5-1','OSCAR','+56923478583','(2) 236970435','M'),
('12922804-0','Escobar','Rivera','2012-11-4','RAMON','+56931576111','(2) 252319898','M'),
('12976756-1','Ruiz','Figueroa','2012-7-12','ANDRES','+56934428729','(2) 294041735','M'),
('13018130-9','Valdés','Riquelme','2010-2-6','JUAN MANUEL','+56939487748','(2) 252143379','M'),
('13173535-9','Vidal','García','2016-5-26','VICENTE','+56975832311','(2) 255429761','M'),
('13325667-9','Salinas','Miranda','2013-10-1','SANTIAGO','+56913779082','(2) 265244536','M'),
('13352917-9','Zúñiga','Bravo','2011-9-1','JOAQUIN','+56967648882','(2) 239457428','M'),
('13427574-k','Peña','Vera','2008-12-28','MARIO','+56984266621','(2) 296206780','M'),
('13483283-5','Godoy','Molina','2009-10-13','VICTOR','+56920861538','(2) 235407781','M'),
('13506519-6','Lagos','Vega','2004-5-20','EDUARDO','+56935766667','(2) 245045669','M'),
('13642296-0','Maldonado','Campos','2011-4-5','ROBERTO','+56966412238','(2) 294317828','M'),
('13736142-6','Bustos','Sandoval','2005-8-15','JAIME','+56931817455','(2) 289333131','M'),
('13790208-7','Medina','Orellana','2008-3-10','FRANCISCO JOSE','+56958693059','(2) 247811387','M'),
('13982631-0','Pino','Cárdenas','2018-9-2','MARCOS','+56987197258','(2) 260310846','M'),
('14079018-4','Palma','Olivares','2006-5-21','HUGO','+56976712770','(2) 294499150','M'),
('14174311-2','Moreno','Alarcón','2013-4-22','IGNACIO','+56911917650','(2) 221734042','M'),
('14237977-5','Sanhueza','Gallardo','2010-2-12','JORDI','+56942244873','(2) 275713954','M'),
('14376815-5','Carvajal','Ortiz','2011-6-17','ALFONSO','+56996414511','(2) 222829288','M'),
('14383540-5','Navarrete','Garrido','2004-11-22','RICARDO','+56946316882','(2) 239344817','M'),
('14413705-1','Sáez','Salazar','2010-6-14','SALVADOR','+56941929520','(2) 257064174','M'),
('14429770-9','Alvarado','Guzmán','2004-4-4','GUILLERMO','+56936136443','(2) 299111330','M'),
('14578327-5','Donoso','Henríquez','2013-12-18','MARC','+56940484342','(2) 233418534','M'),
('14792063-6','Poblete','Saavedra','2015-6-22','GABRIEL','+56991624624','(2) 293220456','M'),
('14911793-8','Bustamante','Navarro','2012-7-10','MOHAMED','+56943917416','(2) 276162119','M'),
('14947414-5','Toro','Aguilera','2017-6-1','EMILIO','+56936962477','(2) 297267688','M'),
('15039260-8','Ortega','Parra','2004-3-6','GONZALO','+56938306051','(2) 265667822','M'),
('15048732-3','Venegas','Romero','2016-6-7','MARTIN','+56924352393','(2) 235397031','M'),
('15169412-8','Lopez','Aravena','2009-3-27','JOSE MIGUEL','+56944302115','(2) 218576446','M'),
('15179890-k','Mendoza','Vargas','2013-11-7','JULIO','+56937428762','(2) 273089536','M'),
('15185593-8','Farías','Vázquez','2012-1-7','JULIAN','+56997826561','(2) 276087274','M'),
('15262394-1','San Martín','Cáceres','2012-2-26','TOMAS','+56980702384','(2) 236390474','M'),
('15313381-6','Gómez','Yáñez','2004-10-24','NICOLAS','+56927101589','(2) 213287354','M'),
('15454715-0','Cortés','Leiva','2012-5-13','AGUSTIN','+56941634162','(2) 295548414','M'),
('15504364-4','Herrera','Escobar','2014-5-12','JOSE RAMON','+56914297370','(2) 247462582','M'),
('15579304-k','Núñez','Ruiz','2016-2-28','SAMUEL','+56963618848','(2) 215973825','M'),
('15580704-0','Jara','Valdés','2016-12-2','ISMAEL','+56952868157','(2) 260510128','M'),
('15623240-8','Vergara','Vidal','2006-6-26','CRISTIAN','+56983307688','(2) 213220070','M'),
('15681949-2','Rivera','Salinas','2015-3-14','LUCAS','+56973311981','(2) 284967724','M'),
('15825800-5','Figueroa','Zúñiga','2010-4-14','JOAN','+56958713159','(2) 252813032','M'),
('15841413-9','Riquelme','Peña','2014-6-20','FELIX','+56943306448','(2) 226541744','M'),
('15845116-6','García','Godoy','2009-3-18','AITOR','+56982636148','(2) 259353540','M'),
('15927593-0','Miranda','Lagos','2007-6-20','HECTOR','+56926326774','(2) 227578212','M'),
('16121092-7','Bravo','Maldonado','2004-1-3','IKER','+56967602860','(2) 244978816','M'),
('16336619-3','Vera','Bustos','2007-2-24','ALEX','+56942323452','(2) 216991466','M'),
('16561336-8','Molina','Medina','2009-8-1','JUAN FRANCISCO','+56974783275','(2) 241252992','M'),
('16775125-3','Vega','Pino','2018-1-13','JOSE CARLOS','+56987937645','(2) 291110087','M'),
('16847204-8','Campos','Palma','2005-3-4','JOSEP','+56996976811','(2) 226734345','M'),
('16920520-5','Sandoval','Moreno','2015-1-13','SEBASTIAN','+56970413843','(2) 282280382','M'),
('17006103-9','Orellana','Sanhueza','2016-7-23','CESAR','+56994422624','(2) 228421979','M'),
('17140946-2','Cárdenas','Carvajal','2010-5-7','MARIANO','+56957566798','(2) 244614385','M'),
('17159388-3','Olivares','Navarrete','2015-8-15','ALFREDO','+56995972022','(2) 242196961','M'),
('17236919-7','Alarcón','Sáez','2005-1-6','DOMINGO','+56989353964','(2) 240382134','M'),
('17423444-2','Gallardo','Alvarado','2017-11-22','MATEO','+56985489634','(2) 221153921','M'),
('17433453-6','Ortiz','Donoso','2017-9-27','JOSE ANGEL','+56982734564','(2) 288770501','M'),
('17462643-k','Garrido','Poblete','2009-11-21','RODRIGO','+56910317132','(2) 243081000','M'),
('17500275-8','Salazar','Bustamante','2006-1-19','VICTOR MANUEL','+56940187571','(2) 261828424','M'),
('17631230-0','Guzmán','Toro','2017-8-24','FELIPE','+56952805124','(2) 264941228','M'),
('17712145-2','Henríquez','Ortega','2013-1-17','JOSE IGNACIO','+56940542190','(2) 261788025','M'),
('17717387-8','Saavedra','Venegas','2007-3-26','LUIS MIGUEL','+56986878170','(2) 240827480','M'),
('17881633-0','Navarro','Lopez','2004-3-3','JOSE FRANCISCO','+56948402817','(2) 218608607','M'),
('17889840-k','Aguilera','Mendoza','2006-4-24','XAVIER','+56954571648','(2) 283079263','M'),
('18020014-2','Parra','Farías','2005-7-13','JUAN LUIS','+56973693881','(2) 263832302','M'),
('18043592-1','Romero','San Martín','2010-9-25','ALBERT','+56983405977','(2) 237187328','M'),
('18088847-0','Aravena','González','2008-3-4','JOAN','+56916159492','(2) 236678767','M'),
('18115706-2','Vargas','Muñoz','2016-11-3','JOSEP','+56966509550','(2) 255207993','M'),
('18252550-2','Vázquez','Rojas','2015-3-20','SAMUEL','+56936257190','(2) 254663944','M'),
('18324655-0','Cáceres','Díaz','2004-3-25','SEBASTIAN','+56951425145','(2) 264242404','M'),
('18502167-k','Yáñez','Pérez','2017-2-12','LUCAS','+56976967096','(2) 247870484','M'),
('18546525-k','Leiva','Soto','2014-1-9','FELIPE','+56910815279','(2) 220265844','M'),
('18555721-9','Escobar','Contreras','2005-6-23','HECTOR','+56941128011','(2) 239436185','M'),
('18632875-2','Ruiz','Silva','2017-2-19','ISMAEL','+56979956832','(2) 284188420','M'),
('18713163-4','Valdés','Martínez','2005-8-4','ALFREDO','+56926382778','(2) 213139321','M'),
('18750533-k','Vidal','Sepúlveda','2007-1-28','DOMINGO','+56930196143','(2) 250072924','M'),
('18890633-8','Salinas','Morales','2013-9-2','AITOR','+56957823349','(2) 234416567','M'),
('19200218-4','Zúñiga','Rodríguez','2011-1-2','MARIANO','+56911932211','(2) 214994276','M'),
('19255556-6','Peña','López','2004-12-19','ALEX','+56938126060','(2) 271739089','M'),
('19322449-0','Godoy','Fuentes','2007-10-1','RODRIGO','+56949626843','(2) 272468016','M'),
('19438843-8','Lagos','Hernández','2009-10-17','IKER','+56961794515','(2) 274648535','M'),
('19573280-9','Maldonado','Torres','2010-9-3','ALEXANDER','+56930719663','(2) 294999407','M'),
('19596562-5','Bustos','Araya','2007-2-11','MATEO','+56935131268','(2) 292880858','M'),
('19676179-9','Medina','Flores','2010-3-4','XAVIER','+56910859468','(2) 260636488','M'),
('19714299-5','Pino','Espinoza','2010-11-12','ESTEBAN','+56924987575','(2) 295094160','M'),
('19867901-1','Palma','Valenzuela','2018-5-20','MARCO','+56915422314','(2) 225168026','M'),
('19874253-8','Moreno','Castillo','2005-9-1','ARTURO','+56914834950','(2) 227959197','M'),
('19977002-0','Sanhueza','Tapia','2004-5-3','GREGORIO','+56959516238','(2) 211747310','M'),
('20008867-0','Carvajal','Reyes','2007-2-24','LORENZO','+56982773890','(2) 253073180','M'),
('20032500-1','Navarrete','Gutiérrez','2004-11-13','BORJA','+56915528070','(2) 291706057','M'),
('20133163-3','Sáez','Castro','2006-8-15','ALBERT','+56950405490','(2) 237484041','M'),
('20273115-5','Alvarado','Pizarro','2009-11-28','AARON','+56961999135','(2) 286065285','M'),
('20372442-k','Donoso','Álvarez','2006-3-5','DARIO','+56922978764','(2) 225537196','M'),
('20627836-6','Poblete','Vásquez','2007-10-20','JOEL','+56990746891','(2) 275445636','M'),
('20862967-0','Bustamante','Sánchez','2012-11-3','EUGENIO','+56970581799','(2) 222376648','M'),
('21075667-1','Toro','Fernández','2016-10-2','CRISTOBAL','+56933736144','(2) 265606919','M'),
('21222580-0','Ortega','Ramírez','2005-12-11','ISAAC','+56995984975','(2) 280147966','M'),
('21223862-7','Venegas','Carrasco','2005-11-19','JONATHAN','+56969742269','(2) 295291817','M'),
('21225067-8','Lopez','Gómez','2011-1-17','CHRISTIAN','+56929388887','(2) 235973401','M'),
('21226311-7','Mendoza','Cortés','2008-6-8','ERIC','+56935638034','(2) 297484795','M'),
('21323694-6','Farías','Herrera','2004-1-11','GERMAN','+56966399293','(2) 225469134','M'),
('21364283-9','San Martín','Núñez','2018-6-4','PAU','+56922898546','(2) 244394091','M'),
('21389495-1','Gómez','Jara','2012-6-6','MOHAMMED','+56956869881','(2) 287559307','M'),
('21414273-2','Cortés','Vergara','2016-2-19','ADOLFO','+56975128857','(2) 249294444','M'),
('21434406-8','Herrera','Rivera','2017-7-9','MARIA CARMEN','+56972396499','(2) 227889590','F'),
('21442089-9','Núñez','Figueroa','2012-1-1','MARIA','+56939143599','(2) 234575947','F'),
('21541090-0','Jara','Riquelme','2009-5-24','CARMEN','+56959286097','(2) 283933070','F'),
('21606571-9','Vergara','García','2006-2-10','ANA MARIA','+56953365182','(2) 243129467','F'),
('21627001-0','Rivera','Miranda','2006-8-16','MARIA PILAR','+56914387635','(2) 247470053','F'),
('21790727-6','Figueroa','Bravo','2013-4-17','LAURA','+56978272840','(2) 281525032','F'),
('21868588-9','Riquelme','Vera','2006-6-5','JOSEFA','+56996553151','(2) 290407899','F'),
('21958343-5','García','Molina','2015-5-27','ISABEL','+56928692183','(2) 263117899','F'),
('22022563-1','Miranda','Vega','2017-2-27','MARIA DOLORES','+56948799158','(2) 212135225','F'),
('22036048-2','Bravo','Campos','2015-3-3','MARIA TERESA','+56931557680','(2) 229244845','F'),
('22352308-0','Vera','Sandoval','2006-9-19','ANA','+56919549347','(2) 299216815','F'),
('22368203-0','Molina','Orellana','2008-5-24','MARTA','+56924762872','(2) 291488894','F'),
('22454387-5','Vega','Cárdenas','2013-7-26','CRISTINA','+56918145682','(2) 278066803','F'),
('22518249-3','Campos','Olivares','2018-12-19','MARIA ANGELES','+56916567852','(2) 219175721','F'),
('22568487-1','Sandoval','Alarcón','2008-4-6','LUCIA','+56981155496','(2) 246098894','F'),
('22816603-0','Orellana','Gallardo','2013-5-1','MARIA ISABEL','+56981536136','(2) 293989691','F'),
('22970870-8','Cárdenas','Ortiz','2010-9-28','MARIA JOSE','+56978857951','(2) 255087191','F'),
('23074350-9','Olivares','Garrido','2007-5-6','FRANCISCA','+56923855992','(2) 269988604','F'),
('23275422-2','Alarcón','Salazar','2006-4-7','ANTONIA','+56970349197','(2) 217150790','F'),
('23307799-2','Gallardo','Guzmán','2018-5-8','DOLORES','+56929814856','(2) 291598581','F'),
('23380055-4','Ortiz','Henríquez','2015-4-4','SARA','+56969158882','(2) 266300712','F'),
('23598250-1','Garrido','Saavedra','2016-4-8','PAULA','+56977722465','(2) 231117561','F'),
('23757852-k','Salazar','Navarro','2009-2-11','ELENA','+56965122653','(2) 279336780','F'),
('23892484-7','Guzmán','Aguilera','2009-4-14','MARIA LUISA','+56930496195','(2) 222180866','F'),
('24000187-k','Henríquez','Parra','2011-1-27','RAQUEL','+56993399989','(2) 281780997','F'),
('24019275-6','Saavedra','Romero','2016-3-27','ROSA MARIA','+56917536233','(2) 216828487','F'),
('24028934-2','Navarro','Aravena','2012-10-15','MANUELA','+56959708322','(2) 246656647','F'),
('24183818-8','Aguilera','Vargas','2016-1-24','PILAR','+56941925237','(2) 282009010','F'),
('24211402-7','Parra','Vázquez','2005-5-28','CONCEPCION','+56954441290','(2) 232619187','F'),
('24419415-k','Romero','Cáceres','2014-8-5','MARIA JESUS','+56963625235','(2) 219850965','F'),
('24421187-9','Aravena','Yáñez','2008-4-5','MERCEDES','+56972379277','(2) 224014926','F'),
('24458701-1','Vargas','Leiva','2015-4-9','JULIA','+56913126751','(2) 247410278','F'),
('24528710-0','Vázquez','Escobar','2011-10-14','BEATRIZ','+56969825041','(2) 297834199','F'),
('24573100-0','Cáceres','Ruiz','2017-2-11','ALBA','+56937246417','(2) 283422261','F'),
('24609032-7','Yáñez','Valdés','2006-5-4','SILVIA','+56979566663','(2) 282674966','F'),
('24736228-2','Leiva','Vidal','2016-10-21','NURIA','+56956199312','(2) 213801890','F'),
('24834658-2','Escobar','Salinas','2009-1-27','IRENE','+56920548899','(2) 239065007','F'),
('24866043-0','Ruiz','Zúñiga','2009-10-10','ROSARIO','+56929708628','(2) 277729789','F'),
('24909331-9','Valdés','Peña','2017-7-4','PATRICIA','+56970494433','(2) 283818730','F'),
('24919853-6','Vidal','Godoy','2012-4-9','JUANA','+56971546665','(2) 253871308','F'),
('24954913-4','Salinas','Lagos','2018-3-24','TERESA','+56939695832','(2) 235386597','F'),
('24989649-7','Zúñiga','Maldonado','2013-6-10','ENCARNACION','+56945273098','(2) 253456320','F'),
('24997363-7','Peña','Bustos','2008-5-15','ANDREA','+56953748422','(2) 282372189','F'),
('5143579-6','Godoy','Medina','2017-9-4','ROCIO','+56970112799','(2) 271923963','F'),
('5152028-9','Lagos','Pino','2009-9-7','MONTSERRAT','+56969813496','(2) 289062811','F'),
('5205778-7','Maldonado','Palma','2014-8-12','MONICA','+56962374866','(2) 267049684','F'),
('5293514-8','Bustos','Moreno','2018-4-23','ALICIA','+56925903526','(2) 253580773','F'),
('5413836-9','Medina','Sanhueza','2018-11-15','MARIA MAR','+56978521054','(2) 268830467','F'),
('5610911-0','Pino','Carvajal','2013-7-6','SANDRA','+56913763258','(2) 213255401','F'),
('5701015-0','Palma','Navarrete','2006-10-24','SONIA','+56957743536','(2) 227519598','F'),
('5705628-2','Moreno','Sáez','2012-10-28','MARINA','+56956923037','(2) 248947755','F'),
('5714495-5','Sanhueza','Alvarado','2005-12-22','ROSA','+56937558567','(2) 296972723','F'),
('5728002-6','Carvajal','Donoso','2004-3-19','ANGELA','+56912506743','(2) 212602675','F'),
('5820223-1','Navarrete','Poblete','2016-8-13','SUSANA','+56932421739','(2) 220469815','F'),
('5904306-4','Sáez','Bustamante','2006-3-25','NATALIA','+56974299146','(2) 236522254','F'),
('5926790-6','Alvarado','Toro','2013-8-9','YOLANDA','+56929889510','(2) 299607507','F'),
('5956468-4','Donoso','Ortega','2016-10-6','MARGARITA','+56949952912','(2) 246751464','F'),
('6003211-4','Poblete','Venegas','2010-12-8','SOFIA','+56981531430','(2) 294112264','F'),
('6059505-4','Bustamante','Lopez','2017-6-23','CLAUDIA','+56986141983','(2) 287295737','F'),
('6083357-5','Toro','Mendoza','2012-1-4','MARIA JOSEFA','+56970372345','(2) 258429188','F'),
('6099803-5','Ortega','Farías','2006-4-24','EVA','+56936421416','(2) 244262040','F'),
('6389439-7','Venegas','San Martín','2017-2-14','CARLA','+56922436779','(2) 263411384','F'),
('6524013-0','Lopez','González','2015-5-2','MARIA ROSARIO','+56982941861','(2) 286302799','F'),
('6592819-1','Mendoza','Muñoz','2017-3-20','INMACULADA','+56949203753','(2) 239167004','F'),
('6727267-6','Farías','Rojas','2015-10-19','MARIA MERCEDES','+56914406660','(2) 211594894','F'),
('6756159-7','San Martín','Díaz','2017-10-6','ANA ISABEL','+56944473212','(2) 258609052','F'),
('6778461-8','Gómez','Pérez','2010-9-25','NOELIA','+56943167296','(2) 240147876','F'),
('7191945-5','Cortés','Soto','2011-3-13','ESTHER','+56917483486','(2) 262118219','F'),
('7675065-3','Herrera','Contreras','2013-11-9','VERONICA','+56925188185','(2) 236463825','F'),
('7680863-5','Núñez','Silva','2012-7-27','NEREA','+56928397041','(2) 268871855','F'),
('7717759-0','Jara','Martínez','2011-5-5','CAROLINA','+56965234058','(2) 270486886','F'),
('7938582-4','Vergara','Sepúlveda','2011-12-2','DANIELA','+56937999158','(2) 244900506','F'),
('7949378-3','Rivera','Morales','2007-8-10','INES','+56977771159','(2) 291794807','F'),
('8168225-9','Figueroa','Rodríguez','2012-2-21','EVA MARIA','+56983321178','(2) 227816253','F'),
('8190117-1','Riquelme','López','2009-8-4','MARIA VICTORIA','+56950833621','(2) 261313037','F'),
('8252547-5','García','Fuentes','2009-4-14','ANGELES','+56972329586','(2) 293133581','F'),
('8266603-6','Miranda','Hernández','2013-12-4','MIRIAM','+56988918744','(2) 273968825','F'),
('8325130-1','Bravo','Torres','2010-6-14','LORENA','+56965296520','(2) 236605927','F'),
('8367833-k','Vera','Araya','2011-1-11','MARIA ROSA','+56912194863','(2) 284927828','F'),
('8769439-9','Molina','Flores','2016-8-8','ANA BELEN','+56913835171','(2) 237991410','F'),
('8797262-3','Vega','Espinoza','2015-12-17','MARIA ELENA','+56948538944','(2) 291196943','F'),
('8993772-8','Campos','Valenzuela','2009-10-5','MARTINA','+56961347044','(2) 249644948','F'),
('9113221-4','Sandoval','Castillo','2012-10-6','VICTORIA','+56973955542','(2) 230934359','F'),
('9158635-5','Orellana','Tapia','2010-3-25','MARIA CONCEPCION','+56993316282','(2) 274211691','F'),
('9307135-2','Cárdenas','Reyes','2005-2-20','AMPARO','+56999135329','(2) 249499972','F'),
('9380479-1','Olivares','Gutiérrez','2008-6-11','ALEJANDRA','+56910778878','(2) 236734844','F'),
('9440769-9','Alarcón','Castro','2004-12-3','MARIA ANTONIA','+56976601338','(2) 230127563','F'),
('9466742-9','Gallardo','Pizarro','2014-5-27','LIDIA','+56937963312','(2) 211729579','F'),
('9490062-k','Ortiz','Álvarez','2012-1-20','CELIA','+56976219741','(2) 251835368','F'),
('9744021-2','Garrido','Vásquez','2009-5-15','CATALINA','+56948328030','(2) 237376267','F'),
('9916669-k','Salazar','Sánchez','2017-7-6','MARIA NIEVES','+56992736042','(2) 241410742','F'),
('9931220-3','Guzmán','Fernández','2016-10-26','FATIMA','+56988623439','(2) 246947172','F'),
('9963123-6','Henríquez','Ramírez','2011-4-22','AINHOA','+56985426029','(2) 249833923','F'),
('9991768-7','Saavedra','Carrasco','2012-2-1','OLGA','+56963719937','(2) 283762745','F');

INSERT INTO [dbo].[t_alumno]
           ([alumno_persona_run])
     VALUES
('10108517-1'),
('10161263-5'),
('10191041-5'),
('10322147-1'),
('10349264-5'),
('10415592-8'),
('10431039-7'),
('10439433-7'),
('10512527-5'),
('10519484-6'),
('10806020-4'),
('10881752-6'),
('10918373-3'),
('10969608-0'),
('10978469-9'),
('11162961-7'),
('11228936-4'),
('11268329-1'),
('11280428-5'),
('11298099-7'),
('11315606-6'),
('11421576-7'),
('11615093-k'),
('11617630-0'),
('11639183-k'),
('11648173-1'),
('11766341-8'),
('11826949-7'),
('11981578-9'),
('12162815-5'),
('12191239-2'),
('12307468-8'),
('12451029-5'),
('12454407-6'),
('12507487-1'),
('12695554-5'),
('12755841-8'),
('12823570-1'),
('12922804-0'),
('12976756-1'),
('13018130-9'),
('13173535-9'),
('13325667-9'),
('13352917-9'),
('13427574-k'),
('13483283-5'),
('13506519-6'),
('13642296-0'),
('13736142-6'),
('13790208-7'),
('13982631-0'),
('14079018-4'),
('14174311-2'),
('14237977-5'),
('14376815-5'),
('14383540-5'),
('14413705-1'),
('14429770-9'),
('14578327-5'),
('14792063-6'),
('14911793-8'),
('14947414-5'),
('15039260-8'),
('15048732-3'),
('15169412-8'),
('15179890-k'),
('15185593-8'),
('15262394-1'),
('15313381-6'),
('15454715-0'),
('15504364-4'),
('15579304-k'),
('15580704-0'),
('15623240-8'),
('15681949-2'),
('15825800-5'),
('15841413-9'),
('15845116-6'),
('15927593-0'),
('16121092-7'),
('16336619-3'),
('16561336-8'),
('16775125-3'),
('16847204-8'),
('16920520-5'),
('17006103-9'),
('17140946-2'),
('17159388-3'),
('17236919-7'),
('17423444-2'),
('17433453-6'),
('17462643-k'),
('17500275-8'),
('17631230-0'),
('17712145-2'),
('17717387-8'),
('17881633-0'),
('17889840-k'),
('18020014-2'),
('18043592-1'),
('18088847-0'),
('18115706-2'),
('18252550-2'),
('18324655-0'),
('18502167-k'),
('18546525-k'),
('18555721-9'),
('18632875-2'),
('18713163-4'),
('18750533-k'),
('18890633-8'),
('19200218-4'),
('19255556-6'),
('19322449-0'),
('19438843-8'),
('19573280-9'),
('19596562-5'),
('19676179-9'),
('19714299-5'),
('19867901-1'),
('19874253-8'),
('19977002-0'),
('20008867-0'),
('20032500-1'),
('20133163-3'),
('20273115-5'),
('20372442-k'),
('20627836-6'),
('20862967-0'),
('21075667-1'),
('21222580-0'),
('21223862-7'),
('21225067-8'),
('21226311-7'),
('21323694-6'),
('21364283-9'),
('21389495-1'),
('21414273-2'),
('21434406-8'),
('21442089-9'),
('21541090-0'),
('21606571-9'),
('21627001-0'),
('21790727-6'),
('21868588-9'),
('21958343-5'),
('22022563-1'),
('22036048-2'),
('22352308-0'),
('22368203-0'),
('22454387-5'),
('22518249-3'),
('22568487-1'),
('22816603-0'),
('22970870-8'),
('23074350-9'),
('23275422-2'),
('23307799-2'),
('23380055-4'),
('23598250-1'),
('23757852-k'),
('23892484-7'),
('24000187-k'),
('24019275-6'),
('24028934-2'),
('24183818-8'),
('24211402-7'),
('24419415-k'),
('24421187-9'),
('24458701-1'),
('24528710-0'),
('24573100-0'),
('24609032-7'),
('24736228-2'),
('24834658-2'),
('24866043-0'),
('24909331-9'),
('24919853-6'),
('24954913-4'),
('24989649-7'),
('24997363-7'),
('5143579-6'),
('5152028-9'),
('5205778-7'),
('5293514-8'),
('5413836-9'),
('5610911-0'),
('5701015-0'),
('5705628-2'),
('5714495-5'),
('5728002-6'),
('5820223-1'),
('5904306-4'),
('5926790-6'),
('5956468-4'),
('6003211-4'),
('6059505-4'),
('6083357-5'),
('6099803-5'),
('6389439-7'),
('6524013-0'),
('6592819-1'),
('6727267-6'),
('6756159-7'),
('6778461-8'),
('7191945-5'),
('7675065-3'),
('7680863-5'),
('7717759-0'),
('7938582-4'),
('7949378-3'),
('8168225-9'),
('8190117-1'),
('8252547-5'),
('8266603-6'),
('8325130-1'),
('8367833-k'),
('8769439-9'),
('8797262-3'),
('8993772-8'),
('9113221-4'),
('9158635-5'),
('9307135-2'),
('9380479-1'),
('9440769-9'),
('9466742-9'),
('9490062-k'),
('9744021-2'),
('9916669-k'),
('9931220-3'),
('9963123-6'),
('9991768-7');

INSERT INTO [dbo].[t_apoderado]
           ([apoderado_persona_run])
     VALUES
('13263940-k '),
('13269124-k '),
('13276952-4 '),
('13283228-5 '),
('13287555-3 '),
('13287638-k '),
('13293393-6 '),
('13296241-3 '),
('13317341-2 '),
('13322547-1 '),
('13362228-4 '),
('13363861-k '),
('13363944-6 '),
('13372558-k '),
('13374749-4 '),
('13388365-7 '),
('13410580-1 '),
('13411638-2 '),
('13417558-3 '),
('13423811-9 '),
('13443180-6 '),
('13448142-0 '),
('13455567-k '),
('13462736-0 '),
('13465574-7 '),
('13466545-9 '),
('13474067-1 '),
('13474325-5 '),
('13478959-k '),
('13490604-9 '),
('13493857-9 '),
('13506199-9 '),
('13511651-3 '),
('13529640-6 '),
('13532532-5 '),
('13539393-2 '),
('13539789-k '),
('13543595-3 '),
('13547242-5 '),
('13549704-5 '),
('13558917-9 '),
('13565523-6 '),
('13567240-8 '),
('13567255-6 '),
('13602705-0 '),
('13622701-7 '),
('13630884-k '),
('13632855-7 '),
('13639690-0 '),
('13648490-7 '),
('13660551-8 '),
('13674283-3 '),
('13675794-6 '),
('13686122-0 '),
('13688966-4 '),
('13719528-3 '),
('13725066-7 '),
('13742329-4 '),
('13754872-0 '),
('13755681-2 '),
('13761711-0 '),
('13790481-0 '),
('13792757-8 '),
('13795755-8 '),
('13812346-4 '),
('13822330-2 '),
('13822989-0 '),
('13824547-0 '),
('13833729-4 '),
('13834142-9 '),
('13846172-6 '),
('13852329-2 '),
('13866551-8 '),
('13886495-2 '),
('13912617-3 '),
('13913725-6 '),
('13970857-1 '),
('13979267-k '),
('13983572-7 '),
('13985194-3 '),
('14003611-0 '),
('14004197-1 '),
('14004836-4 '),
('14011311-5 '),
('14017776-8 '),
('14041899-4 '),
('14068550-k '),
('14074955-9 '),
('14078233-5 '),
('14134348-3 '),
('14149250-0 '),
('14156047-6 '),
('14168155-9 '),
('14197219-7 '),
('14209858-k '),
('14218894-5 '),
('14224136-6 '),
('14225191-4 '),
('14249583-k '),
('14256080-1 '),
('14257703-8 '),
('14275763-k '),
('14281043-3 '),
('14287344-3 '),
('14296021-4 '),
('14305011-4 '),
('14305013-0 '),
('14317456-5 '),
('14323291-3 '),
('14335545-4 '),
('14341357-8 '),
('14363025-0 '),
('14370588-9 '),
('14379776-7 '),
('14386647-5 '),
('14420070-5 '),
('14422764-6 '),
('14457172-k '),
('14462369-k '),
('14472366-k '),
('14486694-0 '),
('14491813-4 '),
('14501107-8 '),
('14509486-0 '),
('14510271-5 '),
('14539285-3 '),
('14549981-k '),
('14554230-8 '),
('14554251-0 '),
('14567934-6 '),
('14574849-6 '),
('14598145-k '),
('14605101-4 '),
('14627082-4 '),
('14628456-6 '),
('14633324-9 '),
('14645067-9 '),
('14645492-5 '),
('14656786-k '),
('14661529-5 '),
('14671112-k '),
('14671421-8 '),
('14678670-7 '),
('14680619-8 '),
('14686507-0 '),
('14694086-2 '),
('14696505-9 '),
('14709163-k '),
('14715101-2 '),
('14753433-7 '),
('14759187-k '),
('14760260-k '),
('14760767-9 '),
('14770207-8 '),
('14782495-5 '),
('14800687-3 '),
('14804677-8 '),
('14809441-1 '),
('14814543-1 '),
('14822144-8 '),
('14828016-9 '),
('14830496-3 '),
('14838403-7 '),
('14851657-k '),
('14860166-6 '),
('14883937-9 '),
('14917382-k '),
('14923274-5 '),
('14926790-5 '),
('14927880-k '),
('14929309-4 '),
('14934729-1 '),
('14936387-4 '),
('14936591-5 '),
('14938591-6 '),
('14941244-1 '),
('14964175-0 '),
('14965443-7 '),
('14988821-7 '),
('14999507-2 '),
('15009257-4 '),
('15013289-4 '),
('15016763-9 '),
('15021905-1 '),
('15023801-3 '),
('15028253-5 '),
('15043360-6 '),
('15062275-1 '),
('15071585-7 '),
('15084210-7 '),
('15087728-8 '),
('15091385-3 '),
('15093745-0 '),
('15098921-3 '),
('15103188-9 '),
('15110295-6 '),
('15120096-6 '),
('15124284-7 '),
('15135848-9 '),
('15149866-3 '),
('15153256-k '),
('15158590-6 '),
('15160344-0 '),
('15161490-6 '),
('15166715-5 '),
('15172797-2 '),
('15199194-7 '),
('15201587-9 '),
('15212839-8 '),
('15229771-8 '),
('15240538-3 '),
('15248739-8 '),
('15264344-6 '),
('15268105-4 '),
('15268163-1 '),
('15273230-9 '),
('15299339-0 '),
('15303918-6 '),
('15332885-4 '),
('15348005-2 '),
('15354132-9 '),
('15354372-0 '),
('15368061-2 '),
('15370774-k '),
('15383436-9 '),
('15400857-8 '),
('15405104-k '),
('15411010-0'),
('15426643-7'),
('15431892-5'),
('15454085-7'),
('15469561-3'),
('15475600-0'),
('15477960-4'),
('15478142-0'),
('15478674-0'),
('15486035-5'),
('15496912-8'),
('15497259-5'),
('15516987-7'),
('15521004-4'),
('15532803-7'),
('15534518-7'),
('15535291-4'),
('15535399-6'),
('15543512-7'),
('15556118-1'),
('15560302-k'),
('15565853-3'),
('15567123-8'),
('15575064-2'),
('15586228-9'),
('15593079-9'),
('15601153-3'),
('15609722-5'),
('15614408-8'),
('15617091-7'),
('15630700-9'),
('15640102-1'),
('15652002-0'),
('15671466-6'),
('15673055-6'),
('15691444-4'),
('15706420-7'),
('15709080-1'),
('15709726-1'),
('15727523-2'),
('15728824-5'),
('15735595-3'),
('15759200-9'),
('15770343-9'),
('15783910-1'),
('15804963-5'),
('15815361-0'),
('15817798-6'),
('15827041-2'),
('15833885-8'),
('15845559-5'),
('15852575-5'),
('15897578-5'),
('15918157-k'),
('15921217-3'),
('15931750-1'),
('15931800-1'),
('15933801-0'),
('15949539-6'),
('15961213-9'),
('15973612-1'),
('15981886-1'),
('15986829-k'),
('15994883-8'),
('16002603-0'),
('16020148-7'),
('16027923-0'),
('16046570-0'),
('16046712-6'),
('16052260-7'),
('16090908-0'),
('16110739-5'),
('16140312-1'),
('16152457-3'),
('16157921-1'),
('16158212-3'),
('16200275-9'),
('16200926-5'),
('16208187-k'),
('16219843-2'),
('16243986-3'),
('16254652-k'),
('16265458-6'),
('16269763-3'),
('16275663-k'),
('16283289-1'),
('16293629-8'),
('16301869-1'),
('16306398-0'),
('16320808-3'),
('16327714-k'),
('16340925-9'),
('16343046-0'),
('16365693-0'),
('16380698-3'),
('16382201-6'),
('16387064-9'),
('16399091-1'),
('16411398-1'),
('16413787-2'),
('16416810-7'),
('16418565-6'),
('16419175-3'),
('16420673-4'),
('16422889-4'),
('16429457-9'),
('16432337-4'),
('16442929-6'),
('16452081-1'),
('16469701-0'),
('16477207-1'),
('16484467-6'),
('16503858-4'),
('16527013-4'),
('16536843-6'),
('16540074-7'),
('16554719-5'),
('16563570-1'),
('16574801-8'),
('16579103-7'),
('16588908-8'),
('16589970-9'),
('16590901-1'),
('16594034-2'),
('16603922-3'),
('16621397-5'),
('16631499-2'),
('16637488-k'),
('16643805-5'),
('16654445-9'),
('16660886-4'),
('16665782-2'),
('16665899-3'),
('16666436-5'),
('16669072-2'),
('16672251-9'),
('16685640-k'),
('16698356-8'),
('16711678-7'),
('16716231-2'),
('16717181-8'),
('16720319-1'),
('16721160-7'),
('16729935-0'),
('16743869-5'),
('16744461-k'),
('16745402-k'),
('16759381-k'),
('16772015-3'),
('16776725-7'),
('16785855-4'),
('16815535-2'),
('16822010-3'),
('16827933-7'),
('16831263-6'),
('16837363-5'),
('16840694-0'),
('16845249-7'),
('16847347-8'),
('16848191-8'),
('16852945-7'),
('16856729-4'),
('16873869-2'),
('16885505-2'),
('16911128-6'),
('16930522-6'),
('16943453-0'),
('16953607-4'),
('16985866-7'),
('16991425-7'),
('16992222-5'),
('16992885-1'),
('17015583-1'),
('17022813-8'),
('17024758-2'),
('17028114-4'),
('17038957-3'),
('17042778-5'),
('17057088-k'),
('17086907-9'),
('17089467-7'),
('17091096-6'),
('17102846-9'),
('17105152-5'),
('17108948-4'),
('17122886-7'),
('17125581-3'),
('17134387-9'),
('17145040-3'),
('17156977-k'),
('17160551-2'),
('17166705-4'),
('17167932-k'),
('17190657-1'),
('17198003-8'),
('17206784-0'),
('17209289-6'),
('17215797-1'),
('17217511-2'),
('17245857-2'),
('17255051-7'),
('17257333-9'),
('17261510-4'),
('17272719-0'),
('17288657-4'),
('17306575-2'),
('17306582-5'),
('17340339-9'),
('17340745-9'),
('17345780-4'),
('17349210-3'),
('17365106-6'),
('17378283-7'),
('17382963-9'),
('17386909-6'),
('17389967-k'),
('17410219-8'),
('17415920-3'),
('17427726-5'),
('17434178-8'),
('17488738-1'),
('17496764-4'),
('17496959-0'),
('17504306-3'),
('17510703-7'),
('17510923-4'),
('17513847-1'),
('17515016-1'),
('17516176-7'),
('17517892-9'),
('17523182-k'),
('17526299-7'),
('17528329-3'),
('17544384-3'),
('17548626-7'),
('17551533-k'),
('17574582-3'),
('17578021-1'),
('17591429-3'),
('17599794-6'),
('17612335-4'),
('17627037-3'),
('17630615-7'),
('17643244-6'),
('17647355-k'),
('17648399-7'),
('17651138-9'),
('17672481-1'),
('17676307-8'),
('17696112-0'),
('17707464-0'),
('17716337-6'),
('17720800-0'),
('17728887-k'),
('17747682-k'),
('17747986-1'),
('17777532-0'),
('17779762-6'),
('17798706-9'),
('17802810-3'),
('17810544-2'),
('17817613-7'),
('17819072-5'),
('17825245-3'),
('17846200-8'),
('17846240-7'),
('17858210-0'),
('17878199-5'),
('17888190-6'),
('17901164-6'),
('17908788-k'),
('17917469-3'),
('17921289-7'),
('17933448-8'),
('17950136-8'),
('17960002-1'),
('17981124-3'),
('17996112-1'),
('18023817-4'),
('18024443-3'),
('18027932-6'),
('18029066-4'),
('18058884-1'),
('18059881-2'),
('18087272-8'),
('18107022-6'),
('18113046-6'),
('18121760-k'),
('18126350-4'),
('18131392-7'),
('18136863-2'),
('18137035-1'),
('18137603-1'),
('18142901-1'),
('18149685-1'),
('18167463-6'),
('18170302-4'),
('18182094-2'),
('18183784-5'),
('18202329-9'),
('18209421-8'),
('18223184-3'),
('18233494-4'),
('18246071-0'),
('18253279-7'),
('18262298-2'),
('18270475-k'),
('18278471-0'),
('18281705-8'),
('18285397-6'),
('18302636-4'),
('18321456-k'),
('18323651-2'),
('18334910-4'),
('18356107-3'),
('18358153-8'),
('18360082-6'),
('18363517-4'),
('18379022-6'),
('18397725-3'),
('18401996-5'),
('18430407-4'),
('18440268-8'),
('18481991-0'),
('18486531-9'),
('18487169-6'),
('18491573-1'),
('18495766-3'),
('18532071-5'),
('18543862-7'),
('18575156-2'),
('18595030-1'),
('18598960-7'),
('18599136-9'),
('18604493-2'),
('18619682-1'),
('18631423-9'),
('18638684-1'),
('18645135-k'),
('18653731-9'),
('18660568-3'),
('18686963-k'),
('18691861-4'),
('18700817-4'),
('18721005-4'),
('18728155-5'),
('18738186-k'),
('18744001-7'),
('18749256-4'),
('18756477-8'),
('18762861-k'),
('18766791-7'),
('18767755-6'),
('18783520-8'),
('18798124-7'),
('18814692-9'),
('18816018-2'),
('18844964-6'),
('18845209-4'),
('18852359-5'),
('18855282-k'),
('18855611-6'),
('18858185-4'),
('18874107-k'),
('18875515-1'),
('18893694-6'),
('18900246-7'),
('18911726-4'),
('18922942-9'),
('18926834-3'),
('18927008-9'),
('18935628-5'),
('18936163-7'),
('18949920-5'),
('18953288-1'),
('18956474-0'),
('18978016-8'),
('18979688-9'),
('18982627-3'),
('18999464-8'),
('19006555-3'),
('19018136-7'),
('19026280-4'),
('19036268-k'),
('19058643-k'),
('19096620-8'),
('19105493-8'),
('19115407-k'),
('19120436-0'),
('19128881-5'),
('19135515-6'),
('19155144-3'),
('19163059-9'),
('19176601-6'),
('19184328-2'),
('19198923-6'),
('19199357-8'),
('19204242-9'),
('19233618-k'),
('19237267-4'),
('19250569-0'),
('19253791-6'),
('19255256-7'),
('19270650-5'),
('19292152-k'),
('19308270-k'),
('19311341-9'),
('19324641-9'),
('19335925-6'),
('19341550-4'),
('19369379-2'),
('19382159-6'),
('19384334-4'),
('19385443-5'),
('19386900-9'),
('19400209-2'),
('19402121-6'),
('19411124-k'),
('19432846-k'),
('19438767-9'),
('19448250-7'),
('19454640-8'),
('19457785-0'),
('19473318-6'),
('19484957-5'),
('19528644-2'),
('19547817-1'),
('19548611-5'),
('19557515-0'),
('19559641-7'),
('19569203-3'),
('19583718-k'),
('19585533-1'),
('19586515-9'),
('19631044-4'),
('19634706-2'),
('19656943-k'),
('19659359-4'),
('19664081-9'),
('19669963-5'),
('19670967-3'),
('19676501-8'),
('19687629-4'),
('19700750-8'),
('19714290-1'),
('19743620-4'),
('19748195-1'),
('19752704-8'),
('19755898-9'),
('19783662-8'),
('19815608-6'),
('19823600-4'),
('19840621-k'),
('19848581-0'),
('19850820-9'),
('19853989-9'),
('19860422-4'),
('19866433-2'),
('19878870-8'),
('19886592-3'),
('19910380-6'),
('19918987-5'),
('19932684-8'),
('19935501-5'),
('19947745-5'),
('19948887-2'),
('19958763-3');

INSERT INTO [dbo].[t_matricula]
           ([curso_agno]
           ,[matricula_alumno_id]
           ,[matricula_apoderado_id]
           ,[matricula_curso_establ_id]
		   ,[matricula_vigencia])
     VALUES
(2023,2,374,116,1),
(2023,6,156,20,1),
(2023,25,223,123,1),
(2023,51,569,167,1),
(2023,83,595,56,1),
(2023,120,384,179,1),
(2023,136,556,48,1),
(2023,152,516,196,1),
(2023,158,132,43,1),
(2023,179,373,149,1),
(2023,185,6,116,1),
(2023,186,241,173,1),
(2023,62,263,128,1),
(2023,90,591,46,1),
(2023,91,33,187,1),
(2023,94,307,53,1),
(2023,105,266,87,1),
(2023,108,180,76,1),
(2023,139,624,166,1),
(2023,147,49,151,1),
(2023,172,103,177,1),
(2023,177,495,194,1),
(2023,182,364,31,1),
(2023,197,222,137,1),
(2023,200,227,20,1),
(2023,202,6,182,1),
(2023,204,370,136,1),
(2023,229,617,174,1),
(2023,5,239,3,1),
(2023,11,209,77,1),
(2023,18,667,100,1),
(2023,19,528,27,1),
(2023,33,688,104,1),
(2023,42,331,87,1),
(2023,64,274,198,1),
(2023,72,90,158,1),
(2023,73,50,173,1),
(2023,86,549,146,1),
(2023,102,430,37,1),
(2023,130,95,151,1),
(2023,138,282,7,1),
(2023,160,86,110,1),
(2023,164,614,176,1),
(2023,166,171,167,1),
(2023,174,650,179,1),
(2023,192,322,19,1),
(2023,195,547,150,1),
(2023,218,174,41,1),
(2023,230,257,190,1),
(2023,60,344,145,1),
(2023,75,440,192,1),
(2023,85,155,190,1),
(2023,88,468,82,1),
(2023,103,47,43,1),
(2023,146,95,23,1),
(2023,148,56,10,1),
(2023,159,497,149,1),
(2023,170,247,142,1),
(2023,201,330,115,1),
(2023,203,536,111,1),
(2023,219,217,157,1),
(2023,38,336,3,1),
(2023,71,393,105,1),
(2023,77,313,68,1),
(2023,106,369,177,1),
(2023,168,126,45,1),
(2023,184,689,109,1),
(2023,226,121,159,1),
(2023,9,684,11,1),
(2023,23,387,65,1),
(2023,31,286,109,1),
(2023,43,129,160,1),
(2023,53,283,182,1),
(2023,59,313,139,1),
(2023,66,554,166,1),
(2023,95,662,23,1),
(2023,111,99,191,1),
(2023,144,387,34,1),
(2023,151,480,63,1),
(2023,154,242,173,1),
(2023,180,243,106,1),
(2023,187,235,102,1),
(2023,194,76,164,1),
(2023,207,462,113,1),
(2023,215,245,110,1),
(2023,10,508,1,1),
(2023,21,79,72,1),
(2023,22,507,96,1),
(2023,28,243,12,1),
(2023,39,662,166,1),
(2023,40,298,123,1),
(2023,61,318,60,1),
(2023,67,477,70,1),
(2023,68,206,10,1),
(2023,70,241,186,1),
(2023,129,638,137,1),
(2023,137,653,102,1),
(2023,140,62,157,1),
(2023,165,275,7,1),
(2023,178,392,26,1),
(2023,189,588,88,1),
(2023,198,295,93,1),
(2023,208,552,72,1),
(2023,212,618,24,1),
(2023,221,456,189,1),
(2023,227,222,37,1),
(2023,232,186,22,1),
(2023,44,606,170,1),
(2023,48,341,15,1),
(2023,55,369,145,1),
(2023,112,118,68,1),
(2023,133,126,50,1),
(2023,163,190,154,1),
(2023,171,76,112,1),
(2023,206,516,55,1),
(2023,209,666,34,1),
(2023,210,178,21,1),
(2023,217,95,118,1),
(2023,231,262,19,1),
(2023,13,624,185,1),
(2023,17,437,191,1),
(2023,20,402,53,1),
(2023,26,44,29,1),
(2023,32,684,69,1),
(2023,41,597,161,1),
(2023,54,169,138,1),
(2023,57,323,145,1),
(2023,76,101,129,1),
(2023,87,668,21,1),
(2023,100,437,130,1),
(2023,116,192,80,1),
(2023,118,567,94,1),
(2023,119,397,168,1),
(2023,155,22,196,1),
(2023,196,564,120,1),
(2023,205,141,15,1),
(2023,216,82,21,1),
(2023,222,6,167,1),
(2023,24,78,91,1),
(2023,37,517,184,1),
(2023,46,34,65,1),
(2023,65,503,54,1),
(2023,78,388,50,1),
(2023,82,252,76,1),
(2023,92,476,148,1),
(2023,115,474,32,1),
(2023,126,689,17,1),
(2023,141,370,89,1),
(2023,161,407,118,1),
(2023,162,392,138,1),
(2023,175,396,86,1),
(2023,176,588,1,1),
(2023,183,155,159,1),
(2023,213,48,35,1),
(2023,214,140,130,1),
(2023,220,201,74,1),
(2023,228,529,89,1),
(2023,3,470,21,1),
(2023,7,260,149,1),
(2023,30,487,160,1),
(2023,35,71,186,1),
(2023,45,398,95,1),
(2023,50,34,3,1),
(2023,101,270,196,1),
(2023,134,630,173,1),
(2023,150,288,38,1),
(2023,153,99,90,1),
(2023,169,261,78,1),
(2023,181,21,109,1),
(2023,224,638,92,1),
(2023,8,548,148,1),
(2023,29,35,125,1),
(2023,79,574,53,1),
(2023,81,637,53,1),
(2023,96,414,117,1),
(2023,110,673,103,1),
(2023,114,590,5,1),
(2023,117,622,102,1),
(2023,123,211,191,1),
(2023,128,130,152,1),
(2023,156,676,155,1),
(2023,211,470,8,1),
(2023,1,20,176,1),
(2023,4,690,153,1),
(2023,27,674,115,1),
(2023,52,287,24,1),
(2023,74,180,63,1),
(2023,93,400,198,1),
(2023,98,229,145,1),
(2023,125,47,4,1),
(2023,127,483,61,1),
(2023,142,267,164,1),
(2023,143,168,52,1),
(2023,145,526,40,1),
(2023,149,62,181,1),
(2023,157,367,116,1),
(2023,173,213,31,1),
(2023,188,305,76,1),
(2023,193,457,75,1),
(2023,199,187,190,1),
(2023,12,262,54,1),
(2023,34,564,70,1),
(2023,49,533,128,1),
(2023,84,653,176,1),
(2023,89,394,57,1),
(2023,99,330,124,1),
(2023,107,496,87,1),
(2023,109,178,60,1),
(2023,121,23,161,1),
(2023,131,105,16,1),
(2023,132,184,142,1),
(2023,167,21,170,1),
(2023,190,53,2,1),
(2023,223,423,150,1),
(2023,14,49,102,1),
(2023,15,192,59,1),
(2023,16,151,184,1),
(2023,36,586,124,1),
(2023,47,233,119,1),
(2023,56,518,141,1),
(2023,58,17,134,1),
(2023,63,571,93,1),
(2023,69,658,152,1),
(2023,80,89,25,1),
(2023,97,118,123,1),
(2023,104,236,124,1),
(2023,113,472,178,1),
(2023,122,235,1,1),
(2023,124,301,25,1),
(2023,135,368,3,1),
(2023,191,66,184,1),
(2023,225,131,176,1);

INSERT INTO [dbo].[t_perfil]
           ([perfil_nombre])
     VALUES
           ('Apoderado'),
		   ('Docente'),
		   ('Director'),
		   ('Alumno');

INSERT INTO [dbo].[t_vigencia]
          ([vigencia_nombre])
    VALUES
          ('Vigente'),
       ('No Vigente');


SET IDENTITY_INSERT [dbo].[t_usuario] ON

INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1, N'Director_Adelina_14218@gmail.com', N'$2a$10$ETZFxXjBzJ.iPURklWxNiOWSkdcQDTQfT3rhwecMK7esinRZxvP8.', N'Director_Adeli_14218', 3, N'14218894-5 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (2, N'Director_Raquel_14224@gmail.com', N'$2a$10$.KP.GVgYdPUrikLEHud01.XsIN.ZM3N70lVExtOT7zn0N8UTO2Pvu', N'Director_Raque_14224', 3, N'14224136-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (3, N'Director_Iván_14225@gmail.com', N'$2a$10$Vt7.CWLHr5cp.I0.hPTUHeD1/wskuflTIMG8YSuDaenG.7EOovSEe', N'Director_Iván_14225', 3, N'14225191-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (4, N'Director_Danilo_14249@gmail.com', N'$2a$10$Ec0GJZTEc6KdiG69IlSnC.dAG/u5vDe7e5Z.TbsrXZsmYIipwyzZG', N'Director_Danil_14249', 3, N'14249583-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (5, N'Director_Adelina_14256@gmail.com', N'$2a$10$NB4BDW5nNIDHUH9Q16iUMeG6GofypdGf8z7VguT1PcPPPE17O.kES', N'Director_Adeli_14256', 3, N'14256080-1 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (6, N'Director_Visitación_14257@gmail.com', N'$2a$10$992lNOzALIwm2Lb528YILutks3w1j3H1EmZIPTPEQsLAgO5FSBQsu', N'Director_Visit_14257', 3, N'14257703-8 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (7, N'Director_Fernando_14275@gmail.com', N'$2a$10$NIoIwhoGdTZat866HHMmuO7Da2.HoeFrTDwHFglhF.NHKN.Qzkl2i', N'Director_Ferna_14275', 3, N'14275763-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (8, N'Director_Florina_14281@gmail.com', N'$2a$10$oUukcPDC7ebtKJWiQEXzzeGxpZdKz9XRbwff8QQ4uC8mpY1C/Z79a', N'Director_Flori_14281', 3, N'14281043-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (9, N'Director_Jimena_14287@gmail.com', N'$2a$10$mdFpo7hX6HwTlV83pf2MruCjCDzdyZc/nmgszcwoDNpi2DcyCM8QC', N'Director_Jimen_14287', 3, N'14287344-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (10, N'Director_Hermenegildo_14296@gmail.com', N'$2a$10$YHeuh5KjYSkbHSrOcXeyx.eZZ.HabInoVWYh/vIJLwHyltXN2Jn92', N'Director_Herme_14296', 3, N'14296021-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (11, N'Director_Fulgencio_14305@gmail.com', N'$2a$10$MI2y4EqJ74kzrwHY4J4r9uyxOTEwnolXROJ5swNoP2a56tv.3ckN6', N'Director_Fulge_14305', 3, N'14305011-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (12, N'Director_Aureliano_14305@gmail.com', N'$2a$10$EIkn02mFk03.PMgrgC4OiuheZnZV9qOPRvLGwb.9jeLm/Wmhc9kOy', N'Director_Aurel_14305', 3, N'14305013-0 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (13, N'Director_Marcial_14317@gmail.com', N'$2a$10$ZC3xsdmUOnfPGWZfqyc7R.xqUhPsVdCCq02r.LW8PziwYNv2brCTC', N'Director_Marci_14317', 3, N'14317456-5 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (14, N'Director_Fidela_14323@gmail.com', N'$2a$10$ISnLzNHZ0jFRiBL/6idGQOvoVrw99.v82zTsDxhiGnh8FFygBByrW', N'Director_Fidel_14323', 3, N'14323291-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (15, N'Director_Fabricio_14335@gmail.com', N'$2a$10$AESVobXL6miZlYNpaMz8ne7j.i.Wyr1LNRZwx04YUwJUEGzqFR2Vu', N'Director_Fabri_14335', 3, N'14335545-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (16, N'Director_Tecla_14341@gmail.com', N'$2a$10$mx.pp5nOyJDHyN5M8RV1jeRyZlqG0sxzFQYxKGineBuTLLn2T2t.O', N'Director_Tecla_14341', 3, N'14341357-8 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (17, N'Director_Teodoro_14363@gmail.com', N'$2a$10$arqTaZiNNPSdUV7/zk6NWO0TZ08EJ3PZIKxAAxbFg2V90r7LDY7c.', N'Director_Teodo_14363', 3, N'14363025-0 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (18, N'Director_Lucas_14370@gmail.com', N'$2a$10$G1u9aN3x3MvOlDYTjLpRyOQM7lBONbnWqCbtuF7ZfPNyPEVaDFnqG', N'Director_Lucas_14370', 3, N'14370588-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (19, N'Director_Eligia_14379@gmail.com', N'$2a$10$Y5MIY7AM8RUsbuTeLLrPpOHEyriTT/czwSZiSCj/HDeRAdu6ezEFq', N'Director_Eligi_14379', 3, N'14379776-7 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (20, N'Director_Cesar_14386@gmail.com', N'$2a$10$jZV5M.q/E6/wdZU5moXfVO/BHaNhBLsOH/ML1wrlnaz.Vulf06pK6', N'Director_Cesar_14386', 3, N'14386647-5 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (21, N'Director_Dora_14420@gmail.com', N'$2a$10$2HFqlA2V7r8vwkpWhjgk7OOX7K7EqXk3Iy5orWRhW5tqOb9ed1uxC', N'Director_Dora_14420', 3, N'14420070-5 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (22, N'Director_Hugo_14422@gmail.com', N'$2a$10$3phP7OEwvZTq.m4SL29nXumqBTKXnFjswXmX7L.cKy9j9iU1o/l6O', N'Director_Hugo_14422', 3, N'14422764-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (23, N'Apoderado_Rafa_13263@gmail.com', N'$2a$10$1CtFaS3zY6nE7QQGuA.izufPPoHqsnU76NLHyO8dixWFzTyDR6.ja', N'Apoderado_Rafa_13263', 1, N'13263940-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (24, N'Apoderado_Celestina_13269@gmail.com', N'$2a$10$Nhgzz3V.D9hAkq1JQW.pw.EFtnLIPp4BY5xcHn5u6u1l23vSg5hDi', N'Apoderado_Celes_13269', 1, N'13269124-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (25, N'Apoderado_Francisco_13276@gmail.com', N'$2a$10$Bcl45trWafTud/ABi8LgHeGwVyDbNhsnjjvHYUi6fMAehy8YzRjLO', N'Apoderado_Franc_13276', 1, N'13276952-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (26, N'Apoderado_Alex_13283@gmail.com', N'$2a$10$mIQCeeGYAvXk81oBZJMU5OlkdXkW.Gh66LOR6NmiZ2M9TVDrLFu3S', N'Apoderado_Alex_13283', 1, N'13283228-5 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (27, N'Apoderado_Josep_13287@gmail.com', N'$2a$10$NaflUIEB9EPkzgxm0uZqGubxofTJh2owbLoMlc0QwnTDksuBazQtS', N'Apoderado_Josep_13287', 1, N'13287555-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (28, N'Apoderado_Jordán_13287@gmail.com', N'$2a$10$q.VqpSeKZUmimuS5M2JC4u3HbDRLPxj8WGVUAwDlBtUkXFqzm7rqS', N'Apoderado_Jordá_13287', 1, N'13287638-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (29, N'Apoderado_María_13293@gmail.com', N'$2a$10$WRziwlHNfiWJzLV2zvzl..937xsedShfutIzSzxR/ptEhhYljOXem', N'Apoderado_María_13293', 1, N'13293393-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (30, N'Apoderado_Eva_13296@gmail.com', N'$2a$10$CjYgNMqUKGFDw3zSnNx8c.uFkTS1K/tibaQpdK0mV6Wu1oR5nNEd.', N'Apoderado_Eva_13296', 1, N'13296241-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (31, N'Apoderado_Álvaro_13317@gmail.com', N'$2a$10$0sITUxW1KlPp3FLNWNG7dOCcp3ruN6ij4hN1vkia6l7Eouro2aFoG', N'Apoderado_Álvar_13317', 1, N'13317341-2 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (32, N'Apoderado_Juan_13322@gmail.com', N'$2a$10$oEVhBgiPymI7juak29T.NuOZfAMa/F4Pl45wppj5exzOpsoDrYxfy', N'Apoderado_Juan_13322', 1, N'13322547-1 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (33, N'Apoderado_Víctor_13362@gmail.com', N'$2a$10$L/s.XT308fudqRJ7zM3urelwMZaG9zZTUxk9GhsF7OfZiS140YWbu', N'Apoderado_Vícto_13362', 1, N'13362228-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (34, N'Apoderado_Gervasio_13363@gmail.com', N'$2a$10$LJti44KUz47lsuVHpdro4.k99DzFB62ehzOh.t.brpyY5mU7qLQcq', N'Apoderado_Gerva_13363', 1, N'13363861-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (35, N'Apoderado_Emma_13363@gmail.com', N'$2a$10$r3kZawywwzWW5t2SPUcPT.XaYjpwl4lUlEJlJM5m0ksSiiXAQzPNS', N'Apoderado_Emma_13363', 1, N'13363944-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (36, N'Apoderado_Aitana_13372@gmail.com', N'$2a$10$KdpOtNfnhPkW9vTezJQVPexSsTdqUGUZD19XZokAix7N2xRhLsAC6', N'Apoderado_Aitan_13372', 1, N'13372558-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (37, N'Apoderado_Ovidio_13374@gmail.com', N'$2a$10$Ug6Ro2VQozIpw5syLc74Wew7LWTACLa5n3c4oaAUKn/NwNCHrOvwC', N'Apoderado_Ovidi_13374', 1, N'13374749-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (38, N'Apoderado_Chelo_13388@gmail.com', N'$2a$10$UrXmaB2BPN.Tvpg3Rc4eE.3oqbnB..tKBxRDHV8oZrCHReM4HkX/O', N'Apoderado_Chelo_13388', 1, N'13388365-7 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (39, N'Apoderado_Lucía_13410@gmail.com', N'$2a$10$n5MEea8UfiDZWw1e5cVkaOCA0bDV5SmJayjyfLlVLrxCbs6pK6gM2', N'Apoderado_Lucía_13410', 1, N'13410580-1 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (40, N'Apoderado_Nélida_13411@gmail.com', N'$2a$10$hdLLtaO7EL64u62wdQBAS.Ch6sdnKmEHu0ZL9an.Sh/ZURjIVD.Uq', N'Apoderado_Nélid_13411', 1, N'13411638-2 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (41, N'Apoderado_Paco_13417@gmail.com', N'$2a$10$xnXUoPjeFPGv0n93d12ARuDgCl/MOO8WfriEtd1YGK0GWF65ibr42', N'Apoderado_Paco_13417', 1, N'13417558-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (42, N'Apoderado_Maxi_13423@gmail.com', N'$2a$10$AcLS5t.H/kG/0SAuKwvMceOVB1JagK2scBLRfYBn41ftWtQM.E3Y2', N'Apoderado_Maxi_13423', 1, N'13423811-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (43, N'Apoderado_Estela_13443@gmail.com', N'$2a$10$Zkd3BT2ch4I.SvE8dzU.R.1IEHRk1GrBsF0KEXmCEuQj1PwMavZse', N'Apoderado_Estel_13443', 1, N'13443180-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (44, N'Apoderado_Maite_13448@gmail.com', N'$2a$10$UJ5gio0nKlOJJ0Qmut88DeyxTIGcBiNLOmpkYYzY.MGRfQ79AfR2m', N'Apoderado_Maite_13448', 1, N'13448142-0 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (45, N'Apoderado_Edgardo_13455@gmail.com', N'$2a$10$HVOaARLXf/JGzwpa0WtYV.ncAPn6OfaZaJ/T2VBEbllDCcMbXz5ui', N'Apoderado_Edgar_13455', 1, N'13455567-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (46, N'Apoderado_Fátima_13462@gmail.com', N'$2a$10$0o.ux10wuN4tEHs78HtcQ.jai.gVU/EZIeFKNfDBN1tpgF503ysle', N'Apoderado_Fátim_13462', 1, N'13462736-0 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (47, N'Apoderado_Jose_13465@gmail.com', N'$2a$10$L3FQOBqjMs3XPgj4..IB9u/nHmFuCWd0V.LjZONyRDmrImcOHjTm6', N'Apoderado_Jose_13465', 1, N'13465574-7 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (48, N'Apoderado_Angelina_13466@gmail.com', N'$2a$10$FbFqq5fuclmzTie/uXkO3eMIuPcA9rJvvIiXgxuV7M6DOYiTf9P6y', N'Apoderado_Angel_13466', 1, N'13466545-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (49, N'Apoderado_Bernarda_13474@gmail.com', N'$2a$10$m5AlHzYVTxgU8WmzE.7h3.FBaUedI.m57E41vAgpH2naV/y5UnHdu', N'Apoderado_Berna_13474', 1, N'13474067-1 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (50, N'Apoderado_Elba_13474@gmail.com', N'$2a$10$N2m9jZdMt1Al5aZS/IIs.um72ZUZGA61dwn1R5AnmRYSzWjCvU/6y', N'Apoderado_Elba_13474', 1, N'13474325-5 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (51, N'Apoderado_Manuelita_13478@gmail.com', N'$2a$10$JpSZu66B02RoVQLDEDOVEeagZX2Ya9SunHDXegAdwIqqDQQ9nm4X6', N'Apoderado_Manue_13478', 1, N'13478959-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (52, N'Apoderado_Adalberto_13490@gmail.com', N'$2a$10$fBTQGf3cIN5sdl9.flRIxOfJAV33tNqGVzyshgM1OZYgzyRBKOo1W', N'Apoderado_Adalb_13490', 1, N'13490604-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (53, N'Apoderado_Evita_13493@gmail.com', N'$2a$10$qx05DBnB4DwIMmU3YcDAged28yT.Vsr.FdySYR0c9t350HPD1Vl3.', N'Apoderado_Evita_13493', 1, N'13493857-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (54, N'Apoderado_Rosalía_13506@gmail.com', N'$2a$10$nMYIOu4tfBmothnxcmtpKe6CgOOaQ22LxKAt1p7n.k2n3O7zmDkii', N'Apoderado_Rosal_13506', 1, N'13506199-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (55, N'Apoderado_Alejo_13511@gmail.com', N'$2a$10$Ub8SEkUEuWrfkv9ZyZdWzeWDJftyffkieYr65jiYeUbe0tvPIKTx.', N'Apoderado_Alejo_13511', 1, N'13511651-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (56, N'Apoderado_Lupe_13529@gmail.com', N'$2a$10$GEoYSMlveIZnAqc2RijqdeU74sRQwEKKC.7SkP0O5qUzx1Ehsg/TG', N'Apoderado_Lupe_13529', 1, N'13529640-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (57, N'Apoderado_Eugenio_13532@gmail.com', N'$2a$10$9tteunBrjee0bhRgf48e6eadXMO0/3Gve4sPx.W94gczhQiSXdfTa', N'Apoderado_Eugen_13532', 1, N'13532532-5 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (58, N'Apoderado_Teófila_13539@gmail.com', N'$2a$10$7BQ3MBLGgi9h.0PAa/pcZ.oJUJUjs28qgbb5iZGGa8uK5gTFUPUdm', N'Apoderado_Teófi_13539', 1, N'13539393-2 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (59, N'Apoderado_Sigfrido_13539@gmail.com', N'$2a$10$ANiPh2wUJeIU2BwrY6Za3uzfI77LpcZb7E8Jp6LDDBnI2PKptA1yu', N'Apoderado_Sigfr_13539', 1, N'13539789-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (60, N'Apoderado_Tito_13543@gmail.com', N'$2a$10$A71NhD7C2Qs.MHkzIFyGNOCavfCXyERUrL1kQ96yCMTTfuZk5mCR.', N'Apoderado_Tito_13543', 1, N'13543595-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (61, N'Apoderado_Jorge_13547@gmail.com', N'$2a$10$M09Mk/X31lRO.kIARXoQS.8tm8PteStCtSVUoF/NYzWxXzEhbTOEW', N'Apoderado_Jorge_13547', 1, N'13547242-5 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (62, N'Apoderado_Andrés_13549@gmail.com', N'$2a$10$/32/ImCK0lCygn4tGbF1.uTExHtHylNg.sqH4PZq8XdugKs5sM2Qe', N'Apoderado_André_13549', 1, N'13549704-5 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (63, N'Apoderado_Encarnacion_13558@gmail.com', N'$2a$10$kqsbJ38wNVejAVpUM0Z/j.dxRNfJA1K2wiif.O.Lbmvm6v5J1frBK', N'Apoderado_Encar_13558', 1, N'13558917-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (64, N'Apoderado_Jessica_13565@gmail.com', N'$2a$10$03C0HORlNAixg7SrEO2lku5uIxBhEz18cBdyrW8kz5coAKRUDjjIu', N'Apoderado_Jessi_13565', 1, N'13565523-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (65, N'Apoderado_Pía_13567@gmail.com', N'$2a$10$WP7I.0Q.ZUsU.ehONFKQ5emD4iTk.mvXHef4W7MOuUYs/j.LNjdQq', N'Apoderado_Pía_13567', 1, N'13567240-8 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (66, N'Apoderado_Francisco_13567@gmail.com', N'$2a$10$k0yBqUEwf1Y5snimoY.wSOxwh1hAscll.RlLIYdMGYgmFYJO1iMYu', N'Apoderado_Franc_13567', 1, N'13567255-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (67, N'Apoderado_Seve_13602@gmail.com', N'$2a$10$L/TyPSViCKphKizeUDMy6uCEkWvw.UafK1U8x9HRwJwlhUiOoU7g6', N'Apoderado_Seve_13602', 1, N'13602705-0 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (68, N'Apoderado_Prudencia_13622@gmail.com', N'$2a$10$WYp5QoB43gnSoLZeOMDCH.tu7v/UKXpXXQXW.Punx2u/Hpp5czK5y', N'Apoderado_Prude_13622', 1, N'13622701-7 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (69, N'Apoderado_Rosenda_13630@gmail.com', N'$2a$10$UezjTUxkpYhwdgwk8Hw6w.5Q//hH893vZR.gPsLya2udNG.hwqAca', N'Apoderado_Rosen_13630', 1, N'13630884-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (70, N'Apoderado_Ximena_13632@gmail.com', N'$2a$10$WEPcbEPgeXF5io1nDA3r8uG7vYOsTb2XK8tTnuxSwlwv/G1/YW/Ue', N'Apoderado_Ximen_13632', 1, N'13632855-7 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (71, N'Apoderado_Chema_13639@gmail.com', N'$2a$10$9CPNZ6Wsr2o05aFCATXVc.5eaYiDYuUJWXUxbob8qW/1uHkFhHjke', N'Apoderado_Chema_13639', 1, N'13639690-0 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (72, N'Apoderado_Daniela_13648@gmail.com', N'$2a$10$RQ8pKq1rVYKVRbAs4ldfr.m2xUo3VX.ZgC6OTP.96LJz6A6iMtseC', N'Apoderado_Danie_13648', 1, N'13648490-7 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (73, N'Apoderado_Miguel_13660@gmail.com', N'$2a$10$QbjgbLffbwTAzB8Qz9P64.InbP6ildikCud1DmcgRzQ.FbDyx7nf6', N'Apoderado_Migue_13660', 1, N'13660551-8 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (74, N'Apoderado_Cipriano_13674@gmail.com', N'$2a$10$OtJ.MyMavJoo0pxOIrCvi.y/RXiHlyx.qq2K8JaJhUUjVGJ3GjrmK', N'Apoderado_Cipri_13674', 1, N'13674283-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (75, N'Apoderado_Arturo_13675@gmail.com', N'$2a$10$qTUlhqmqCmpihGT4NTKQlemgjBBedxOfCjawLiUcIdIbyCzju3IXm', N'Apoderado_Artur_13675', 1, N'13675794-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (76, N'Apoderado_Virginia_13686@gmail.com', N'$2a$10$XzPP4pIxMKVCg52MOqcoTefs27XuSHPyX9llhJbSeyhsgo8z9Kjwq', N'Apoderado_Virgi_13686', 1, N'13686122-0 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (77, N'Apoderado_Saturnino_13688@gmail.com', N'$2a$10$QDoP1TUOHVnkgS.IIw1W6.9KTZyFbEvVgD5uO.Vw3FIB/BVXWkIle', N'Apoderado_Satur_13688', 1, N'13688966-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (78, N'Apoderado_Martirio_13719@gmail.com', N'$2a$10$.RAxYmffTB6boARxuRHchOp4qYnQsSWcjz/wYMxT94zdqWJKJkNqC', N'Apoderado_Marti_13719', 1, N'13719528-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (79, N'Apoderado_Ramón_13725@gmail.com', N'$2a$10$JUJOTYI.juZtCxjeiCJyiea0i9ivbmf8AWlxIJcfd0B9QAgikzUIC', N'Apoderado_Ramón_13725', 1, N'13725066-7 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (80, N'Apoderado_Cloe_13742@gmail.com', N'$2a$10$X1xE2DaAgscWXXHDTbkNguBNt9tCGdSHt5yfLUO4HabN.JGza0nVS', N'Apoderado_Cloe_13742', 1, N'13742329-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (81, N'Apoderado_Juan_13754@gmail.com', N'$2a$10$OAOuxC5U7UpjpcdzcgYHCu0pgW1Bz5iWGopDT6gc.ZaCHLilXkQKu', N'Apoderado_Juan_13754', 1, N'13754872-0 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (82, N'Apoderado_Rodrigo_13755@gmail.com', N'$2a$10$fO0/bHaEQSAeO7UL9iFe.uOd4Qs4Rv5iRB541MB.o/FZS8OkN6ge2', N'Apoderado_Rodri_13755', 1, N'13755681-2 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (83, N'Apoderado_Fausto_13761@gmail.com', N'$2a$10$XbmgJ.rE38KC4qtFqynlfuns2oXMOVpcpKAr8aUeEiONS/OrjYi/C', N'Apoderado_Faust_13761', 1, N'13761711-0 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (84, N'Apoderado_Javi_13790@gmail.com', N'$2a$10$SxrNaG1q3H3dMhlmO56Qge7gF/s3G6aUscafiR0jZxMBaLgn8uNni', N'Apoderado_Javi_13790', 1, N'13790481-0 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (85, N'Apoderado_José_13792@gmail.com', N'$2a$10$A0JPoyfogdWqi805gSoVIukmFGjK8C9e472KMIQHbhbQ8X0B3GTdq', N'Apoderado_José_13792', 1, N'13792757-8 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (86, N'Apoderado_Cruz_13795@gmail.com', N'$2a$10$uux9qTnCwYjrTjS9sxWNg.6Rtwq2RvFA3gHqbLHXXTB.fS0HYunme', N'Apoderado_Cruz_13795', 1, N'13795755-8 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (87, N'Apoderado_Beatriz_13812@gmail.com', N'$2a$10$8t.GJ4zwxmmw6PMltnOvIOWMJYLnpIAuqI4f1FEwo1u8OV1CZlnj6', N'Apoderado_Beatr_13812', 1, N'13812346-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (88, N'Apoderado_Ascensión_13822@gmail.com', N'$2a$10$6VVidDXWBbDZdc92WSadV.MvNfnBAbo6BSC6KMFN92AlzFh25L6ne', N'Apoderado_Ascen_13822', 1, N'13822330-2 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (89, N'Apoderado_Rebeca_13822@gmail.com', N'$2a$10$eaKLC1f8/3pO1jfngwwh1uVsLIgVeXQOQSUhdQ/CKLHlaPzBxFDoy', N'Apoderado_Rebec_13822', 1, N'13822989-0 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (90, N'Apoderado_Candela_13824@gmail.com', N'$2a$10$XoUMK//ufD3qTqAFOb0xSuI8tS6sTWq0T71H/TWdb11TiYCJsLIBG', N'Apoderado_Cande_13824', 1, N'13824547-0 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (91, N'Apoderado_David_13833@gmail.com', N'$2a$10$2yeH1sy8W8qLmigUoWzNlelcGboy0NcSEWKPNOGod1GaoUVYIJwq6', N'Apoderado_David_13833', 1, N'13833729-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (92, N'Apoderado_Josep_13834@gmail.com', N'$2a$10$PsS2yo6hqr6TKf/DqmYEd.rC50D3bAFvag4X5GALIe8XTxN.vW8AC', N'Apoderado_Josep_13834', 1, N'13834142-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (93, N'Apoderado_Juliana_13846@gmail.com', N'$2a$10$jLhlso/mpQLMAJKNrxLuYuRNNemiaedfF785cLyh/AbaXd/hciSnS', N'Apoderado_Julia_13846', 1, N'13846172-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (94, N'Apoderado_Baudelio_13852@gmail.com', N'$2a$10$j8HYInP9iBI9FllZMlYyfOKFKrjyASZ/xeKN62ZYIkq1.PHpd50L.', N'Apoderado_Baude_13852', 1, N'13852329-2 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (95, N'Apoderado_Piedad_13866@gmail.com', N'$2a$10$EL9GZK/P2xsVas6wdNBAne2JNRLyiljTYrcGwYfRXgoRi9btYNYiW', N'Apoderado_Pieda_13866', 1, N'13866551-8 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (96, N'Apoderado_Luis_13886@gmail.com', N'$2a$10$LrzkGK8MdWRYlCSGU9XkRuTyLKLXrQywrsaZUEObfPnhZeBoRTdEi', N'Apoderado_Luis_13886', 1, N'13886495-2 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (97, N'Apoderado_María_13912@gmail.com', N'$2a$10$NhEgzujqoWRb9OwpYtNU7.bDJKWeVyp9DvHdVVejl5iUHaDnjZQe6', N'Apoderado_María_13912', 1, N'13912617-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (98, N'Apoderado_Narciso_13913@gmail.com', N'$2a$10$q6TXAUnE4ct1aLIzNWmmHeLqYL7uddyeOGoSUxEAbePPDhPtjYZnG', N'Apoderado_Narci_13913', 1, N'13913725-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (99, N'Apoderado_Calista_13970@gmail.com', N'$2a$10$4g0KEGdCZ9Z./XtRkhXezOQmca4EOH6x3iekbr7Gn6Mhn17PdVj/C', N'Apoderado_Calis_13970', 1, N'13970857-1 ', 1)

INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (100, N'Apoderado_Elba_13979@gmail.com', N'$2a$10$nW/lRStl5DT8m6acBdy7eO/txhoZU5Goqp12tEKaOsgPz9HkUdV5G', N'Apoderado_Elba_13979', 1, N'13979267-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (101, N'Apoderado_Jonatan_13983@gmail.com', N'$2a$10$RP66B0eE7SO.dKgtMTHzP.aWYF60iy0vhZS772wAfQN3GbqnoyieK', N'Apoderado_Jonat_13983', 1, N'13983572-7 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (102, N'Apoderado_Feliciana_13985@gmail.com', N'$2a$10$P.TGRUastCEfaRngicPNEO7LmQsLjEjpU/gEkEI3JRMuCwS7MtRa6', N'Apoderado_Felic_13985', 1, N'13985194-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (103, N'Apoderado_Pío_14003@gmail.com', N'$2a$10$LDt8uG8T4GmMxPOl2sYK9.Iiz.J4YtDC7l2Q7NeEO8BJxrLfgC1L6', N'Apoderado_Pío_14003', 1, N'14003611-0 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (104, N'Apoderado_Dolores_14004@gmail.com', N'$2a$10$XlkJcjJ.URzwe3Bxk2wSiOWYZeizNQYhkKS516CCQAZB7cUYVKTsC', N'Apoderado_Dolor_14004', 1, N'14004197-1 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (105, N'Apoderado_Griselda_14004@gmail.com', N'$2a$10$3QtOSnh5ju/fXjNQak/nHuwUIwFggt6M0ZYcHb4RDSyo2NuWAFGUS', N'Apoderado_Grise_14004', 1, N'14004836-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (106, N'Apoderado_Paca_14011@gmail.com', N'$2a$10$53bplZWjAN8SMKC1YzG3JOFrZ.MI7J0pDrS9Y6yg1gkfnoRrp3eIC', N'Apoderado_Paca_14011', 1, N'14011311-5 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (107, N'Apoderado_Alondra_14017@gmail.com', N'$2a$10$fC0VvqOAz8gTDSmgXFsLE.3wMmwC/oB71POEm9lxaZwlVfiHA5IPK', N'Apoderado_Alond_14017', 1, N'14017776-8 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (108, N'Apoderado_Kike_14041@gmail.com', N'$2a$10$oUs62n6.WA5QODl.t/Fzh.wD..QSYgrcRu9coAMh6j1ZrlnLF9cJ2', N'Apoderado_Kike_14041', 1, N'14041899-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (109, N'Apoderado_Wilfredo_14068@gmail.com', N'$2a$10$tMSUyxgcX3T0XKiJEo1.dOFCjL1yRryNuVZv0jl9a9LJrTTIvglCu', N'Apoderado_Wilfr_14068', 1, N'14068550-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (110, N'Apoderado_Mireia_14074@gmail.com', N'$2a$10$YlnKuf6liNKa/19jXI0W4OHetOXp0s5YIdCblJ4uCw/LPbyO217ye', N'Apoderado_Mirei_14074', 1, N'14074955-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (111, N'Apoderado_Moisés_14078@gmail.com', N'$2a$10$WwxumBDfivUsu1QxAtb0Re.uPE7G1USQ1ObvWvcs71cpD.mq3HxMe', N'Apoderado_Moisé_14078', 1, N'14078233-5 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (112, N'Apoderado_Sigfrido_14134@gmail.com', N'$2a$10$t5kLJzafIaU1iVg35IK3kO3zdzTeMMtaq8EO5bOYddTa/Tyogdgfm', N'Apoderado_Sigfr_14134', 1, N'14134348-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (113, N'Apoderado_Espiridión_14149@gmail.com', N'$2a$10$SNWm6QJjgHQeQ05CIn4Sou8/I5hBJ7Q13DPTSCx1R4u61kRUr7iAm', N'Apoderado_Espir_14149', 1, N'14149250-0 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (114, N'Apoderado_Fortunata_14156@gmail.com', N'$2a$10$dVmerN6T0OzOoOITV3IhhO4SQ5Mky21.KXaM77tdU30NBfAs9lpxy', N'Apoderado_Fortu_14156', 1, N'14156047-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (115, N'Apoderado_Fernando_14168@gmail.com', N'$2a$10$Lv0AVTUS4ZqFiKXEG1xMz.9/NGL3dxHy6uu/R3aKqSUC6TQMrRB5G', N'Apoderado_Ferna_14168', 1, N'14168155-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (116, N'Apoderado_Reynaldo_14197@gmail.com', N'$2a$10$rvVqgfFPyOG80V.gxcNQae4pWhJNPh16DykVOpO7KD0J5Flem3Nju', N'Apoderado_Reyna_14197', 1, N'14197219-7 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (117, N'Apoderado_Saturnina_14209@gmail.com', N'$2a$10$7/c6TcUwHc8hB0Cdk8/ZgOvQ3Zlj1cJWElofKYeyr6zO7mfP5nsyK', N'Apoderado_Satur_14209', 1, N'14209858-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (118, N'Apoderado_Adelina_14218@gmail.com', N'$2a$10$YtF3q0vYWMfaPrBb7IsqYeaRdUCvTORnhdkmyQi6qovHkFj20KU.O', N'Apoderado_Adeli_14218', 1, N'14218894-5 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (119, N'Apoderado_Raquel_14224@gmail.com', N'$2a$10$Qotfqu1QrflpqTmpukOlOe9KbARffYSz..yKEdSD.SjTHnZHfXhpi', N'Apoderado_Raque_14224', 1, N'14224136-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (120, N'Apoderado_Iván_14225@gmail.com', N'$2a$10$J2XmfSgvLq21J3ngS/LsKON5fn4U1cUjgWwYxUIgllsOWbUbt6iV2', N'Apoderado_Iván_14225', 1, N'14225191-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (121, N'Apoderado_Danilo_14249@gmail.com', N'$2a$10$shOV8YXs5PyS.zXUqLsoJuXZx3sFploJmXRvVW4euudAGobD2BhB.', N'Apoderado_Danil_14249', 1, N'14249583-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (122, N'Apoderado_Adelina_14256@gmail.com', N'$2a$10$P9fuqH7aZd3HwD8TyIjTHOCiJ2JeZjLsW8F8I5EKDQ6bmUBa7Zwl.', N'Apoderado_Adeli_14256', 1, N'14256080-1 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (123, N'Apoderado_Visitación_14257@gmail.com', N'$2a$10$SEO1NWbsXNzVsatXflzlDe8g4rb6a/jQtWLrmRU292x/8ykpz8YvK', N'Apoderado_Visit_14257', 1, N'14257703-8 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (124, N'Apoderado_Fernando_14275@gmail.com', N'$2a$10$P0bmB8b54avKOPXiKJEtxOF/iw300OdVG072G5Qa0w/wGG2xiy3hy', N'Apoderado_Ferna_14275', 1, N'14275763-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (125, N'Apoderado_Florina_14281@gmail.com', N'$2a$10$eaUJab47Pm4b//CXaC.2J.h2jNE7x7QOxl.uGdsAW4PlncHQ4lhXK', N'Apoderado_Flori_14281', 1, N'14281043-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (126, N'Apoderado_Jimena_14287@gmail.com', N'$2a$10$DDVZfyQfCvHUpU.wQWZ8oeNvMYpr20Pbu5d0DIYQOkyv3LwjJcER2', N'Apoderado_Jimen_14287', 1, N'14287344-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (127, N'Apoderado_Hermenegildo_14296@gmail.com', N'$2a$10$ezzNakJ12niWdGQwfOkYBeT0IdRvA8kShEj/3OUaPHc3ibFrtpF36', N'Apoderado_Herme_14296', 1, N'14296021-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (128, N'Apoderado_Fulgencio_14305@gmail.com', N'$2a$10$7UjH5RP4NhFm/wjpZSAWKOqyEqfVm8ceSgtc1CYVa.QU1IFYP86Zi', N'Apoderado_Fulge_14305', 1, N'14305011-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (129, N'Apoderado_Aureliano_14305@gmail.com', N'$2a$10$m80h6XSAG4d5fvvXzatbk.MPASCs0ivC57EXokxAAPOnayfeybZL.', N'Apoderado_Aurel_14305', 1, N'14305013-0 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (130, N'Apoderado_Marcial_14317@gmail.com', N'$2a$10$UYSYC9y64lrNpLaBDHo0DOPLGAiQpcElAr8.ia3KxET.eSZQASHyW', N'Apoderado_Marci_14317', 1, N'14317456-5 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (131, N'Apoderado_Fidela_14323@gmail.com', N'$2a$10$llJ4zv/hNJVqXw0WQOlOE.Ywvyzayd.isurn1yQ1lh3iU8cD7u1mq', N'Apoderado_Fidel_14323', 1, N'14323291-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (132, N'Apoderado_Fabricio_14335@gmail.com', N'$2a$10$3mLtVv.tCSxS3CitfI8jsO.OdRcOuCgPaIR9l4H11bIiQjAVbHHeG', N'Apoderado_Fabri_14335', 1, N'14335545-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (133, N'Apoderado_Tecla_14341@gmail.com', N'$2a$10$Vuc.ItI1wjN6FA0KgO5i7O/Rh8tjZ8iQeup05ht9L6onrT9xgDZwK', N'Apoderado_Tecla_14341', 1, N'14341357-8 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (134, N'Apoderado_Teodoro_14363@gmail.com', N'$2a$10$P9lgAYJXHFeix171lTq5QupqvOjDoN4oqISfvk82YQkDUWT/GQt0u', N'Apoderado_Teodo_14363', 1, N'14363025-0 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (135, N'Apoderado_Lucas_14370@gmail.com', N'$2a$10$7X1uUpr.xAd/0qKpDIQWQ.M5Y1HZyexP4RJtcVke/sEGwA/QCbBMG', N'Apoderado_Lucas_14370', 1, N'14370588-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (136, N'Apoderado_Eligia_14379@gmail.com', N'$2a$10$bfr0/Rk9kF2A4Jjg7BB9pOhaxSii5Ojn/8Jiem49Z4IK7OrP/7I6u', N'Apoderado_Eligi_14379', 1, N'14379776-7 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (137, N'Apoderado_Cesar_14386@gmail.com', N'$2a$10$GGYLxZk4GDXuCmmF8jKbJumd4yGfkULDQkyjVdpmjZGt9WFruP15m', N'Apoderado_Cesar_14386', 1, N'14386647-5 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (138, N'Apoderado_Dora_14420@gmail.com', N'$2a$10$j3xc9FU6.4gEwFts3ePt7uttkpYp.DuAQeeGcsePtgULqMm3/4dE.', N'Apoderado_Dora_14420', 1, N'14420070-5 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (139, N'Apoderado_Hugo_14422@gmail.com', N'$2a$10$5Tfg83jJ3xNjew5uoX1uZ.ylHtguEZsd5pU850XXMcaaITStt/7VC', N'Apoderado_Hugo_14422', 1, N'14422764-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (140, N'Apoderado_Norberto_14457@gmail.com', N'$2a$10$Mu3IxuQNwr3dUiQv5HJGue1W/DqF98tyeUdAVRj8uhrtkEq4scLKu', N'Apoderado_Norbe_14457', 1, N'14457172-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (141, N'Apoderado_Juan_14462@gmail.com', N'$2a$10$oWta2MllJIlaqgG.EgA4e.nMoDyDlc3rZmCfzn.BjjJaJLsllq0Ai', N'Apoderado_Juan_14462', 1, N'14462369-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (142, N'Apoderado_Adelina_14472@gmail.com', N'$2a$10$3.JD5F09gheGD8VQswU5kOqvArcmKCJOojqM6pjB66ehCIbA8t2HG', N'Apoderado_Adeli_14472', 1, N'14472366-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (143, N'Apoderado_Chuy_14486@gmail.com', N'$2a$10$5Phoh8freMzjwc.60gOk2uKDCbLymmFqU0VG4h8dnU0VCwk1qkqeW', N'Apoderado_Chuy_14486', 1, N'14486694-0 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (144, N'Apoderado_Graciana_14491@gmail.com', N'$2a$10$Z5iCroEvkSwRgZEaphP1A.y3KNXDG.lMSfgBj4hBrDd0huJY1PzOy', N'Apoderado_Graci_14491', 1, N'14491813-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (145, N'Apoderado_Jaime_14501@gmail.com', N'$2a$10$rTY7AaAztjhy7xnj8RIpvOg3N7U.Tdw0VIz7MYI8OKodapzaxhJ3.', N'Apoderado_Jaime_14501', 1, N'14501107-8 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (146, N'Apoderado_Abraham_14509@gmail.com', N'$2a$10$aq.exYJsXBK3cfUTAaBUnOnCLniMJZGpYLph.pdDup8h28fc2LUde', N'Apoderado_Abrah_14509', 1, N'14509486-0 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (147, N'Apoderado_María_14510@gmail.com', N'$2a$10$qw.ljxrl2SaO94t7uInkYeOX15IWgFSUXNrzSyoiLmGL6fDZa4qwy', N'Apoderado_María_14510', 1, N'14510271-5 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (148, N'Apoderado_Gisela_14539@gmail.com', N'$2a$10$tvIbtk2r4rFSKcNJlx1KteSWJbrzi3FHftDibZrhgcp.JFX/fxjZS', N'Apoderado_Gisel_14539', 1, N'14539285-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (149, N'Apoderado_Jordán_14549@gmail.com', N'$2a$10$AZuvWKoAGzw1rvO9cAdK1uOvFbYkrENLku3vLb2HasPNiR6XAZX7i', N'Apoderado_Jordá_14549', 1, N'14549981-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (150, N'Apoderado_Marisela_14554@gmail.com', N'$2a$10$1fd2vizh9AKO.s4z0O2AbuC.EbslicRR499.cYeFRDi/BPSLoxrM.', N'Apoderado_Maris_14554', 1, N'14554230-8 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (151, N'Apoderado_Oriana_14554@gmail.com', N'$2a$10$4nFkBEPZ4puD0ag4EAE5q.oYjrOdTDIUD1Fa.wVymBECzc1q9BqNW', N'Apoderado_Orian_14554', 1, N'14554251-0 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (152, N'Apoderado_Perlita_14567@gmail.com', N'$2a$10$Mw67ervEEXlp4zDcweZwBOeXUVA4JYWjukLjrssRfKUAl2G/k47hm', N'Apoderado_Perli_14567', 1, N'14567934-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (153, N'Apoderado_Ámbar_14574@gmail.com', N'$2a$10$MpJfEuxNz3d0hLA4//isoesmz4MZOxeJSUsPNvfo9tb79A2m/qjca', N'Apoderado_Ámbar_14574', 1, N'14574849-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (154, N'Apoderado_Olga_14598@gmail.com', N'$2a$10$7.wwm1zYX1/0G6098gJDie/X.NTC4TSVHr/Fgx7qO5ZWSJp4u1FoW', N'Apoderado_Olga_14598', 1, N'14598145-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (155, N'Apoderado_Isaac_14605@gmail.com', N'$2a$10$iUIVgvI.hIX8lWHbwQBWJ.h8XrW9czYrSFb6wLkjEJoHDpbxg.HBa', N'Apoderado_Isaac_14605', 1, N'14605101-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (156, N'Apoderado_Roque_14627@gmail.com', N'$2a$10$zEVO5taoAZq5SB3HlGzjUeWvm2LmFKeAhyE7PqdptNrJr4OAHYCcC', N'Apoderado_Roque_14627', 1, N'14627082-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (157, N'Apoderado_Marcia_14628@gmail.com', N'$2a$10$hrifR/3uNeyl9uBWK/7gvOVrMlZucfgl9UzjEv5UK.lI55t7ewmWW', N'Apoderado_Marci_14628', 1, N'14628456-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (158, N'Apoderado_Mireia_14633@gmail.com', N'$2a$10$m25lgnH67Q5vLIvHKI45HefQCdpKQmAEOuQ0PWAP52RFRxAdUoH0.', N'Apoderado_Mirei_14633', 1, N'14633324-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (159, N'Apoderado_Hilario_14645@gmail.com', N'$2a$10$vcuWI4bZ2fRmsxv5ZtoolOObqmKo8xuo0H37ji5q6WtK.wUia27Sa', N'Apoderado_Hilar_14645', 1, N'14645067-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (160, N'Apoderado_Camilo_14645@gmail.com', N'$2a$10$eREaNFcgdPL4f3O8T76jb.nORb70hgBkwfWD4EpeNNq6B8TB7xE1C', N'Apoderado_Camil_14645', 1, N'14645492-5 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (161, N'Apoderado_Dorotea_14656@gmail.com', N'$2a$10$76BmimRURd9zLWEx/LF9IOukyxwdt2.oozUn1lNhlRgZNHSxAo4zG', N'Apoderado_Dorot_14656', 1, N'14656786-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (162, N'Apoderado_Jaime_14661@gmail.com', N'$2a$10$xbD5dUXzHpUTV6A18lzOd.ALsbI/w10g8ZdkNmMuuJ2fhOoYda6ua', N'Apoderado_Jaime_14661', 1, N'14661529-5 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (163, N'Apoderado_Edmundo_14671@gmail.com', N'$2a$10$eAgBp2eocURgbfmY/54s2.GOWbCmrjFyTY3MNuJiNnMsWYvQFK.hC', N'Apoderado_Edmun_14671', 1, N'14671112-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (164, N'Apoderado_Mohamed_14671@gmail.com', N'$2a$10$H1RKWO7FcGx/Kr8lm1P/POAddwFwl64QC.IZXMk5tpqBYYdCF1Pbi', N'Apoderado_Moham_14671', 1, N'14671421-8 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (165, N'Apoderado_Félix_14678@gmail.com', N'$2a$10$n/Nhf4jVTZh1BB0MQvLrouB0T26DFY5FJ/IGhTqjgeVACmNEfMtaO', N'Apoderado_Félix_14678', 1, N'14678670-7 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (166, N'Apoderado_Ángel_14680@gmail.com', N'$2a$10$WyJWvhAc8BMI3Csyntq0qOVcpM8w2.zMi.lx5qPD8OyrhGLK0ojki', N'Apoderado_Ángel_14680', 1, N'14680619-8 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (167, N'Apoderado_Leticia_14686@gmail.com', N'$2a$10$4tQfOQVMjjSQLEOFTyRC9.3kUj8XO4aoV8LRcNVwj9Zk/.UCtiOQa', N'Apoderado_Letic_14686', 1, N'14686507-0 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (168, N'Apoderado_Paca_14694@gmail.com', N'$2a$10$1G1C.aopjYWqgtNcO.v9i.SZbjfXJX7rmdbUd/6VEmorh64qTyuy2', N'Apoderado_Paca_14694', 1, N'14694086-2 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (169, N'Apoderado_Espiridión_14696@gmail.com', N'$2a$10$855G9wAz9UiGAyNDuyZEN.nvzT4fOu/150sAUmcZ0AgZsZ4xxXmku', N'Apoderado_Espir_14696', 1, N'14696505-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (170, N'Apoderado_Jacobo_14709@gmail.com', N'$2a$10$VrspFqKw5KN7ZI9/YpiTTu9z6rEqKkef4TiYRIJ5msPC9fc9Q.aoS', N'Apoderado_Jacob_14709', 1, N'14709163-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (171, N'Apoderado_Domitila_14715@gmail.com', N'$2a$10$u4AVZSrFeoy6d95V5GTKYOP.sRsWoJHmnf9YSSVtLxIboZzgIHy7W', N'Apoderado_Domit_14715', 1, N'14715101-2 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (172, N'Apoderado_Ruy_14753@gmail.com', N'$2a$10$oI3tk9Hynatw.fTykShCeeHf4wusOoTsma0FSPMrUZu4JQAsxmvly', N'Apoderado_Ruy_14753', 1, N'14753433-7 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (173, N'Apoderado_Dionisia_14759@gmail.com', N'$2a$10$D9HNf/dK/FGytWWT/XlyJeuInVdjFBi8c9zGNsPHvNEhy0r536M/K', N'Apoderado_Dioni_14759', 1, N'14759187-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (174, N'Apoderado_Felicidad_14760@gmail.com', N'$2a$10$DbCL4zHvsjerFEs/g5GgWO4W4XQzUG2YH7XLtxnOQHNX84JnBnq8C', N'Apoderado_Felic_14760', 1, N'14760260-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (175, N'Apoderado_Marco_14760@gmail.com', N'$2a$10$fE/dlGXanvIzGZjrcdkJruqIi4zQ10A3NC4mpqsBQuTxiW5MH6a26', N'Apoderado_Marco_14760', 1, N'14760767-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (176, N'Apoderado_Zoraida_14770@gmail.com', N'$2a$10$AOBqLTX8JSWsxjp7mpkA3eQT3i.rvlGqoERHo/k.Vba6Lks2G9OwC', N'Apoderado_Zorai_14770', 1, N'14770207-8 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (177, N'Apoderado_Macaria_14782@gmail.com', N'$2a$10$CpYy.m7yzDrfaCYV4qmSoev.0Ly3d.fkT.Wh.iVivAuY2rwDOA5NO', N'Apoderado_Macar_14782', 1, N'14782495-5 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (178, N'Apoderado_Hermenegildo_14800@gmail.com', N'$2a$10$eTRJubYh80JJCEDE8Wnff.AdFvPX2dicIeI.AEnn2mh2fiR3UlfSu', N'Apoderado_Herme_14800', 1, N'14800687-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (179, N'Apoderado_Merche_14804@gmail.com', N'$2a$10$XBi7QYhicCZ.JXnwwUQ1Iu4XnzURH8qgL.tBbJYxZgO2GO.SIuluC', N'Apoderado_Merch_14804', 1, N'14804677-8 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (180, N'Apoderado_Rosario_14809@gmail.com', N'$2a$10$l/x/5BZnZ243cvwp1g4tjO.EalZf2wTuSYgsU7lW5kRyJPEzrGPKu', N'Apoderado_Rosar_14809', 1, N'14809441-1 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (181, N'Apoderado_Vicente_14814@gmail.com', N'$2a$10$/bZaGAn4J2kj5bv0s2ifDet6jQmq0a/QivN1BxBiGwZiHLWIDsd3C', N'Apoderado_Vicen_14814', 1, N'14814543-1 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (182, N'Apoderado_Zaira_14822@gmail.com', N'$2a$10$x6NQQ0.aRQLkMTa80q6RvOnnu5kRlNTog6ji9ZFTPWPaVn0/FX23O', N'Apoderado_Zaira_14822', 1, N'14822144-8 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (183, N'Apoderado_Fernanda_14828@gmail.com', N'$2a$10$BUHwssaupdxNdp9OWCjxIO1WNrNBh8o52IaPdrPuSwjLgLurytqZy', N'Apoderado_Ferna_14828', 1, N'14828016-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (184, N'Apoderado_Blas_14830@gmail.com', N'$2a$10$/Vf5y7x9CpQJIxtu1745BeC6N0GN86ZQugvTtf8ukkRwurFQJaqGC', N'Apoderado_Blas_14830', 1, N'14830496-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (185, N'Apoderado_Águeda_14838@gmail.com', N'$2a$10$xUytYViCNQ5q..YwH2MVvuXEogtf3L3CENhVDday/0LWKfrNKKZqC', N'Apoderado_Águed_14838', 1, N'14838403-7 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (186, N'Apoderado_Noemí_14851@gmail.com', N'$2a$10$KB9PlxtoQKB6pIvnYYfmfugrCELLgzqOP/6kqv8Xt7/i3cL2QNhme', N'Apoderado_Noemí_14851', 1, N'14851657-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (187, N'Apoderado_Erasmo_14860@gmail.com', N'$2a$10$1vG9qZJ9RLK7VvpfOdQSFeqEgwiizJTG12ad4wntZRi7LetIt8Lka', N'Apoderado_Erasm_14860', 1, N'14860166-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (188, N'Apoderado_Itziar_14883@gmail.com', N'$2a$10$BBX3LCfnumeTmz9pkjXuju1Lq/tKG4RoSRzs/NWE9MbOntlW1pOHu', N'Apoderado_Itzia_14883', 1, N'14883937-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (189, N'Apoderado_Graciana_14917@gmail.com', N'$2a$10$wQrqRYtAZhRhvckDWKa.DeHWyGRGhcvnwpp52Dow/buKCe7voHCce', N'Apoderado_Graci_14917', 1, N'14917382-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (190, N'Apoderado_Clotilde_14923@gmail.com', N'$2a$10$cEH5cZ5gxUSd8NDNwqipAevJRS9Zh18p1pDNyRdO6zoIQfO0SYQTO', N'Apoderado_Cloti_14923', 1, N'14923274-5 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (191, N'Apoderado_Samuel_14926@gmail.com', N'$2a$10$xbDCa1X64ZwznJr.n1MD/e2R/fEqA3BXP9.gLh4mzjVWE2JaPmSTO', N'Apoderado_Samue_14926', 1, N'14926790-5 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (192, N'Apoderado_Emperatriz_14927@gmail.com', N'$2a$10$O6CTDvNCA6gTXLyUZoPQPe9eZX9hiCAAYjbiUnMSinCF3gNbd6XG2', N'Apoderado_Emper_14927', 1, N'14927880-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (193, N'Apoderado_Miguel_14929@gmail.com', N'$2a$10$LbTZpvY7sauR6J3tkEMbfOcIgdYNtFT5KSYeqENJPSWXu6nmBdAhy', N'Apoderado_Migue_14929', 1, N'14929309-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (194, N'Apoderado_Carlota_14934@gmail.com', N'$2a$10$uCD2jfIQuoEGCgSUIbGz1.PyaZUcbzITPSQHZs82iJgbuVis36cUi', N'Apoderado_Carlo_14934', 1, N'14934729-1 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (195, N'Apoderado_Jose_14936@gmail.com', N'$2a$10$Yw8qmy.F9i.pKqT3JryFeukvAnzpAG2IwjhZYvcUW0qOCNeI/O4iO', N'Apoderado_Jose_14936', 1, N'14936387-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (196, N'Apoderado_Priscila_14936@gmail.com', N'$2a$10$PsJv1TWfZI/gvE/x2LdMxeNzNLZMbZeNJEHjZgPUJwna.GFDgZUgS', N'Apoderado_Prisc_14936', 1, N'14936591-5 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (197, N'Apoderado_Juan_14938@gmail.com', N'$2a$10$.NRoGevG5CPgK8rRYuwUXeHIDzffxfIIc8Um5TtCKX3GMCGcijtg.', N'Apoderado_Juan_14938', 1, N'14938591-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (198, N'Apoderado_Andrés_14941@gmail.com', N'$2a$10$DrMWgm9A81ainqP6mnrk1OplkNXDPsQ8pmUBTMQJgfzNKcSqRviDG', N'Apoderado_André_14941', 1, N'14941244-1 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (199, N'Apoderado_Elodia_14964@gmail.com', N'$2a$10$/rrpDonTJFE73x5YQdmtRuN.NjW6bGnMPgQTnzroJe9uGiTfnlPMO', N'Apoderado_Elodi_14964', 1, N'14964175-0 ', 1)

INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (200, N'Apoderado_Daniel_14965@gmail.com', N'$2a$10$7YnSkG.BiXxC7MMepQOIwuXhI4FY/Cwcozq.eQItufXUa697WdIaW', N'Apoderado_Danie_14965', 1, N'14965443-7 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (201, N'Apoderado_Ascensión_14988@gmail.com', N'$2a$10$kWZbMtetVREw.f44C..NjOSXUYnb5VmuliBYF9jQLaID46/xe7DRG', N'Apoderado_Ascen_14988', 1, N'14988821-7 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (202, N'Apoderado_Julián_14999@gmail.com', N'$2a$10$VKW7ZhS38GzE22LJ6VNo/uPgFOD9oxF8H/t/hbmyMr0LE7UA4sf4i', N'Apoderado_Juliá_14999', 1, N'14999507-2 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (203, N'Apoderado_Cayetano_15009@gmail.com', N'$2a$10$2KC1rdDDJ2ay0XDbpKr8LuFUwGPfOykavxl9fbm6IwV9S6ghBrOom', N'Apoderado_Cayet_15009', 1, N'15009257-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (204, N'Apoderado_Roxana_15013@gmail.com', N'$2a$10$L1yEb1jDSbGwXrzkoPe1/eVW7r9ua1QI/Bmyytd0WuDp6myZ4hmGe', N'Apoderado_Roxan_15013', 1, N'15013289-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (205, N'Apoderado_Armando_15016@gmail.com', N'$2a$10$V04TdbT1XNq08lbFW9R0gOT.FztUcO0xvcFEe8luKcker5p7QvWQW', N'Apoderado_Arman_15016', 1, N'15016763-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (206, N'Apoderado_Lupe_15021@gmail.com', N'$2a$10$X5MtvPN0SeZxmG3J6sKlrOhDexe2g0/.ADhcez249l5qLMzyLqOou', N'Apoderado_Lupe_15021', 1, N'15021905-1 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (207, N'Apoderado_Sosimo_15023@gmail.com', N'$2a$10$gNGwHu2NGdAaWcdsjP8XqeB9lm3Rqo5hHA1rqSNH1pEVIN.awvJXO', N'Apoderado_Sosim_15023', 1, N'15023801-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (208, N'Apoderado_María_15028@gmail.com', N'$2a$10$tpYvy5vTMP7tBr4p0KGzEek0XpWVdwlMlJUhhZlf8Kimm9Hxk7kNi', N'Apoderado_María_15028', 1, N'15028253-5 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (209, N'Apoderado_Moisés_15043@gmail.com', N'$2a$10$fcPnBGCHOvv11OP3fgVRQeElUlPHjXFPywImEzTSp8vpUbM6jUT3.', N'Apoderado_Moisé_15043', 1, N'15043360-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (210, N'Apoderado_Mireia_15062@gmail.com', N'$2a$10$pSEEp1KQqzuh4/N2q.IoS.n8F0PBo3IJ6IfgOiLW80.n0WbxNmcd2', N'Apoderado_Mirei_15062', 1, N'15062275-1 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (211, N'Apoderado_Basilio_15071@gmail.com', N'$2a$10$I3rkfNTEg/JTk4V169Ta9uAHZV4AWqj4qAIzMl8pJS2mSm9/t88QW', N'Apoderado_Basil_15071', 1, N'15071585-7 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (212, N'Apoderado_Reyna_15084@gmail.com', N'$2a$10$PXH6CzUQIKhneShZJFFsxuDlS0qTs9yc81lS/ZXSbuNGzBTnBBX.m', N'Apoderado_Reyna_15084', 1, N'15084210-7 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (213, N'Apoderado_Ascensión_15087@gmail.com', N'$2a$10$8XdpwviYCmFSwaAYJWpB6.E1jfFgvdODBsU.tAfFelBaUNK0bG11e', N'Apoderado_Ascen_15087', 1, N'15087728-8 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (214, N'Apoderado_Hortensia_15091@gmail.com', N'$2a$10$mG2cBP83hbd6ng2qANC24eauaZEKwJ1QP8wJ3Xb5OydNp4sYcbixa', N'Apoderado_Horte_15091', 1, N'15091385-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (215, N'Apoderado_Segismundo_15093@gmail.com', N'$2a$10$vwmjj.VuM3uhUjPwBYMeoOJ/m0hJQ/9GUnZa1KfZEMMGjQXu7TVy.', N'Apoderado_Segis_15093', 1, N'15093745-0 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (216, N'Apoderado_Olivia_15098@gmail.com', N'$2a$10$wYM5zkV63IW5BfL6FltAuuzctDcq5kjG1ZV9/I0hHwHf1ix2zN02K', N'Apoderado_Olivi_15098', 1, N'15098921-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (217, N'Apoderado_Ignacia_15103@gmail.com', N'$2a$10$HY/V9LPhVbBSDIjv29K6e.igZ4sxpM.XkymlEZfJSo8P3qsXPwbN6', N'Apoderado_Ignac_15103', 1, N'15103188-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (218, N'Apoderado_Víctor_15110@gmail.com', N'$2a$10$tOttNj1anF/f/YZF6o9Wt.9G9mMEhv0QWHD0yjRiCfRcwy4GvfKUm', N'Apoderado_Vícto_15110', 1, N'15110295-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (219, N'Apoderado_Luis_15120@gmail.com', N'$2a$10$fzoJERRZAYkODUxURUFZpuSCcFqpXIb.kX8KcSI4cl8CJh0MKIhqW', N'Apoderado_Luis_15120', 1, N'15120096-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (220, N'Apoderado_Charo_15124@gmail.com', N'$2a$10$TuHTl8UqqMzTynhn4b9h5eildOM6rx2EztgPDdjL.kUCK3m6l./Be', N'Apoderado_Charo_15124', 1, N'15124284-7 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (221, N'Apoderado_Tomasa_15135@gmail.com', N'$2a$10$wqWM6vkbwJB8E92WMKegm.srucBtnGAFoT6Cspu4xqs1CcUW.StKm', N'Apoderado_Tomas_15135', 1, N'15135848-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (222, N'Apoderado_Micaela_15149@gmail.com', N'$2a$10$E2K9u9rGVVGfhJS4/iTZrO6s/rkbPHQCC.3tIzV8xeI1jlAsf8mfK', N'Apoderado_Micae_15149', 1, N'15149866-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (223, N'Apoderado_Diego_15153@gmail.com', N'$2a$10$pET6cOtaal1sjIsxFimpdeV5ms0kIaZmAYs/TTM0vG5N6LxeeXcDW', N'Apoderado_Diego_15153', 1, N'15153256-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (224, N'Apoderado_Ximena_15158@gmail.com', N'$2a$10$s67srBb9JswnBB1yhWO3B.HvnWKCnpaXdnfGY7MGhFdVvnF4Yuumi', N'Apoderado_Ximen_15158', 1, N'15158590-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (225, N'Apoderado_Berto_15160@gmail.com', N'$2a$10$kA6JccCGP3ayUoEstWI4FuWSDOLf3.zrhqFsfr4NgqPgSCp62Bcu.', N'Apoderado_Berto_15160', 1, N'15160344-0 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (226, N'Apoderado_Modesto_15161@gmail.com', N'$2a$10$bfpF2caUHillW./Km5GS6eYBxAH2X162xiA8MKOIh7HbprHML0iS6', N'Apoderado_Modes_15161', 1, N'15161490-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (227, N'Apoderado_Bernabé_15166@gmail.com', N'$2a$10$JA1Hdn4sYQRZJWkFnzGKiuKTpHmnuTGWCqaqXt5OSDCKAjFLs6Ly2', N'Apoderado_Berna_15166', 1, N'15166715-5 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (228, N'Apoderado_Asunción_15172@gmail.com', N'$2a$10$2ogIcZZEgKmVriOVl2cbqumrmbiCVkbGj/BJaCj1tHk73ZmkABBIC', N'Apoderado_Asunc_15172', 1, N'15172797-2 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (229, N'Apoderado_Pascual_15199@gmail.com', N'$2a$10$XCB01VelH8DBFzyThT.f2.lIp9M/sESm09klUbFXFLc7NI/La0vM.', N'Apoderado_Pascu_15199', 1, N'15199194-7 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (230, N'Apoderado_Régulo_15201@gmail.com', N'$2a$10$qWw5NU.rXnl3XW4nxF522uwsgo5S7HfGZWCT55mxEMsy78pht8IsO', N'Apoderado_Régul_15201', 1, N'15201587-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (231, N'Apoderado_Edelmiro_15212@gmail.com', N'$2a$10$xW4jsRzmKQ4wH0NsgSeh7u9wnMMTgMVo8BQaw/0LR/ccIkI1nau42', N'Apoderado_Edelm_15212', 1, N'15212839-8 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (232, N'Apoderado_Ale_15229@gmail.com', N'$2a$10$eV//rtTiOJWXthmO9n2LMOwO1zOVx.VFPy6aFNHWkcuMJdpSr0yle', N'Apoderado_Ale_15229', 1, N'15229771-8 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (233, N'Apoderado_Manu_15240@gmail.com', N'$2a$10$UeJkfFl0QoiyyPF2JbO8j.yYfmgrmr8MFiZIKGs5nFbZi6sjJZo5K', N'Apoderado_Manu_15240', 1, N'15240538-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (234, N'Apoderado_Fidela_15248@gmail.com', N'$2a$10$hCwubblqkZL2A1fJEFd8puQVvqKqaVTT/Ce/l49kM7nqJlPWDf.mO', N'Apoderado_Fidel_15248', 1, N'15248739-8 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (235, N'Apoderado_Jose_15264@gmail.com', N'$2a$10$WPFjzljFKvi.Ap7BNeMxzOGayePN4sc.mNerfQdgmekvSjB6dJ1FS', N'Apoderado_Jose_15264', 1, N'15264344-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (236, N'Apoderado_María_15268@gmail.com', N'$2a$10$ic7hu4TXDet0GwgGDSFv1ei.Qcpv5gpyfsecqM32UaVdJKy3oaqfG', N'Apoderado_María_15268', 1, N'15268105-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (237, N'Apoderado_Isabel_15268@gmail.com', N'$2a$10$Mgr/GWquu7hHk35vCXRlz.Ba9ACzpr1BZp.DCTJ7x0zOm.NGnEX.m', N'Apoderado_Isabe_15268', 1, N'15268163-1 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (238, N'Apoderado_Perlita_15273@gmail.com', N'$2a$10$WBLB6xL1gg2xk/AYIMopUu4HhogxXNMwcliBm1LnTwcLeK8OUjjai', N'Apoderado_Perli_15273', 1, N'15273230-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (239, N'Apoderado_Marciano_15299@gmail.com', N'$2a$10$fNlbAWRq8ZqQ8w4Rc3oMBO7A4NWRonHLL7Ged3jRgNlwTMHEYJsl.', N'Apoderado_Marci_15299', 1, N'15299339-0 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (240, N'Apoderado_Cleto_15303@gmail.com', N'$2a$10$4FamnDC6pspbo04i5M5vI.blIir/v5BPWdQqDN36Gql8H/Qht0Lk6', N'Apoderado_Cleto_15303', 1, N'15303918-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (241, N'Apoderado_Emilio_15332@gmail.com', N'$2a$10$I0FC.jrMs5.kRmqh33dtn.Jkhjgc4AoZHcAhMBLYxBdahSbKdBalO', N'Apoderado_Emili_15332', 1, N'15332885-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (242, N'Apoderado_Gustavo_15348@gmail.com', N'$2a$10$su5SKhza6GJ0eTSQk5OgKOtQV2QojmA2P8gtDezEesDDke9dsK0B.', N'Apoderado_Gusta_15348', 1, N'15348005-2 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (243, N'Apoderado_María_15354@gmail.com', N'$2a$10$LnqhPlqIIfqGFoYUNXbIweh9HS6rrebyW/YvK3yo6VqCM.afPEFQe', N'Apoderado_María_15354', 1, N'15354132-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (244, N'Apoderado_Eloísa_15354@gmail.com', N'$2a$10$uO2/6mqrEwZ.8FHH7N3M4eMPDev5v7E3mRJU3l3A30U5aHirMhWrm', N'Apoderado_Eloís_15354', 1, N'15354372-0 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (245, N'Apoderado_Ángel_15368@gmail.com', N'$2a$10$PM28VrQ/n59IlaELb7ZMS.6TMKjMbty/3Jyuee9vbNglgnZO2eXLW', N'Apoderado_Ángel_15368', 1, N'15368061-2 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (246, N'Apoderado_Lupita_15370@gmail.com', N'$2a$10$6aqgNYfo8EnbJfJ6a5wUgeOtk9SODNJpuyZWGiKKJ.ZruYg/wJ2K2', N'Apoderado_Lupit_15370', 1, N'15370774-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (247, N'Apoderado_Iris_15383@gmail.com', N'$2a$10$FFK.WpIonJkv7VCL1qcmnOq6S2wb9ABpGo86wgC.owZLMgTqVYDsG', N'Apoderado_Iris_15383', 1, N'15383436-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (248, N'Apoderado_Filomena_15400@gmail.com', N'$2a$10$djWw1h2vmzvfgnZc5DgSUeINh8TIPKwbmffiohjlGynB0ehcJVLCi', N'Apoderado_Filom_15400', 1, N'15400857-8 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (249, N'Apoderado_Vera_15405@gmail.com', N'$2a$10$up1q4K6Q42rQE15TUPVwPuaL60iUpkTXRf8WvTdlfhJ4NcFxKLcDW', N'Apoderado_Vera_15405', 1, N'15405104-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (250, N'Apoderado_Máximo_15411@gmail.com', N'$2a$10$9zcYgRmQkwPy8APClIExxemIYvcsQC.1Kq.a5R/ZhIFtuEQNK.91i', N'Apoderado_Máxim_15411', 1, N'15411010-0 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (251, N'Apoderado_Aarón_15426@gmail.com', N'$2a$10$n4WibBnRzl/0FKzlNVrcJOEVJFffwRlpUFJIkd4wmTx1BSJilPVhm', N'Apoderado_Aarón_15426', 1, N'15426643-7 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (252, N'Apoderado_José_15431@gmail.com', N'$2a$10$u5Ymf/swvsAm3/4/84/Pb.jL6.SPOGn5hnPyEtecdhio76shduVJG', N'Apoderado_José_15431', 1, N'15431892-5 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (253, N'Apoderado_Anastasio_15454@gmail.com', N'$2a$10$HvIE3KpmcM.7BIl9nBrHPuGn5fK8tPFWJWZZHAzQStJKI8HX.mOQ6', N'Apoderado_Anast_15454', 1, N'15454085-7 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (254, N'Apoderado_Flavia_15469@gmail.com', N'$2a$10$9HsNNDfMk/SZt0nvjIeUrOKIT8s4R/NUYwTpF3Rwa9/ZJ2LgRjLL2', N'Apoderado_Flavi_15469', 1, N'15469561-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (255, N'Apoderado_Margarita_15475@gmail.com', N'$2a$10$4t2rSFUKjXW53gGW1Pf3FOeF9EFtFTlCQbpk6QVOSRnb3qldhswee', N'Apoderado_Marga_15475', 1, N'15475600-0 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (256, N'Apoderado_Casandra_15477@gmail.com', N'$2a$10$zlHvp7o2Up/99zEiyau8Juep.zMTtHAYnoH75e4YT.I8JoD/fqIT6', N'Apoderado_Casan_15477', 1, N'15477960-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (257, N'Apoderado_Amelia_15478@gmail.com', N'$2a$10$.jOSS.RovCROdqRXRxYnb.77MUd6l3Lq1D7aBcmUvt6rkdfFO0kyK', N'Apoderado_Ameli_15478', 1, N'15478142-0 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (258, N'Apoderado_Armando_15478@gmail.com', N'$2a$10$.gVRpt/TVGvaq.6GgrubJOoJ7veHddtMuSrVSiU0RPScR0eK9rDT.', N'Apoderado_Arman_15478', 1, N'15478674-0 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (259, N'Apoderado_Omar_15486@gmail.com', N'$2a$10$6IwK7XTzHLQUQcaca9saAuUsX/x2Snrg7WxGo2v1bJY2oXSkw.dRe', N'Apoderado_Omar_15486', 1, N'15486035-5 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (260, N'Apoderado_Candelario_15496@gmail.com', N'$2a$10$fRMYbEmJXCPMeIWe9/5Ltuiruy.3cINE98plHDBFaebxKmiL15rG6', N'Apoderado_Cande_15496', 1, N'15496912-8 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (261, N'Apoderado_Isidro_15497@gmail.com', N'$2a$10$3uuGka5IiyGYq8rpb4Y4sOU8p3La6e6VnDjjwuYuKEKZEN0pkbrx6', N'Apoderado_Isidr_15497', 1, N'15497259-5 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (262, N'Apoderado_Catalina_15516@gmail.com', N'$2a$10$JyA1TT6TDsxSftkKKsyA1eSqduWWr1lg1aS9hLiugd4mU4jzIaxXG', N'Apoderado_Catal_15516', 1, N'15516987-7 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (263, N'Apoderado_Flor_15521@gmail.com', N'$2a$10$07UCixa0CaHuRYoEz/Unl.u.00C1ZikZTZQmFZ7t8AdZEXzRMYD3K', N'Apoderado_Flor_15521', 1, N'15521004-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (264, N'Apoderado_Delfina_15532@gmail.com', N'$2a$10$wox6q/qFVBrDtKXctGh.zOvJkrqKW5721USqdmw3ZI.dTNdp8oXpm', N'Apoderado_Delfi_15532', 1, N'15532803-7 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (265, N'Apoderado_Pelayo_15534@gmail.com', N'$2a$10$Rl46HaVeciroLj8A1zVC5.3ZrczRn.YyMCwnGe4OSjDHEJc5KxhiK', N'Apoderado_Pelay_15534', 1, N'15534518-7 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (266, N'Apoderado_Leyre_15535@gmail.com', N'$2a$10$D3UkFE6iEb5D/JmadM9n.e5bluyzB1NrVdaaz.Ijc7hsRz6NscjV.', N'Apoderado_Leyre_15535', 1, N'15535291-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (267, N'Apoderado_Nazaret_15535@gmail.com', N'$2a$10$QJQeDJEDWX97xhVr76DnIOCuNhEgyYg7V0tWy7lsbIr9BD244DHA2', N'Apoderado_Nazar_15535', 1, N'15535399-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (268, N'Apoderado_Teodoro_15543@gmail.com', N'$2a$10$zLja8Ze5IP2/uQxHxIqskuHg5/jsTjf2SKrWLYOaRdgoO3tAJsQi6', N'Apoderado_Teodo_15543', 1, N'15543512-7 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (269, N'Apoderado_Aníbal_15556@gmail.com', N'$2a$10$pi1Ykdd31VFaP5ny4yz78uWEljW8wylss8xwec3Tq.x1hLS7QBSti', N'Apoderado_Aníba_15556', 1, N'15556118-1 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (270, N'Apoderado_Pepita_15560@gmail.com', N'$2a$10$ocLpRdx9mXPlvd4usl/3Xem7gkkKvp.yfr5LgmMjWUlE.RD7gDd5S', N'Apoderado_Pepit_15560', 1, N'15560302-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (271, N'Apoderado_Noelia_15565@gmail.com', N'$2a$10$qVNe/69ZJZ427cDs5JZCROt41ux10s0kKridcbOnfw/5WYaZEdCz.', N'Apoderado_Noeli_15565', 1, N'15565853-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (272, N'Apoderado_Magdalena_15567@gmail.com', N'$2a$10$eFulnIpI3QwkNIGKrv/NE.ZAK5dNcARlADYEen23ZeE7bujqYjw9K', N'Apoderado_Magda_15567', 1, N'15567123-8 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (273, N'Apoderado_Rosario_15575@gmail.com', N'$2a$10$UiB2nI8lRNIDh4l36i9mseRUUoITkNDsMYq5ZbpwFxY93p0OeH7Fy', N'Apoderado_Rosar_15575', 1, N'15575064-2 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (274, N'Apoderado_Guillermo_15586@gmail.com', N'$2a$10$3uNAnOBiLE5UpwToAVJV7.C4ayWFZSOKKbp73nHml3yFFgXdidLAy', N'Apoderado_Guill_15586', 1, N'15586228-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (275, N'Apoderado_Otilia_15593@gmail.com', N'$2a$10$dWvWZjtEUHfJ0NJBu0v5veFIrO3vp0YnehcuGpzZbC9Ui2IGfnAFW', N'Apoderado_Otili_15593', 1, N'15593079-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (276, N'Apoderado_Jesusa_15601@gmail.com', N'$2a$10$85VHmVucrcZ0tzffRjybcekwSmSKQ8pkB9ElhUlqY9B3Z/EaJtRzi', N'Apoderado_Jesus_15601', 1, N'15601153-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (277, N'Apoderado_Paula_15609@gmail.com', N'$2a$10$WYftwGywV1ITDXC1glE3TenCBbTlTUvfUM87wYOhrzcSwt2K0xqC.', N'Apoderado_Paula_15609', 1, N'15609722-5 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (278, N'Apoderado_César_15614@gmail.com', N'$2a$10$WaysLSdbkdeyfO5KkHFxIuCfIgUe0B7s.aW/lZL3xtoI3tsNL4cW2', N'Apoderado_César_15614', 1, N'15614408-8 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (279, N'Apoderado_Aroa_15617@gmail.com', N'$2a$10$nzH.48X7KXSgkD9egA7LmO5kcYjekSWyLFNT5piPYQsNo4OdBR6Si', N'Apoderado_Aroa_15617', 1, N'15617091-7 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (280, N'Apoderado_Anunciación_15630@gmail.com', N'$2a$10$eUkYej8SSx6sE9NBG1s2ueER7S.MFTl.gBdGw9ZxUohx06ahDgRJ6', N'Apoderado_Anunc_15630', 1, N'15630700-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (281, N'Apoderado_Mirta_15640@gmail.com', N'$2a$10$gn90.vvm2jG0EOZQ8KzZkuGTgxZOoMnRYuE9uAAAvb/A7G2jf6LIC', N'Apoderado_Mirta_15640', 1, N'15640102-1 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (282, N'Apoderado_Salvador_15652@gmail.com', N'$2a$10$j6pOASNQID9U.9P0i7Jfc.qjMXxNIvrATx5gjE4259aHSWSEx1T0m', N'Apoderado_Salva_15652', 1, N'15652002-0 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (283, N'Apoderado_Xavier_15671@gmail.com', N'$2a$10$WSfwzpYP4NdNmcGOoylqJ.mcp3DZwGW5yJ02LopAEXMuNCNuNc0a2', N'Apoderado_Xavie_15671', 1, N'15671466-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (284, N'Apoderado_Lina_15673@gmail.com', N'$2a$10$BogOGpQ7m/1kS.NlTTan3Ol4dPNWiy6IVoysviQ2u4jyKSLngRO9a', N'Apoderado_Lina_15673', 1, N'15673055-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (285, N'Apoderado_Teo_15691@gmail.com', N'$2a$10$ShnppfkqBzU.uuWGmwbznerQplODRhfiX8RswUhRrzbECPJVpqPX6', N'Apoderado_Teo_15691', 1, N'15691444-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (286, N'Apoderado_Evita_15706@gmail.com', N'$2a$10$LmohxDQVK6OInZ7sZXECkuu6CGCiotWyex31SJ3CBj6cGDSQA2a2C', N'Apoderado_Evita_15706', 1, N'15706420-7 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (287, N'Apoderado_Tristán_15709@gmail.com', N'$2a$10$fp9lFu0XDnj3pYB6ut4Hcue01REGtoGYNTRzYU/dYoOHrTZm8PyoW', N'Apoderado_Trist_15709', 1, N'15709080-1 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (288, N'Apoderado_Nadia_15709@gmail.com', N'$2a$10$eebUTKPqr7YbkOFwD72OBeuuJmzCheZFsdlImKMG0jE3GuvvOMWm6', N'Apoderado_Nadia_15709', 1, N'15709726-1 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (289, N'Apoderado_Trinidad_15727@gmail.com', N'$2a$10$LsUDMFrWflkMZc6adxZdaOkQh2sf1CO0YxsJ4qd.qbSXPF2Vhre7.', N'Apoderado_Trini_15727', 1, N'15727523-2 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (290, N'Apoderado_José_15728@gmail.com', N'$2a$10$Zx3f7cNqtcQR8oCvhuKX6eES5.hQ.qyyBDD2pM7b4ySYFzp93dKN.', N'Apoderado_José_15728', 1, N'15728824-5 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (291, N'Apoderado_Concepción_15735@gmail.com', N'$2a$10$UXGKi0kYipWoxky7hZtEgea7DX9YcD3q.NQ8Kg1KsR4D7BHRVdbYG', N'Apoderado_Conce_15735', 1, N'15735595-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (292, N'Apoderado_Lupe_15759@gmail.com', N'$2a$10$WogoTY5ZAIw26ZmvE5vVTu2VZzUNRv0fzaxp4eQCZyEL/uaXBPsAm', N'Apoderado_Lupe_15759', 1, N'15759200-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (293, N'Apoderado_Natividad_15770@gmail.com', N'$2a$10$xuQUw9v2v./4ryZLVHzPYu3QyySBT.AVwBX62yUfDfbHhH7O45aWO', N'Apoderado_Nativ_15770', 1, N'15770343-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (294, N'Apoderado_René_15783@gmail.com', N'$2a$10$dwpOJ/CWiae4v3ixHL0aP.At7PoPoCfZAUhpq9VZmCghfOiNQHnnq', N'Apoderado_René_15783', 1, N'15783910-1 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (295, N'Apoderado_Lidia_15804@gmail.com', N'$2a$10$XqdQqH57qRNC.9ObexQwben0P272B/Q8gjJb0ODho0Zx30as17qly', N'Apoderado_Lidia_15804', 1, N'15804963-5 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (296, N'Apoderado_Luis_15815@gmail.com', N'$2a$10$9OpaW4uR0f4AtLqwWQ7hxey6u2Tsy.rE3CfH/hFS2gPG0mRHuDaSm', N'Apoderado_Luis_15815', 1, N'15815361-0 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (297, N'Apoderado_Adora_15817@gmail.com', N'$2a$10$ur4vUZ79Q/VPZoiC4M5b6.QkAJVl7IMW4Uxv4K1rzL34XAMcGU5fW', N'Apoderado_Adora_15817', 1, N'15817798-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (298, N'Apoderado_Jordi_15827@gmail.com', N'$2a$10$pTbAoYv9GwwJiPIUJ/PFyeGKvpA/jPs8NrTOe1ZvpnkYVB82l4Kya', N'Apoderado_Jordi_15827', 1, N'15827041-2 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (299, N'Apoderado_Tiburcio_15833@gmail.com', N'$2a$10$Zm/dsrKX0DZcHn7/wghKL.kF242u050mR4TZ6IECj1K2NG2MSPIIe', N'Apoderado_Tibur_15833', 1, N'15833885-8 ', 1)

INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (300, N'Apoderado_Raimundo_15845@gmail.com', N'$2a$10$2FlYEGXxawrU9hSJmvvZXuQmF6g4quwLql50jvQZF0MnGpyXhkgOa', N'Apoderado_Raimu_15845', 1, N'15845559-5 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (301, N'Apoderado_Liliana_15852@gmail.com', N'$2a$10$exuduoux231Mra39Klc/f.u29Yhyo5/wb3MF/qMvmZG7zYQ89G/yu', N'Apoderado_Lilia_15852', 1, N'15852575-5 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (302, N'Apoderado_Vicenta_15897@gmail.com', N'$2a$10$UJDHJzG6yoAo7.TGApEW1eY/T4nrQUP2SNWrpT6nVArINfF57kpt6', N'Apoderado_Vicen_15897', 1, N'15897578-5 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (303, N'Apoderado_Natalia_15918@gmail.com', N'$2a$10$NftmqXgX5scdW3FJ0nrxFOb.hI6aqHiEtBw66RcbejAdU0uON61rm', N'Apoderado_Natal_15918', 1, N'15918157-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (304, N'Apoderado_Ovidio_15921@gmail.com', N'$2a$10$qh1nKeyG7aETqZSgUX38OOK3M7P5wfONBXek21D2tPM0wdiacED/2', N'Apoderado_Ovidi_15921', 1, N'15921217-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (305, N'Apoderado_Teodora_15931@gmail.com', N'$2a$10$GOFL1ImpTGWYHITTVYcGduQ/92lcfPpPC05vVv.KoiZYn.KIF5jZi', N'Apoderado_Teodo_15931', 1, N'15931750-1 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (306, N'Apoderado_Sebastián_15931@gmail.com', N'$2a$10$/4nBNkEvknt71EvL4FEU3.W5iYfrh5KoqHg0Q/AGkxPcv396pSlXK', N'Apoderado_Sebas_15931', 1, N'15931800-1 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (307, N'Apoderado_Edelmiro_15933@gmail.com', N'$2a$10$nAv.I4z/K7Mn3RVRAK7vweWojik1yyMqdeNqyv8Yh/5H6FB6EnSQa', N'Apoderado_Edelm_15933', 1, N'15933801-0 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (308, N'Apoderado_Severino_15949@gmail.com', N'$2a$10$q/IDvmkz3lbVQee3DvWSuOa97jTfeyN0mUqUTcPbX14E1EmdmChUK', N'Apoderado_Sever_15949', 1, N'15949539-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (309, N'Apoderado_Jorge_15961@gmail.com', N'$2a$10$zOfBdLHEFMfhN74Qjrqg3e3NKUylorXWbAaUqE2u91/zrX.bIbHQa', N'Apoderado_Jorge_15961', 1, N'15961213-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (310, N'Apoderado_Heliodoro_15973@gmail.com', N'$2a$10$WNzBC7Eiispylp/btATIC.XhNLD.tgTK2M/3r.iO9FZc8JseDxaGS', N'Apoderado_Helio_15973', 1, N'15973612-1 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (311, N'Apoderado_Reyes_15981@gmail.com', N'$2a$10$eJqswj64cj8CbmYPnUhFJ.xXZyyJrdXCIfTTOImQOcHv9ywCgQ0Mq', N'Apoderado_Reyes_15981', 1, N'15981886-1 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (312, N'Apoderado_Rosalina_15986@gmail.com', N'$2a$10$hBqCtH7nNO5MlD59WhsuxeWRhNi7fr8WZu0nzMQg.0t9z9zzO4bFK', N'Apoderado_Rosal_15986', 1, N'15986829-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (313, N'Apoderado_Plácido_15994@gmail.com', N'$2a$10$xiTJ.ZBD68ZoBlD4i0SZs.6zPP4.7Fuj2Myfn9Fe5j0GZXhMRzLH6', N'Apoderado_Pláci_15994', 1, N'15994883-8 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (314, N'Apoderado_Ovidio_16002@gmail.com', N'$2a$10$qxdofMuhtGiTZhKIs2jiTeaUs2GmaCaFybsjoVNFoXbYGOvdoyZD6', N'Apoderado_Ovidi_16002', 1, N'16002603-0 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (315, N'Apoderado_Dora_16020@gmail.com', N'$2a$10$dU1hNoUP20/LryTBdhdFJ.5D97n6S2oKE4BBuCWS0BlEr.cJtY62S', N'Apoderado_Dora_16020', 1, N'16020148-7 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (316, N'Apoderado_Ildefonso_16027@gmail.com', N'$2a$10$J.N05YP5LBeQRZ6F5HCYB.L17dGSEAynK9b59cFKfm1YnfVxC7.ry', N'Apoderado_Ildef_16027', 1, N'16027923-0 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (317, N'Apoderado_Manu_16046@gmail.com', N'$2a$10$WpewavMy/Ejpnnh6qqw9Me/E2mXQDk/Pjpwk5mkOEJaLaUUreOoky', N'Apoderado_Manu_16046', 1, N'16046570-0 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (318, N'Apoderado_Lisandro_16046@gmail.com', N'$2a$10$QwO4SYyDkfLgYA2EFO/lxetvXoN/MChKuDTGN/8cG0gRfUK7VNYhW', N'Apoderado_Lisan_16046', 1, N'16046712-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (319, N'Apoderado_Rolando_16052@gmail.com', N'$2a$10$Hba6pSitaakt20SOIeXqm.XnDi0U6L3Q7/ErsblkNYft0EQkj05QO', N'Apoderado_Rolan_16052', 1, N'16052260-7 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (320, N'Apoderado_Juan_16090@gmail.com', N'$2a$10$tH5U8.tRbAiJfw69GwkAx.kPoWp6Vxg9VsKmEclPuQUwPSBCjBnne', N'Apoderado_Juan_16090', 1, N'16090908-0 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (321, N'Apoderado_Anunciación_16110@gmail.com', N'$2a$10$n1emyZrfOAdmrFeFPrF1futwkIQSpd7I1HBRIidFOyGz66J2Tkgky', N'Apoderado_Anunc_16110', 1, N'16110739-5 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (322, N'Apoderado_Luisa_16140@gmail.com', N'$2a$10$fGUJ84E6lhh8x.EZfKmmGeVSqEHMvaEJ87ZWvvEycKQIJxbJUpTLu', N'Apoderado_Luisa_16140', 1, N'16140312-1 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (323, N'Apoderado_Rolando_16152@gmail.com', N'$2a$10$NP3lu07WrnAJKfw2sPoDt.qoOvwXUuyfysxIf4GcniR.NkTEmo2l.', N'Apoderado_Rolan_16152', 1, N'16152457-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (324, N'Apoderado_Eugenio_16157@gmail.com', N'$2a$10$JmPDgVKtRFFNyQuBvNqHPeknt/H3ZJKTQn5oFigUeGIutlsZOFyWe', N'Apoderado_Eugen_16157', 1, N'16157921-1 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (325, N'Apoderado_Martirio_16158@gmail.com', N'$2a$10$JgWPxwoZ2H3dTpdEByhozuTof2Qg3UGc5yN/6GWv7g9bVjXT8le6K', N'Apoderado_Marti_16158', 1, N'16158212-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (326, N'Apoderado_Timoteo_16200@gmail.com', N'$2a$10$csVfb/MOyQAtGtQCiLDIKOq6airQ/wU2SIHRF9wWHMuh085Xe5L1m', N'Apoderado_Timot_16200', 1, N'16200275-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (327, N'Apoderado_Ezequiel_16200@gmail.com', N'$2a$10$53ni9Czg/mipoEODKByMVOK2tzqvHJlAS4Qiz3bz/PoyD8Vwtt6Dm', N'Apoderado_Ezequ_16200', 1, N'16200926-5 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (328, N'Apoderado_Guillermo_16208@gmail.com', N'$2a$10$16PSkWYQ7ZZqtVD9b/AfDuQTjndTikHOsbhMbt5FhcWh8IrLmCKXS', N'Apoderado_Guill_16208', 1, N'16208187-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (329, N'Apoderado_Espiridión_16219@gmail.com', N'$2a$10$NnGNpJioslG8YSg.EXxEmugFTuXe3j2rdevtzac55WwH3o9UQan/y', N'Apoderado_Espir_16219', 1, N'16219843-2 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (330, N'Apoderado_Irene_16243@gmail.com', N'$2a$10$x9.DMRHHAMrvR4q/IdKOKOMZs6WoNAKlXXj1NhRSVkzy8iTh1wNUS', N'Apoderado_Irene_16243', 1, N'16243986-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (331, N'Apoderado_Micaela_16254@gmail.com', N'$2a$10$0.4MjA0qDf2AIpUONJcTqO2WYEQSppltIPcY0Qa/ZfcJnpH5eYmHa', N'Apoderado_Micae_16254', 1, N'16254652-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (332, N'Apoderado_Gema_16265@gmail.com', N'$2a$10$bahBozujYuiT2endFlVKWeL/ax6YbLJuzjWbchk.XqdpiX/Oef4ju', N'Apoderado_Gema_16265', 1, N'16265458-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (333, N'Apoderado_Agustina_16269@gmail.com', N'$2a$10$T0N4jDSrVlY.EBVOpsrUZeJM3Ck5b67p1mhj/mtoBjWH.HKGw.bXu', N'Apoderado_Agust_16269', 1, N'16269763-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (334, N'Apoderado_Vasco_16275@gmail.com', N'$2a$10$.gfbCCe091.GOTmtJ4mVWevGhsYmeReeVbKJClOiFy0ASNM/4aUSO', N'Apoderado_Vasco_16275', 1, N'16275663-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (335, N'Apoderado_Visitación_16283@gmail.com', N'$2a$10$IjE/ngTfbZ5UqkwEMHfO..5/BQLA/0iAr52WxdVAk1OaswLM.BrEG', N'Apoderado_Visit_16283', 1, N'16283289-1 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (336, N'Apoderado_Perlita_16293@gmail.com', N'$2a$10$njVZ7gs0WZH6qyK0skmSxeoqG1fFTkftLmux7V.O/9qPZQvuqcXy.', N'Apoderado_Perli_16293', 1, N'16293629-8 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (337, N'Apoderado_Andrea_16301@gmail.com', N'$2a$10$PbNKeVGvLI6sENCQBK0.wunzcOOzmuubhlHTng9AfYF280QiKAg96', N'Apoderado_Andre_16301', 1, N'16301869-1 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (338, N'Apoderado_Bartolomé_16306@gmail.com', N'$2a$10$4tQCbktFhw618UR6NKb5/usSX9GkDjaHk478x0LHEkX3hl4PC.fne', N'Apoderado_Barto_16306', 1, N'16306398-0 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (339, N'Apoderado_Bonifacio_16320@gmail.com', N'$2a$10$hURpZZ4DO87C/cLCFnNJh.TqV/uQURCcofTI3KrY7xNGuyHzUOmEm', N'Apoderado_Bonif_16320', 1, N'16320808-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (340, N'Apoderado_Samuel_16327@gmail.com', N'$2a$10$pmN6lWy31zV/M3hn8jnxoehVfDblGDtyMtFvExhus4YKWE18NfL4S', N'Apoderado_Samue_16327', 1, N'16327714-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (341, N'Apoderado_Malena_16340@gmail.com', N'$2a$10$Nu2jbEVfofHUKMZKtIQfvO./hTTWdF5UGDIHTqgmUqVIsRFcKjlVO', N'Apoderado_Malen_16340', 1, N'16340925-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (342, N'Apoderado_Liliana_16343@gmail.com', N'$2a$10$LcEGtEcvwV2/bzEJtEtWze9pFZ/C6rjyq/xiF1lZ7pJsqgOS49hky', N'Apoderado_Lilia_16343', 1, N'16343046-0 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (343, N'Apoderado_Manolo_16365@gmail.com', N'$2a$10$Zbo9yHKeKF.g1tWh7t5zcuW7Y4eWalbY3UCytQjKsdviIK5YiDc2W', N'Apoderado_Manol_16365', 1, N'16365693-0 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (344, N'Apoderado_Guadalupe_16380@gmail.com', N'$2a$10$pvck8FygsxkszLAMCIVSKuk0C/xDqYSU5R0jSKW95AG7MpceC4n3q', N'Apoderado_Guada_16380', 1, N'16380698-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (345, N'Apoderado_Pánfilo_16382@gmail.com', N'$2a$10$ffgsrR6um1RuhNCjvmkYROEuasrSSD4/ZRTkpt31hzNfHM3yUXiWy', N'Apoderado_Pánfi_16382', 1, N'16382201-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (346, N'Apoderado_Faustino_16387@gmail.com', N'$2a$10$lP/xSbyXjbHh7GmhNfY8dOIsQ5i4juJEnH8IN0hB6VH.wImd/jc/q', N'Apoderado_Faust_16387', 1, N'16387064-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (347, N'Apoderado_Joaquín_16399@gmail.com', N'$2a$10$3ku/7d0RfgEIjA7J2r0g2.e.tRqNV8Ogr5JoRK8WNTzgzg.9ezbU2', N'Apoderado_Joaqu_16399', 1, N'16399091-1 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (348, N'Apoderado_Evaristo_16411@gmail.com', N'$2a$10$jjG4wICslytO9sdqb4z11.h0S7hBiejbCeNf9s4fLPZE92QIWaISa', N'Apoderado_Evari_16411', 1, N'16411398-1 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (349, N'Apoderado_Andrea_16413@gmail.com', N'$2a$10$4PlwACD4JwHTUGhUddWLJe3ngDSxpgjwERIIn6sdQ/8bQOY2yHfyC', N'Apoderado_Andre_16413', 1, N'16413787-2 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (350, N'Apoderado_Eufemia_16416@gmail.com', N'$2a$10$3JT5ZCL2Se8B.nxXO6BDMu6hsUpA7peyLvCdPuOo1L37kG.3W6bOa', N'Apoderado_Eufem_16416', 1, N'16416810-7 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (351, N'Apoderado_Pelayo_16418@gmail.com', N'$2a$10$LkRtwoeuAgTmy4/9Wt6Zue9gNYd9DanGq51zAlzBBwcQoTHVgtVsu', N'Apoderado_Pelay_16418', 1, N'16418565-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (352, N'Apoderado_Araceli_16419@gmail.com', N'$2a$10$/X1kKdHVwmLRCJsjBEpi1u9HvFrm3sTTuNNgx.vl3LJSOiQhxDMD2', N'Apoderado_Arace_16419', 1, N'16419175-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (353, N'Apoderado_Juan_16420@gmail.com', N'$2a$10$.zCBs6sJh7fHG0HysnZIn.wg.Vt8dLo3bBdcXqHU7naPmP7pdN7Ai', N'Apoderado_Juan_16420', 1, N'16420673-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (354, N'Apoderado_Celestina_16422@gmail.com', N'$2a$10$xcdoFNmRBrQdDQ0Zy/VPLuCyIFTTijOuBseF0cfmT2aMsPEAGM3au', N'Apoderado_Celes_16422', 1, N'16422889-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (355, N'Apoderado_Manuela_16429@gmail.com', N'$2a$10$Acf0swl41KHecxRu3vYcDOmKEaIp0hhDP4BZg.ogG8XWtVkKAu.w.', N'Apoderado_Manue_16429', 1, N'16429457-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (356, N'Apoderado_Ágata_16432@gmail.com', N'$2a$10$TZ9NQtOkGJcW58Y5tuBeTeoVLHJAxkt5xlPRvp419P7ewxbfq.0xK', N'Apoderado_Ágata_16432', 1, N'16432337-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (357, N'Apoderado_Macario_16442@gmail.com', N'$2a$10$ItTF129qobyu2lZmtRXB8.FYiWTa1N2Qn/XISWRcgh.aKmKDwqr8e', N'Apoderado_Macar_16442', 1, N'16442929-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (358, N'Apoderado_Griselda_16452@gmail.com', N'$2a$10$lAavTpkDafpSN8Gezf7equImsIPfekyLOZ5B6CdnQDNYBue7uzCIS', N'Apoderado_Grise_16452', 1, N'16452081-1 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (359, N'Apoderado_Aníbal_16469@gmail.com', N'$2a$10$IoE3AfLkJPf8puIZcFrrJeYfDJ6gG90H3acmj8sUp7BvJtMQCJqhG', N'Apoderado_Aníba_16469', 1, N'16469701-0 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (360, N'Apoderado_Jose_16477@gmail.com', N'$2a$10$1YCcPTox7Mx4mwSzDT0/W.enjf8gJJCi7Ydw48lZlroC9dD4HiZ2q', N'Apoderado_Jose_16477', 1, N'16477207-1 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (361, N'Apoderado_Goyo_16484@gmail.com', N'$2a$10$0dM2YFezXzpPrpzdwUSUNeqpuIvo2PxYJQ2v0nryPhZh9YWO03kma', N'Apoderado_Goyo_16484', 1, N'16484467-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (362, N'Apoderado_Nazaret_16503@gmail.com', N'$2a$10$XOPTtsciupmR2EqKFaPeheMJjuZw5FCSsJoLmCoENqNpW.OTzl31O', N'Apoderado_Nazar_16503', 1, N'16503858-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (363, N'Apoderado_Erasmo_16527@gmail.com', N'$2a$10$IOXTgVOhIhJlmhEjXMzM1OuAwA/DIIstk5PzfHKrJ8KetPwpOs4kq', N'Apoderado_Erasm_16527', 1, N'16527013-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (364, N'Apoderado_Alcides_16536@gmail.com', N'$2a$10$E0n5OQiyVr7uJof0.45TcOkop52GZmByWvPWgma1hJ.Jpaz2cB1Xa', N'Apoderado_Alcid_16536', 1, N'16536843-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (365, N'Apoderado_Horacio_16540@gmail.com', N'$2a$10$92MCVAHN.fhW9.b4/BbB0uFxgp4NbQ1wV.uwNri6vUNRGiNdTqJZa', N'Apoderado_Horac_16540', 1, N'16540074-7 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (366, N'Apoderado_Leandra_16554@gmail.com', N'$2a$10$IhiUHyaOLZUG64fB9M7JkO0dSqJuIxSpR6p8yXxBajpVAKqmvtjA2', N'Apoderado_Leand_16554', 1, N'16554719-5 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (367, N'Apoderado_Clímaco_16563@gmail.com', N'$2a$10$sOI7GhO0IXRnOI.5X0Kklu0QxfX0Zcj3wh1fbRUHt4.Y/YfMbqDfe', N'Apoderado_Clíma_16563', 1, N'16563570-1 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (368, N'Apoderado_Juan_16574@gmail.com', N'$2a$10$2eOIujHAR1/LP9QDnc5q3uYS/1rR5GQa69dCQfuVWhrbHTQfrT.W.', N'Apoderado_Juan_16574', 1, N'16574801-8 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (369, N'Apoderado_Ariel_16579@gmail.com', N'$2a$10$9eH5RNzY/Nq51d9r.3vy4.t2/wxbgB3dYJKyc25E0wFFfdtT1hu4e', N'Apoderado_Ariel_16579', 1, N'16579103-7 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (370, N'Apoderado_Leocadio_16588@gmail.com', N'$2a$10$q8IYUz7A37xEC0P5Vzakg.1m9jXuAmebJGFOFbuLYdM8aBdx1IB8i', N'Apoderado_Leoca_16588', 1, N'16588908-8 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (371, N'Apoderado_Maricela_16589@gmail.com', N'$2a$10$4r1SOuMATaBbF6ouFgsPIuvqpTehBTzd.q7bp4GI2kDHdje4N3Iea', N'Apoderado_Maric_16589', 1, N'16589970-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (372, N'Apoderado_Ofelia_16590@gmail.com', N'$2a$10$pd7kDvIocnPsxPPk7erpQe35di59AyOt4JySJiLrY3qTnA4hjL/6a', N'Apoderado_Ofeli_16590', 1, N'16590901-1 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (373, N'Apoderado_Zoraida_16594@gmail.com', N'$2a$10$55qZXXOzcQmgrUABs.RnpOlDSXPgerkJZm0hU4zrWDFT0nPggXky.', N'Apoderado_Zorai_16594', 1, N'16594034-2 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (374, N'Apoderado_Íñigo_16603@gmail.com', N'$2a$10$lEjxYJSnVPiKMB/I.jz3MeR5X7JiBkujVB.u9cV0B4JXXXp4D0qlO', N'Apoderado_Íñigo_16603', 1, N'16603922-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (375, N'Apoderado_Inocencio_16621@gmail.com', N'$2a$10$fBOJKXFSHKCNU5IHSp.kS.pWP9w0LACjl7mqf./bh6aLQ5xMgOqgq', N'Apoderado_Inoce_16621', 1, N'16621397-5 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (376, N'Apoderado_Gil_16631@gmail.com', N'$2a$10$5IKhUuJ9p4Syzw2PooNghOh/sUYnZcnXgJP5QmdgwAgsOfri4DADy', N'Apoderado_Gil_16631', 1, N'16631499-2 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (377, N'Apoderado_Marina_16637@gmail.com', N'$2a$10$uQQ99LonSkCjSm7ggpRt4uRYDk6R5Hky6HkGuFwqhSDwJfaDyqPhu', N'Apoderado_Marin_16637', 1, N'16637488-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (378, N'Apoderado_Bautista_16643@gmail.com', N'$2a$10$1qYF9FqN0aCrPO/jiz69u.y6wyDe.nwyI9/2qx1Bpgnvlwd38920W', N'Apoderado_Bauti_16643', 1, N'16643805-5 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (379, N'Apoderado_Charo_16654@gmail.com', N'$2a$10$W5jReTr3y7ucgF6US3/EWuN1tQb5AWysSc2ql0uvdjTy199Ia1fY6', N'Apoderado_Charo_16654', 1, N'16654445-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (380, N'Apoderado_Hernando_16660@gmail.com', N'$2a$10$dQAYpnwbLZaJovqkq8st.OpGDF/RLKPzKv8o0rIR/ns9NRKKEzrha', N'Apoderado_Herna_16660', 1, N'16660886-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (381, N'Apoderado_Timoteo_16665@gmail.com', N'$2a$10$fM4YbKkIRCnomTTdheGyUesjHR5BIyqVwCRKP.5giwnNAIvVOBYT6', N'Apoderado_Timot_16665', 1, N'16665782-2 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (382, N'Apoderado_Lucho_16665@gmail.com', N'$2a$10$ulSFTIZEON.DKRq579OnAOETYbL/tFu0gh/.lC5MDYXtnBTbuT7vW', N'Apoderado_Lucho_16665', 1, N'16665899-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (383, N'Apoderado_Toño_16666@gmail.com', N'$2a$10$.BxSxx.3CeS1Vgn6or5xHuQUgUo5qK8iYXYTA44yvU8Mradi242lO', N'Apoderado_Toño_16666', 1, N'16666436-5 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (384, N'Apoderado_Heriberto_16669@gmail.com', N'$2a$10$74BLhQ/xpXH7cOrE6VzqC.jrvHZrfSp8Kj02PkBZU1y2Itgr8Wzge', N'Apoderado_Herib_16669', 1, N'16669072-2 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (385, N'Apoderado_Alonso_16672@gmail.com', N'$2a$10$7oQyae7y7QOj2xPTkeWZVep5.GENVzDdSNH5/kyBfXIbvpDWfH5JW', N'Apoderado_Alons_16672', 1, N'16672251-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (386, N'Apoderado_Manuela_16685@gmail.com', N'$2a$10$RI6YFg.O.7SD/xWT53Gpie/eMTwpevhvkYf9WLnSzujrHUyralq9y', N'Apoderado_Manue_16685', 1, N'16685640-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (387, N'Apoderado_Vicente_16698@gmail.com', N'$2a$10$4EgghGLB3ShxnY.XJc9eRO8HI6s6RZTYepTuAoTSIkKESIVyn5uc2', N'Apoderado_Vicen_16698', 1, N'16698356-8 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (388, N'Apoderado_María_16711@gmail.com', N'$2a$10$rW7iFHndmNzKu0BVh7jciOVTi43ezzQZmD7Wz9yUoX580hjrxe8mm', N'Apoderado_María_16711', 1, N'16711678-7 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (389, N'Apoderado_Íñigo_16716@gmail.com', N'$2a$10$roMS3ZPOBoePwwJFOI3Z1O5XgCj/nJnv2Zqkuna48pGcb597qQ.mm', N'Apoderado_Íñigo_16716', 1, N'16716231-2 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (390, N'Apoderado_Marcial_16717@gmail.com', N'$2a$10$44uafH.TlNleqwWatVnQEOERUINuXPuM8zUuN61xeODlLh9rZAadu', N'Apoderado_Marci_16717', 1, N'16717181-8 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (391, N'Apoderado_Goyo_16720@gmail.com', N'$2a$10$tV1bvF/LaOhvkgHg7y34T.mdlAEY1sZcwnu9LV98oOdhJqxyYD4tO', N'Apoderado_Goyo_16720', 1, N'16720319-1 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (392, N'Apoderado_Leoncio_16721@gmail.com', N'$2a$10$ANAn2z537uVHEQzm9dZwqel/G1fIuLGgct2EzWwUbdusc6M21ujM2', N'Apoderado_Leonc_16721', 1, N'16721160-7 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (393, N'Apoderado_Arsenio_16729@gmail.com', N'$2a$10$dik8GFlZ5VhkgYxSGw2fGuXAMsBc4OJjphxYXViI6PcYc7cOvuwYG', N'Apoderado_Arsen_16729', 1, N'16729935-0 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (394, N'Apoderado_Leticia_16743@gmail.com', N'$2a$10$hd/WxIsUMb.S9X5h9ocrvu4ogmGQnE4EBeO1wNYTusNsUP7fAJCF.', N'Apoderado_Letic_16743', 1, N'16743869-5 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (395, N'Apoderado_Juan_16744@gmail.com', N'$2a$10$vLsO2p2NMZ1q3PAW048OluqPDBQ0NJYjmm57jHYXHY/dcVC9ncKR2', N'Apoderado_Juan_16744', 1, N'16744461-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (396, N'Apoderado_Rocío_16745@gmail.com', N'$2a$10$siO0wYmz1WCKZtqh.0u98u29xU2qsaJBQJyySRQCnWpHJWCnS4nhO', N'Apoderado_Rocío_16745', 1, N'16745402-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (397, N'Apoderado_Marcio_16759@gmail.com', N'$2a$10$VrgSPaity5dKRfx/9J7p1uyKY.XVZEqLiUMdLnMZfqNcBdVXEingq', N'Apoderado_Marci_16759', 1, N'16759381-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (398, N'Apoderado_María_16772@gmail.com', N'$2a$10$s4iHOR6n9bN.NL4bJ49OBO38I5D0IL/kpeNOS7b.OOoMbWHrXBEmq', N'Apoderado_María_16772', 1, N'16772015-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (399, N'Apoderado_Chus_16776@gmail.com', N'$2a$10$jWPS.R9UxSSD/1FZamMN5euo/jALjjyGk1Y4buEi1/3Z33CU2U1ca', N'Apoderado_Chus_16776', 1, N'16776725-7 ', 1)

INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (400, N'Apoderado_Fabián_16785@gmail.com', N'$2a$10$7RdbobgBnYtfeu6vn8M9F.cCBdQZq64HSctvXO9MbSRMwrjHyMdcG', N'Apoderado_Fabiá_16785', 1, N'16785855-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (401, N'Apoderado_Dimas_16815@gmail.com', N'$2a$10$07sEMKEkO5brrjpkPOF7c.TE8e7TmN2s546/ms6XKfwzmBs0CL8DG', N'Apoderado_Dimas_16815', 1, N'16815535-2 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (402, N'Apoderado_Lucía_16822@gmail.com', N'$2a$10$uUKnhCMertuxNXzVtblKieDKRjYFdfOg7MDu7Ob0EoDaZ42MmpY9i', N'Apoderado_Lucía_16822', 1, N'16822010-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (403, N'Apoderado_Juanito_16827@gmail.com', N'$2a$10$Px3xg52qbdHEklP7vr7aI.X0aXFsWHWC0Xcwk9q7.qoKzUoLPzvWC', N'Apoderado_Juani_16827', 1, N'16827933-7 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (404, N'Apoderado_Fabiola_16831@gmail.com', N'$2a$10$QvaRZYGp9hzonJHIKWEwCOh.oI/K/R8GzGQfIpU1N6hshyGuIT5Cu', N'Apoderado_Fabio_16831', 1, N'16831263-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (405, N'Apoderado_Rosalina_16837@gmail.com', N'$2a$10$6DKRF/lTEYUT5ScsJe0eA.rFAomyBV1XCG4.bVVNtJC1Zn1zdf1i2', N'Apoderado_Rosal_16837', 1, N'16837363-5 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (406, N'Apoderado_Jacobo_16840@gmail.com', N'$2a$10$0IB7oCeAv.q.BQfOwF467Ocik5vvJ0yt048e8C6JTzezZWok9/SIK', N'Apoderado_Jacob_16840', 1, N'16840694-0 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (407, N'Apoderado_Iris_16845@gmail.com', N'$2a$10$MXJDvgr5EiukJ9Iohb4H5.bFdr1ceBkb/idZ8djU6iNiRhpD1MOBy', N'Apoderado_Iris_16845', 1, N'16845249-7 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (408, N'Apoderado_Alma_16847@gmail.com', N'$2a$10$rES49P.yMPRMImgD1RJOpenzjS3XtocfKXYyOY2Vc.ICZQIZvusIK', N'Apoderado_Alma_16847', 1, N'16847347-8 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (409, N'Apoderado_Ema_16848@gmail.com', N'$2a$10$1MwxGlGUKo45Yxozjrb0UuT5NYOitZn0gkXRaLfqFkjC2tpPk7TBG', N'Apoderado_Ema_16848', 1, N'16848191-8 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (410, N'Apoderado_Alex_16852@gmail.com', N'$2a$10$WFUfCBJcWPjHL46p3qOcMuP9QdJh6jj9puT0UNv5OcWg./igV9qiO', N'Apoderado_Alex_16852', 1, N'16852945-7 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (411, N'Apoderado_Ildefonso_16856@gmail.com', N'$2a$10$cYCyba/VHPnPz03vr7jcZeIUHdEqCDwyhA2XoYmxD1SLRG9eTNj4i', N'Apoderado_Ildef_16856', 1, N'16856729-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (412, N'Apoderado_Febe_16873@gmail.com', N'$2a$10$8EYfEd/mMY8Qj8T34nM4QOU9D30xSP07QEdIWeFxIemgoFjY7Pa4C', N'Apoderado_Febe_16873', 1, N'16873869-2 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (413, N'Apoderado_Irma_16885@gmail.com', N'$2a$10$MqMHO9H8oOz2.TDP95Be9eGLuBe3Ldz./G2mXh2afibeXeIiXyyRa', N'Apoderado_Irma_16885', 1, N'16885505-2 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (414, N'Apoderado_Eloy_16911@gmail.com', N'$2a$10$VWQSiTsyi4biE59.e5T40.10Ku4LvIue3k3WZ1GK12pIBlGFdzwYW', N'Apoderado_Eloy_16911', 1, N'16911128-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (415, N'Apoderado_Eva_16930@gmail.com', N'$2a$10$pFwTgPfTIm6kyHt4iGrZ/ubtJz4WODu9KEHCR/amoud3Eul78DRi.', N'Apoderado_Eva_16930', 1, N'16930522-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (416, N'Apoderado_Isaac_16943@gmail.com', N'$2a$10$O50eReinfV0islamBbXYU.MEiS/V3Kzndg0tloRd7/3jwxErteyQa', N'Apoderado_Isaac_16943', 1, N'16943453-0 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (417, N'Apoderado_Roque_16953@gmail.com', N'$2a$10$05P5AKmLj1R0unmXbL9ZgegRQluc7aRyiuaDnbf3hMhKx8d7.IDiq', N'Apoderado_Roque_16953', 1, N'16953607-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (418, N'Apoderado_Sigfrido_16985@gmail.com', N'$2a$10$SuIIZoes4Y4fI4Gv1oTzfOaSaDPGsLSRE2iu32I.wBBb7SrpXjVhC', N'Apoderado_Sigfr_16985', 1, N'16985866-7 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (419, N'Apoderado_Nazaret_16991@gmail.com', N'$2a$10$WRGdr8iDfQA7RPFXVDB88OyXDxrdeoOdE4aS6aDsQC3rn/KLGzUQK', N'Apoderado_Nazar_16991', 1, N'16991425-7 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (420, N'Apoderado_Valero_16992@gmail.com', N'$2a$10$pOa/lfFGBIcTHJvmfDJ1jebCZLfgFnYK1Ksh9Bl3PAVZO8EYS6aGG', N'Apoderado_Valer_16992', 1, N'16992222-5 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (421, N'Apoderado_Consuela_16992@gmail.com', N'$2a$10$1fQfTvwuWUNvg97PDynCVe1sMozB6FrqQOAW5dQxLR8sF5DV3b6ai', N'Apoderado_Consu_16992', 1, N'16992885-1 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (422, N'Apoderado_Selena_17015@gmail.com', N'$2a$10$IVpxNf7AJXOXEZhOTI2oH.cRZLCHBH.YJWkBtXiEkSCeEh1HGdoYi', N'Apoderado_Selen_17015', 1, N'17015583-1 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (423, N'Apoderado_Camilo_17022@gmail.com', N'$2a$10$pRo53vo9OdHOeRZVxyG89e8.BTUNRSqN.c7a8DfKFohHIRS2F4apG', N'Apoderado_Camil_17022', 1, N'17022813-8 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (424, N'Apoderado_Noé_17024@gmail.com', N'$2a$10$EYUArj2ZCGVc8rKRnfkzCeWho.RO.IKoueFUbdmBoWHZqnpO9k9DO', N'Apoderado_Noé_17024', 1, N'17024758-2 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (425, N'Apoderado_Atilio_17028@gmail.com', N'$2a$10$cEYphmlxLnAYaLNR8Daw0eu0jEG.5ukUcX2EuxXHXpnkILJnF3xK6', N'Apoderado_Atili_17028', 1, N'17028114-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (426, N'Apoderado_Victoria_17038@gmail.com', N'$2a$10$B5IjyFomDoOKruSV05SZmuwtIy4zIEnbjS.JaO44y4ldiibkvr4k.', N'Apoderado_Victo_17038', 1, N'17038957-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (427, N'Apoderado_Chus_17042@gmail.com', N'$2a$10$ueloYE0nSpFoiJ72w6dMC.jFjHpJvt/16T0ZJu0v2L9E/M6ZgMktm', N'Apoderado_Chus_17042', 1, N'17042778-5 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (428, N'Apoderado_Consuelo_17057@gmail.com', N'$2a$10$u/bTcpmwgjn1L2UEymoiteTv0I/Sy1ItfkJcqWhp6aX/dZH7e4xc.', N'Apoderado_Consu_17057', 1, N'17057088-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (429, N'Apoderado_Consuelo_17086@gmail.com', N'$2a$10$OORXVYV.t8agQEp3SsOH7.oWt2M8yJnUe/ujuEXEsEw4eUGtIGfZi', N'Apoderado_Consu_17086', 1, N'17086907-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (430, N'Apoderado_Dora_17089@gmail.com', N'$2a$10$zBlp.tsTQI2iB//Gvsvo1..ROWQSmEPghkt.b1Kr.EnYQqyxX9v02', N'Apoderado_Dora_17089', 1, N'17089467-7 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (431, N'Apoderado_Amada_17091@gmail.com', N'$2a$10$MIBCZGwjsRX7duYQVfxdb./cWEqQnNP6QTAi7V6w.zzQQDNfkqq.i', N'Apoderado_Amada_17091', 1, N'17091096-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (432, N'Apoderado_Haroldo_17102@gmail.com', N'$2a$10$kFsi.RtOQYAz6Sze8Mgy7uH.p5/WsChcnRNTcRmYSLafeAVoi6noS', N'Apoderado_Harol_17102', 1, N'17102846-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (433, N'Apoderado_Jacinto_17105@gmail.com', N'$2a$10$oky1iykK1mTbeJV8HqjcROTWhNu/Lo3sbgIqmBG7TEOii5MWoJbqe', N'Apoderado_Jacin_17105', 1, N'17105152-5 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (434, N'Apoderado_Jose_17108@gmail.com', N'$2a$10$pzIUaoZ5B9tP2W9zSbnURegOdrDyYkaJ5IGyuHdWbqqmCnx8GNC4m', N'Apoderado_Jose_17108', 1, N'17108948-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (435, N'Apoderado_Arsenio_17122@gmail.com', N'$2a$10$Jkyo.hjjCrRyps3unZs77eRJrK3yYc.WAfPybGtXNnW.Y4eZjvqWa', N'Apoderado_Arsen_17122', 1, N'17122886-7 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (436, N'Apoderado_Aarón_17125@gmail.com', N'$2a$10$saN7q3eX8VYcgs4qnSCkQOHTHKrZhumy84si4lsyvtJGBZVLsQgJK', N'Apoderado_Aarón_17125', 1, N'17125581-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (437, N'Apoderado_Yésica_17134@gmail.com', N'$2a$10$soMoxgMxI2CDXezXVLnfdOeoPkMLNvURdylikcSXaGZ4ethbp/V5m', N'Apoderado_Yésic_17134', 1, N'17134387-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (438, N'Apoderado_Julie_17145@gmail.com', N'$2a$10$VrIEVfVNNgCEuxQDfJRaqOdEOc4shcBmviQZ45E4m2u1//U0XMc6.', N'Apoderado_Julie_17145', 1, N'17145040-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (439, N'Apoderado_Efraín_17156@gmail.com', N'$2a$10$Er0P4wGwu5AampGcyQdX4OewdTz2ihA/XbUDpWd4E89eEAEW0H.3u', N'Apoderado_Efraí_17156', 1, N'17156977-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (440, N'Apoderado_Juan_17160@gmail.com', N'$2a$10$jFZNfpQlJBbHqPsa.RSwIeyszFjUpubHp3NBQ4ONQL.AGGE.mHLJe', N'Apoderado_Juan_17160', 1, N'17160551-2 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (441, N'Apoderado_Adán_17166@gmail.com', N'$2a$10$1C52BGyjaxnFb3nOc4b10u4X64ur0BkWd4SuAxji/qhF3BkfAOQIC', N'Apoderado_Adán_17166', 1, N'17166705-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (442, N'Apoderado_Casandra_17167@gmail.com', N'$2a$10$21aApUwnVFKIT1Jklz7pIe1eVMwyUMAmCMqsyrb7zPdy4kikE4fci', N'Apoderado_Casan_17167', 1, N'17167932-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (443, N'Apoderado_Pilar_17190@gmail.com', N'$2a$10$LWQqE4Dzg2ur2wgMSFHZgOzuTUJd6znZ1NdvD41VixQv6t5NKlRhu', N'Apoderado_Pilar_17190', 1, N'17190657-1 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (444, N'Apoderado_Sonia_17198@gmail.com', N'$2a$10$9Ud5W5pvRsg8RSvpSmjjreSSVACvgloPqAiwKiYVyqqrdWFBxUQFe', N'Apoderado_Sonia_17198', 1, N'17198003-8 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (445, N'Apoderado_Marisela_17206@gmail.com', N'$2a$10$dgQVKAmUccqmvSODdT7d0..syQnpsq3VPLkZ5K/9OvK01M8voAbXy', N'Apoderado_Maris_17206', 1, N'17206784-0 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (446, N'Apoderado_Emigdio_17209@gmail.com', N'$2a$10$B3MzsMdbp.WtjhevcQvMpeAGqAYBLd8iCggKVR8kSwV4eNexgvus.', N'Apoderado_Emigd_17209', 1, N'17209289-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (447, N'Apoderado_Delia_17215@gmail.com', N'$2a$10$1BlvgUxZZ9eq0Z3QJ8gJhe8.PIvgbEGxyvjPByJVBDaljDaZSZHKe', N'Apoderado_Delia_17215', 1, N'17215797-1 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (448, N'Apoderado_René_17217@gmail.com', N'$2a$10$qCd4hoMd/Uq81ku1NlSE4OOxkROMK.i/gBSwnTpf469muCEZto/zW', N'Apoderado_René_17217', 1, N'17217511-2 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (449, N'Apoderado_Abraham_17245@gmail.com', N'$2a$10$mVjnmpHmwBtH.3bJy7oCmumNSQ861I/ettPTt63iRYa3uqBAdRRoG', N'Apoderado_Abrah_17245', 1, N'17245857-2 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (450, N'Apoderado_Fernanda_17255@gmail.com', N'$2a$10$58HV7txBTMiOoSsd6qT92uFw1/IGExD32kCHHfccgf/pWJQRqU/GC', N'Apoderado_Ferna_17255', 1, N'17255051-7 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (451, N'Apoderado_Perla_17257@gmail.com', N'$2a$10$.SZSS7ovkCGPWI48NuhS2uzMqn/GAb79CZu9F0Ma3DNSr5ceBLrdi', N'Apoderado_Perla_17257', 1, N'17257333-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (452, N'Apoderado_Evaristo_17261@gmail.com', N'$2a$10$Hq/o2klgXYSjz6T6JhDxyORBIxTiyfSYkF.pfbnAepgk9P/91ErTy', N'Apoderado_Evari_17261', 1, N'17261510-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (453, N'Apoderado_Virgilio_17272@gmail.com', N'$2a$10$CqEZemYmvwvQVwt2TOYxz.ZGHFoGgCooRhQx6JJqfcJnD8QJZ6nLS', N'Apoderado_Virgi_17272', 1, N'17272719-0 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (454, N'Apoderado_Sabas_17288@gmail.com', N'$2a$10$XVPA.dAr.gvjOvROIPxqluNh.yTzNDsoS09V3TbGwiUjB116mGKhu', N'Apoderado_Sabas_17288', 1, N'17288657-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (455, N'Apoderado_Luciana_17306@gmail.com', N'$2a$10$mG/VW3N.G1ZahYqwC6tZy.HwtK.ke7Ny5lHkSY3rW3IqzUQxmNMxG', N'Apoderado_Lucia_17306', 1, N'17306575-2 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (456, N'Apoderado_Georgina_17306@gmail.com', N'$2a$10$n/yBQysxni8isVNxxxRpEOa4iP3zKY2Pxf6scIampIcSCKWRzhLYS', N'Apoderado_Georg_17306', 1, N'17306582-5 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (457, N'Apoderado_Matías_17340@gmail.com', N'$2a$10$V5rkaZpOtK6k6MGjeftCJuAyn7xuLAH2R/FdQTc2S9bb5Nqfw5gUS', N'Apoderado_Matía_17340', 1, N'17340339-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (458, N'Apoderado_Cristian_17340@gmail.com', N'$2a$10$Bx3xm6xER.Ab.OF.5LacBOEcy.nL.HfqqxvldvamP4OapM/Ox3O4G', N'Apoderado_Crist_17340', 1, N'17340745-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (459, N'Apoderado_Jennifer_17345@gmail.com', N'$2a$10$6B3SNIwHXnfPLDz4A4zdK.EDPi6ZhD5pVK.n1GwBtdf5jZKfhvVDG', N'Apoderado_Jenni_17345', 1, N'17345780-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (460, N'Apoderado_Áurea_17349@gmail.com', N'$2a$10$WXf41p0O/osiQLlD0w2LMOuXs0tPG4azSbEAI0DPXe.5d4/3uEzqu', N'Apoderado_Áurea_17349', 1, N'17349210-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (461, N'Apoderado_Cándido_17365@gmail.com', N'$2a$10$3ocLehEs3casBvZ9EwjdvO6erbbIbHKGBXVo8iUluXWgggxP6ZVmO', N'Apoderado_Cándi_17365', 1, N'17365106-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (462, N'Apoderado_Silvestre_17378@gmail.com', N'$2a$10$OIvCCVkOFOXnZfuq.IP7TeYe2QI0m8vnF.KLoXg.n95ndjCmWiQt2', N'Apoderado_Silve_17378', 1, N'17378283-7 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (463, N'Apoderado_Marcos_17382@gmail.com', N'$2a$10$wrbzHRMD4ftrFWpY1kk/9u57z7V1Y9hBe3KXreVrk6NQHpgr3edKO', N'Apoderado_Marco_17382', 1, N'17382963-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (464, N'Apoderado_Heraclio_17386@gmail.com', N'$2a$10$vZFacugH0nCIP70KaqyCiORSPBNvGy7sORpfDWRJEmVlL9KAOigjm', N'Apoderado_Herac_17386', 1, N'17386909-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (465, N'Apoderado_Matías_17389@gmail.com', N'$2a$10$0xNfIZTTVOtddf6a3w5G3.YsfmN2zJJYnHTCdCdpIKlUrX5GUKiYG', N'Apoderado_Matía_17389', 1, N'17389967-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (466, N'Apoderado_Isaura_17410@gmail.com', N'$2a$10$unNSV/og06H5cLLhZ7aFGuAnsAnwrxkSuzQNYB3k8Zy./b2UeCwiC', N'Apoderado_Isaur_17410', 1, N'17410219-8 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (467, N'Apoderado_Cristina_17415@gmail.com', N'$2a$10$GASW/4irAysSQb3cuzwzBu66.7nNiGr2LQH/fJgphJVRnYxOqBNay', N'Apoderado_Crist_17415', 1, N'17415920-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (468, N'Apoderado_Ruy_17427@gmail.com', N'$2a$10$LJvJEQbbfu687h1gbsKIZOY2VDq0XKcctjqAucwKWxtCdDA2i.4oO', N'Apoderado_Ruy_17427', 1, N'17427726-5 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (469, N'Apoderado_Gaspar_17434@gmail.com', N'$2a$10$B9vVKV0.2gxhQKBVcb2Zt.utRUvm3iocjR5wzW4WNS9yYWgXJN9g.', N'Apoderado_Gaspa_17434', 1, N'17434178-8 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (470, N'Apoderado_Violeta_17488@gmail.com', N'$2a$10$5OcnsHy.hkXYVUjCiElSqeAOqVdSa48Q4CVQC9XwnGHNqVbJ3mKAu', N'Apoderado_Viole_17488', 1, N'17488738-1 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (471, N'Apoderado_Jessica_17496@gmail.com', N'$2a$10$AAP7KW4PQFRrTX8B0YIGuuhJpRq1lHKUyOFyMkbEey1QXSDC3Ykfa', N'Apoderado_Jessi_17496', 1, N'17496764-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (472, N'Apoderado_Damián_17496@gmail.com', N'$2a$10$jyTaZfTKjoVMMdXfyl2t0uu6hfp.dMxwmbHIpgXIgOTkYALW6/doi', N'Apoderado_Damiá_17496', 1, N'17496959-0 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (473, N'Apoderado_Amada_17504@gmail.com', N'$2a$10$Nl9kAMLJkuV6A.x7YvZhd.X8PGjULqj.LlzFXdJbS7DlxscijIG2.', N'Apoderado_Amada_17504', 1, N'17504306-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (474, N'Apoderado_Luisa_17510@gmail.com', N'$2a$10$TSKaRxwVh1JDZ9Y9YkvPMOOlPfEWhHt7zK5V1ZCoiNw/rrcsicFY.', N'Apoderado_Luisa_17510', 1, N'17510703-7 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (475, N'Apoderado_Nicanor_17510@gmail.com', N'$2a$10$ue1qCGXBKmKBY7Zbu1OYMOcsnQ0vTxW9BMcxNm7j5ubKU6Qn037Du', N'Apoderado_Nican_17510', 1, N'17510923-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (476, N'Apoderado_Ángeles_17513@gmail.com', N'$2a$10$hhHgk3BRwVvsqwQ5RBnbYuLmMGi94vOViZNqz4Ed7vQ4lnmXTi6Nm', N'Apoderado_Ángel_17513', 1, N'17513847-1 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (477, N'Apoderado_Bernardo_17515@gmail.com', N'$2a$10$UZLYdmASkjNCb7iMM0muXeD8GBWbXoTjayr/EZWinCSkhlLO3NSi.', N'Apoderado_Berna_17515', 1, N'17515016-1 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (478, N'Apoderado_Raúl_17516@gmail.com', N'$2a$10$/OlaveVmHJ3mTR9DivC8IOTubnBQ70sEWxn5xqRQMZjwgo4e9BpHK', N'Apoderado_Raúl_17516', 1, N'17516176-7 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (479, N'Apoderado_Estefanía_17517@gmail.com', N'$2a$10$Vbxfhr0FlOi4CIGqvRgQUuodJDUThYJljUA6rTsjUZUH8ghm197BG', N'Apoderado_Estef_17517', 1, N'17517892-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (480, N'Apoderado_Amanda_17523@gmail.com', N'$2a$10$kbEQ7M3shyhd24yj0sUdoetl81uEn34Hhn4JgaTktXf./Hqq5SqVW', N'Apoderado_Amand_17523', 1, N'17523182-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (481, N'Apoderado_Bárbara_17526@gmail.com', N'$2a$10$v/2.vH0wP8xxnLIOvLGIVu8jWvgPaotPz4Pj/hRntpqwEZW93veLa', N'Apoderado_Bárba_17526', 1, N'17526299-7 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (482, N'Apoderado_Imelda_17528@gmail.com', N'$2a$10$iGDTjk2W/.3bsI1Fxf5CSepsqt.MODcdeHZDr95JE7ZUaLEkXJWFK', N'Apoderado_Imeld_17528', 1, N'17528329-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (483, N'Apoderado_Delfina_17544@gmail.com', N'$2a$10$M5tahEj6wA1886FnxGFnAObqKtN160PIzl0pON9fg4DMEa31fpAfS', N'Apoderado_Delfi_17544', 1, N'17544384-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (484, N'Apoderado_Alfonso_17548@gmail.com', N'$2a$10$qVvMpMHBxg8Gyt2ZI86GhuUwYjZ6gxVRy8LELYzRIeUf3ac2veq2u', N'Apoderado_Alfon_17548', 1, N'17548626-7 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (485, N'Apoderado_Mamen_17551@gmail.com', N'$2a$10$J.ca.7XPxqq311PDjD.kWOD6vDlqutgoJuX7yM5H85NBYs/dgh7C2', N'Apoderado_Mamen_17551', 1, N'17551533-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (486, N'Apoderado_Hipólito_17574@gmail.com', N'$2a$10$NvVsGYFk/C590oTBnGCI0ez0eGBWi.5QoFZY7l.68s8Z0ZRDTzDcG', N'Apoderado_Hipól_17574', 1, N'17574582-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (487, N'Apoderado_Ana_17578@gmail.com', N'$2a$10$4QShn/JU1Bzd22vtjkiZZOcz2P.hpX5sH7FAy0SCZI0ng8Qqs7LOS', N'Apoderado_Ana_17578', 1, N'17578021-1 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (488, N'Apoderado_Emilio_17591@gmail.com', N'$2a$10$TfP8Feb13CrgcgHjTuH.XOun.hem66LSFobLTC29qisE.Tx2dyLiK', N'Apoderado_Emili_17591', 1, N'17591429-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (489, N'Apoderado_Aitana_17599@gmail.com', N'$2a$10$BTA0NJjVHLAI.qPxJuTh6uyuxR.Z.LVcNC5gXHdOBan4tAjud6mS6', N'Apoderado_Aitan_17599', 1, N'17599794-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (490, N'Apoderado_Américo_17612@gmail.com', N'$2a$10$p5Bm94ffF2Nqams1JvJZ0.E0uJSRJNik.BGQDN89KrmH0vcct3dJK', N'Apoderado_Améri_17612', 1, N'17612335-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (491, N'Apoderado_Lisandro_17627@gmail.com', N'$2a$10$tlUTzGjPcx4MgGkeKSe2fOplLug2pn/7xGZe81myAACWW97/UNGXC', N'Apoderado_Lisan_17627', 1, N'17627037-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (492, N'Apoderado_Jenaro_17630@gmail.com', N'$2a$10$3qmhkWaLwLX08Llhg0j2mOi2GsvyrRk9OL9Uj/FWtJ4XPmgCF5yO.', N'Apoderado_Jenar_17630', 1, N'17630615-7 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (493, N'Apoderado_Mireia_17643@gmail.com', N'$2a$10$epL.eDLlQq5K/iOnMU8Z3OtrKZ3e02O9moYlODVjf8Pc4jc/K1Y6O', N'Apoderado_Mirei_17643', 1, N'17643244-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (494, N'Apoderado_Faustino_17647@gmail.com', N'$2a$10$MA6S8/7/Fon25rH5iDs9E.LhKCfwL9ohDm/Sq3Br2qnlL9ocTSz6y', N'Apoderado_Faust_17647', 1, N'17647355-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (495, N'Apoderado_Eric_17648@gmail.com', N'$2a$10$vpuocpD8ucbCc.MxE2vQdOoB.EZ0eeFSjAiasqwL0hiB56BJYrXYe', N'Apoderado_Eric_17648', 1, N'17648399-7 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (496, N'Apoderado_Duilio_17651@gmail.com', N'$2a$10$ePs7TKvSG/Z9zO6KIzSJkOsoeySvu38wiDy0p5ne6V9ROMElWBNqu', N'Apoderado_Duili_17651', 1, N'17651138-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (497, N'Apoderado_Constanza_17672@gmail.com', N'$2a$10$y/krqh8/OQpTAHpfVFSBkuSoeGYvRs3GVSBUcmCyrpSGmTHW6MR0a', N'Apoderado_Const_17672', 1, N'17672481-1 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (498, N'Apoderado_Rómulo_17676@gmail.com', N'$2a$10$UaZnCnest/0BL8AbcLOOAOKDG6wuWh5VQFFtifunqiu6gzKPOjkfO', N'Apoderado_Rómul_17676', 1, N'17676307-8 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (499, N'Apoderado_Evangelina_17696@gmail.com', N'$2a$10$NLIhjDRcLxRxo6Ez12CChuOqAQUp7SXgLFFLSE6xf8CLcEop.fOay', N'Apoderado_Evang_17696', 1, N'17696112-0 ', 1)

INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (500, N'Apoderado_Leonardo_17707@gmail.com', N'$2a$10$xhC1FC0Tr6PBavYRgv0hSO/lvrosbVVDwcbUm/R.z/LZdaG/7ptqC', N'Apoderado_Leona_17707', 1, N'17707464-0 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (501, N'Apoderado_Gilberto_17716@gmail.com', N'$2a$10$tNl3s0NzKG.tD./JZIJuguGDx669wfPhjGl.8eosTI5TOGDAkK9Hu', N'Apoderado_Gilbe_17716', 1, N'17716337-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (502, N'Apoderado_Faustino_17720@gmail.com', N'$2a$10$H2O4j0ES/bNq2/EcaJlQ2eOkoSxfHgQ77.qwMllwJ4.falY3FGFW2', N'Apoderado_Faust_17720', 1, N'17720800-0 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (503, N'Apoderado_Román_17728@gmail.com', N'$2a$10$ntUalonkwHtSphKmKHSUqOTYLjw0jEq8u458rPum1ZnhhosAiQsli', N'Apoderado_Román_17728', 1, N'17728887-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (504, N'Apoderado_Joaquina_17747@gmail.com', N'$2a$10$GEgxm7315uy0G3FA45g5eOsw/CUHkQ69yjYp77CL1QUCPISKE.smG', N'Apoderado_Joaqu_17747', 1, N'17747682-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (505, N'Apoderado_Pablo_17747@gmail.com', N'$2a$10$8C1hCPQZtqW48jewRUggf.5l5Q.GmMWA8jFLpV5AzhRjCu3e.01xu', N'Apoderado_Pablo_17747', 1, N'17747986-1 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (506, N'Apoderado_Noé_17777@gmail.com', N'$2a$10$YpNVIDQttfVlcFucdwBAOuLg.4TPMyNWLPcUU.W87CMn9eCPgCsbm', N'Apoderado_Noé_17777', 1, N'17777532-0 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (507, N'Apoderado_Ciriaco_17779@gmail.com', N'$2a$10$WTGzbIkgoXReZ0FrCjzwH.n0FyJOfssq59LD.9UMYmEOkiohPy9hK', N'Apoderado_Ciria_17779', 1, N'17779762-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (508, N'Apoderado_Roldán_17798@gmail.com', N'$2a$10$aGih7VFWyEKJCSjb8mWvoeAtjkdyqAjxArGw4re.g5j438E84MUaS', N'Apoderado_Roldá_17798', 1, N'17798706-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (509, N'Apoderado_Azahar_17802@gmail.com', N'$2a$10$6U0NsJosiNWll4f95r8rOOy0w2p8RUZQrq0htAf2h8mUbiUCf0fKy', N'Apoderado_Azaha_17802', 1, N'17802810-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (510, N'Apoderado_María_17810@gmail.com', N'$2a$10$IpZbQnCch1tPpaDoHFAgxuRj89BaKBgMZ32GR47TIQj8a34h9VPO6', N'Apoderado_María_17810', 1, N'17810544-2 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (511, N'Apoderado_Julia_17817@gmail.com', N'$2a$10$w4OceuOiSNwp6LJLTeBG4uWYq3TktZRxTd4snHIkh/GM4vJRlJPPm', N'Apoderado_Julia_17817', 1, N'17817613-7 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (512, N'Apoderado_Marina_17819@gmail.com', N'$2a$10$t64YT9HcRyMrIB/CZ8g9k.MWOv.xtrbV29/qoNcrSfm.nNQ.WJNfi', N'Apoderado_Marin_17819', 1, N'17819072-5 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (513, N'Apoderado_Aarón_17825@gmail.com', N'$2a$10$UAAa94XQNjaWKT6PPQqSi.UJnc41OTO4RY.WCyLtSK2OVpZindt2m', N'Apoderado_Aarón_17825', 1, N'17825245-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (514, N'Apoderado_Ovidio_17846@gmail.com', N'$2a$10$SExkTy0BxsXl/8/emT8HWOe2Cqu5t17yxha2qOwOk0M3fSZF7J8Li', N'Apoderado_Ovidi_17846', 1, N'17846200-8 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (515, N'Apoderado_Eduardo_17846@gmail.com', N'$2a$10$t9Ya5Z1rY03oOfPN/NNVJOwozEeU/eyFtl.apzjHtA4GvHCjrCqju', N'Apoderado_Eduar_17846', 1, N'17846240-7 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (516, N'Apoderado_Francisco_17858@gmail.com', N'$2a$10$N7vhvyQqb1pOJ7qq4Hq7xe.Blou9/m8rfKuXKmaGOJTgfjA3eah7e', N'Apoderado_Franc_17858', 1, N'17858210-0 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (517, N'Apoderado_Jonatan_17878@gmail.com', N'$2a$10$k6Qqs/LURLFNSW2gFoVQq.nBaZK7PmfBq59AHxQbmKV57sHAINIz.', N'Apoderado_Jonat_17878', 1, N'17878199-5 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (518, N'Apoderado_Ovidio_17888@gmail.com', N'$2a$10$m.qMTBwDrxNrIHQU.0M5EOUKVLuuydKndaeSHjq1q/dOOPrGdjkvW', N'Apoderado_Ovidi_17888', 1, N'17888190-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (519, N'Apoderado_Ascensión_17901@gmail.com', N'$2a$10$0BzKtsR5URUilP0y00jsB.XOtz5VfxzUdfGvz46N08PReMVR6D4i6', N'Apoderado_Ascen_17901', 1, N'17901164-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (520, N'Apoderado_Jenaro_17908@gmail.com', N'$2a$10$oVItCwQ3PrgEU3cj8M8gXefnDW1kSEw0hOOiyEMTXr9QFSsuck5Yq', N'Apoderado_Jenar_17908', 1, N'17908788-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (521, N'Apoderado_Borja_17917@gmail.com', N'$2a$10$iFLGVYrRVwzJQXzcz3PnJ.ltYieZDPMhhXYkmzlaQLXhZ13jQkbfW', N'Apoderado_Borja_17917', 1, N'17917469-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (522, N'Apoderado_Adrián_17921@gmail.com', N'$2a$10$Gw0p0cymcP1TgD/5Uwe/B.k252na5zWCNlSnt.Cy2y3hkwWi.aYUS', N'Apoderado_Adriá_17921', 1, N'17921289-7 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (523, N'Apoderado_Rosario_17933@gmail.com', N'$2a$10$TRFVEeN1pqNNR8.JA7k2S.Bh48br0V3uMS3KDsiq.e7cuVqXaMXVC', N'Apoderado_Rosar_17933', 1, N'17933448-8 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (524, N'Apoderado_Aránzazu_17950@gmail.com', N'$2a$10$9labwRu4lLrxuqubOKr80e9xWAKGrF0aiyCTVjwC5Ex0ejvXU38pq', N'Apoderado_Aránz_17950', 1, N'17950136-8 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (525, N'Apoderado_Roxana_17960@gmail.com', N'$2a$10$qG47AO2U4Jy1wcbc8qMLMOSx1yI1P8eaWwO.21kFXndrmY272IzZm', N'Apoderado_Roxan_17960', 1, N'17960002-1 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (526, N'Apoderado_Juanito_17981@gmail.com', N'$2a$10$h8qr6tuFkwVy2y6o.eE39u.VUh8mFRZqHhM4oyY8apJs9CsPGoXT2', N'Apoderado_Juani_17981', 1, N'17981124-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (527, N'Apoderado_Modesta_17996@gmail.com', N'$2a$10$s/Mgl4B3puNubz09fOQNueyIPb2G2aePFv7s4OxJQMi0LGBcEH0Y6', N'Apoderado_Modes_17996', 1, N'17996112-1 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (528, N'Apoderado_Miguel_18023@gmail.com', N'$2a$10$RGI8kr09M.x92sCNIsefPefrq8BrT6OlNACHSjo6B6c3dSPMepzpS', N'Apoderado_Migue_18023', 1, N'18023817-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (529, N'Apoderado_Lucio_18024@gmail.com', N'$2a$10$yqTLUyBvuvyLelCpBxKd8ORPxgv3ziGW9hrYeyMWS0ebAppuDsCxu', N'Apoderado_Lucio_18024', 1, N'18024443-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (530, N'Apoderado_Trinidad_18027@gmail.com', N'$2a$10$Re3on12rE3i67RBJvC/krOZB9BKXRGddJgBTeZP4ko3ZqOfsW9UCm', N'Apoderado_Trini_18027', 1, N'18027932-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (531, N'Apoderado_Alfredo_18029@gmail.com', N'$2a$10$BfaWNX9nD8Jr9BiUOquT5OVUflnqe1nhrbvyLXgU7nLq9Fbe94pdG', N'Apoderado_Alfre_18029', 1, N'18029066-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (532, N'Apoderado_Roque_18058@gmail.com', N'$2a$10$mdZL/AFt9s8a6Qgaso0US.O32/h5nFoqWeRzae6o9PRqIE20EXA/K', N'Apoderado_Roque_18058', 1, N'18058884-1 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (533, N'Apoderado_Édgar_18059@gmail.com', N'$2a$10$mOsTDHsB8npZQqXnY/Ht/OJ7JMeZRTlQr9BVuIs/a.iCXB51DlxGS', N'Apoderado_Édgar_18059', 1, N'18059881-2 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (534, N'Apoderado_Domingo_18087@gmail.com', N'$2a$10$d3U0KvhQNIBNMICHGUPr8eDVFW9psoMYpNqv80nOSz0xdJjTM5fRO', N'Apoderado_Domin_18087', 1, N'18087272-8 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (535, N'Apoderado_Marianela_18107@gmail.com', N'$2a$10$R9mgQ2BECwGIKmCd4W0joOIB/IrMqd5FWc9JT1wnDmXsSKQwkXH1q', N'Apoderado_Maria_18107', 1, N'18107022-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (536, N'Apoderado_Valero_18113@gmail.com', N'$2a$10$bCImdb8B8ETNhaYcGR19He2toL91si5tM58sYWJyyGovAOhnFcdkS', N'Apoderado_Valer_18113', 1, N'18113046-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (537, N'Apoderado_Moreno_18121@gmail.com', N'$2a$10$bz1x2fLIJZGWxBt7ZaUaX.gNPuiYX3XBixuNXAr.tbN0.IQtSZyfu', N'Apoderado_Moren_18121', 1, N'18121760-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (538, N'Apoderado_Rolando_18126@gmail.com', N'$2a$10$ZLruj2d6zb5rSf/kgQiu4.ngTcdvbkC8XLAObxgDFUJtFt8GZy..2', N'Apoderado_Rolan_18126', 1, N'18126350-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (539, N'Apoderado_Raúl_18131@gmail.com', N'$2a$10$j4yOsXryHIsSwSy/kbEyx.OR2BHbCCyoJvoZKDxuJY9LshsEpPdSu', N'Apoderado_Raúl_18131', 1, N'18131392-7 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (540, N'Apoderado_Jonatan_18136@gmail.com', N'$2a$10$HGRlfj0YPEdDmctWEASDBuhNZKhR2VF1m9jYpu1etfD8VFmj3X6pq', N'Apoderado_Jonat_18136', 1, N'18136863-2 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (541, N'Apoderado_Eusebia_18137@gmail.com', N'$2a$10$rBla0vx3LByNtBCRNhQ74.JZk6.kkj76joXL8.i/HZyMKtxiIPlOi', N'Apoderado_Euseb_18137', 1, N'18137035-1 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (542, N'Apoderado_Nilo_18137@gmail.com', N'$2a$10$oOi.TDAlepk9qJQ1KLfsYOp3vqy.u5PkWLqMd2X3SmblhPQcHH33O', N'Apoderado_Nilo_18137', 1, N'18137603-1 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (543, N'Apoderado_Maura_18142@gmail.com', N'$2a$10$KAIXJK/ypKw8Ld657oGlEu9qtns4mQuUuigPjAOhLH76TrS5FLvBW', N'Apoderado_Maura_18142', 1, N'18142901-1 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (544, N'Apoderado_Lucio_18149@gmail.com', N'$2a$10$.JsQrglHf0NZUsoWk8USYe3ayPKJ2OH7pdEI2CDpZj24.PA/r8gze', N'Apoderado_Lucio_18149', 1, N'18149685-1 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (545, N'Apoderado_Piedad_18167@gmail.com', N'$2a$10$6wB1aZ/.ktB0cpUapUu2jumuMJHKlNi5POvziDjSC/BS7b4CIBUq.', N'Apoderado_Pieda_18167', 1, N'18167463-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (546, N'Apoderado_Luisina_18170@gmail.com', N'$2a$10$SLG7rRtK6fnh9GVBbDXaW.oNBuGj5no8xDorL4RA5dwJAQpFxTnkK', N'Apoderado_Luisi_18170', 1, N'18170302-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (547, N'Apoderado_Candelas_18182@gmail.com', N'$2a$10$tIxya5dsNRRuATy9qvC3rOcaYHUIabQH3noAk5LHn2HR.S9IQ7w2u', N'Apoderado_Cande_18182', 1, N'18182094-2 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (548, N'Apoderado_Mateo_18183@gmail.com', N'$2a$10$.X/HqstwQRL79lcjYGcrpOpgQcihINCmAP2F8R/abtfQmILkkzeTi', N'Apoderado_Mateo_18183', 1, N'18183784-5 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (549, N'Apoderado_Eustaquio_18202@gmail.com', N'$2a$10$y6kPk2TReHDHPiL07DIv9OZPk.Bgu/GIfLWSNIVEwyeuWlXJePh7K', N'Apoderado_Eusta_18202', 1, N'18202329-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (550, N'Apoderado_Pepe_18209@gmail.com', N'$2a$10$kGU1qADnrTVsBh73cu2mReWZd7q573RRW83Io2.asfUhOvdUFLCVu', N'Apoderado_Pepe_18209', 1, N'18209421-8 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (551, N'Apoderado_María_18223@gmail.com', N'$2a$10$utO1.7uwhvPwc5dp3JI87O8wooDhlrbkAo0uaimpPP7tZDNxwY5iS', N'Apoderado_María_18223', 1, N'18223184-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (552, N'Apoderado_Obdulia_18233@gmail.com', N'$2a$10$jynQlno9zMcSJf2kjObHDeMYqAr.XJ2LXv42MiLtV1a21OegdubQi', N'Apoderado_Obdul_18233', 1, N'18233494-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (553, N'Apoderado_Nayara_18246@gmail.com', N'$2a$10$3yPeWarAbH7t8AyC9Sa11e.qyWDuVCcbZNBMqy0JbH9a0pIJgwviK', N'Apoderado_Nayar_18246', 1, N'18246071-0 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (554, N'Apoderado_Néstor_18253@gmail.com', N'$2a$10$EljDJOOz6aywEQVwrt3kauwxYC218/2hH5GwrlOBa5XwHSZoIIDkK', N'Apoderado_Nésto_18253', 1, N'18253279-7 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (555, N'Apoderado_Feliciana_18262@gmail.com', N'$2a$10$P4NBkXgA0ubhnrkavBIwOOOlxwoOVxQyY/V/I6Mr5GqnVVb1rxZSW', N'Apoderado_Felic_18262', 1, N'18262298-2 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (556, N'Apoderado_Emilia_18270@gmail.com', N'$2a$10$N4/rvFV9KO632Ejd3mNdmOigzfgmBZq8EeCFZVxcg4/0Bo.A68ecq', N'Apoderado_Emili_18270', 1, N'18270475-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (557, N'Apoderado_Marco_18278@gmail.com', N'$2a$10$mGDcg2SvSfUp4SJeCOK8geByJw0RweQeT/8gyjDx7fpvBzDyoj8H2', N'Apoderado_Marco_18278', 1, N'18278471-0 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (558, N'Apoderado_Maximiliano_18281@gmail.com', N'$2a$10$PBjWtP6D0stkLueHLDDZae8hhuX2FHGCoq5riC4h5lOem1IH5xp5a', N'Apoderado_Maxim_18281', 1, N'18281705-8 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (559, N'Apoderado_Duilio_18285@gmail.com', N'$2a$10$O6bGABCC6.haTM7fpM3iWuJBqu/Z12eVHmMLXPOiqooFZ6ntoRELO', N'Apoderado_Duili_18285', 1, N'18285397-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (560, N'Apoderado_Inmaculada_18302@gmail.com', N'$2a$10$xMMiE9NdXQy837XF8ehVn.ieNrkhERdi5RRXoypA21.EF6e.TjrUW', N'Apoderado_Inmac_18302', 1, N'18302636-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (561, N'Apoderado_Priscila_18321@gmail.com', N'$2a$10$twVpK4AmjwPxYlqmLqQKQu77sqroeQ8Qi9bi2xknAqUuH36fby1hq', N'Apoderado_Prisc_18321', 1, N'18321456-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (562, N'Apoderado_Lucía_18323@gmail.com', N'$2a$10$PCY3c4vWc3YTj9n9u2qO7Okkp3s4vAEgVmFLOV1E0eFNlxikVr33W', N'Apoderado_Lucía_18323', 1, N'18323651-2 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (563, N'Apoderado_Calista_18334@gmail.com', N'$2a$10$35sWqIZR3u5VpBsTGrM.ceBVS6Ltp6pvBqLTkAFIhtC9EcTFdECsi', N'Apoderado_Calis_18334', 1, N'18334910-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (564, N'Apoderado_Erasmo_18356@gmail.com', N'$2a$10$9YaNSGNDEVMt6U6e3s64Euj..K7F5XQypyU/bUvlJ3TH3Vr7ojcsq', N'Apoderado_Erasm_18356', 1, N'18356107-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (565, N'Apoderado_Azahara_18358@gmail.com', N'$2a$10$An9ebDuAEENJiqYr2TtRlex4VqgxlcS1M0IDbTiYcxG2mSqw60K4C', N'Apoderado_Azaha_18358', 1, N'18358153-8 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (566, N'Apoderado_Mariano_18360@gmail.com', N'$2a$10$CwJl3a7sAQS7fAtKIU3OduFbOqvaNConV.R98rJVD52s6KrF9Pc3C', N'Apoderado_Maria_18360', 1, N'18360082-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (567, N'Apoderado_Modesta_18363@gmail.com', N'$2a$10$AaovEvM2CG5/LE/Nn0sU4eSe.1MAa0114SIItJ6A4V5JXqurT/TWe', N'Apoderado_Modes_18363', 1, N'18363517-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (568, N'Apoderado_Natalio_18379@gmail.com', N'$2a$10$pYK/2V8ZwcsfzkD1KElE.uyrUYT7jKsr8RaDSzB.VSEYPltSHEB.C', N'Apoderado_Natal_18379', 1, N'18379022-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (569, N'Apoderado_Nacho_18397@gmail.com', N'$2a$10$S2PSkrYVKaSbhNVQEb9/du7Kmeyc51mNpQuqi.pdayqU4I8JZK0hC', N'Apoderado_Nacho_18397', 1, N'18397725-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (570, N'Apoderado_Bienvenida_18401@gmail.com', N'$2a$10$U.c3QuN.tMe.g98BGNXy/.tmovyXv8AHaB7x.dfG0LhUm7iiD2.DG', N'Apoderado_Bienv_18401', 1, N'18401996-5 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (571, N'Apoderado_Alejandra_18430@gmail.com', N'$2a$10$bF4DUSsSKvfGikSV6O7RGe6jlyD9uA5I2frzQSpeI0ARuH5mpfSbm', N'Apoderado_Aleja_18430', 1, N'18430407-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (572, N'Apoderado_Agustín_18440@gmail.com', N'$2a$10$Y/bsffD6PCcF26UbMsIIp.gkwODnB7s9qS3PVFW2R26YC/PAaFsjG', N'Apoderado_Agust_18440', 1, N'18440268-8 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (573, N'Apoderado_Esperanza_18481@gmail.com', N'$2a$10$hOK8cIYGh06klQtjMczLO.vdmh.qFK4cZpY.elACVwhmaRCZ797wG', N'Apoderado_Esper_18481', 1, N'18481991-0 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (574, N'Apoderado_Ariel_18486@gmail.com', N'$2a$10$GOMjr.e7LOB8PCnrfEh/rett1VMO9X88F7x9vEYxnmO766aMUlhEu', N'Apoderado_Ariel_18486', 1, N'18486531-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (575, N'Apoderado_María_18487@gmail.com', N'$2a$10$8DbLSzTf88Unn75qe/KLlODo0SZLqlky9IkBneoKPYkc3prg9dE3a', N'Apoderado_María_18487', 1, N'18487169-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (576, N'Apoderado_Hermenegildo_18491@gmail.com', N'$2a$10$rJhnqai9TNJ8cLIWdo3CX.RnAdr39.H2mmjClEph6yu7wyFymP3zi', N'Apoderado_Herme_18491', 1, N'18491573-1 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (577, N'Apoderado_Filomena_18495@gmail.com', N'$2a$10$VUFo1sJlBNlNHX2badjXvOKq91caPK3oJhM5/zCDy2lppM5cHbbAG', N'Apoderado_Filom_18495', 1, N'18495766-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (578, N'Apoderado_Tere_18532@gmail.com', N'$2a$10$TPWuYxVD3pJlJ117QXqYG.Tox4AU6PpV6aHfEE.1yYbb9jkYnBWa2', N'Apoderado_Tere_18532', 1, N'18532071-5 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (579, N'Apoderado_Moisés_18543@gmail.com', N'$2a$10$C2KrgGzPh4D8ZO0/m6oOOeo19fhZj52OodY8zo.dT03QMh3UDdIKm', N'Apoderado_Moisé_18543', 1, N'18543862-7 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (580, N'Apoderado_Camilo_18575@gmail.com', N'$2a$10$xE7pxiosaKTx6uDHCyu42OtkfLBoQnKXEf1OWivkVLEabB9VyJnAy', N'Apoderado_Camil_18575', 1, N'18575156-2 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (581, N'Apoderado_Tania_18595@gmail.com', N'$2a$10$qTcs7h.wrlEoWSfhsyCp2.2UyxdUdzRQHQFmTxfYnmzNXTP77Y.yu', N'Apoderado_Tania_18595', 1, N'18595030-1 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (582, N'Apoderado_Adolfo_18598@gmail.com', N'$2a$10$Hy67/DNC8pgHZeXYmocXd./EbIrID/7b3x2nEl6C.R0t5oeftvBii', N'Apoderado_Adolf_18598', 1, N'18598960-7 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (583, N'Apoderado_Nydia_18599@gmail.com', N'$2a$10$UEnqXSFFFIddtBtzPtZjbOF64dLZ24ClnNNv2aHygIwTAK/SHuSnG', N'Apoderado_Nydia_18599', 1, N'18599136-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (584, N'Apoderado_Rodolfo_18604@gmail.com', N'$2a$10$ezHm686RP.SD0xC.QQT/8eOlomo8Ui/MC0ZT6VRSstCa0MkJiUeJS', N'Apoderado_Rodol_18604', 1, N'18604493-2 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (585, N'Apoderado_Oriana_18619@gmail.com', N'$2a$10$b9V3Q4VHFwOw0XcZXWZyp.aMSF3p948/1QckmOKt21XskAy6LHGTG', N'Apoderado_Orian_18619', 1, N'18619682-1 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (586, N'Apoderado_Elodia_18631@gmail.com', N'$2a$10$LEMMpHyEBCkFXXaqzIsnf.cnCq0GYfZNZ4zfXG.ENlbvipqAKsWVG', N'Apoderado_Elodi_18631', 1, N'18631423-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (587, N'Apoderado_Marciano_18638@gmail.com', N'$2a$10$xVnfPk.kxV5OfpHToQpioeOGdIkgVgXPwdaGMA6DUootKJr0sOcHm', N'Apoderado_Marci_18638', 1, N'18638684-1 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (588, N'Apoderado_Lázaro_18645@gmail.com', N'$2a$10$FClApCxP9I7lNh7xqnMt4..FU64mHbyxPh82LXCi28Yfwanx8kNYq', N'Apoderado_Lázar_18645', 1, N'18645135-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (589, N'Apoderado_Reyes_18653@gmail.com', N'$2a$10$4DtZeSehBaCm5JjTa7zeDOUJPezvq/rxCOR7IeyCuJjIjchTtkWXK', N'Apoderado_Reyes_18653', 1, N'18653731-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (590, N'Apoderado_Magdalena_18660@gmail.com', N'$2a$10$gFzVnAolWKQqcbCvt3Xi3unqpKnc4b7KLhpxaW9vK2d2Rhp6WZn.y', N'Apoderado_Magda_18660', 1, N'18660568-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (591, N'Apoderado_Jose_18686@gmail.com', N'$2a$10$du1pTALL4vlpc8rznm5gUusz36FW/mI5PSmHCZl9UNX9I//hD6HfW', N'Apoderado_Jose_18686', 1, N'18686963-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (592, N'Apoderado_Carlito_18691@gmail.com', N'$2a$10$o4heqc76kyTAWZ6Q0RJOBeBQioYJqo9ZufE5FLELbFUxDEZbOyF0a', N'Apoderado_Carli_18691', 1, N'18691861-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (593, N'Apoderado_Josué_18700@gmail.com', N'$2a$10$3gBrhr9zNDLu2Fm8RTv2bueqKnKvBvDRAV0XHDKorTTGl/bBb0zl6', N'Apoderado_Josué_18700', 1, N'18700817-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (594, N'Apoderado_Fidela_18721@gmail.com', N'$2a$10$OMhUFQhLEvDu2JbRqkkn7OnziWJ1DDOqJ99EnipVML8HAdl.BZBf.', N'Apoderado_Fidel_18721', 1, N'18721005-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (595, N'Apoderado_Cleto_18728@gmail.com', N'$2a$10$qwXDO..avENwPdiUI55D.O3.AZ7DvqpKhVOIGhzLjZzG85w7p3LP6', N'Apoderado_Cleto_18728', 1, N'18728155-5 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (596, N'Apoderado_Modesta_18738@gmail.com', N'$2a$10$MzFxT5cZrRBbLHyLhVRKA.azgFDhywJnLvX.rRFzFd8dorgWgC852', N'Apoderado_Modes_18738', 1, N'18738186-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (597, N'Apoderado_Eligio_18744@gmail.com', N'$2a$10$wVpIC.cXdlJQRG81yd4dGOxkxnrVJ57HE5tD2cQmMhcUZzgV5Zp.O', N'Apoderado_Eligi_18744', 1, N'18744001-7 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (598, N'Apoderado_Juliana_18749@gmail.com', N'$2a$10$4/s6hSQykEVEdMfiw.OoPuLevOqdTpTcKlJjzDPJ4K0Cb/5y2HGie', N'Apoderado_Julia_18749', 1, N'18749256-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (599, N'Apoderado_Lupe_18756@gmail.com', N'$2a$10$IxxGwRvMN/4HWx7w526nkeHVZO3wIgIpwtdMR7rzE9yCEcYhD65Qa', N'Apoderado_Lupe_18756', 1, N'18756477-8 ', 1)

INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (600, N'Apoderado_Reynaldo_18762@gmail.com', N'$2a$10$AfDQpZ5rf0hGwRvy44DFHOlaTUp5nRX2g3WTb6/yKC.1hNMkyoPMK', N'Apoderado_Reyna_18762', 1, N'18762861-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (601, N'Apoderado_Abraham_18766@gmail.com', N'$2a$10$bbE1TQnjcUU.0gffdyhE.OSKXvjQi.8ukvJLYNtlNYpj5qc9.U8Ia', N'Apoderado_Abrah_18766', 1, N'18766791-7 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (602, N'Apoderado_Andrés_18767@gmail.com', N'$2a$10$F.T4eIf4bExGMJM3ZWSVzexyV.OqrY7oZ7aC644Bz.9S.BGyamiu6', N'Apoderado_André_18767', 1, N'18767755-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (603, N'Apoderado_Encarnación_18783@gmail.com', N'$2a$10$SLntWPoSWS3vB699/KcZ4.1wcfaW9HuLkzit2NP.mhemGtDFFFfnu', N'Apoderado_Encar_18783', 1, N'18783520-8 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (604, N'Apoderado_Fermín_18798@gmail.com', N'$2a$10$FAXoHXrXwJI13M2cllgNr.T8AsW07JrYdVECOeC9R1H6OQTLLqZ3O', N'Apoderado_Fermí_18798', 1, N'18798124-7 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (605, N'Apoderado_Florentino_18814@gmail.com', N'$2a$10$CWtIIy/U/qmdO.sgEwp9wOv6hAfRUT3iGOkY0U5L6ZRoxUXZoHSdq', N'Apoderado_Flore_18814', 1, N'18814692-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (606, N'Apoderado_Lupita_18816@gmail.com', N'$2a$10$IAkjUagmJCAgbgIQWM4gyuBkYyhaCfjInWxM3g5Swv6AmW8ukKb2O', N'Apoderado_Lupit_18816', 1, N'18816018-2 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (607, N'Apoderado_Leoncio_18844@gmail.com', N'$2a$10$7036GA742EXzwcvKN.5PWewZA7EIE0mtMuaoVHjxaf93mk7cYLanu', N'Apoderado_Leonc_18844', 1, N'18844964-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (608, N'Apoderado_Sebastián_18845@gmail.com', N'$2a$10$eZTjfbjuNbHMA/HEosfcpOglzGUMKTbCsdEZrB3x/c2Yw6WEqTHFS', N'Apoderado_Sebas_18845', 1, N'18845209-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (609, N'Apoderado_Fulgencio_18852@gmail.com', N'$2a$10$IEMNrgfxTkIjkvwsX/8a4eR.IFY.Ii9UOChCZVG/iwX0rtdpIGtay', N'Apoderado_Fulge_18852', 1, N'18852359-5 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (610, N'Apoderado_Soraya_18855@gmail.com', N'$2a$10$dhxWBNugVVpJZnbgD3DARuNw3VSJ/VKjZ4XCrZYybVpJ3WiDdphuK', N'Apoderado_Soray_18855', 1, N'18855282-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (611, N'Apoderado_Teo_18855@gmail.com', N'$2a$10$6jCRe9yQ7hxeCJngcVE/8.rQZKCF5P5mwQfBRCXGY1mZ1Q9QC2IIS', N'Apoderado_Teo_18855', 1, N'18855611-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (612, N'Apoderado_Maricela_18858@gmail.com', N'$2a$10$Y8EX2haLN.cIPzvg7azizeDnJDOUC1SDP2WgIgAAy9QdCg05K91LO', N'Apoderado_Maric_18858', 1, N'18858185-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (613, N'Apoderado_Maxi_18874@gmail.com', N'$2a$10$mxnVXw7YcOlSd7nKp4BBO.P9ZcuJmW4mEqMYsK4wG0fdJz7953HSa', N'Apoderado_Maxi_18874', 1, N'18874107-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (614, N'Apoderado_Segismundo_18875@gmail.com', N'$2a$10$MzOJrwia7NcNa52Hi4ZW..aB3TNu3FxvYO4SpmJLXK6dLQ.y5ke9e', N'Apoderado_Segis_18875', 1, N'18875515-1 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (615, N'Apoderado_Zaira_18893@gmail.com', N'$2a$10$ZaSlb6SxVsY2d6tDenaZDens4j1QCu9spCmW6x9DyDrIs.qbyt2gO', N'Apoderado_Zaira_18893', 1, N'18893694-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (616, N'Apoderado_Noelia_18900@gmail.com', N'$2a$10$SwiFxT7Rwzw4xuxORIE7Y./2bf2HxQQOQ2HbFZl9IHBQS4xsNYo8S', N'Apoderado_Noeli_18900', 1, N'18900246-7 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (617, N'Apoderado_Palmira_18911@gmail.com', N'$2a$10$BMZ4VnAfd7X0.yuHJ4aoJuL5o8TNGIVQE.nrqgoQwg9KjaIiXBGJm', N'Apoderado_Palmi_18911', 1, N'18911726-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (618, N'Apoderado_Jose_18922@gmail.com', N'$2a$10$gjsQTbFFwQAq/jQ0nGWhkeQOLW0JNjPSpToBQv8qtTUd19jw8aga2', N'Apoderado_Jose_18922', 1, N'18922942-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (619, N'Apoderado_Susanita_18926@gmail.com', N'$2a$10$fWTrHgodiPHJ2rTxNgZBtuotMMw1q.Xq9lRjp2zeI8J1bhuK8BO2G', N'Apoderado_Susan_18926', 1, N'18926834-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (620, N'Apoderado_Gonzalo_18927@gmail.com', N'$2a$10$2ss1BtmnwU0x3teglP2rMOAcl/.TYWs2RSpl4lvOa5MVrGSNRY0lK', N'Apoderado_Gonza_18927', 1, N'18927008-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (621, N'Apoderado_Apolinar_18935@gmail.com', N'$2a$10$R97bGvtYYiVd3pQyblD5VeKVMUmEmZOtU01.VQNPf5Ac/i2zfCt/i', N'Apoderado_Apoli_18935', 1, N'18935628-5 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (622, N'Apoderado_Balduino_18936@gmail.com', N'$2a$10$wnLFGTOeE9xDkj61pWl4Ye8s7JRf7ObVRBOu2TbbAyW4t/Pa7RWnS', N'Apoderado_Baldu_18936', 1, N'18936163-7 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (623, N'Apoderado_Arsenio_18949@gmail.com', N'$2a$10$6XrFqduN2zV1QMHxB/6NceJy.DDxpD7lWVAGeCJ9Vr64SC9gW/iGi', N'Apoderado_Arsen_18949', 1, N'18949920-5 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (624, N'Apoderado_Alma_18953@gmail.com', N'$2a$10$V8fVySq.ddYCwnDJbpK.ouR.hibIpy85zh64ZUzemWhCtwAAHBLbq', N'Apoderado_Alma_18953', 1, N'18953288-1 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (625, N'Apoderado_María_18956@gmail.com', N'$2a$10$YhZnNczQTjrct1vmn0wqaumJ1Hs1jPeIAkuhxlBYO2H8isX4ISh3C', N'Apoderado_María_18956', 1, N'18956474-0 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (626, N'Apoderado_Úrsula_18978@gmail.com', N'$2a$10$/VOrmbiGkujqkeXfRF3tdutmlVNcyF425TaCw9UO7RKTsWQinO3Ly', N'Apoderado_Úrsul_18978', 1, N'18978016-8 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (627, N'Apoderado_Natalio_18979@gmail.com', N'$2a$10$cMoXJ5uHdFKNwmKFBwKH8OcLbutgZBaUTAnRMqgpBwjWhk0KKQq.S', N'Apoderado_Natal_18979', 1, N'18979688-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (628, N'Apoderado_Candelas_18982@gmail.com', N'$2a$10$ooJF/BXeZh1URtkDYUHgHusuRL2UIsEFSZmN9fKWgTuN2EF5uONjG', N'Apoderado_Cande_18982', 1, N'18982627-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (629, N'Apoderado_Loreto_18999@gmail.com', N'$2a$10$pA.0pLG3Yfl8JnIa0/wAAecOJp8IeIv7KXEpKfLeWPbEBfpnryt3y', N'Apoderado_Loret_18999', 1, N'18999464-8 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (630, N'Apoderado_Ulises_19006@gmail.com', N'$2a$10$ygN24ndwghsTBj3DPpWblO7.j5Khy.r515LqzZrDv8zGc.joReGjK', N'Apoderado_Ulise_19006', 1, N'19006555-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (631, N'Apoderado_Armida_19018@gmail.com', N'$2a$10$rprFgfAJAKSOIA1uPVSn/OIptMjbeFGipepuqBU85Dh0UBH9JDKwO', N'Apoderado_Armid_19018', 1, N'19018136-7 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (632, N'Apoderado_Marcela_19026@gmail.com', N'$2a$10$eoYSfYH2kCo5FiU4.GrkYOrKuxFiRzLGw6n6NxTCRxrD8ycqRFEAS', N'Apoderado_Marce_19026', 1, N'19026280-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (633, N'Apoderado_Fausto_19036@gmail.com', N'$2a$10$7mrzFi51UzSzdgV8iDKbYu2K6eQ1LEtqfm6855SoxK8gV9AwHZelK', N'Apoderado_Faust_19036', 1, N'19036268-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (634, N'Apoderado_Teresa_19058@gmail.com', N'$2a$10$N9T32XpA.v4jjMzDsU0rnu020nNk4rDVdDRtkTJ3fR54Elgf9SYki', N'Apoderado_Teres_19058', 1, N'19058643-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (635, N'Apoderado_Ildefonso_19096@gmail.com', N'$2a$10$yN/O24Yce/Lxe8EyjIv0beWfgzag.D9.gM9UC9cH12dNah8hsxo0K', N'Apoderado_Ildef_19096', 1, N'19096620-8 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (636, N'Apoderado_Carolina_19105@gmail.com', N'$2a$10$fXUSJ0TnRpeyk3pqyTPJx.7QvcKGserKNUudvB6zMJYcldQlYts2.', N'Apoderado_Carol_19105', 1, N'19105493-8 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (637, N'Apoderado_Edu_19115@gmail.com', N'$2a$10$4KgXniRcjkrH5CqB.A8WJe2.32sw5nnjpNMSxS2cVWHxmQC5xmkGa', N'Apoderado_Edu_19115', 1, N'19115407-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (638, N'Apoderado_Rosa_19120@gmail.com', N'$2a$10$KNv42q/AdVqXrk7sfYOX3eoc1AAYDnqNhHEcT8a77IliN..Lk2uW2', N'Apoderado_Rosa_19120', 1, N'19120436-0 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (639, N'Apoderado_Carmela_19128@gmail.com', N'$2a$10$8tB1INRzadWiIYvbwq8abO8lo7Q1MmQZKyno5F32yONs3yrOQQIvS', N'Apoderado_Carme_19128', 1, N'19128881-5 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (640, N'Apoderado_Encarnacion_19135@gmail.com', N'$2a$10$EcWU1jZF03GI3a8N0aYoWea/1K4dlhO2c30DtonuZFH9D8nxN4HKq', N'Apoderado_Encar_19135', 1, N'19135515-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (641, N'Apoderado_Rosario_19155@gmail.com', N'$2a$10$bOz05U8F8FiKZBH0V4OQM.JCxyyFtLapQo3OR9Su5GEpX6FwOjFY.', N'Apoderado_Rosar_19155', 1, N'19155144-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (642, N'Apoderado_Evaristo_19163@gmail.com', N'$2a$10$55/Y8gUh5nUQcYKLd.Qb6.nOYg7wm0q7JZsJgLf50m1CRW/E.Yb5O', N'Apoderado_Evari_19163', 1, N'19163059-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (643, N'Apoderado_Natalio_19176@gmail.com', N'$2a$10$WxPHq1DeWyea0XmJQy/r8uAV4ja/Bq95fDZIXXQr8V5VWoWBnecva', N'Apoderado_Natal_19176', 1, N'19176601-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (644, N'Apoderado_Cándida_19184@gmail.com', N'$2a$10$CaDzZEgSAbYOl68PPO.uZOTEg86dawKGATGrDsQqr41jgExWyJDh2', N'Apoderado_Cándi_19184', 1, N'19184328-2 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (645, N'Apoderado_Clímaco_19198@gmail.com', N'$2a$10$..X0hWgHNoerTeVE6h61WOkHvx7TWjO7EhCCqYOyqmpLtDvsHJaz.', N'Apoderado_Clíma_19198', 1, N'19198923-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (646, N'Apoderado_Luciana_19199@gmail.com', N'$2a$10$szFdng0Cejgx4ThnKK9LeetNBnDS4ENmPlsF5U13YaKzRntN895Qm', N'Apoderado_Lucia_19199', 1, N'19199357-8 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (647, N'Apoderado_Otilia_19204@gmail.com', N'$2a$10$jsb7AV.MSqamCAadjTrHPuTHuldEy2oqihpJJZLnwsnea.oZtRC/e', N'Apoderado_Otili_19204', 1, N'19204242-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (648, N'Apoderado_Andrés_19233@gmail.com', N'$2a$10$F6N92yT.jUQ4bTTtmPryxur1QamtH57ib7wZFvjuKWX8.wJ0cd1ta', N'Apoderado_André_19233', 1, N'19233618-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (649, N'Apoderado_Samanta_19237@gmail.com', N'$2a$10$NVmNxnjHFs6priw7mUtJo.WKiYKhhEN7sntX0OFwTogFOamayJzDm', N'Apoderado_Saman_19237', 1, N'19237267-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (650, N'Apoderado_Ariel_19250@gmail.com', N'$2a$10$4vscW0EG.U7j9CZE9ZcLTOMoa2scUrvTImLj8i1h6Hi3C/bLflm3m', N'Apoderado_Ariel_19250', 1, N'19250569-0 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (651, N'Apoderado_Serafina_19253@gmail.com', N'$2a$10$72E7BzUD8z9YiFIiHIUTOuxsyenrT8G6r8aIylPKCpxP9FlKH/LWC', N'Apoderado_Seraf_19253', 1, N'19253791-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (652, N'Apoderado_Jose_19255@gmail.com', N'$2a$10$wd7T7KfL6gfVc6NRUqaRpOkJUHEjA/FpEfx2IRs97KEWVC1S2II8u', N'Apoderado_Jose_19255', 1, N'19255256-7 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (653, N'Apoderado_José_19270@gmail.com', N'$2a$10$ZmBOt5KwO1R1Y32UpheTcevhmpIbiOHSTqUhhBIAetVIFE4/E4Tfe', N'Apoderado_José_19270', 1, N'19270650-5 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (654, N'Apoderado_Celia_19292@gmail.com', N'$2a$10$dzh6i5Q5G0yVOr1bPdYtrO0Q2DNnGXkY5rfswTxmRm0P4cDpTYKbO', N'Apoderado_Celia_19292', 1, N'19292152-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (655, N'Apoderado_Juan_19308@gmail.com', N'$2a$10$tafOIeFuIulkkPlIK8xk5.noMq.FfDBVmFBfyeJj2vCuqKJ/ZP7J2', N'Apoderado_Juan_19308', 1, N'19308270-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (656, N'Apoderado_Gregorio_19311@gmail.com', N'$2a$10$jGNXAOcdIcKCMX1Epvo6R.pZ5dT2CWuJoPhwOprp59XEDHgIxQrp.', N'Apoderado_Grego_19311', 1, N'19311341-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (657, N'Apoderado_Sonia_19324@gmail.com', N'$2a$10$nzTroO/IoVqP.0gr5Wadn.DDJolNAU1fy9/Qn3xRT5pMUanVEehSO', N'Apoderado_Sonia_19324', 1, N'19324641-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (658, N'Apoderado_Rebeca_19335@gmail.com', N'$2a$10$BZ1dszX9RoYVK0WZncu9YOqNBNpvkv1EbsAKKYbVnbb1hyj8l0z4e', N'Apoderado_Rebec_19335', 1, N'19335925-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (659, N'Apoderado_Perlita_19341@gmail.com', N'$2a$10$yCU2O88A1JeSDqAqpSmQW.bEdDtUUAkngcE7P7zaolDhLRBSX4nVW', N'Apoderado_Perli_19341', 1, N'19341550-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (660, N'Apoderado_Susana_19369@gmail.com', N'$2a$10$UR1o//Jo.bd2L6mQgeRnP./7mK.TjsihUVtFc1nHe7ikd06fdNyN.', N'Apoderado_Susan_19369', 1, N'19369379-2 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (661, N'Apoderado_Palmira_19382@gmail.com', N'$2a$10$Qthgrd5zOIP4ML2BN4LBDe8VspSF7pP8c92JfeFc0ImvCJJXyPNrm', N'Apoderado_Palmi_19382', 1, N'19382159-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (662, N'Apoderado_Eliseo_19384@gmail.com', N'$2a$10$oOYYRm.sWjjPUttEWoR6EejgB//Mt1VtumaIOFtm6ouMixamVf4B6', N'Apoderado_Elise_19384', 1, N'19384334-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (663, N'Apoderado_Lisandro_19385@gmail.com', N'$2a$10$XwMNDI5zy7AYwGFky479Vuj8rSFrkcK6RNa83PK4bssiGCfpDkTmG', N'Apoderado_Lisan_19385', 1, N'19385443-5 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (664, N'Apoderado_Jose_19386@gmail.com', N'$2a$10$UFVLXs.hDnqMMK3vncaFLec1fNeeQSPEB6ltBCf18Gi5hcwk2acX2', N'Apoderado_Jose_19386', 1, N'19386900-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (665, N'Apoderado_Dorotea_19400@gmail.com', N'$2a$10$9lJ67BRk1OROHBjb.gwuSe6DSEVoINxFrLHOdJCrm9KM3ALVI4jl6', N'Apoderado_Dorot_19400', 1, N'19400209-2 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (666, N'Apoderado_Yéssica_19402@gmail.com', N'$2a$10$tpFlHhGZQ98R.rTUQ0uYuuaqwAoHVm41MqlUe3u26FH0GZq4vUwli', N'Apoderado_Yéssi_19402', 1, N'19402121-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (667, N'Apoderado_Eutimio_19411@gmail.com', N'$2a$10$xg58Qe5cI13M2ZkipwAa5OBH.m5gacn2USaxm7RwUyOJojh4fCZn2', N'Apoderado_Eutim_19411', 1, N'19411124-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (668, N'Apoderado_Heliodoro_19432@gmail.com', N'$2a$10$AllIphC.yOz4jkEo6v4td.ELqVIrODhAUpC70GD8OD2fdTTGhBnt.', N'Apoderado_Helio_19432', 1, N'19432846-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (669, N'Apoderado_Valeria_19438@gmail.com', N'$2a$10$rujx/q1P7I3jLy/oc3uVf.rIuMYrrtPdHhvrTyzsIr3/.eVdPOcse', N'Apoderado_Valer_19438', 1, N'19438767-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (670, N'Apoderado_Jose_19448@gmail.com', N'$2a$10$/rXw/NQpQ7OS89Xm6fGPGeSmTXh7WxIXBJxPR97xEOIQPSC.byJ/e', N'Apoderado_Jose_19448', 1, N'19448250-7 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (671, N'Apoderado_Joaquina_19454@gmail.com', N'$2a$10$iZ20kIL1bUYsjnfkXb/EmegC/0nP8Yd45VDKOZZ8vV/qbpvcOX4eu', N'Apoderado_Joaqu_19454', 1, N'19454640-8 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (672, N'Apoderado_Alejo_19457@gmail.com', N'$2a$10$.ZXXFpfZrhQc6w10Pdd78.xvjN52DegSZgvuh7IHauA1VtbDWLKSy', N'Apoderado_Alejo_19457', 1, N'19457785-0 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (673, N'Apoderado_Noé_19473@gmail.com', N'$2a$10$kuQD5qAKOrnJmhnY5K.J3.ZloYPN3D3nmmSbEfbWv.8osYJf4.TLi', N'Apoderado_Noé_19473', 1, N'19473318-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (674, N'Apoderado_María_19484@gmail.com', N'$2a$10$rbOF/lBzRWeT4O92qnuEgeuhBcKs6ULmuQezospQVwGLE9tiW1jCK', N'Apoderado_María_19484', 1, N'19484957-5 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (675, N'Apoderado_Wálter_19528@gmail.com', N'$2a$10$hSlXsSouGELBR51DE.OxcubUti.DLUaI/bgYmbX16FVEv6LoYreNG', N'Apoderado_Wálte_19528', 1, N'19528644-2 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (676, N'Apoderado_Lorenzo_19547@gmail.com', N'$2a$10$gTuU4xaS3UdRvoiRkpNaWuFLWZ6wWe/DmKGEek.Pi1beq6Y7bR9EW', N'Apoderado_Loren_19547', 1, N'19547817-1 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (677, N'Apoderado_Bibiana_19548@gmail.com', N'$2a$10$6/Ji/hXONOharm0t5asJZuDZ84AGN6mDg5AMqKE9FJnwIQhIobn2e', N'Apoderado_Bibia_19548', 1, N'19548611-5 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (678, N'Apoderado_David_19557@gmail.com', N'$2a$10$6uFFS0F4OUiacAMBwQPHc.V4ji3uaEgHmE.2UwcdZvtIrOQi8I7le', N'Apoderado_David_19557', 1, N'19557515-0 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (679, N'Apoderado_Flora_19559@gmail.com', N'$2a$10$rrCxUu2BkZRodMHTCn3hxuI7xJAHh7NAmkPy.xUs5Xy9VTssBB6Da', N'Apoderado_Flora_19559', 1, N'19559641-7 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (680, N'Apoderado_Azeneth_19569@gmail.com', N'$2a$10$HOL/wUNXwe8ZaiY2bPAW4O0FERpHqrWvv7xwRlifNwnNMyxS0c0C2', N'Apoderado_Azene_19569', 1, N'19569203-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (681, N'Apoderado_Nicolás_19583@gmail.com', N'$2a$10$aEGSdldUVpMJ8SJGU4mwe.cKNPC5E1U9fSNNjKjgvHFlHQbCw4mMi', N'Apoderado_Nicol_19583', 1, N'19583718-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (682, N'Apoderado_Crescencia_19585@gmail.com', N'$2a$10$rdiLFD/XnGsYCDCL.MPkduWHiSmnOlFm5DYcWHBSzj35YtV07MtCW', N'Apoderado_Cresc_19585', 1, N'19585533-1 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (683, N'Apoderado_Emilia_19586@gmail.com', N'$2a$10$vYN3xpiuxq6SZRVVFQ2lFO8CHt1acuUDRHzzFflrjtwBXp/MokBnK', N'Apoderado_Emili_19586', 1, N'19586515-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (684, N'Apoderado_Miguel_19631@gmail.com', N'$2a$10$ETbWbF6sE//AN29fVBPB3euANRi8Ajsxd.EO/chxT1X3kmKvaAvXu', N'Apoderado_Migue_19631', 1, N'19631044-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (685, N'Apoderado_Miguel_19634@gmail.com', N'$2a$10$iIsY.Qo4UGAqh2jgMEcVOunaAlWKIrs/I5h6cLXxSOUjKDDyHDVnS', N'Apoderado_Migue_19634', 1, N'19634706-2 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (686, N'Apoderado_Bienvenida_19656@gmail.com', N'$2a$10$um7L7YCiGatv1A/Vvt.90uLm1tDomkGEhGR8lLijUWaYhPyC9VpFG', N'Apoderado_Bienv_19656', 1, N'19656943-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (687, N'Apoderado_Nicanor_19659@gmail.com', N'$2a$10$P8DfC3NVKRYpaJryWG7KbOkpdDWoa.ntz5JS0RL0sE55MlAGZGjDC', N'Apoderado_Nican_19659', 1, N'19659359-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (688, N'Apoderado_Elba_19664@gmail.com', N'$2a$10$lKAFeEsKMCA6Kr6UiDyIPeT0J8NyFUYJzWbiFFuEJdc.cj3rHa7mq', N'Apoderado_Elba_19664', 1, N'19664081-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (689, N'Apoderado_Cosme_19669@gmail.com', N'$2a$10$ytrueXC9IJxyCiYYKFJkmOp16zymFNMXQCVp6sbZMIofiGpjPzM4C', N'Apoderado_Cosme_19669', 1, N'19669963-5 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (690, N'Apoderado_Vicenta_19670@gmail.com', N'$2a$10$Y4YVtW8OCJ8hUj5eLANM0ulCfhIrxkLgRkDri6VU6DpzclJ4vzFrO', N'Apoderado_Vicen_19670', 1, N'19670967-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (691, N'Apoderado_Marcelo_19676@gmail.com', N'$2a$10$rVXLrcckOpuot9.zyzUI9O1xEy6KV9hReaZmmg1P/QK0zPDf8JLmq', N'Apoderado_Marce_19676', 1, N'19676501-8 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (692, N'Apoderado_Mateo_19687@gmail.com', N'$2a$10$IP6Rd6BTuG5GbaMQzKI7puLn1UxgArOUeLulI.tuR3QErMzjpawO.', N'Apoderado_Mateo_19687', 1, N'19687629-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (693, N'Apoderado_Trinidad_19700@gmail.com', N'$2a$10$pPp2RnUTgiAs8XvWYH3mKOuT5OKZ992TfQqnBA3iMRy7sdRdVmknu', N'Apoderado_Trini_19700', 1, N'19700750-8 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (694, N'Apoderado_Reyes_19714@gmail.com', N'$2a$10$v3IxVb8EAyGyRJgFkmGVi.rrfA8R7cwOAJZz9jfJCTxOHEhS2posm', N'Apoderado_Reyes_19714', 1, N'19714290-1 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (695, N'Apoderado_Melisa_19743@gmail.com', N'$2a$10$Z7YpIZRsuhUPWU.douDA5OuIp4lm5tqounLEYRd4yK1FxcubxJ8jq', N'Apoderado_Melis_19743', 1, N'19743620-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (696, N'Apoderado_Francisco_19748@gmail.com', N'$2a$10$NBWX7t4/mJm4l6Eauv7/Kuh9mrpIPgGazX0kEYGCevdg0fV8UmSrO', N'Apoderado_Franc_19748', 1, N'19748195-1 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (697, N'Apoderado_Benita_19752@gmail.com', N'$2a$10$ScYRTW0O3zbYflX1ZQ7bgeu9nO7X93NpIvQ2LX9i6K6.Az63nWdZG', N'Apoderado_Benit_19752', 1, N'19752704-8 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (698, N'Apoderado_Amada_19755@gmail.com', N'$2a$10$7t0lWwTRlSYmBWRgX0E5y.AL9RvbEiYMUwMMHoXTA/TmgciaYTkPO', N'Apoderado_Amada_19755', 1, N'19755898-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (699, N'Apoderado_Gaspar_19783@gmail.com', N'$2a$10$HAVZzAjrhVMDhDYcX5VQqurRwVkV04qxom5oFdz/O9xCO6ke1wMXK', N'Apoderado_Gaspa_19783', 1, N'19783662-8 ', 1)

INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (700, N'Apoderado_Reyes_19815@gmail.com', N'$2a$10$1G/luU85vhhz7BxSm6Ml4OCxH.ZTVyOYTnG94g3wnXUaWLpwjWkU6', N'Apoderado_Reyes_19815', 1, N'19815608-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (701, N'Apoderado_Genoveva_19823@gmail.com', N'$2a$10$j8sle7I9Cyi2RJQNLFPDoOIAAQ97wFJdrit4/f3y8MG4dZmJ1dUMm', N'Apoderado_Genov_19823', 1, N'19823600-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (702, N'Apoderado_Marcio_19840@gmail.com', N'$2a$10$rFK4w9QKvUAhXXZUki.Fj.nAsVjZsnk/YJxym2Wrhn8kd25u3TvdO', N'Apoderado_Marci_19840', 1, N'19840621-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (703, N'Apoderado_Luciano_19848@gmail.com', N'$2a$10$OJYO.4JNCpHy2cJQc1zj0.0n5lTMj7XetqbgPPrMaKOp6iJs0s1AG', N'Apoderado_Lucia_19848', 1, N'19848581-0 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (704, N'Apoderado_Godofredo_19850@gmail.com', N'$2a$10$bo4fgTDpbHYIMMFAtO01ieRzl15u44mygTSAliJtMoEdfUB/nf0RG', N'Apoderado_Godof_19850', 1, N'19850820-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (705, N'Apoderado_Encarnita_19853@gmail.com', N'$2a$10$tPK01OrcLvCRSmHEME4.Y.A.MC/seUBCbVSIQ0w3rzxr7PZ8ME7W.', N'Apoderado_Encar_19853', 1, N'19853989-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (706, N'Apoderado_Quique_19860@gmail.com', N'$2a$10$5V0tqdDnn7qOxtaXoK7Av.BZjv32IUBqEKH2kE7vRoDIGFJTP2ZT.', N'Apoderado_Quiqu_19860', 1, N'19860422-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (707, N'Apoderado_Fabián_19866@gmail.com', N'$2a$10$dC8uhWVa.biXZGMlqUYp/.1HQcgXkHK/xSuIL04LvWh3fDqN6HR8i', N'Apoderado_Fabiá_19866', 1, N'19866433-2 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (708, N'Apoderado_María_19878@gmail.com', N'$2a$10$cJzTeN5bSTlQgjLtsC626uOY7QewbMXmyIhGEC9SKWeAaXYW9FhYe', N'Apoderado_María_19878', 1, N'19878870-8 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (709, N'Apoderado_Aristides_19886@gmail.com', N'$2a$10$/mA3UroFuLIKzbVgjgcPQOd5qvqV.ZpcHMWtmDDL/n55YQaYuoWwK', N'Apoderado_Arist_19886', 1, N'19886592-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (710, N'Apoderado_Chelo_19910@gmail.com', N'$2a$10$WG9wmmKlz4kStQh09NVVmOV.f.fecGrSptD.Fm8JRFDqQpAipzA92', N'Apoderado_Chelo_19910', 1, N'19910380-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (711, N'Apoderado_Hernando_19918@gmail.com', N'$2a$10$CclOvkQ.4KshDAooFLPRlOjhA4VEKjwCY6pzoSq2OF3apeiVgC5Ni', N'Apoderado_Herna_19918', 1, N'19918987-5 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (712, N'Apoderado_Asdrubal_19932@gmail.com', N'$2a$10$FpUxF2d1rRZRrWZUEZkaouwStxlFPV7sC1fa8ka3gKA5fFFZFhQ8e', N'Apoderado_Asdru_19932', 1, N'19932684-8 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (713, N'Apoderado_Cruz_19935@gmail.com', N'$2a$10$f.d6TFwkQCMN8Ch6p7rdluPBfJJf/DYgWBDnlpazCx8pw6ebHTS1S', N'Apoderado_Cruz_19935', 1, N'19935501-5 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (714, N'Apoderado_Bienvenida_19947@gmail.com', N'$2a$10$TIISIEB9WLKc7d3aE8P0oeFgWbmsLTK6kgvNaXgTbJIb823NxnNZm', N'Apoderado_Bienv_19947', 1, N'19947745-5 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (715, N'Apoderado_Chema_19948@gmail.com', N'$2a$10$fJiBeUTkXMtLJNecSdBiauet3Et2F0CVjA7x50Q4RRHGX9pVON3/G', N'Apoderado_Chema_19948', 1, N'19948887-2 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (716, N'Apoderado_Tiburcio_19958@gmail.com', N'$2a$10$p4kaGPbaLDBL8CbUwwWSDOI5G5Q/XcSlhZfASLEXzLrhc5pnmL4d2', N'Apoderado_Tibur_19958', 1, N'19958763-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (717, N'Docente_Flavia_10253@gmail.com', N'$2a$10$DF6.RAd3WH0PbZLUwuamf.riVVmi78EBCwcXWSb5u3jZ1kcn4cTYK', N'Docente_Flavi_10253_2023', 2, N'10253981-8 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (718, N'Docente_Eusebio_10258@gmail.com', N'$2a$10$N7kusQJ/925HDhi1ADf5/enxuXpDxGeUR44rMcNskcJdjnjNXLC0O', N'Docente_Euseb_10258_2023', 2, N'10258276-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (719, N'Docente_Natalia_10282@gmail.com', N'$2a$10$A4Do4ZwmXs8gQe5YcBRxjugHWSDDcgW21MHEMIfioIr3ItaTA8DVa', N'Docente_Natal_10282_2023', 2, N'10282003-7 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (720, N'Docente_Valeria_10283@gmail.com', N'$2a$10$VtgBej76hoogISCkf3NMtOf1A5vb1zKuNzhV2FhleAaK16E01.YIi', N'Docente_Valer_10283_2023', 2, N'10283850-5 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (721, N'Docente_Matilde_10284@gmail.com', N'$2a$10$HSjhDm5skS8.ipbo3Pd9/eASWR2yCRIU18AGB3y8iuNZKhKpNkXdu', N'Docente_Matil_10284_2023', 2, N'10284435-1 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (722, N'Docente_Anselmo_10289@gmail.com', N'$2a$10$EBeXhMpQWE8ocC9QR8Ouh.K9UVboej7xYY7nmOJvprfU1ypP93al2', N'Docente_Ansel_10289_2023', 2, N'10289034-5 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (723, N'Docente_Jerónimo_10294@gmail.com', N'$2a$10$YJRfwFAEmDaS1Nnlm9Ej1eKgiB1F70.2VctVIqj1uAayb7Fg064yC', N'Docente_Jerón_10294_2023', 2, N'10294702-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (724, N'Docente_Eva_10307@gmail.com', N'$2a$10$zwKwM/Q3UfHRxWr8uX.UI.OfGjqZdC7yc4TCpaem2N2qY0JXhl8Z6', N'Docente_Eva_10307_2023', 2, N'10307783-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (725, N'Docente_Luz_10309@gmail.com', N'$2a$10$2lJApcZ.UKjnbDtMA2K8yusz4T7eTxIaWNJ3TxHrBXkW7etb/kwWC', N'Docente_Luz_10309_2023', 2, N'10309856-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (726, N'Docente_Héctor_10335@gmail.com', N'$2a$10$hcIxOAsEQax.DZaftrSFJuQ8mY2B8Xtx0VVu3PayKEKUgokOxukPC', N'Docente_Hécto_10335_2023', 2, N'10335354-8 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (727, N'Docente_Lucía_10337@gmail.com', N'$2a$10$qHgtPVF7xniAaY8v/npBZeYAwq7Inf7gvmX0VvoXCHaQEqz.XGpx.', N'Docente_Lucía_10337_2023', 2, N'10337268-2 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (728, N'Docente_Paz_10341@gmail.com', N'$2a$10$tmlBFMXceg.PZmsjJ9MWt.3FHTIvHm/soDVIf310YDTqMCZPBd5sq', N'Docente_Paz_10341_2023', 2, N'10341783-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (729, N'Docente_Carmelita_10343@gmail.com', N'$2a$10$pREkzc.8WkAV5YdfU.CyHONoHE48XGPADPtkFpqkYMbRyolj1kXum', N'Docente_Carme_10343_2023', 2, N'10343931-0 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (730, N'Docente_Emma_10344@gmail.com', N'$2a$10$bNlGDNouvfrxrj44WksUd.96app01l7Nj78k/tsi8CbrC6jBhFRd2', N'Docente_Emma_10344_2023', 2, N'10344239-7 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (731, N'Docente_Elba_10371@gmail.com', N'$2a$10$9vVVGa2yXuNqQd1NyJ6zAe75MEDMCTMkbGEmTnkT0HFxtyll6vU9e', N'Docente_Elba_10371_2023', 2, N'10371655-1 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (732, N'Docente_Ramiro_10372@gmail.com', N'$2a$10$tfQ0ErN.0JSh.pV0pAEcWuOPZOWFeUd387OyVtkRNtIkP/xBjTtpm', N'Docente_Ramir_10372_2023', 2, N'10372585-2 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (733, N'Docente_Gabriela_10383@gmail.com', N'$2a$10$rwos6ahF58VUk/QuFKxY4.8KYbWBdE23C6rXHrlS0mkOGe9QuVwaK', N'Docente_Gabri_10383_2023', 2, N'10383412-0 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (734, N'Docente_Candela_10419@gmail.com', N'$2a$10$JTsV85atBrzjRHRpzvqbQOjP8Mo5CtSxI15C1Dv.K0tC1m4U16Pxy', N'Docente_Cande_10419_2023', 2, N'10419644-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (735, N'Docente_Macarena_10426@gmail.com', N'$2a$10$O5Lv8orOQsB7H5F0Vtz/..H7MdMU.GuSUEtFVmc6p6ypae8NLSIx6', N'Docente_Macar_10426_2023', 2, N'10426377-1 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (736, N'Docente_Cosme_10440@gmail.com', N'$2a$10$WOl0QAtiRtJcaPKhNYhjFOpIG4rqb2.fVC/2XfssLmD3DHrHqLw6q', N'Docente_Cosme_10440_2023', 2, N'10440686-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (737, N'Docente_Sandra_10442@gmail.com', N'$2a$10$H3/O0dA5KemBu2Kdps7MNuDVv.UMMwpI7PZCWvVvP0cbxdlfBvn1C', N'Docente_Sandr_10442_2023', 2, N'10442532-1 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (738, N'Docente_Isaías_10452@gmail.com', N'$2a$10$yK/8lg03hOmSgYfX08IzreCwhR7vpexE/2WieClvAhQPWUdnpsfkC', N'Docente_Isaía_10452_2023', 2, N'10452525-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (739, N'Docente_Nuria_10461@gmail.com', N'$2a$10$BsQS2qJrJUAleTbYwNdxSOkRMEjZbY.gJGRd2Fb7RzEEyHb4RQVX.', N'Docente_Nuria_10461_2023', 2, N'10461021-8 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (740, N'Docente_Matilde_10462@gmail.com', N'$2a$10$8dcNk2w5r6qw0m3y.FktIu.CqCg.2vzcWBmlqKYFC2LiEjLo4Ti3a', N'Docente_Matil_10462_2023', 2, N'10462201-1 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (741, N'Docente_Tiburcio_10474@gmail.com', N'$2a$10$K2w52iu.xtpvnribLNTJ1eLp/HH0HxUe2OeUTELu0xg2MATJcDwAq', N'Docente_Tibur_10474_2023', 2, N'10474580-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (742, N'Docente_Verónica_10477@gmail.com', N'$2a$10$Rkq67H0Auyr70r1o0iQE/.bJbIJ0bl/ZXMFBZ93F8fTLJvG57fP8m', N'Docente_Verón_10477_2023', 2, N'10477159-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (743, N'Docente_Marcelino_10504@gmail.com', N'$2a$10$7L5L7h2UJGDwIFXnE36lSOMe6Q9et4i/gKks9ldkA77t4.30l2R0W', N'Docente_Marce_10504_2023', 2, N'10504838-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (744, N'Docente_María_10508@gmail.com', N'$2a$10$sZFHAdiv/74k088qjJaYHuyUq2LGDWSybAJb7mM30ZI.CWBBSlBOG', N'Docente_María_10508_2023', 2, N'10508665-2 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (745, N'Docente_Bonifacio_10510@gmail.com', N'$2a$10$k0votQei.BywkNZtYqRnqe/Ue/AHJj6d1eTcCcLP2/X0SDoOKG2cC', N'Docente_Bonif_10510_2023', 2, N'10510257-7 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (746, N'Docente_Lucho_10511@gmail.com', N'$2a$10$ZcHzK2NQYTPhRKQr1THZW.jCuCf6jw47e8qbyJJeG468jumoFblke', N'Docente_Lucho_10511_2023', 2, N'10511035-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (747, N'Docente_Nuria_10536@gmail.com', N'$2a$10$97GVx/pDuonQcIjexMkhGOEuOcf8MduJzyERSc4traP0noaALtQha', N'Docente_Nuria_10536_2023', 2, N'10536148-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (748, N'Docente_Salvador_10539@gmail.com', N'$2a$10$K43ZGmaVpEScGgS6dbiYbe2rTMV/NOaZwGCCDZeYVCNc1X.y/jkRi', N'Docente_Salva_10539_2023', 2, N'10539485-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (749, N'Docente_Gustavo_10547@gmail.com', N'$2a$10$h332n4Sr/8umO86EIiBRDeFsJiJMBqrHBTvyE2ZTdQ8Q97576AJiG', N'Docente_Gusta_10547_2023', 2, N'10547385-0 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (750, N'Docente_Marianela_10553@gmail.com', N'$2a$10$vTIPLGAZlK6gMjC/bGHT6eANJdEIK4Zq4C83BDC2q3sY5jsbsMC8.', N'Docente_Maria_10553_2023', 2, N'10553589-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (751, N'Docente_Tatiana_10556@gmail.com', N'$2a$10$Axvm6crjvQ6dSIOuqOrqYOKrsutGdhzPw/3NU/8IEPBhezsgtKLmO', N'Docente_Tatia_10556_2023', 2, N'10556456-2 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (752, N'Docente_Micaela_10575@gmail.com', N'$2a$10$YUBr1jSZbnxp2n9bFrZKBuWo3tIxDOL/ivMWWlJ4QXKtO5ZqcvSQe', N'Docente_Micae_10575_2023', 2, N'10575408-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (753, N'Docente_Griselda_10584@gmail.com', N'$2a$10$uQPzp0tskStZZgnzXZKBBunWWNrTP5KPnuruC9pjiL2FbEvX0taEW', N'Docente_Grise_10584_2023', 2, N'10584120-5 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (754, N'Docente_Ramón_10593@gmail.com', N'$2a$10$SSHUpRaF71kQirP81VuA.OxPQ/DdM0kzE.cuY7DhjnXxanWTX51qy', N'Docente_Ramón_10593_2023', 2, N'10593687-7 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (755, N'Docente_Emiliano_10617@gmail.com', N'$2a$10$4LLcXyJtFG0RjzjPACcIlO5nqwysCW8d1Li4PIzyWPHVoT.nVw/T6', N'Docente_Emili_10617_2023', 2, N'10617869-0 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (756, N'Docente_Sonia_10628@gmail.com', N'$2a$10$iebpg0dDpsqjPRykIJvxJ.6d46TfSJvfZ6XVd7JuzTuVLmM/xSDpS', N'Docente_Sonia_10628_2023', 2, N'10628551-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (757, N'Docente_Alejandra_10633@gmail.com', N'$2a$10$A1uZ9xpf6uV9CwsoT.tda.errTh74lGAlGBo2.7kGG6Po.KDFfaWC', N'Docente_Aleja_10633_2023', 2, N'10633287-8 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (758, N'Docente_Ciro_10659@gmail.com', N'$2a$10$ETlbASWqc2Ay4ULY5xybr.niOdCqvEXU0mwQsouOyUBQJ58rNQuf.', N'Docente_Ciro_10659_2023', 2, N'10659332-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (759, N'Docente_Andrea_10672@gmail.com', N'$2a$10$ZiHNQXSVERVnZbLKZGObX.YhpyJbEAAezwZy4d3hInNZyhBCMTwIy', N'Docente_Andre_10672_2023', 2, N'10672491-1 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (760, N'Docente_Amaya_10695@gmail.com', N'$2a$10$WX8e.OOBhtEKfZ1gXsnGnemFMxxNMVQt3qTILW/w2TyvMxjDFo.Fy', N'Docente_Amaya_10695_2023', 2, N'10695109-8 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (761, N'Docente_Edelmiro_10700@gmail.com', N'$2a$10$pqTd0hf1OT/PAMW8moXHC..vb73eg1SXnJQ.RkkfpxCKi6iSLuhGS', N'Docente_Edelm_10700_2023', 2, N'10700522-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (762, N'Docente_Bernabé_10705@gmail.com', N'$2a$10$xfq1Hg8et4RD2gvnRhP2I.Zeg3La56hvVbXLS8lrYMxOX7tZ4VJ8y', N'Docente_Berna_10705_2023', 2, N'10705549-5 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (763, N'Docente_Gisela_10706@gmail.com', N'$2a$10$arMWko6u.0YJJsYpNIRMpe8kaEay13f36TxqIt5sUEXCPOAhIEh1i', N'Docente_Gisel_10706_2023', 2, N'10706331-5 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (764, N'Docente_Yago_10721@gmail.com', N'$2a$10$fKRTdqHA0PRcGrqjB0.PQehFDcKBDdid1n8FLKjpaYEFyoIIjRhdq', N'Docente_Yago_10721_2023', 2, N'10721723-1 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (765, N'Docente_Cristóbal_10733@gmail.com', N'$2a$10$qaB29bF1Z1r43GSlky5VeOnzC9vIsL0i7PO9b2g0EeC5IqPL09ZO.', N'Docente_Crist_10733_2023', 2, N'10733695-8 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (766, N'Docente_Nacho_10738@gmail.com', N'$2a$10$jTLgGXYr.mEflfV7i3.qkOPHpp4Zh2Z7YdZKVxU2KLbW.OdrIVyba', N'Docente_Nacho_10738_2023', 2, N'10738748-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (767, N'Docente_Arsenio_10740@gmail.com', N'$2a$10$xxti/jTIYgDbGXuZO1M6QOV7riF5.8a8SWzKvqB9UGHPCxkMDKZ4K', N'Docente_Arsen_10740_2023', 2, N'10740172-5 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (768, N'Docente_Jacinto_10744@gmail.com', N'$2a$10$Kq115vpCh9Up/YX3O5Axte9zRbYk35ghCwvNoRkjnSW3Qk/UqWFcW', N'Docente_Jacin_10744_2023', 2, N'10744132-8 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (769, N'Docente_Teodora_10763@gmail.com', N'$2a$10$HUY9xXmwg6ygai07xKs8puY7HGEl6U1FF.zkk4IGJBhylKse8CMs2', N'Docente_Teodo_10763_2023', 2, N'10763343-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (770, N'Docente_Diana_10773@gmail.com', N'$2a$10$KDR1xLeu27uC2BW/3vy2U.TeYwb5kt45irVSKsQqGFFszRBJEwguu', N'Docente_Diana_10773_2023', 2, N'10773848-7 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (771, N'Docente_Soledad_10779@gmail.com', N'$2a$10$yM4LHweEGQeneKUkrTGuluU/R3d3wIyv9ApPfevHv.m5GC5XEXjnq', N'Docente_Soled_10779_2023', 2, N'10779229-5 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (772, N'Docente_Nadia_10788@gmail.com', N'$2a$10$Xpb5hg/kZaig19Gz..CRkeA5o7jWtNy7w4w7/v.YkMih9w4cga.JC', N'Docente_Nadia_10788_2023', 2, N'10788953-1 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (773, N'Docente_Tadeo_10802@gmail.com', N'$2a$10$uqLDebEkiD8nro5T3Fg.LuvruNAuyU4LYAYVXZkEYDVrHxDmtHTA2', N'Docente_Tadeo_10802_2023', 2, N'10802648-0 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (774, N'Docente_Severo_10814@gmail.com', N'$2a$10$GXlcBMuE8DV5/jGUBeR3f.SSaQYaqoh0sj3F6cgK7Rt7X3zVDMkvC', N'Docente_Sever_10814_2023', 2, N'10814200-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (775, N'Docente_Amanda_10830@gmail.com', N'$2a$10$d.blOR/KKqqjsMCc68XG3ekhLHdVrOyCkq3N1GoIjthkJYudbdrJS', N'Docente_Amand_10830_2023', 2, N'10830649-1 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (776, N'Docente_Cesar_10830@gmail.com', N'$2a$10$YAHZhFvWtgYETLaIsejrNu1MwTVshD8AZD9.3aDnKgj58L/h6YjZ2', N'Docente_Cesar_10830_2023', 2, N'10830895-8 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (777, N'Docente_Eusebio_10836@gmail.com', N'$2a$10$5BtNpgl/tPXOk4tgUSq.Xu49KusPsgrpPr5nGonzMFONDltp6sk3O', N'Docente_Euseb_10836_2023', 2, N'10836337-1 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (778, N'Docente_Nadia_10861@gmail.com', N'$2a$10$wQ4B8IjkQ4z4vSRpeOsyrO5s0vO/Gt77JnTvFGMnMvXuEuEFIwFsi', N'Docente_Nadia_10861_2023', 2, N'10861765-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (779, N'Docente_Haroldo_10866@gmail.com', N'$2a$10$bdvQf2WphhYf8BccKrDVmuTDal6ToJ2QTx4NGl7tyU5mOZ4MwaGAq', N'Docente_Harol_10866_2023', 2, N'10866223-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (780, N'Docente_Blas_10883@gmail.com', N'$2a$10$WlSwQovE.ftOUGJcspmbRuwBJU5foEyYiid/LAIcWu0Cr8MRki/Xy', N'Docente_Blas_10883_2023', 2, N'10883566-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (781, N'Docente_Angelina_10897@gmail.com', N'$2a$10$mVor89NczjKEssKhf0MHmeLH237YiDtNv/aerP1P5HLaRUn0V9Dw6', N'Docente_Angel_10897_2023', 2, N'10897741-8 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (782, N'Docente_Isa_10905@gmail.com', N'$2a$10$pjVaVCz1L8a4zI1D4Qv2vOXYBFrHgrQIthwAi.Xj/hfs67N71tp7G', N'Docente_Isa_10905_2023', 2, N'10905674-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (783, N'Docente_Fernanda_10938@gmail.com', N'$2a$10$1U1NyYkJCxXIO8Zm0JhQi.qDRDSis1gf4czXe3VPDuDLIQjv6yeam', N'Docente_Ferna_10938_2023', 2, N'10938191-8 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (784, N'Docente_Eusebia_10942@gmail.com', N'$2a$10$ZGlra.mu0NH1pZBBJjulBO5pt3NkY8BD6pl.5Tml0Rv140WKg37L6', N'Docente_Euseb_10942_2023', 2, N'10942645-8 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (785, N'Docente_Saturnino_10949@gmail.com', N'$2a$10$1cfzIN9XZJJ8/pI3dEHbveE5Q6hGI6Q2tXnXF3bvNFKafhucjLQKy', N'Docente_Satur_10949_2023', 2, N'10949037-7 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (786, N'Docente_Joan_10955@gmail.com', N'$2a$10$Eu4ohq93.qvEfCQ9RE9UoeNaflGQwUUrcSuO9HvQa/08Vz6ZTaa1e', N'Docente_Joan_10955_2023', 2, N'10955920-2 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (787, N'Docente_Elías_10956@gmail.com', N'$2a$10$te15kxg1fhzZ2vC39Eke1eUcdcV2013sg3urq3cFiMIo00QWhuGYi', N'Docente_Elías_10956_2023', 2, N'10956528-8 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (788, N'Docente_Luciana_10962@gmail.com', N'$2a$10$IBS0W6J7daove7QCpcvD1ejn1R19AF0uhqNFHjaag42fdPs2UNKTm', N'Docente_Lucia_10962_2023', 2, N'10962131-5 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (789, N'Docente_Hilda_10967@gmail.com', N'$2a$10$EKCIt3UYcUNxcUGvK/zuh.mmaCbcg.1C3jYR.saoz8rI0NZDMbgMq', N'Docente_Hilda_10967_2023', 2, N'10967060-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (790, N'Docente_María_10967@gmail.com', N'$2a$10$Tyti9HnTiGOin32dwPaFA.eHzoIotPa3cbfA1c7wxSuGyUyt9xCFC', N'Docente_María_10967_2023', 2, N'10967188-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (791, N'Docente_Alex_10987@gmail.com', N'$2a$10$BcFJvdXOHV/bMLV8uEL1H.1dQL7MTWjyIpU2I9uFUSH8Bj8quNw8a', N'Docente_Alex_10987_2023', 2, N'10987992-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (792, N'Docente_Susanita_11007@gmail.com', N'$2a$10$.fhrKdM05v.3AUfOwakjTeJJf6GC.Y5VUEvBAZ/l7BWtTo5i5Ssoy', N'Docente_Susan_11007_2023', 2, N'11007556-1 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (793, N'Docente_Eutropio_11008@gmail.com', N'$2a$10$nofuWQGZ7JXZmQXcVLzmHOPF1kNcUqdcHUYyiE0.5UHmf6IApQdKO', N'Docente_Eutro_11008_2023', 2, N'11008805-1 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (794, N'Docente_Patricia_11036@gmail.com', N'$2a$10$wy87U0KovVWFH3eIPkAEKe1YSmZiMjFIlify3lDbgtjvpB0slpGy2', N'Docente_Patri_11036_2023', 2, N'11036749-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (795, N'Docente_Rosa_11050@gmail.com', N'$2a$10$ZH7j2oiB4ArH0Mx/xdyRXOPvYm4OAxoUQUapnuwyTJq6X02Ug6NqW', N'Docente_Rosa_11050_2023', 2, N'11050974-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (796, N'Docente_Paz_11054@gmail.com', N'$2a$10$N0xFY3OZCE0x0wGCiw4oB.NtBg8Nv7Fv.B226qhs1TJ/XGKNn7.I.', N'Docente_Paz_11054_2023', 2, N'11054915-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (797, N'Docente_Diana_11059@gmail.com', N'$2a$10$Nk9UepwJUHmiuR8b.1fv6OsO9.BLSyOAZsRBCdZw1zrb.PespaacG', N'Docente_Diana_11059_2023', 2, N'11059095-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (798, N'Docente_Dan_11062@gmail.com', N'$2a$10$JTbgo1pnbWvfLSnZZh0esey..iPq/MnW1SnoWMhAIS2s1ngjx2Mmm', N'Docente_Dan_11062_2023', 2, N'11062704-1 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (799, N'Docente_Augusto_11082@gmail.com', N'$2a$10$QzRRzr5lg8HUyLTPS/PmPO/MeIDuWN9U5uS2PqwUAvbhD87RYZ.kq', N'Docente_Augus_11082_2023', 2, N'11082022-4 ', 1)

INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (800, N'Docente_Anselmo_11084@gmail.com', N'$2a$10$irVWdJv7RA4yB65RUwjuSernmYk/rnL7Vc1OIH3JeyBgUQypSfwxK', N'Docente_Ansel_11084_2023', 2, N'11084619-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (801, N'Docente_Ágata_11098@gmail.com', N'$2a$10$XMlZumXAK4KjFCOYmmXW/.fB/zwnwR1p8XwkKgGmiVdH2/lP25gYm', N'Docente_Ágata_11098_2023', 2, N'11098895-8 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (802, N'Docente_Asunción_11123@gmail.com', N'$2a$10$LI3NQ6oS29giuqlmcHv.IOIaU0nsM/Zidb3tlJbEgWFGylAvw6VhO', N'Docente_Asunc_11123_2023', 2, N'11123065-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (803, N'Docente_Tadeo_11126@gmail.com', N'$2a$10$rVi51QVLYGu2awt0Lsa4n.ed.8D8mX1bl9OpwMC9ALmM53mv7pFUC', N'Docente_Tadeo_11126_2023', 2, N'11126113-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (804, N'Docente_Pastora_11145@gmail.com', N'$2a$10$2RJBwvHqueBch8GUif76LuvnBJsbZtHvKC4f3lPooAmsmkT/3WVpS', N'Docente_Pasto_11145_2023', 2, N'11145086-2 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (805, N'Docente_Curro_11145@gmail.com', N'$2a$10$HVg7noeGoChiC0dXmMmvUepJEXLX2qHzaixgXEzcQbrnkbht5Rcly', N'Docente_Curro_11145_2023', 2, N'11145641-0 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (806, N'Docente_Albina_11164@gmail.com', N'$2a$10$Ni1WY65syTe/OqdlEpPGgeGW/q9qiNqSJ8BPjSoDAv84gWFjZS3ym', N'Docente_Albin_11164_2023', 2, N'11164951-0 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (807, N'Docente_Olalla_11168@gmail.com', N'$2a$10$giX2b1fk8RHwIjHXWVRlG.iNLLQkUlUyelH0H7YKs/pm16ZjnRa5q', N'Docente_Olall_11168_2023', 2, N'11168517-7 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (808, N'Docente_Germán_11173@gmail.com', N'$2a$10$AKVAM2LLUg.8xPwN0Q5rS.q152htr9Y.i50FkOypWR/IcSYC06cke', N'Docente_Germá_11173_2023', 2, N'11173549-2 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (809, N'Docente_América_11176@gmail.com', N'$2a$10$Ri0bQwinGsCwuRLPHGUsp.eRg3fCocaWGrSn9qP8xfXrR0ulN.HjO', N'Docente_Améri_11176_2023', 2, N'11176016-0 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (810, N'Docente_Eladio_11176@gmail.com', N'$2a$10$XZxlzSWRTo18yDY7XrQ7Tu7GqI5QqIuaxzc2Ls/ZeclrlLj8uadZ6', N'Docente_Eladi_11176_2023', 2, N'11176056-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (811, N'Docente_Brígida_11182@gmail.com', N'$2a$10$lfaRrG1Y9iQiYUyp6odfruoQlyE2tQd5zgmF7ChteQDdZgPocDVRO', N'Docente_Brígi_11182_2023', 2, N'11182218-2 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (812, N'Docente_Bernarda_11185@gmail.com', N'$2a$10$qqSA.ln3jlUH.AricGPgTO7OJZvam6HmBrJdlMcB9mSn.I9Zj4QPi', N'Docente_Berna_11185_2023', 2, N'11185639-7 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (813, N'Docente_Delfina_11188@gmail.com', N'$2a$10$4dgoqAOkDxAB.HYkgSbbQu6vclBqGDIf7Knt4J0cIT.3K/cdPt2ay', N'Docente_Delfi_11188_2023', 2, N'11188577-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (814, N'Docente_Chucho_11198@gmail.com', N'$2a$10$NVkhf3PcY6mht0V9hU2NpOul2mlRrBxX5IMoO5tUjlIvWnvsS4OZW', N'Docente_Chuch_11198_2023', 2, N'11198467-0 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (815, N'Docente_Aroa_11199@gmail.com', N'$2a$10$cj0YWXoTIMcDoaAQbhHB9Ogk9QnLGFu79OMSvDLzFj9WQ6ijkRHFS', N'Docente_Aroa_11199_2023', 2, N'11199081-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (816, N'Docente_Glauco_11208@gmail.com', N'$2a$10$JuasLuzRxTPBZF2FPzs.DOsi179jGobSapKWopS6hWYloMfSvvjNy', N'Docente_Glauc_11208_2023', 2, N'11208457-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (817, N'Docente_Juan_11216@gmail.com', N'$2a$10$sEpTh8CYzEICINI5p47zv.MgwOxn6RACS/XB6yUFOocZu0US3/S/a', N'Docente_Juan_11216_2023', 2, N'11216921-0 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (818, N'Docente_Maricruz_11217@gmail.com', N'$2a$10$9RhU56/W2amiPdhmznGeI.YTHKqYsc9RmwSc7vPOtSS4mTmXYpuTK', N'Docente_Maric_11217_2023', 2, N'11217170-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (819, N'Docente_Isabela_11219@gmail.com', N'$2a$10$V4Gnei/IVsKU.2Res6V9YehvxUozr4RNlsOOPsUTCRfH7RBzcTJGC', N'Docente_Isabe_11219_2023', 2, N'11219994-2 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (820, N'Docente_Bibiana_11227@gmail.com', N'$2a$10$JV.9/wpOBOAUfssz1CWlLOBLdY/bWpJ/l9SI8tT/Z..DZ9qApYufW', N'Docente_Bibia_11227_2023', 2, N'11227400-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (821, N'Docente_Daniel_11253@gmail.com', N'$2a$10$QzdI98kaZUrASfUgcR2j5.hUHjCUQewu6MzA.DEcZ2/dzru70hzKC', N'Docente_Danie_11253_2023', 2, N'11253393-1 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (822, N'Docente_Ligia_11284@gmail.com', N'$2a$10$GUdnoNwS4Ku3G4HiLApBKOA/lKNs0LbCxF74arkjciv1Wf5l8rdbS', N'Docente_Ligia_11284_2023', 2, N'11284745-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (823, N'Docente_Sol_11297@gmail.com', N'$2a$10$Jg9MjNe46aJaeXXdaKd2wewlnKdd3ZEcPGOtJx1Tyn4MYbCn/Emru', N'Docente_Sol_11297_2023', 2, N'11297502-0 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (824, N'Docente_Etelvina_11303@gmail.com', N'$2a$10$sUubFvu2EUjCCE892.bfTeBLauzhVFQsRHJbaJnZeKa97RtgW0ivC', N'Docente_Etelv_11303_2023', 2, N'11303471-8 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (825, N'Docente_Moreno_11309@gmail.com', N'$2a$10$YAc28oM93SsVmBqf0CTSm.TsjvrNxbRkqAOshy6lEoMSGnn2ZQfN2', N'Docente_Moren_11309_2023', 2, N'11309691-8 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (826, N'Docente_Miguel_11315@gmail.com', N'$2a$10$DC/.Bi2UOXTWO2mN8kb9j.GZE2cQ71nGc0vkgVAwbS83C8mQnTHZq', N'Docente_Migue_11315_2023', 2, N'11315203-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (827, N'Docente_Ileana_11316@gmail.com', N'$2a$10$MgfSzCJqLtB1Yx/jUfZSSeIb8ksnI4u5hTfQVFygxuU8Pmv4K6Ehu', N'Docente_Ilean_11316_2023', 2, N'11316271-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (828, N'Docente_Emelina_11322@gmail.com', N'$2a$10$PyFMYYTyAcplFf9lJWieru37D9.uYnlw6z6i0Xdwypj2mqqGyvwDa', N'Docente_Emeli_11322_2023', 2, N'11322539-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (829, N'Docente_Bernardino_11322@gmail.com', N'$2a$10$5.N5MmSS99Wi0YRtgLYMFOJ40csI2kyeT6gI9N02I7XOps8WQq4Sy', N'Docente_Berna_11322_2023', 2, N'11322765-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (830, N'Docente_Carmen_11334@gmail.com', N'$2a$10$KLhmB4zWvbede/fCkaR2yupKK20sSMF75bDd2f8tv93AX1htQrNgS', N'Docente_Carme_11334_2023', 2, N'11334648-5 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (831, N'Docente_Elisa_11352@gmail.com', N'$2a$10$NCv2AUU0sh5avJptg55aw.rBP.1i6kCO2I2lEbNtUY8WDWRMCoZCy', N'Docente_Elisa_11352_2023', 2, N'11352824-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (832, N'Docente_Valerio_11353@gmail.com', N'$2a$10$sNbM8y5VK4gpRkZsWs0QOu.t/w2bPPCWd4d7oD1bC2gDBWOTqRjXC', N'Docente_Valer_11353_2023', 2, N'11353432-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (833, N'Docente_Fabián_11358@gmail.com', N'$2a$10$DyFrRn3dYfgbq08ApJ.6oOJQzlD5/Ut/Kq30friYoDpX6auFC6F4y', N'Docente_Fabiá_11358_2023', 2, N'11358792-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (834, N'Docente_Eusebio_11408@gmail.com', N'$2a$10$3kyXKbIjKQJnhJKwSFfHZeWT9KhZJOSc.NNp/HXlWg7/6QvOJJ6dW', N'Docente_Euseb_11408_2023', 2, N'11408393-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (835, N'Docente_Gil_11430@gmail.com', N'$2a$10$RM1cg5K9w6/.M/lKl5tlvuHcy.hvW98AAWFYL1c0VxZNjYt8bV1QG', N'Docente_Gil_11430_2023', 2, N'11430437-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (836, N'Docente_Dora_11431@gmail.com', N'$2a$10$.RGHczddlwAHvX2yCEVHNOl.8N58nx/xPr.wfXr0Nm86OylXUWtcS', N'Docente_Dora_11431_2023', 2, N'11431877-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (837, N'Docente_Úrsula_11433@gmail.com', N'$2a$10$r8g7MIlzT2Jzm.F3tG7Kr.BG3/XqFu5XDaBzf6hhevxYGXhy.6iMy', N'Docente_Úrsul_11433_2023', 2, N'11433382-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (838, N'Docente_Morena_11434@gmail.com', N'$2a$10$jvFIt1sjlIDZOytdSxLCx.su.VUEOg/DcSCHHbdOAjy.lCwCt72ZC', N'Docente_Moren_11434_2023', 2, N'11434461-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (839, N'Docente_Yolanda_11444@gmail.com', N'$2a$10$19x1WoegEmgKR54BFKIK1.1QaIogn27V84UPDRiLAXRP9lLPiHTUW', N'Docente_Yolan_11444_2023', 2, N'11444595-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (840, N'Docente_Juana_11451@gmail.com', N'$2a$10$D.VRrcKhTiNoxfkAniYTQOV.Cp5pBQnL5DnyC4lez4bgy920T42bS', N'Docente_Juana_11451_2023', 2, N'11451351-2 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (841, N'Docente_Eligio_11455@gmail.com', N'$2a$10$bS3Fvy39XbzEDSfPGY6o8OFxuo7dlg2t0iuCh6sjk4KEVh.M6XSfm', N'Docente_Eligi_11455_2023', 2, N'11455765-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (842, N'Docente_Tania_11469@gmail.com', N'$2a$10$a9OtpW69Kc664soYD2n6wOLn1mw10cvU2b8zTTs6yMbIag.Pgd336', N'Docente_Tania_11469_2023', 2, N'11469397-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (843, N'Docente_Emma_11471@gmail.com', N'$2a$10$EA/0n7hy.KczsG4qL9JpwOLGPNnNdN7ZQLeKxHcqWdSfQF.mLlkHG', N'Docente_Emma_11471_2023', 2, N'11471072-5 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (844, N'Docente_Jafet_11480@gmail.com', N'$2a$10$kkT2FXZYcLF0zLQ84TXD6uTXdPJIDcRpcyJgA4PTtrU2st0ASaaim', N'Docente_Jafet_11480_2023', 2, N'11480725-7 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (845, N'Docente_Jose_11499@gmail.com', N'$2a$10$6cFKPx7p/V3RNgivc/8hSu9FOvVeUz/sDNVQjZsk0OWU.BYFsBXja', N'Docente_Jose_11499_2023', 2, N'11499957-1 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (846, N'Docente_Pastora_11517@gmail.com', N'$2a$10$AUErnC.ty85h5y.Ob0EwyenFxuhPpGEwtNL/52N0HVVWA6cdfFXYm', N'Docente_Pasto_11517_2023', 2, N'11517664-1 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (847, N'Docente_Isa_11524@gmail.com', N'$2a$10$/zGuL0H8czdgWNZA/ws5ce04PiHZJFYUd1tjpbJ5FJvdiDOzlEFlq', N'Docente_Isa_11524_2023', 2, N'11524508-2 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (848, N'Docente_Wálter_11527@gmail.com', N'$2a$10$gXs.QXQdTZmM/Hw9bUBnheWxXNF4i8DAdeHkWLihOIB4bxsDrddAW', N'Docente_Wálte_11527_2023', 2, N'11527425-2 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (849, N'Docente_Juan_11577@gmail.com', N'$2a$10$UC/ufYvZLwyqEQITtbqRIeSV.BfcGb7JoEH3Xhs1/XWAO1pzD2D/i', N'Docente_Juan_11577_2023', 2, N'11577212-0 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (850, N'Docente_Juliana_11598@gmail.com', N'$2a$10$lM.gq2xM4x2/pL1JHoqfZOkS6cQYaqQ/Y2ZIMf07S6NwUvFniAvHO', N'Docente_Julia_11598_2023', 2, N'11598215-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (851, N'Docente_Eligia_11601@gmail.com', N'$2a$10$1NiqMqY1VnB5TrpDuqznfOgtzwoyOkEtjrmL3fvU7w08dhTqzpuBm', N'Docente_Eligi_11601_2023', 2, N'11601329-0 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (852, N'Docente_Eufemia_11605@gmail.com', N'$2a$10$XgDuttfAoiopQ42ytSV8GObiNAvzAId0sHvHskrQY5a4xRcBsNIum', N'Docente_Eufem_11605_2023', 2, N'11605505-8 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (853, N'Docente_Bienvenida_11616@gmail.com', N'$2a$10$lrU/zpldFDPILGmerJsKMuB6HqHVXLXH5oPOrhGKlMFTJ5izaxY4K', N'Docente_Bienv_11616_2023', 2, N'11616524-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (854, N'Docente_Alicia_11624@gmail.com', N'$2a$10$d5uh3i8bVDL9xhaEggJsROfFEDdE1ZMKX3cm7mAs6mGg1IGv2hvrC', N'Docente_Alici_11624_2023', 2, N'11624333-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (855, N'Docente_Fabiana_11633@gmail.com', N'$2a$10$VeUoCqBCv6iuwA2IVIjlCukNUGvL4nDDZcLYH0Tv29miFfLCBTeTy', N'Docente_Fabia_11633_2023', 2, N'11633547-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (856, N'Docente_Cleto_11660@gmail.com', N'$2a$10$RVS7YWzTDe9Ts.WPnpf3We/V7EbipMf82WO6S3EgqNH2fJRxENMwG', N'Docente_Cleto_11660_2023', 2, N'11660317-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (857, N'Docente_Ramiro_11666@gmail.com', N'$2a$10$tThuDqe1I8OagxlIX2Rnje9bdO7AThDMBa7pCGwG3mZYL22WUC4ZO', N'Docente_Ramir_11666_2023', 2, N'11666439-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (858, N'Docente_María_11671@gmail.com', N'$2a$10$twsbEhdDgXh/e1oelyfp8uLqqxya59lopIwYcwHxGhBC7gRCHPWG6', N'Docente_María_11671_2023', 2, N'11671016-1 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (859, N'Docente_Leocadia_11674@gmail.com', N'$2a$10$Pz6enVWBRlYQ5dYX31BryediZbd/OXZA5KVW0p8XC2vpZzbANRh8.', N'Docente_Leoca_11674_2023', 2, N'11674014-1 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (860, N'Docente_Cristian_11683@gmail.com', N'$2a$10$TncjLkSYbY/XWB2956yzH.41Vr5yJoxQ1yg.sG4zw9XsXm/rUT4yC', N'Docente_Crist_11683_2023', 2, N'11683737-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (861, N'Docente_Merche_11708@gmail.com', N'$2a$10$P/OLacRd4oZX4iiYspuJeuamFgwLnjghTuCmyeCG6WjNedG8kyJkC', N'Docente_Merch_11708_2023', 2, N'11708304-7 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (862, N'Docente_Luis_11711@gmail.com', N'$2a$10$Ym/ridTJLxxmgxZsMabuXux9Kf4O5aI0pBO64YLPGRlaUMrUiZ6Ja', N'Docente_Luis_11711_2023', 2, N'11711168-7 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (863, N'Docente_Domitila_11722@gmail.com', N'$2a$10$s0gwJHT3BydcVWOpaZAAZe/h4nXfLGGdjBQCNdqflQMc1bgzuf7nO', N'Docente_Domit_11722_2023', 2, N'11722146-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (864, N'Docente_Graciana_11733@gmail.com', N'$2a$10$9Nki2pZwTkqFeT1J.L0xhui.MxSWgM4Hh0FH8gJxZWHa1we721W6a', N'Docente_Graci_11733_2023', 2, N'11733502-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (865, N'Docente_Isabel_11740@gmail.com', N'$2a$10$/pq8fv8XrMwqBqCI.bTW2u.4Kw7e6wa2QRaSuYO9D0OYNeh2f6HnW', N'Docente_Isabe_11740_2023', 2, N'11740188-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (866, N'Docente_Noa_11744@gmail.com', N'$2a$10$em2IhThl7omYG/8DXCLwmOvOwZRLq4/WRE49p5z9ZtrrS5O1rOyHi', N'Docente_Noa_11744_2023', 2, N'11744859-2 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (867, N'Docente_Olga_11759@gmail.com', N'$2a$10$CkIY5Uds7UrQNYzC6U7LtOdhW/2pnumr9KSNNMjphxpFtpm13rOMe', N'Docente_Olga_11759_2023', 2, N'11759443-2 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (868, N'Docente_Gerónimo_11761@gmail.com', N'$2a$10$ZpV6XirzfUnMqoqrka5LpevFb57UaIb8FQFZYLEaHcHwcT0zrH34S', N'Docente_Gerón_11761_2023', 2, N'11761847-1 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (869, N'Docente_Isaura_11776@gmail.com', N'$2a$10$OxMuJ5Jm3E3UzX6aAnQjTetLvOdgzXgZvsd5NqduB7tnuRoEMyw2O', N'Docente_Isaur_11776_2023', 2, N'11776869-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (870, N'Docente_Eva_11794@gmail.com', N'$2a$10$69dZxthySO0L/4i2.XZ/le7QBwTotS16Rd8sVOpCqroFwbLBdPE0S', N'Docente_Eva_11794_2023', 2, N'11794615-0 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (871, N'Docente_Maxi_11810@gmail.com', N'$2a$10$tT.bAwhgedCaKe5qjTsZneFiolvLA7VJ6StG9uGAOfXkN582MrETK', N'Docente_Maxi_11810_2023', 2, N'11810267-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (872, N'Docente_Úrsula_11819@gmail.com', N'$2a$10$0IJptzu2sfbyLHsCN2v/vufE0DLLIKaR5dq0gcsJAtlnE866.6wvm', N'Docente_Úrsul_11819_2023', 2, N'11819750-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (873, N'Docente_Consuela_11833@gmail.com', N'$2a$10$pQS2HqEByKErtRh30QDQY.yGhbkS1aAL5pfLRAQXrCIiPN2Fnw5OW', N'Docente_Consu_11833_2023', 2, N'11833788-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (874, N'Docente_Humberto_11836@gmail.com', N'$2a$10$4WRpI8WySX/LVzAfpU78ducVPH/LYvwlvQwFwJ9JUXj.1RYe3N5uy', N'Docente_Humbe_11836_2023', 2, N'11836666-2 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (875, N'Docente_Gracia_11850@gmail.com', N'$2a$10$DEpVgvmx1/tgQmT.vhzZv.0/XZ/98o0zHTHb321si4PCP/JJSBrNW', N'Docente_Graci_11850_2023', 2, N'11850206-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (876, N'Docente_África_11868@gmail.com', N'$2a$10$8IKZ1CRljDEMMN2q2AcMJesQdPMWsglUOYKUtFmdl19l73YJDubX6', N'Docente_Áfric_11868_2023', 2, N'11868373-0 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (877, N'Docente_Leire_11873@gmail.com', N'$2a$10$2MP/OKBuaiWmIBVpz8Wef.kT5nLx2bjzzpccdrKDt2cHSGQbiEdIO', N'Docente_Leire_11873_2023', 2, N'11873643-5 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (878, N'Docente_Reyes_11881@gmail.com', N'$2a$10$YfqluN0OndVWXIomkzD8/.ViT9awgPvjMkutzDwIi6ZibcbgHCRfe', N'Docente_Reyes_11881_2023', 2, N'11881844-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (879, N'Docente_Marina_11904@gmail.com', N'$2a$10$OnP5rso7apNbJRQeLR8ADuwwRWTBcorUbFE7.abzk3joWLdyTBAMm', N'Docente_Marin_11904_2023', 2, N'11904379-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (880, N'Docente_Encarna_11906@gmail.com', N'$2a$10$YINQjaLIibaz19qFY1OdRuN1RVKKBQWgwzt5n0YFUOZdIbQY68Daq', N'Docente_Encar_11906_2023', 2, N'11906416-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (881, N'Docente_Imelda_11917@gmail.com', N'$2a$10$6KtAFpwKLyIdAR.8eZTNau2xYsNSYNmlk28JqOdMVk8NS0muwIBM2', N'Docente_Imeld_11917_2023', 2, N'11917875-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (882, N'Docente_Remigio_11946@gmail.com', N'$2a$10$hZTdsCMGG4UdycOXgEvj0etI9k.PH6JgY1fvNcpx52wuVPNruPuHW', N'Docente_Remig_11946_2023', 2, N'11946591-5 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (883, N'Docente_Saturnina_11958@gmail.com', N'$2a$10$tnc8wBeGP3/CAd4zlMmPrOe6KRVMQxdASl.xxreHlf66JchYxntLO', N'Docente_Satur_11958_2023', 2, N'11958784-0 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (884, N'Docente_Ariadna_11959@gmail.com', N'$2a$10$zwyuaLAr51lFQr3TrWyTQeJ3St050b9JlUnD95PjlOUEzwxcD.ME.', N'Docente_Ariad_11959_2023', 2, N'11959645-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (885, N'Docente_Borja_11959@gmail.com', N'$2a$10$v7IauTCY/NsSxFZw61PFheWHCKSfCDg3kvFLudb/6Udj3v1FIn0Cm', N'Docente_Borja_11959_2023', 2, N'11959835-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (886, N'Docente_Baldomero_11974@gmail.com', N'$2a$10$EcwBQLwS5eGbYGCZxDpd3eopQqJiWAKhYD6GiB/kN6j/8608wu6c6', N'Docente_Baldo_11974_2023', 2, N'11974383-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (887, N'Docente_Bautista_12001@gmail.com', N'$2a$10$8WJv/bxIDbzH4FZH.6nP1.7MR5hTGYS.RHm8hoRPMvYJTr8/WOZq6', N'Docente_Bauti_12001_2023', 2, N'12001609-1 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (888, N'Docente_Rosa_12004@gmail.com', N'$2a$10$kERRrE51paxuAvsQPBHCBeiGp/l6oJb3HaCxQ/OQnhG8d.DtJzO2.', N'Docente_Rosa_12004_2023', 2, N'12004414-1 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (889, N'Docente_Conrado_12026@gmail.com', N'$2a$10$2nughUevk2j.qn.LIZu4O.uexAXLUisPSXLECwt8II02cYV1WQ33q', N'Docente_Conra_12026_2023', 2, N'12026928-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (890, N'Docente_Juanito_12033@gmail.com', N'$2a$10$5z3wAPJE.tCfb1POakQniuYzPPj6EhKTqOXmGBieD.ulvPTib5DuK', N'Docente_Juani_12033_2023', 2, N'12033070-5 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (891, N'Docente_Elisa_12035@gmail.com', N'$2a$10$KSnUwSfCnWnnnl467nbSA.aW7nt6f49KAw/4H0aeaJy0Qty2jz6.u', N'Docente_Elisa_12035_2023', 2, N'12035695-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (892, N'Docente_José_12051@gmail.com', N'$2a$10$pxqvSqxDuMFsKxussK6MuevYXkhuSMapJ35RyzL4pIyPgAJFdPCS2', N'Docente_José_12051_2023', 2, N'12051453-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (893, N'Docente_Lucio_12057@gmail.com', N'$2a$10$eg7CjGXAslV6oIu5udbHN.j3T/NFA42JjVsz2SpcO6eWzSArt7stW', N'Docente_Lucio_12057_2023', 2, N'12057597-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (894, N'Docente_Carlito_12070@gmail.com', N'$2a$10$tOvN5iKNBVTarpVg4AGn3.kAgD9qFKksPWM.B2HancPPP5X5sj0de', N'Docente_Carli_12070_2023', 2, N'12070423-0 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (895, N'Docente_Crescencia_12077@gmail.com', N'$2a$10$pAweFZmHEupFNRGw3.Wkzu3/.4rnGm87izNZy6B9/lP0yJpWNuxnW', N'Docente_Cresc_12077_2023', 2, N'12077732-7 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (896, N'Docente_Felix_12078@gmail.com', N'$2a$10$dBlGcWq.MPqFUWV8Ye.NIejJ60ajAhwlVdkrttTBm02HeP/8rz/g2', N'Docente_Felix_12078_2023', 2, N'12078844-2 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (897, N'Docente_Antonio_12086@gmail.com', N'$2a$10$au58b5hswOeCIXGcgzHIhumG7htKxs.VycC.txQPXIUnbCvby40DS', N'Docente_Anton_12086_2023', 2, N'12086533-1 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (898, N'Docente_Susana_12089@gmail.com', N'$2a$10$Eb.QvSrC55Y3pgdpBGEMoevHovFShxAhSRcpbxWG9plG11/WlxSwW', N'Docente_Susan_12089_2023', 2, N'12089722-5 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (899, N'Docente_Blanca_12102@gmail.com', N'$2a$10$WEfduyLLN9Bn0wXEnu701.mq7CMUydhgM2L.8J6YhYds9s9f11q2C', N'Docente_Blanc_12102_2023', 2, N'12102298-2 ', 1)

INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (900, N'Docente_Isidoro_12108@gmail.com', N'$2a$10$A/Ffzx.YRNyU.JBfDCSoo.tPp2YvwP6MKHgH/RUaHUCiN1GPuu076', N'Docente_Isido_12108_2023', 2, N'12108304-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (901, N'Docente_María_12123@gmail.com', N'$2a$10$JK5pORn03XfiKptkNYZdkOT.V1bIYhtMns5nHXZ.eevyrxf7pBzji', N'Docente_María_12123_2023', 2, N'12123814-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (902, N'Docente_María_12135@gmail.com', N'$2a$10$0C1Nfkk/1JbokPzpa5l85.JuQCpi.9G7h9K64g2TIxgG7WX.0ei72', N'Docente_María_12135_2023', 2, N'12135980-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (903, N'Docente_Ricarda_12136@gmail.com', N'$2a$10$nUQoDwzWsNkguJaMfIHXKenVqZAgxknKlC1Fk45Boz5LMtKHmphWu', N'Docente_Ricar_12136_2023', 2, N'12136075-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (904, N'Docente_Tomás_12136@gmail.com', N'$2a$10$jQjlDfEZUjEcEcjXm1Ipiu6I9GPW6yjtzIENsXyMcvGTIcD/6FHuy', N'Docente_Tomás_12136_2023', 2, N'12136289-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (905, N'Docente_Nilda_12143@gmail.com', N'$2a$10$zV0fktcLmpMsz3LusQA63O20EU8JpokhR2cbZGnvAD5b6wyVb6MCW', N'Docente_Nilda_12143_2023', 2, N'12143946-8 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (906, N'Docente_Tatiana_12158@gmail.com', N'$2a$10$k5wDSSKMtTc.ZJ.Askf1BuuWLAajLY.ocdhau8xl.fbaxEtMjPuvi', N'Docente_Tatia_12158_2023', 2, N'12158243-0 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (907, N'Docente_Desiderio_12160@gmail.com', N'$2a$10$nqx65zc.azV6xp0z.ePJ4.cwsBx50ujagcvhvBsPlVlvMxOuoR4J6', N'Docente_Desid_12160_2023', 2, N'12160085-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (908, N'Docente_José_12161@gmail.com', N'$2a$10$uGXkBpTn7rLf0bButzAvMOLo19Qv35AOvLYD8yyYSbWxq4ivcHUaS', N'Docente_José_12161_2023', 2, N'12161455-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (909, N'Docente_Imelda_12187@gmail.com', N'$2a$10$eeP481TcB6RnEw2zW0ED2OZFJadwCPVNVrR84sL1TpPsgcwS.dyO6', N'Docente_Imeld_12187_2023', 2, N'12187703-1 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (910, N'Docente_África_12198@gmail.com', N'$2a$10$NgbyvvKFUjTvFyxc8x3uBOYYmG2XWBhft3zNZmATGFiTJTptGx0XC', N'Docente_Áfric_12198_2023', 2, N'12198763-5 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (911, N'Docente_Geraldo_12199@gmail.com', N'$2a$10$9.kQ41eLH17XTNS37FwxZemoBAPdDNP0hidyw6nmO7Wxeq1V3GVle', N'Docente_Geral_12199_2023', 2, N'12199624-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (912, N'Docente_Reyna_12203@gmail.com', N'$2a$10$2Dr/qcaFgAmTYVNN8bYSTukt.X0HqwaPSfT7eqJfglsKoB8JeMh5K', N'Docente_Reyna_12203_2023', 2, N'12203790-8 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (913, N'Docente_Paloma_12224@gmail.com', N'$2a$10$m5HNqcJoAFKed7D9hjFei.8APgMp2dmlMd9dU67x9cIWXFN3Phr16', N'Docente_Palom_12224_2023', 2, N'12224585-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (914, N'Docente_Isaías_12233@gmail.com', N'$2a$10$3.6d53bREZIkORSObbIfYOarJCDi4Gcxg4xNs3UJA6tBCIglWuRly', N'Docente_Isaía_12233_2023', 2, N'12233991-2 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (915, N'Docente_Nereida_12247@gmail.com', N'$2a$10$v8tL9KRTCrb.zMuCLWNBlux0JAMQtxS1i48O089IT4HXqVjRDJ6hi', N'Docente_Nerei_12247_2023', 2, N'12247052-0 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (916, N'Docente_Ambrosio_12249@gmail.com', N'$2a$10$L2nUeUIBdNI9rRV5simjeOYTKi9DzLhB7VuHMe9x05QyzFVK0rrru', N'Docente_Ambro_12249_2023', 2, N'12249675-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (917, N'Docente_José_12253@gmail.com', N'$2a$10$ExGapaem8LniulG7Wy6sDO5JhFAjTNyfmrcZY2NOyWp.pXnsrMNNO', N'Docente_José_12253_2023', 2, N'12253177-5 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (918, N'Docente_Dora_12256@gmail.com', N'$2a$10$sU9i6PUf0Rt08x0jwxW3fertNvU7qmz8SoN8EHzmCneyFTTrbHxN.', N'Docente_Dora_12256_2023', 2, N'12256834-2 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (919, N'Docente_Dorita_12267@gmail.com', N'$2a$10$1Gq.H8Wdods156RdRQeGLOgJG2wmRvIm/NVClSx.fixOvdLmBE95i', N'Docente_Dorit_12267_2023', 2, N'12267765-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (920, N'Docente_Nieves_12274@gmail.com', N'$2a$10$LhRw90pvZIWZk0EpDw/7EugpXHYXjQWelZYGAUtdMFu6IUDsOBKx.', N'Docente_Nieve_12274_2023', 2, N'12274620-8 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (921, N'Docente_Custodia_12302@gmail.com', N'$2a$10$k3fnGCP7..bgNzWNIfXZ4exkPNXrfim/jM1lsprD5AvIm1OdCs0KO', N'Docente_Custo_12302_2023', 2, N'12302949-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (922, N'Docente_Ricardo_12304@gmail.com', N'$2a$10$vpK0YhqxiiKqjG1wOXaUdOAFynEOb3ylbc.Q3ODfzoo6R1jbTQQNa', N'Docente_Ricar_12304_2023', 2, N'12304987-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (923, N'Docente_Ágata_12321@gmail.com', N'$2a$10$u2w3PO/k9UPNdiUxRhRlPujmhmAfBF2fGnpq2uuXoWkGrySMtTz3W', N'Docente_Ágata_12321_2023', 2, N'12321870-1 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (924, N'Docente_Agapito_12322@gmail.com', N'$2a$10$atm35deAyHI3izvsmvrne.U29iG7PTWwG7s6GMLBMl1sfdbIS6o4i', N'Docente_Agapi_12322_2023', 2, N'12322583-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (925, N'Docente_Mireia_12326@gmail.com', N'$2a$10$C5nZDB.gHEKG0T9TdG25j.huQhfM92Tdvq59H.iLdHbuiSU1j58IC', N'Docente_Mirei_12326_2023', 2, N'12326211-5 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (926, N'Docente_Manuel_12331@gmail.com', N'$2a$10$HtoTDUl3tjZguEOWeNbDUePVDKNJOeOXXGCvkxs5muDxIl0Cjh3K6', N'Docente_Manue_12331_2023', 2, N'12331008-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (927, N'Docente_Corona_12345@gmail.com', N'$2a$10$ByY05YdOTHbXsbrtP9WrDu9SZ6.vIAuJ24l1rli8nlhma/vEDrIA2', N'Docente_Coron_12345_2023', 2, N'12345194-5 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (928, N'Docente_Juan_12353@gmail.com', N'$2a$10$.AZfAHVhRLFKatEl8vb4s.lh8oi/3bSaLsNj2D7dRr.1R6XQc2WzK', N'Docente_Juan_12353_2023', 2, N'12353202-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (929, N'Docente_Paola_12357@gmail.com', N'$2a$10$2yfDpsrhJKShSKGVw1pLzerJ0vfrL0PKXtSMbD/41upkL1VVGmzg6', N'Docente_Paola_12357_2023', 2, N'12357698-5 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (930, N'Docente_Aarón_12400@gmail.com', N'$2a$10$uySGMSbk99aUS8Dmr5X77.UNtquxyyWG7S0jKpmPCnPQxhWCVMKXm', N'Docente_Aarón_12400_2023', 2, N'12400096-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (931, N'Docente_Aurelia_12402@gmail.com', N'$2a$10$vXNQn4duitfxBtkXKOKd2eF3sBOWVoSp.Bn18UdKgxmNQauXdkET.', N'Docente_Aurel_12402_2023', 2, N'12402978-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (932, N'Docente_Baudelio_12404@gmail.com', N'$2a$10$mfYRT8bN0XgF4FnAeKI6EuBFKk5aCSUh6xEA1oPJv0JQBKAL3kJsq', N'Docente_Baude_12404_2023', 2, N'12404518-5 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (933, N'Docente_Lucila_12408@gmail.com', N'$2a$10$b8jk1fVAnDHx4GwvmgG/kumWuC3cYruGHxMjrS8Vmqkoivcy5O3/S', N'Docente_Lucil_12408_2023', 2, N'12408398-2 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (934, N'Docente_Martin_12412@gmail.com', N'$2a$10$tGLK13tjDzYi0cBaxfAsb.JVVVHAgV44KsX.2PTd2apGxyZ3xfr3a', N'Docente_Marti_12412_2023', 2, N'12412784-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (935, N'Docente_Zaida_12415@gmail.com', N'$2a$10$Q1qprZLeZbiQ65suSZghP.L53PfU.uh34ENy49DZ1Mkc8YVwA4fZ2', N'Docente_Zaida_12415_2023', 2, N'12415134-1 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (936, N'Docente_María_12425@gmail.com', N'$2a$10$AeBolGsqmm3W65Rp0OHCTeGAW5R0pbgAaJdGxGouAwE/brfbL7jI2', N'Docente_María_12425_2023', 2, N'12425989-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (937, N'Docente_Elena_12429@gmail.com', N'$2a$10$MzDGGMwJItNxHJVC.kJm/OZQRwMg0Zha2Yl3kuKqf38H/YvV.c1qS', N'Docente_Elena_12429_2023', 2, N'12429692-7 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (938, N'Docente_Glauco_12442@gmail.com', N'$2a$10$I.aXIkyv/QWDRGsI6pZ1Q.8Ms4RrsfzUgVwT3RH4FANh8EUZ59fYm', N'Docente_Glauc_12442_2023', 2, N'12442756-8 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (939, N'Docente_Ricarda_12462@gmail.com', N'$2a$10$tQKqyg45zZgjUWjwF7fWL.AIQcJwscTjbfbYoH63QwVPH3kEPOWay', N'Docente_Ricar_12462_2023', 2, N'12462396-0 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (940, N'Docente_Eva_12463@gmail.com', N'$2a$10$f1KCwKxNjsYcTsxn/CpCNeMf.pPuhjKG4pJklIG7qKhBgX.cLyW5i', N'Docente_Eva_12463_2023', 2, N'12463586-1 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (941, N'Docente_Sabina_12482@gmail.com', N'$2a$10$i9ZsK4YjimJSbdza5jXn6.FlNagbmv04kM328XFqqualrC60YCmoq', N'Docente_Sabin_12482_2023', 2, N'12482661-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (942, N'Docente_Hector_12489@gmail.com', N'$2a$10$slryaAzsxfL7AWZAuIg1f.dHYydTTfrkL0aYh/zUfpYjQQYez0nqu', N'Docente_Hecto_12489_2023', 2, N'12489531-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (943, N'Docente_Eutropio_12503@gmail.com', N'$2a$10$UbcnnX5yf3Yy5qiLgQix5OdNqCKQhfuwmyM/NQP.LBXmML6zSUXiC', N'Docente_Eutro_12503_2023', 2, N'12503946-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (944, N'Docente_Laura_12507@gmail.com', N'$2a$10$Df9d5i.eCRivO7oDWLecR.WKkbCBTh.GVypnQZ0VIsmtPMeeG9O5y', N'Docente_Laura_12507_2023', 2, N'12507657-2 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (945, N'Docente_Visitación_12526@gmail.com', N'$2a$10$hH/pD/XQ8xto7nwH6Iv4oenhsLzBrHVPoRdNQ5.Wg2qeq5B5IMfea', N'Docente_Visit_12526_2023', 2, N'12526155-8 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (946, N'Docente_Sofía_12546@gmail.com', N'$2a$10$Po6kwg.mi9Qv9w7mNJXSDeF4fh1sbCCbaaklZnYXJiPKYyb42Ts5e', N'Docente_Sofía_12546_2023', 2, N'12546347-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (947, N'Docente_Victorino_12567@gmail.com', N'$2a$10$U2zam44QinvmJzyKXKoLgu7YiB0OxksXkIgpqn7J53XWVxkRtzSxm', N'Docente_Victo_12567_2023', 2, N'12567318-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (948, N'Docente_Angelita_12577@gmail.com', N'$2a$10$3WWEItoR6BUpGQW1Om7lwu3.51C5mcSkMfmXSY1Wp5lLxIgbwXlgG', N'Docente_Angel_12577_2023', 2, N'12577750-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (949, N'Docente_Bibiana_12579@gmail.com', N'$2a$10$tnLlY94P8ZaktrjklYZh6e/0bTKFTjbu088xX8OY1fnb3BVfCk9Xy', N'Docente_Bibia_12579_2023', 2, N'12579409-2 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (950, N'Docente_Florinda_12580@gmail.com', N'$2a$10$I.7ojaiyVdfvrhZmEj5Ud.VO89QnnnL0fDwin4Ys.OgLEciZkceCO', N'Docente_Flori_12580_2023', 2, N'12580480-2 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (951, N'Docente_Rita_12582@gmail.com', N'$2a$10$S6OhDWzLJAMDGyPKu6f73.NPLkES.uyF1wipPSILwWWEOIhBld1yS', N'Docente_Rita_12582_2023', 2, N'12582057-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (952, N'Docente_Rosa_12606@gmail.com', N'$2a$10$WsR7fZ5CPxn0zQHnlCW8u.t1IwAt1G.FuXunrUOPRa6U8Dwwhse0G', N'Docente_Rosa_12606_2023', 2, N'12606604-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (953, N'Docente_Amalia_12608@gmail.com', N'$2a$10$TZXcLTm6D/F8K/MpoBSs/uQ0QaK3plsMZ5b2dzFUbcFQgV47DSiaS', N'Docente_Amali_12608_2023', 2, N'12608347-5 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (954, N'Docente_Baldomero_12611@gmail.com', N'$2a$10$TD6Ktw50O9bvDI0vPo20gOg3WcyjLD42IYjryaBFNrhfZ5bgJuVk.', N'Docente_Baldo_12611_2023', 2, N'12611214-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (955, N'Docente_Juan_12628@gmail.com', N'$2a$10$c.XOs6O58ip8CFcGjzInY.aK/QoVcqIm3JNq/zao1mlDZrIJDmbme', N'Docente_Juan_12628_2023', 2, N'12628491-8 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (956, N'Docente_Federico_12632@gmail.com', N'$2a$10$r9bS4jewKurWOcxUj9FOXeJBoNtV/Xu6WsXIYPtRE58F143F/5Q6.', N'Docente_Feder_12632_2023', 2, N'12632919-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (957, N'Docente_Azahara_12672@gmail.com', N'$2a$10$kSVd6MdSVe6Q69KVCJilQeRVo35nZ42Cs0di8hZjI0lu9xpCOBtbS', N'Docente_Azaha_12672_2023', 2, N'12672315-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (958, N'Docente_Juan_12680@gmail.com', N'$2a$10$CaLvJPqN0soT0tgqGt/dru/voHxL7oL74LxxM1VapVrm2W0Vbp7g.', N'Docente_Juan_12680_2023', 2, N'12680923-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (959, N'Docente_Noelia_12717@gmail.com', N'$2a$10$14wQBVJRVlVAvhAUcATqquWb5ddLqrC9KdKUY.6.sCrdfujVHKiSa', N'Docente_Noeli_12717_2023', 2, N'12717457-1 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (960, N'Docente_Emma_12720@gmail.com', N'$2a$10$CobcuV5cCMjahVJUYe.LI.Zx31zRitGXrdxcGlPmiQ/vP.7qMrIam', N'Docente_Emma_12720_2023', 2, N'12720040-8 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (961, N'Docente_Atilio_12743@gmail.com', N'$2a$10$fk8yJOSlsXW4bZx8HxZGwOst9q1cM3Glqbsaqw3.VQQkAaNFAiAYu', N'Docente_Atili_12743_2023', 2, N'12743380-1 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (962, N'Docente_Félix_12749@gmail.com', N'$2a$10$HEXY8mtarL9VDKaNuSUS5unNQn7zVaSindhWcEc/dWkR287VN/FWu', N'Docente_Félix_12749_2023', 2, N'12749398-7 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (963, N'Docente_Toribio_12767@gmail.com', N'$2a$10$zz.W2.94oNSM76u3v9cbJeeizBpfkKxIDPc5NoVJsg9CU07VT5Xga', N'Docente_Torib_12767_2023', 2, N'12767532-5 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (964, N'Docente_Olegario_12777@gmail.com', N'$2a$10$lG7f9iWGjNcFsxWdLB0XsukL3uuP82vwEzPxkFSTPvSeSUmwzZ59y', N'Docente_Olega_12777_2023', 2, N'12777742-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (965, N'Docente_Maura_12804@gmail.com', N'$2a$10$8ENQd2OxK7ZSfN6ZYEO/luDJI8uxMi6Uc8daKBcI40QVQelsryZdC', N'Docente_Maura_12804_2023', 2, N'12804380-2 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (966, N'Docente_Nicolás_12833@gmail.com', N'$2a$10$oKuZZ/jMINomU7QOxneE9.X3HxcStqyxfo7oRrUAt5iVkl0Is57Um', N'Docente_Nicol_12833_2023', 2, N'12833818-7 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (967, N'Docente_Zaira_12839@gmail.com', N'$2a$10$S2ibzgBLkIiA2.c1356We.9vZjVyvkgQdf7gwwCT5MZUJ0EezJd3W', N'Docente_Zaira_12839_2023', 2, N'12839134-7 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (968, N'Docente_Concha_12854@gmail.com', N'$2a$10$1OxF4pSKApPelpOF8cHc7upPkAj9mmxrPDQ3RG7qaz7PMlsgQ8CRS', N'Docente_Conch_12854_2023', 2, N'12854262-0 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (969, N'Docente_Priscila_12856@gmail.com', N'$2a$10$XlGrwfp71b6GzuGTuxAY5ue8D0LqQqpLbRcIN0bZG3/dfSjG9SB1u', N'Docente_Prisc_12856_2023', 2, N'12856748-8 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (970, N'Docente_Ignacia_12859@gmail.com', N'$2a$10$7EjHN/D8FUNyICXmy9NAFemKss0pRQZaNJn3xryYO9nhZDiAci.2W', N'Docente_Ignac_12859_2023', 2, N'12859330-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (971, N'Docente_Áurea_12878@gmail.com', N'$2a$10$Gu7XTXKDuUKkk/PIes8/tuWT8jhM44I5PoL1rz1Fb4SKmOfDIEQLi', N'Docente_Áurea_12878_2023', 2, N'12878102-1 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (972, N'Docente_Salomé_12893@gmail.com', N'$2a$10$u/MEaKxvWyrm.h.PIOkskew/gqGnkFlHaakxhRlkr54FfwbaRPl8S', N'Docente_Salom_12893_2023', 2, N'12893775-7 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (973, N'Docente_Jose_12941@gmail.com', N'$2a$10$DgxAX36UsODAUDbQs73hBu9o60S4bEXigRQ47q5lcMzg08ReUEgi2', N'Docente_Jose_12941_2023', 2, N'12941720-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (974, N'Docente_Sosimo_12960@gmail.com', N'$2a$10$g1lNWxenaJh//YvIQwnh.OL9lbktc4xpkTvTtC.ZvN9XtwYHsUi6.', N'Docente_Sosim_12960_2023', 2, N'12960555-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (975, N'Docente_Marina_12998@gmail.com', N'$2a$10$BYvxlxou6rRjmuGkLnZXc.pmlo0V2OtArmiUtgF98QVCsGn8ZQx7S', N'Docente_Marin_12998_2023', 2, N'12998143-1 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (976, N'Docente_Valerio_13007@gmail.com', N'$2a$10$Hu0uw16htX/YXE4uzRWhL.gkSczn1ZPiT6llC2ACV/TgLwEHDfhcq', N'Docente_Valer_13007_2023', 2, N'13007742-0 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (977, N'Docente_Germán_13012@gmail.com', N'$2a$10$Xp0yw8DJngfH6F7hDN635.5n/.tdSs.G.D1w1Amk0IqoSYWmfSMl.', N'Docente_Germá_13012_2023', 2, N'13012660-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (978, N'Docente_Angélica_13014@gmail.com', N'$2a$10$3Z9UGnyu1PSL/sao2XCkv.e.hRCiPlgKesmqjETJusbRtn6Y22xXW', N'Docente_Angél_13014_2023', 2, N'13014361-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (979, N'Docente_Ruth_13022@gmail.com', N'$2a$10$IYosffOC3.Mfi7cfhxdH/eqKNCxqvxyv.4GqPMeLIgNa1AbZgd5Oa', N'Docente_Ruth_13022_2023', 2, N'13022922-0 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (980, N'Docente_Lorenzo_13036@gmail.com', N'$2a$10$cEe/6Zy7YNYaaealUkmISedB9IB.QAcyrC2DJBdRRMawP3YSE.nmq', N'Docente_Loren_13036_2023', 2, N'13036082-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (981, N'Docente_Jonatan_13053@gmail.com', N'$2a$10$vFwoiyoRxmt19lnmRmyU5.nTud8mefbGosYmouBCdT6YtovP1olHi', N'Docente_Jonat_13053_2023', 2, N'13053465-1 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (982, N'Docente_Joaquina_13071@gmail.com', N'$2a$10$b4MmULssDLVEH7lTgPEivObwXz2HTyRqugU3/b3.VkHcwtOMYyi86', N'Docente_Joaqu_13071_2023', 2, N'13071620-2 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (983, N'Docente_Mohamed_13074@gmail.com', N'$2a$10$33FqQKrAjTJS07kVS9.sQONFQvkQoTszONYQj6mxUFvj9A1x7v2nG', N'Docente_Moham_13074_2023', 2, N'13074835-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (984, N'Docente_Adelardo_13104@gmail.com', N'$2a$10$4Q2AGZWEiQcDQnTX2STtzuDxH6O8cPurtZzM0uvvE4dW9xPzZrRHK', N'Docente_Adela_13104_2023', 2, N'13104816-5 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (985, N'Docente_Paulina_13127@gmail.com', N'$2a$10$eX49Mq.8AYzomvyxadKThuK1qoIplCwSXpqE8Qp99wxsLgalk6JEO', N'Docente_Pauli_13127_2023', 2, N'13127102-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (986, N'Docente_Timoteo_13164@gmail.com', N'$2a$10$3kk45vCE6psK0ueJB8HdhO.Xw8p0W9dzf6K/mKcM6xGoKMnhnOv0O', N'Docente_Timot_13164_2023', 2, N'13164403-5 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (987, N'Docente_Marcio_13164@gmail.com', N'$2a$10$QRqHpxC18h7rV82PWqtaSOWOgjDVKlkJD5eUBi9wKxrYVKHpGKNVS', N'Docente_Marci_13164_2023', 2, N'13164845-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (988, N'Docente_Joaquina_13166@gmail.com', N'$2a$10$gzFWF.9lo30cEoPd3VFZgOzdUG9wf.qycZP5WCFykS4EsC2zVn/r.', N'Docente_Joaqu_13166_2023', 2, N'13166555-5 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (989, N'Docente_Sabina_13169@gmail.com', N'$2a$10$.XQZu11AVYwfQ0CsXp96e.GD0wdvgH/BzZEZcIxUrcNVVLzl4QvBW', N'Docente_Sabin_13169_2023', 2, N'13169178-5 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (990, N'Docente_Ramón_13169@gmail.com', N'$2a$10$YL8wpxuJ/i1BZjiV3QQDg.kjclX11mO2sBbb2KyaBuXptJD4h7wS2', N'Docente_Ramón_13169_2023', 2, N'13169897-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (991, N'Docente_Guadalupe_13172@gmail.com', N'$2a$10$Jcr1loeqH/HzOPXEeeKFruJRxyhT4mgpjClr.GksUiKAYCpic40bG', N'Docente_Guada_13172_2023', 2, N'13172585-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (992, N'Docente_Fortunata_13176@gmail.com', N'$2a$10$3SThSOk0TXnHj7x1cdUgoetShZCQIfBlJKhLmQb/LhMPv.USpN/cq', N'Docente_Fortu_13176_2023', 2, N'13176516-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (993, N'Docente_Nacho_13180@gmail.com', N'$2a$10$5LNDlKy.r6f3KGQr9uAtWerperYReMUzbU/z1zELMUP9LN3q2jg/K', N'Docente_Nacho_13180_2023', 2, N'13180112-2 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (994, N'Docente_Sergio_13187@gmail.com', N'$2a$10$ZrrABPdx1ffjTKhmHbvSd.kyLsRWPmq9.3cIijjf1zcOmjSRb8fQi', N'Docente_Sergi_13187_2023', 2, N'13187874-5 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (995, N'Docente_Reyes_13189@gmail.com', N'$2a$10$c.aS11Hzq6Soaw5nxzz7g.d0l.sZMGZJi5q9MRA8HS9TndSxYj7JW', N'Docente_Reyes_13189_2023', 2, N'13189569-0 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (996, N'Docente_Pastor_13229@gmail.com', N'$2a$10$uw4GyWJ/m7NhQikZTW/Hb.ALjF4czA.II.1WNy8VB94cTwCB22HbC', N'Docente_Pasto_13229_2023', 2, N'13229854-8 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (997, N'Docente_Raúl_13230@gmail.com', N'$2a$10$i.zSuPNeLbo5jqYu0L0spu7eKxJOi0vs0DDNEqsGfw2DNEmtHpUaq', N'Docente_Raúl_13230_2023', 2, N'13230860-8 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (998, N'Docente_Paulina_13236@gmail.com', N'$2a$10$.sT7XjOCSL3LB/4ZOYRVS.sOG54H4MAMQ1/623sVBkKxXKC33kSna', N'Docente_Pauli_13236_2023', 2, N'13236896-1 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (999, N'Docente_Gustavo_13250@gmail.com', N'$2a$10$9UbVcMmqB9W5p7IfuCRUReAkIjAETYeOhIN9mzp1lbNLBnDXGCtRO', N'Docente_Gusta_13250_2023', 2, N'13250207-2 ', 1)

INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1000, N'Docente_Benjamín_13255@gmail.com', N'$2a$10$P53RnDVvycgDLpIlxuh38.9TLGAiIsYFWFncRMT7Y.J3emm142zJK', N'Docente_Benja_13255_2023', 2, N'13255996-1 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1001, N'Docente_Lorenzo_13257@gmail.com', N'$2a$10$BUmOBX47K5730dZ25usTjOddUmkTVsY2cvlre1sgd8oyy2AqigPJu', N'Docente_Loren_13257_2023', 2, N'13257517-7 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1002, N'Docente_Bienvenida_13258@gmail.com', N'$2a$10$x18XUCdgAm9qnMV7AKBxrOvdd1LDqH0WiA3ZnPulMyHqspI0Wjynq', N'Docente_Bienv_13258_2023', 2, N'13258827-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1003, N'Docente_Sarita_13263@gmail.com', N'$2a$10$H0FK8mwWI9/rzwjmiv1t4eZ6ZtMkM9NY3pRgDUATpgEodyv3gpMxu', N'Docente_Sarit_13263_2023', 2, N'13263791-1 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1004, N'Docente_Rafa_13263@gmail.com', N'$2a$10$iEhtL1yXLlrNdc1MonhCNOJIQ0sa4co7NytZ/WGtfpMAECCtDXqke', N'Docente_Rafa_13263_2023', 2, N'13263940-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1005, N'Docente_Celestina_13269@gmail.com', N'$2a$10$ADPX.6jkZAtqj7WH2xy5OuS/6dRZi9DEQB6ai9ZWhflePrYQ4JFd2', N'Docente_Celes_13269_2023', 2, N'13269124-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1006, N'Docente_Francisco_13276@gmail.com', N'$2a$10$hGleokcLf4oQFjRetXxfvOwaoN/Zo.Rh/04ANg41ex.ZplLmtT3mm', N'Docente_Franc_13276_2023', 2, N'13276952-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1007, N'Docente_Alex_13283@gmail.com', N'$2a$10$XKhBwsO/OaMtYd9hNO2Wtufzw0zC8TrK3bU.yAFM8c6vviCOYN2gC', N'Docente_Alex_13283_2023', 2, N'13283228-5 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1008, N'Docente_Josep_13287@gmail.com', N'$2a$10$yb/OXGkgpEl0zJT6cbKLkuAQpfXeUYhkD2m8Ya7YpRewOgadhU1B2', N'Docente_Josep_13287_2023', 2, N'13287555-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1009, N'Docente_Jordán_13287@gmail.com', N'$2a$10$di/TabvDwJWCNQ921c7qk.ITBKvoMpOKg8O0t7vaiBWWGG1ipBTNy', N'Docente_Jordá_13287_2023', 2, N'13287638-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1010, N'Docente_María_13293@gmail.com', N'$2a$10$HUPp5PJzSs3UFpF1TfCtje.gRuatlujxojY36l0MFBfzSJzM/V0Mu', N'Docente_María_13293_2023', 2, N'13293393-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1011, N'Docente_Eva_13296@gmail.com', N'$2a$10$RVo/DhVLnXIoMoXJw02O9uD2AdPFMPaHnfFCwcFG8kvndnjDQcFFO', N'Docente_Eva_13296_2023', 2, N'13296241-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1012, N'Docente_Álvaro_13317@gmail.com', N'$2a$10$VakajLEpKaLdMzm0Q5Fate2Ey7vP0KikakIhWc8mNDwcIYVnQvcAu', N'Docente_Álvar_13317_2023', 2, N'13317341-2 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1013, N'Docente_Juan_13322@gmail.com', N'$2a$10$D8/cKb8S5kudev9049t31OnzxCtx6Z8fwQbgbmLfnMqRVCvnZhKpe', N'Docente_Juan_13322_2023', 2, N'13322547-1 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1014, N'Docente_Víctor_13362@gmail.com', N'$2a$10$kakREvNBE9ZofB3weyfruO6viarS9lH2nmwtQDaXoUi4sx8013rT.', N'Docente_Vícto_13362_2023', 2, N'13362228-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1015, N'Docente_Gervasio_13363@gmail.com', N'$2a$10$k81poWDsGuFswT506j./NOa2CGa905QW1UmIfnxtuKpISgpgDmony', N'Docente_Gerva_13363_2023', 2, N'13363861-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1016, N'Docente_Emma_13363@gmail.com', N'$2a$10$P.9FIXTq5GgnBTyI1pVwiu3uvJaIzp7PwieCCKSQiQ1eJ/oYhruD.', N'Docente_Emma_13363_2023', 2, N'13363944-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1017, N'Docente_Aitana_13372@gmail.com', N'$2a$10$NPcZfuhOIl.vfBBzAkhKCOjPjc5U6dYvnUNCAsNVn9IouofiIjlAq', N'Docente_Aitan_13372_2023', 2, N'13372558-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1018, N'Docente_Ovidio_13374@gmail.com', N'$2a$10$z1XHPloPxufiRmboTb8f2.SGorbn5euvU58TvOUQWTc5qOvz7LWOi', N'Docente_Ovidi_13374_2023', 2, N'13374749-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1019, N'Docente_Chelo_13388@gmail.com', N'$2a$10$VW4zYjkbki165LKHnLhRauRtS6ktgHzCpNPi8mPP4SDsdIigXA4sy', N'Docente_Chelo_13388_2023', 2, N'13388365-7 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1020, N'Docente_Lucía_13410@gmail.com', N'$2a$10$HU884kbVYUfdSiUaVWD3C.OFhS5hu1ESg3OefffWNnJUpOqrTsnhG', N'Docente_Lucía_13410_2023', 2, N'13410580-1 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1021, N'Docente_Nélida_13411@gmail.com', N'$2a$10$kCDWEUCkvlcVOKmFqC8MJ.7YDnmT8nO1x9e//3GRM9d1DWuZONgpO', N'Docente_Nélid_13411_2023', 2, N'13411638-2 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1022, N'Docente_Paco_13417@gmail.com', N'$2a$10$agJOlGomKt0rQUZG7oFx3.qcddWHuKcnxGbLgPrzHqEpn27P0fWTK', N'Docente_Paco_13417_2023', 2, N'13417558-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1023, N'Docente_Maxi_13423@gmail.com', N'$2a$10$U2UplHxAFq4dO7aiEG1JtORy8SpwqnBuu5glDVidfDtDhoIc5S.ga', N'Docente_Maxi_13423_2023', 2, N'13423811-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1024, N'Docente_Estela_13443@gmail.com', N'$2a$10$CbjLY6kb7iO4CPenGACXUeH0fvvthYJhN9Dtxqc8q6WzJNzF5G5EO', N'Docente_Estel_13443_2023', 2, N'13443180-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1025, N'Docente_Maite_13448@gmail.com', N'$2a$10$QwOI0xge2B/IMUZp9I1cuuB/L.Mp6vN9sIO7WqlJe6ibbFJYtaSRC', N'Docente_Maite_13448_2023', 2, N'13448142-0 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1026, N'Docente_Edgardo_13455@gmail.com', N'$2a$10$EshPi7GEow0Y6OvQUvD1GO.maiAyxuE5EoMwP0KTWzLExQoEpg3HS', N'Docente_Edgar_13455_2023', 2, N'13455567-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1027, N'Docente_Fátima_13462@gmail.com', N'$2a$10$ecA7Ye4/.0WKc.3SEnD9deQNt0Mt2kONZjVF1KIMb7sghvDpC8r/a', N'Docente_Fátim_13462_2023', 2, N'13462736-0 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1028, N'Docente_Jose_13465@gmail.com', N'$2a$10$A2H./j5bdxIwHNF/jn908.VNQBsozjtBoZamUrdAvO7CPwwmQSgT6', N'Docente_Jose_13465_2023', 2, N'13465574-7 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1029, N'Docente_Angelina_13466@gmail.com', N'$2a$10$6.5iQsEDugv2lyxBnUsGdetRJOw6kns9fuqbD4uaogYlCMHZoNyeG', N'Docente_Angel_13466_2023', 2, N'13466545-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1030, N'Docente_Bernarda_13474@gmail.com', N'$2a$10$z7oaHoHQTmpw9UgeuT3gL.yAJ4cVSx8XAA3x4uKAdLG4jGfnFAPDm', N'Docente_Berna_13474_2023', 2, N'13474067-1 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1031, N'Docente_Elba_13474@gmail.com', N'$2a$10$j1TtlKqIyeqgZTHciGQjDORvoyyVokKirA/FljscETmGRo0dLce4C', N'Docente_Elba_13474_2023', 2, N'13474325-5 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1032, N'Docente_Manuelita_13478@gmail.com', N'$2a$10$ewh7pnhfgqzhcJ6lHg3JUuBdNIkoI0H6oLMqccT/VJcJEZfr.5QHO', N'Docente_Manue_13478_2023', 2, N'13478959-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1033, N'Docente_Adalberto_13490@gmail.com', N'$2a$10$4n6idqlbyoBryTAv6FSbJOQNgZRFauj8u9aOQ1Sn33GuLsUFgdyoe', N'Docente_Adalb_13490_2023', 2, N'13490604-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1034, N'Docente_Evita_13493@gmail.com', N'$2a$10$HeDLFWpqEyoNcOOqhqALjeuZgT/ggwiRb6zsLOzxeQuPR6aANzCHC', N'Docente_Evita_13493_2023', 2, N'13493857-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1035, N'Docente_Rosalía_13506@gmail.com', N'$2a$10$KAHAqdBc2m/GU.BrtHLEueyjtR/EpOizdqu40C6Fbs0Gmsu6s1qwO', N'Docente_Rosal_13506_2023', 2, N'13506199-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1036, N'Docente_Alejo_13511@gmail.com', N'$2a$10$Db5Ys4J8xQF94moXUiCa1O73KZhehaF2DgIy/e8jTKr/JQlNKZ3ZG', N'Docente_Alejo_13511_2023', 2, N'13511651-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1037, N'Docente_Lupe_13529@gmail.com', N'$2a$10$at2sMi2yZQOmIWMYh.MEmeunzmUObKm/bncFJjf2GHY3PuNtdYPTS', N'Docente_Lupe_13529_2023', 2, N'13529640-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1038, N'Docente_Eugenio_13532@gmail.com', N'$2a$10$LoNAf07XQZCi8M8I1w09tuknlb7OmBlmAxaoyFB41WgRb/MtowvCa', N'Docente_Eugen_13532_2023', 2, N'13532532-5 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1039, N'Docente_Teófila_13539@gmail.com', N'$2a$10$FJjmxFv9JHLYSCrTaDVPvOHSg4dBWLK6u2lUJRZLAXJ5aqFAV1Mla', N'Docente_Teófi_13539_2023', 2, N'13539393-2 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1040, N'Docente_Sigfrido_13539@gmail.com', N'$2a$10$fYfLh4SSFNu.Jz3ChTL2R.unMSLJFMQNmbla33myL5sH.tHPJJcnu', N'Docente_Sigfr_13539_2023', 2, N'13539789-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1041, N'Docente_Tito_13543@gmail.com', N'$2a$10$81NTmZyaV6kdPJHeRfpwk.f.pcq03qwCdwvsR5XxhOWQfKVNO0jxS', N'Docente_Tito_13543_2023', 2, N'13543595-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1042, N'Docente_Jorge_13547@gmail.com', N'$2a$10$RpmQjUGd5msqy.Hd6Xq.aeQqPmTuyxsTNhnaRZ8.7AZbDaf59NZ..', N'Docente_Jorge_13547_2023', 2, N'13547242-5 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1043, N'Docente_Andrés_13549@gmail.com', N'$2a$10$t5Ur2tYkZobbP1JvYl7NuegnonYQrsGm9sv6nzCzhFn0n7jTQ.19u', N'Docente_André_13549_2023', 2, N'13549704-5 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1044, N'Docente_Encarnacion_13558@gmail.com', N'$2a$10$gBWsPgu39wUFQMaeCa0DDelCIH6yrThqqPPAieR1Um17/rRBKWUD2', N'Docente_Encar_13558_2023', 2, N'13558917-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1045, N'Docente_Jessica_13565@gmail.com', N'$2a$10$SJcZ6oZXscO2Zd2WddYE3uQeg1CZtvPLhAlyNMYs.1llXidLaBygi', N'Docente_Jessi_13565_2023', 2, N'13565523-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1046, N'Docente_Pía_13567@gmail.com', N'$2a$10$c9uvutGWOOPC5K7GEjVlZOLFOv5oexKHk7xadr68Ko7aPLwKvxXK.', N'Docente_Pía_13567_2023', 2, N'13567240-8 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1047, N'Docente_Francisco_13567@gmail.com', N'$2a$10$qMxiYiiLenqt.1fUztmdL.ay5PEMPrfmwmKyd6sAfKjR7D1KmMJiC', N'Docente_Franc_13567_2023', 2, N'13567255-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1048, N'Docente_Seve_13602@gmail.com', N'$2a$10$bX0hRLase4fB6T4FLSEuHe/R0bD/WC.022W1D8I6CTy4JQwl9RD4u', N'Docente_Seve_13602_2023', 2, N'13602705-0 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1049, N'Docente_Prudencia_13622@gmail.com', N'$2a$10$XBv.yZYC5kdO7.n6t/ZRj.tombDLnPul9O3iNP3YaBcw66A2QdjoW', N'Docente_Prude_13622_2023', 2, N'13622701-7 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1050, N'Docente_Rosenda_13630@gmail.com', N'$2a$10$FoOQ6.tUloqt0XccR31yRuL914aj4sBHp24gvDNla8bHCnjSZTYwS', N'Docente_Rosen_13630_2023', 2, N'13630884-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1051, N'Docente_Ximena_13632@gmail.com', N'$2a$10$KC1ugS/sjBNiroAiFGyOMOJsIpJtlHF.lpcGCGXzmq1m.IztvG/Gy', N'Docente_Ximen_13632_2023', 2, N'13632855-7 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1052, N'Docente_Chema_13639@gmail.com', N'$2a$10$CpLGNDr4OSIfFRSrWWI26Ozjbj6CCcpQAa3xe1VUVxhjX8QglcdnK', N'Docente_Chema_13639_2023', 2, N'13639690-0 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1053, N'Docente_Daniela_13648@gmail.com', N'$2a$10$Jg.7SVBy4R4ixm89wSBZAOPFrIrbJAPB3.WGV18tmCDPuEECzieyW', N'Docente_Danie_13648_2023', 2, N'13648490-7 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1054, N'Docente_Miguel_13660@gmail.com', N'$2a$10$P/dplTe3gIVi/Yi13ay0ouXWnsOiKDWPHt2lsN7Sqmub8.aPW1d.e', N'Docente_Migue_13660_2023', 2, N'13660551-8 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1055, N'Docente_Cipriano_13674@gmail.com', N'$2a$10$ZfaBsLhwKt79k9IXqqc1i.zKFg1PZCOJvPOOKoZa8kRaLHrbpAv06', N'Docente_Cipri_13674_2023', 2, N'13674283-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1056, N'Docente_Arturo_13675@gmail.com', N'$2a$10$NvfUqoigtNoPEyWJzw9JTet15r5r8aQdH7VvYdrBCFqDpIq1KSM1W', N'Docente_Artur_13675_2023', 2, N'13675794-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1057, N'Docente_Virginia_13686@gmail.com', N'$2a$10$FhKA5fShDDqRYlIH2z97pOGokUACVXvaGYqB3z6eWNC.hFKh0wDai', N'Docente_Virgi_13686_2023', 2, N'13686122-0 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1058, N'Docente_Saturnino_13688@gmail.com', N'$2a$10$cfwdb2OdqwD2gvZwba0skuIedkOWILZ.ameLwbp44P423P/3Kyw66', N'Docente_Satur_13688_2023', 2, N'13688966-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1059, N'Docente_Martirio_13719@gmail.com', N'$2a$10$Xn1OjEZM1.RHUtocxdjQlevkFM/ClVRtlI5E5fzl/Tlwe2oo7hQDm', N'Docente_Marti_13719_2023', 2, N'13719528-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1060, N'Docente_Ramón_13725@gmail.com', N'$2a$10$KQWdZPcyGmCVhIOc/S79oOtv3MLjGFsEp4CfeFlaWDWoMQTTt31WW', N'Docente_Ramón_13725_2023', 2, N'13725066-7 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1061, N'Docente_Cloe_13742@gmail.com', N'$2a$10$xmHSxn1xe672m4im4LretO7gHWhaOOQ54h9amz15qtz1scxBUJDU6', N'Docente_Cloe_13742_2023', 2, N'13742329-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1062, N'Docente_Juan_13754@gmail.com', N'$2a$10$FEfQGqV3Rn87mS9/eassDOtuMgrK3hq0.G4xnVbqD6VjM0152lRqy', N'Docente_Juan_13754_2023', 2, N'13754872-0 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1063, N'Docente_Rodrigo_13755@gmail.com', N'$2a$10$3VZtCr58Ya.heTzzw388wu.LqHiVtIzbTXSzpy3o9/1v06fMvh2aO', N'Docente_Rodri_13755_2023', 2, N'13755681-2 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1064, N'Docente_Fausto_13761@gmail.com', N'$2a$10$Huj5EVHbIxA7kC.ME4ugDuMroeE/Q8fi1mvldTWIL2AzRgpJ0M5oy', N'Docente_Faust_13761_2023', 2, N'13761711-0 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1065, N'Docente_Javi_13790@gmail.com', N'$2a$10$W34Ds4eFXEkhv6DG87I23e8UB38XWHVSVuPlGfNa2C0nL.uXK0rnK', N'Docente_Javi_13790_2023', 2, N'13790481-0 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1066, N'Docente_José_13792@gmail.com', N'$2a$10$wdGfozUfvXEvTOloIKq3hOpm.BTUFpNjrjAlOqSjp/xKLca3guojW', N'Docente_José_13792_2023', 2, N'13792757-8 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1067, N'Docente_Cruz_13795@gmail.com', N'$2a$10$2VZUeOljMzer0hbB2IG7FeNir.TAQQ5bw9QrxwRqCN54MDtPz69PG', N'Docente_Cruz_13795_2023', 2, N'13795755-8 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1068, N'Docente_Beatriz_13812@gmail.com', N'$2a$10$yM2VymIzY/YTw2URLM4LeeDyqornGvPvlrMnXzkdule0L.ID8PQFa', N'Docente_Beatr_13812_2023', 2, N'13812346-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1069, N'Docente_Ascensión_13822@gmail.com', N'$2a$10$fLbH4UQLSDi.2nPKeLf64.cef6clD1zh9oGe.S86o8wVWSM.Byui2', N'Docente_Ascen_13822_2023', 2, N'13822330-2 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1070, N'Docente_Rebeca_13822@gmail.com', N'$2a$10$F6yXK1h0aaHFeC.vUVMRNebw5sx99gfbJ1HFU.2vJOdq5ppL1luri', N'Docente_Rebec_13822_2023', 2, N'13822989-0 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1071, N'Docente_Candela_13824@gmail.com', N'$2a$10$H/HPGZ3sLvjBnnkbfsL.f.b1zX/oSU6xF1YWpgursqxQW5SCCC53K', N'Docente_Cande_13824_2023', 2, N'13824547-0 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1072, N'Docente_David_13833@gmail.com', N'$2a$10$Qt5xbVoghaVMtqe9OhAOWurByMHhb.WIyPMElZqKOz/2hRx0gedci', N'Docente_David_13833_2023', 2, N'13833729-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1073, N'Docente_Josep_13834@gmail.com', N'$2a$10$JzqoCwoO2a./UKvOQYstCuNmVR7VwSmIcNIT2X1fpp0bKJhSNDhaO', N'Docente_Josep_13834_2023', 2, N'13834142-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1074, N'Docente_Juliana_13846@gmail.com', N'$2a$10$jyeqcxrzGwZ5gmpk4UI.7uGlalUSx0REYRthldZP8Pg4isXeWnsvG', N'Docente_Julia_13846_2023', 2, N'13846172-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1075, N'Docente_Baudelio_13852@gmail.com', N'$2a$10$xA4PMOeCFGs4lXBD/4fnQ.654KWGwLXE2AYQVt584ghWz4ug/TcmO', N'Docente_Baude_13852_2023', 2, N'13852329-2 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1076, N'Docente_Piedad_13866@gmail.com', N'$2a$10$ETisGX2tvfdrK7loTGft0eoEWeo3vj.2ZZXs6gOvPH1h38xEmPPTm', N'Docente_Pieda_13866_2023', 2, N'13866551-8 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1077, N'Docente_Luis_13886@gmail.com', N'$2a$10$bjqHEWFaQLOfY8sdINiBS.eu3cEfF7yT4SlBKRECAt4br5vOjWM7C', N'Docente_Luis_13886_2023', 2, N'13886495-2 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1078, N'Docente_María_13912@gmail.com', N'$2a$10$nqX0aze63wWxb8MNwoiz.eNEoZma4g1o2ihR9lzK2pAnDgK3xtMPO', N'Docente_María_13912_2023', 2, N'13912617-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1079, N'Docente_Narciso_13913@gmail.com', N'$2a$10$kWeX2uvPdn6LmFliX4OQg.Lgjms.vZxivh5fZeAsSYWLxu6OZWh7G', N'Docente_Narci_13913_2023', 2, N'13913725-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1080, N'Docente_Calista_13970@gmail.com', N'$2a$10$4kUKH3lkLi2.7yC0npN/qOPIhTuR.EkOK49YkZ7nh5SAVApXj/Cme', N'Docente_Calis_13970_2023', 2, N'13970857-1 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1081, N'Docente_Elba_13979@gmail.com', N'$2a$10$8Vg4BkMrfFGkYmhbPmVk0uDJiYGDl4XQ6Ya63evnSlQVFwA75GPtC', N'Docente_Elba_13979_2023', 2, N'13979267-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1082, N'Docente_Jonatan_13983@gmail.com', N'$2a$10$ZQyQqc3uMWdRKingsURou..Rl4be19TiSmvjCeAbUHMW/TzZfFRGK', N'Docente_Jonat_13983_2023', 2, N'13983572-7 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1083, N'Docente_Feliciana_13985@gmail.com', N'$2a$10$zXI9Mxhkq6YoOgJRYYBP3ub1i0SCuttZg1CjMpBoqYEOOeDDIgMle', N'Docente_Felic_13985_2023', 2, N'13985194-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1084, N'Docente_Pío_14003@gmail.com', N'$2a$10$FdCudbZRzjaXqSZxfrsbwOjx2jXPRNmLZyJy9MA0QHcj34nLGGn5W', N'Docente_Pío_14003_2023', 2, N'14003611-0 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1085, N'Docente_Dolores_14004@gmail.com', N'$2a$10$zriRcTwpFR.iuOXkdlQPvuAReNZyYGw8JBDJGr57HYSAeGXmYKYHS', N'Docente_Dolor_14004_2023', 2, N'14004197-1 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1086, N'Docente_Griselda_14004@gmail.com', N'$2a$10$DVtRauS0eUtC/U6Zwb0qruEYpEQHaRGsQfvPBPp18PwGjZQ1oiI5W', N'Docente_Grise_14004_2023', 2, N'14004836-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1087, N'Docente_Paca_14011@gmail.com', N'$2a$10$peVyD/GHAx5L5NznReEW/.3smyKYZGWEBqyx6Fj42oqs0lzwAFlJm', N'Docente_Paca_14011_2023', 2, N'14011311-5 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1088, N'Docente_Alondra_14017@gmail.com', N'$2a$10$g2qGPr/STvr51.fX3NCzmOVWeJpao6UVJ6jD3rowUiS7PVXXonykW', N'Docente_Alond_14017_2023', 2, N'14017776-8 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1089, N'Docente_Kike_14041@gmail.com', N'$2a$10$AuwuliU8M/wINPfzEpPJFuX7jJfU7wnjoeMldtEWuxibsUEfiKt8G', N'Docente_Kike_14041_2023', 2, N'14041899-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1090, N'Docente_Wilfredo_14068@gmail.com', N'$2a$10$jDE2JXCJQ24xjbsaILA1/ugRj5cCCKZlM9/aK.bi02UctXZH0JQym', N'Docente_Wilfr_14068_2023', 2, N'14068550-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1091, N'Docente_Mireia_14074@gmail.com', N'$2a$10$X75/8u/jQxVVdXf8n7PcQ.Niz5UMowvNUjRG9JCbN4I/fSBjygMoK', N'Docente_Mirei_14074_2023', 2, N'14074955-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1092, N'Docente_Moisés_14078@gmail.com', N'$2a$10$jVMTxTWDR43Z5ToGnJRQ4ObwIy.19WjI7/mz4kcFQCSx8uQv6a4SO', N'Docente_Moisé_14078_2023', 2, N'14078233-5 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1093, N'Docente_Sigfrido_14134@gmail.com', N'$2a$10$WblrWPa2dfUNRkxWSNweUuAvzGVbs2tSjtvLfFxisyiLZQRf3pHd2', N'Docente_Sigfr_14134_2023', 2, N'14134348-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1094, N'Docente_Espiridión_14149@gmail.com', N'$2a$10$Xly4qWS7gsqAmHVN8JHnou4CW75GhW8X7GmLxHa/RkFZ4vJE6ErIO', N'Docente_Espir_14149_2023', 2, N'14149250-0 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1095, N'Docente_Fortunata_14156@gmail.com', N'$2a$10$gCiawH5m2M7nh/CTBfboeeIPgtluorNVlXJezpAyT5eigs1EmaF4W', N'Docente_Fortu_14156_2023', 2, N'14156047-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1096, N'Docente_Fernando_14168@gmail.com', N'$2a$10$nguUogfDu7m9Xqi52fsK.e.xy0IKVXpVE/qP.ztaYb7iXF.EqOnWW', N'Docente_Ferna_14168_2023', 2, N'14168155-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1097, N'Docente_Reynaldo_14197@gmail.com', N'$2a$10$tI7wRmEdWhnOEUcZQC94tORS9WkZfqXw8lXqnou0MB1B67pnJN4ry', N'Docente_Reyna_14197_2023', 2, N'14197219-7 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1098, N'Docente_Saturnina_14209@gmail.com', N'$2a$10$kq59H/mVY3Ltqpi/0EMX9O3m1snMENNdsnZeo3D.KAecmI.TXvd92', N'Docente_Satur_14209_2023', 2, N'14209858-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1099, N'Docente_Adelina_14218@gmail.com', N'$2a$10$BFmVAYTFWUTEufR3qF1zj.1eW.FgAOZAIjsbNTQraA.rjoZG/eEJq', N'Docente_Adeli_14218_2023', 2, N'14218894-5 ', 1)

INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1100, N'Docente_Raquel_14224@gmail.com', N'$2a$10$Auis6KEog5.c.ca2CK.QP..OFAgONRvgfeCnz4L/YQsWdq.nXZqVK', N'Docente_Raque_14224_2023', 2, N'14224136-6 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1101, N'Docente_Iván_14225@gmail.com', N'$2a$10$.4gm4O3PjvfQjWJZmZm4xO4zf7dFa3Mr/63.0ga2lyCRGyf0Qlz92', N'Docente_Iván_14225_2023', 2, N'14225191-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1102, N'Docente_Danilo_14249@gmail.com', N'$2a$10$ZAiBO8RfhyICZjPhb1g9aOqOZ01c9mndT2BeT.J.M2BsuN6T4Gt8q', N'Docente_Danil_14249_2023', 2, N'14249583-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1103, N'Docente_Adelina_14256@gmail.com', N'$2a$10$pYmIdOrGRV5YWpFDXLJFHugGh3JRiUdoWNou5cazVbqjX8OOJSV8C', N'Docente_Adeli_14256_2023', 2, N'14256080-1 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1104, N'Docente_Visitación_14257@gmail.com', N'$2a$10$IdYTM0yWP3rc0lsuRDK2ROX2JjoYx8OV7G2/hdGOaECj0PUGX40wq', N'Docente_Visit_14257_2023', 2, N'14257703-8 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1105, N'Docente_Fernando_14275@gmail.com', N'$2a$10$eKUuI06a1oRXbwrrK2hV9OcmzawsILNSmGbZtjqtLTEoGocNRjZoW', N'Docente_Ferna_14275_2023', 2, N'14275763-k ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1106, N'Docente_Florina_14281@gmail.com', N'$2a$10$0tG8E0SYRSsJYfG7p6/1UOaRnK6juw5YL2DHaCUs33FpAeQNtTXla', N'Docente_Flori_14281_2023', 2, N'14281043-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1107, N'Docente_Jimena_14287@gmail.com', N'$2a$10$TAsXARN.Y7CLYaECxc1SjurXHXDsTsyAQ3eBoDjHSllLzWwULyxHC', N'Docente_Jimen_14287_2023', 2, N'14287344-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1108, N'Docente_Hermenegildo_14296@gmail.com', N'$2a$10$sT24R1ZkaaSpKpyer8LI4uP5VeRoFa7JycbuniUEDU3G7z8Sw.0Je', N'Docente_Herme_14296_2023', 2, N'14296021-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1109, N'Docente_Fulgencio_14305@gmail.com', N'$2a$10$IrnEWt1qfhxvFduS9UHfP.pjKChyeSsj3MM/ks7XUoEUm9I28Y2Zy', N'Docente_Fulge_14305_2023', 2, N'14305011-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1110, N'Docente_Aureliano_14305@gmail.com', N'$2a$10$pWA8ZKFtA7oFzOMa8rqcWuIKc.1HRstvSXw52oVCYuqAICrQ85xDi', N'Docente_Aurel_14305_2023', 2, N'14305013-0 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1111, N'Docente_Marcial_14317@gmail.com', N'$2a$10$vU/khWlLSph2rpTW/A51KezwuW7IzH4XVwWRLDCze0Y/wlnbUMI7K', N'Docente_Marci_14317_2023', 2, N'14317456-5 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1112, N'Docente_Fidela_14323@gmail.com', N'$2a$10$azPZps2pVhfsHwNIv/yPruCDG5W91uBcw5Wz1vG3vaEDSmh3YAQUq', N'Docente_Fidel_14323_2023', 2, N'14323291-3 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1113, N'Docente_Fabricio_14335@gmail.com', N'$2a$10$aOUSXJKVTn./kwAvBYHCwejakLBkL3ObLF97ewPSeg1dgrhu2KwHm', N'Docente_Fabri_14335_2023', 2, N'14335545-4 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1114, N'Docente_Tecla_14341@gmail.com', N'$2a$10$wt7xIZ5bIGstDQqbl.657er.3QsdPYhepm0gtF881R8dPCoM7JFRi', N'Docente_Tecla_14341_2023', 2, N'14341357-8 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1115, N'Docente_Teodoro_14363@gmail.com', N'$2a$10$jXlo32OhDXu9KdeaaXJz0.x7mu3lC/Yy2pSE/85XjqHZq3ycyfp36', N'Docente_Teodo_14363_2023', 2, N'14363025-0 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1116, N'Docente_Lucas_14370@gmail.com', N'$2a$10$rhz0f1.ON9ppgV4Xh65YRukWJfcSNIdMXmrrZS6kZHHZI3P0g2tui', N'Docente_Lucas_14370_2023', 2, N'14370588-9 ', 1)
INSERT [dbo].[t_usuario] ([id], [email], [password], [username], [usuario_perfil_id], [usuario_persona_run], [usuario_vigencia_id]) VALUES (1117, N'Docente_Eligia_14379@gmail.com', N'$2a$10$8kZdDmUKbKdxWQ4BPCISNePZhmltyYDjaFei2Cf0BCcdBgdiCcT2C', N'Docente_Eligi_14379_2023', 2, N'14379776-7 ', 1)
SET IDENTITY_INSERT [dbo].[t_usuario] OFF;

IF EXISTS (
    SELECT * FROM sysobjects WHERE name = 'fn_InfoDocente'
)
    DROP FUNCTION fn_InfoDocente;

CREATE FUNCTION fn_InfoDocente (@establecimiento bigint, @persona_run varchar(100), @curso_id bigint)
                                   RETURNS TABLE
                                   AS

                                   RETURN(

                                     select p.persona_run,
                                                                      	   p.persona_nombre,
                                                                      	   p.persona_apellido_paterno,
                                                                      	   p.persona_apellido_materno,
                                                                      	   p.persona_numero_celular,
                                                                      	   p.persona_numero_telefonico,
                                                                      	   u.email,
                                   									   a.asignatura_nombre,
                                                                      	   e.establ_id,
                                                                      	   e.establ_nombre,
                                                                      	   c.curso_nombre,
                                                                      	   dc.docente_jefe
                                                                      from   t_docente d inner join
                                                                      	   t_docente_curso dc on d.docente_id = dc.docente_curso_docente_id inner join
                                                                      	   t_curso_establ ce on dc.docente_curso_establ_id = ce.curso_establ_id inner join
                                                                      	   t_curso c on ce.curso_establ_curso_id = c.curso_id inner join
                                                                      	   t_establ e on ce.curso_establ_establ_id = e.establ_id inner join
                                                                      	   t_asignatura_docente ad on dc.docente_curso_id = ad.asignatura_doc_docente_establ_id
                                                                      	   inner join t_asignatura a on ad.asignatura_doc_asignatura_id = a.asignatura_id
                                                                      	   inner join t_persona p on d.docente_persona_run = p.persona_run
                                                                           inner join t_usuario u on p.persona_run = u.usuario_persona_run
                                                                       								                                   where ad.asignatura_doc_fin > GETDATE()
                                   		and (e.establ_id = @establecimiento or @establecimiento = -1)
                                   		and (p.persona_run = @persona_run  or @persona_run  = '-1')
                                   		and (dc.docente_curso_id = @curso_id or @curso_id = -1)
                                        and u.usuario_perfil_id = 2
                                   );


	IF EXISTS (
        SELECT * FROM sysobjects WHERE name = 'fn_InfoAlumno'
    )
        DROP FUNCTION fn_InfoAlumno;

    CREATE FUNCTION fn_InfoAlumno (@parametro bigint)
    RETURNS TABLE
    AS

    RETURN(
    select p.persona_run as alumno_rut, p.persona_nombre as alumno_nombre, p.persona_apellido_paterno as alumno_apellido_paterno, p.persona_apellido_materno as alumno_materno,
    apoderado.apoderado_persona_run as apoderado_run, apoderado.persona_nombre as apoderado_nombre, apoderado.persona_apellido_paterno as apoderado_apellido_paterno,
    apoderado.persona_apellido_materno as apoderado_apellido_materno,
    c.curso_nombre, e.establ_nombre
    from t_alumno a
    inner join t_persona p on a.alumno_persona_run = p.persona_run
    inner join t_matricula m on a.alumno_id = m.matricula_alumno_id
    inner join (select * from t_apoderado apo inner join t_persona per on apo.apoderado_persona_run = per.persona_run) apoderado on apoderado.apoderado_id = m.matricula_apoderado_id
    inner join t_curso_establ ce on m.matricula_curso_establ_id = ce.curso_establ_id
    inner join t_curso c on c.curso_id = ce.curso_establ_curso_id
    inner join t_establ e on ce.curso_establ_establ_id = e.establ_id
    where e.establ_id = (@parametro) and m.curso_agno = YEAR(CURRENT_TIMESTAMP));

    				  update t_usuario set password = '$2a$10$NZ57Zoyc8J/7V6hshE0JDe4OHvG2Wg14pxtLsHm/1QeQ8V52tCJ76'

       --INSERT INTO [dbo].[t_usuario]
         --         ([email]
           --       ,[username]
             --     ,[password]
               --   ,[usuario_perfil_id]
                 -- ,[usuario_persona_run]
                 -- ,[usuario_vigencia_id])
            --VALUES
              --    ('camila.zaragoza@gmail.com','cami'
                --  ,'$2a$10$XEGS8J0hIUII6kdPgT9ykuRTwPCdDiDzt24eOcodgi16kTMQPfqna'
                  --,1
                  --,'10007672-1 '
                  --,1);