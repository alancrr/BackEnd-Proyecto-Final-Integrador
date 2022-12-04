DROP TABLE IF EXISTS domicilios;
CREATE TABLE DOMICILIOS (
ID INT AUTO_INCREMENT PRIMARY KEY,
CALLE VARCHAR(100) NOT NULL,
NUMERO INT NOT NULL,
LOCALIDAD VARCHAR(100) NOT NULL,
PROVINCIA VARCHAR(100) NOT NULL);

DROP TABLE IF EXISTS PACIENTES;
CREATE TABLE PACIENTES (
ID INT AUTO_INCREMENT PRIMARY KEY,
APELLIDO VARCHAR(100) NOT NULL,
NOMBRE VARCHAR(100) NOT NULL,
EMAIL VARCHAR(100) NOT NULL,
DNI INT NOT NULL,
FECHA_INGRESO DATE NOT NULL,
DOMICILIO_ID INT NOT NULL);

DROP TABLE IF EXISTS ODONTOLOGOS;
CREATE TABLE ODONTOLOGOS (
ID INT AUTO_INCREMENT PRIMARY KEY,
APELLIDO VARCHAR(100) NOT NULL,
NOMBRE VARCHAR(100) NOT NULL,
MATRICULA INT NOT NULL);

INSERT INTO DOMICILIOS (CALLE, NUMERO, LOCALIDAD, PROVINCIA) VALUES
 ('Calle falsa',123,'LaCity','City'),
 ('CalleTest',666,'CiudadTest','ProvinciaTest');
INSERT INTO PACIENTES (APELLIDO, NOMBRE, EMAIL, DNI, FECHA_INGRESO, DOMICILIO_ID) VALUES
 ('Roberto','Latortuga','qwe@gmail.com',33333333,'2022-11-15',1),
 ('Robert','TheTurtle','email@test.com',12345678,'2022-12-01',2);
INSERT INTO ODONTOLOGOS (APELLIDO, NOMBRE, MATRICULA) VALUES
('Juan','Dentista',123456);