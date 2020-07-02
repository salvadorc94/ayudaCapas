DROP TABLE usuario;
DROP TABLE materia;
DROP TABLE alumnoxmateria;

CREATE TABLE Alumno(
	codigoEstudiante SERIAL PRIMARY KEY,
	nombreEstudiante VARCHAR NOT NULL,
	apellidoEstudiante VARCHAR NOT NULL
);

CREATE TABLE AlumnoXmateria(
	idalumnoxmateria SERIAL PRIMARY KEY,
	idAlumno INTEGER NOT NULL,
	idMateria INTEGER NOT NULL,
	notaMateria FLOAT NOT NULL
);

CREATE TABLE Materia(
	idMateria SERIAL PRIMARY KEY,
	nombreMateria VARCHAR NOT NULL
);


ALTER TABLE AlumnoXmateria ADD FOREIGN KEY (idAlumno)
REFERENCES Alumno(codigoEstudiante);

ALTER TABLE AlumnoXmateria ADD FOREIGN KEY (idMateria)
REFERENCES Materia(idMateria);

SELECT * FROM alumno;
SELECT * FROM materia;
SELECT * FROM alumnoxmateria;
INSERT INTO alumno(nombreestudiante, apellidoestudiante) VALUES('Salvador', 'Campos');
INSERT INTO alumno(nombreestudiante, apellidoestudiante) VALUES('Sara', 'Romero');
INSERT INTO materia(nombremateria) VALUES ('Simu');
INSERT INTO materia(nombremateria) VALUES ('Capas');
INSERT INTO alumnoxmateria(idalumno,idmateria,notamateria) VALUES (1,1,10);
INSERT INTO alumnoxmateria(idalumno,idmateria,notamateria) VALUES (2,2,10);



