CREATE SCHEMA juego;
USE juego;

CREATE TABLE categoria (
	id INT NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(30),
    premio INT,
    PRIMARY KEY (id)
);

INSERT INTO categoria (nombre, premio) VALUES
('Iniciante', 200),
('Básico', 400),
('Intermedio', 600),
('Avanzado', 800),
('Experto', 1000);

CREATE TABLE usuario (
	id INT NOT NULL AUTO_INCREMENT,
    cc BIGINT NOT NULL,
    nombre VARCHAR(60),
    nivel TINYINT DEFAULT 1,
    puntaje INT DEFAULT 0,
    PRIMARY KEY (id)
);

INSERT INTO usuario (cc, nombre, nivel, puntaje) VALUES
(1152436729, 'Juan Esteban Pineda',5,3000);


CREATE TABLE pregunta (
	id INT NOT NULL AUTO_INCREMENT,
    enunciado VARCHAR(300) NOT NULL,
    opcion_1 VARCHAR(300) NOT NULL,
    opcion_2 VARCHAR(300) NOT NULL,
    opcion_3 VARCHAR(300) NOT NULL,
    opcion_4 VARCHAR(300) NOT NULL,
    respuesta TINYINT NOT NULL,
    id_categoria INT NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (id_categoria) REFERENCES categoria(id)
);

INSERT INTO pregunta (enunciado, opcion_1, opcion_2, opcion_3, opcion_4, respuesta, id_categoria) VALUES
('¿Cuál es la capital de Colombia?', 'Lima', 'Buenos Aires', 'Quito', 'Bogotá', 4, 1),
('¿Cuál es la capital de Paraguay?', 'Asunción', 'Buenos Aires', 'Montevideo', 'La Paz', 1, 1),
('¿Cuál es la capital de Uruguay?', 'Asunción', 'Santiago', 'Montevideo', 'La Paz', 3, 1),
('¿Cuál es la capital de Chile?', 'Lima', 'Santiago', 'Asunción', 'Caracas', 2, 1),
('¿Cuál es la capital de Perú?', 'Quito', 'La Paz', 'Lima', 'Caracas', 3, 1),
('¿Cuál es la capital de Portugal?', 'Barcelona', 'Oporto', 'Lisboa', 'Santiago', 3, 2),
('¿Cuál es la capital de Bélgica?', 'Amsterdam', 'Bruselas', 'La Haya', 'Amberes', 2, 2),
('¿Cuál es la capital de Finlandia?', 'Helsinki', 'Oslo', 'Kiev', 'Minsk', 1, 2),
('¿Cuál es la capital de Polonia?', 'Riga', 'Kiev', 'Cracovia', 'Varsovia', 4, 2),
('¿Cuál es la capital de Suiza?', 'Ginebra', 'Viena', 'Berna', 'Venecia', 3, 2),
('¿Cuál es la capital de Honduras?', 'Tegucigalpa', 'Honduras', 'San Pedro Sula', 'Santiago', 1, 3),
('¿Cuál es la capital de Nicaragua?', 'Oaxaca', 'Culiacán', 'León', 'Managua', 4, 3),
('¿Cuál es la capital de Jamaica?', 'Winnipeg', 'Kingston', 'Jacksonville', 'Georgetown', 2, 3),
('¿Cuál es la capital de Trinidad y Tobago?', 'Santo Domingo', 'Mérida', 'Puerto Príncipe', 'Puerto España', 4, 3),
('¿Cuál es la capital de Canadá?', 'Ottawa', 'Montreal', 'Toronto', 'Vancouver', 1, 3),
('¿Cuál es la capital de Filipinas?', 'Bangkok', 'Singapur', 'Manila', 'Kuala Lumpur', 3, 4),
('¿Cuál es la capital de Camboya?', 'Nom Pen', 'Yakarta', 'Vientián', 'Hanói', 1, 4),
('¿Cuál es la capital de Azerbaiyán?', 'Bakú', 'Astaná', 'Asjabad', 'Biskek', 1, 4),
('¿Cuál es la capital de Líbano?', 'Nicosia', 'Damasco', 'Beirut', 'Saná', 3, 4),
('¿Cuál es la capital de Yemen?', 'Mosul', 'Isfahán', 'Haifa', 'Saná', 4, 4),
('¿Cuál es la capital de Nigeria?', 'Lagos', 'Annaba', 'Abuya', 'Agadez', 3, 5),
('¿Cuál es la capital de Angola?', 'Benguela', 'Maputo', 'Luanda', 'Praia', 3, 5),
('¿Cuál es la capital de Eritrea?', 'Bakú', 'Asmara', 'Asuán', 'Mogadiscio', 2, 5),
('¿Cuál es la capital del Congo?', 'Nicosia', 'Kinsasa', 'Jaipur', 'Saná', 2, 5),
('¿Cuál es la capital de Sudán del Sur?', 'Jartum', 'Yuba', 'Adis Abeba', 'Bengasi', 2, 5);

CREATE TABLE respuesta (
	id INT NOT NULL AUTO_INCREMENT,
    id_pregunta INT,
    id_usuario INT,
    respuesta TINYINT,
    resultado TINYINT,
    PRIMARY KEY (id),
    FOREIGN KEY (id_pregunta) REFERENCES pregunta(id),
    FOREIGN KEY (id_usuario) REFERENCES usuario(id)
);

DROP database juego;


