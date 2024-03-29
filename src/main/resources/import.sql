/*Rellenar tabla colegios*/
INSERT INTO colegios (id_colegio, nombre, direccion) VALUES (1, 'Santa María' , 'Av. Los Pajaritos 4201')
INSERT INTO colegios (id_colegio, nombre, direccion) VALUES (2, 'Internacional Alba' , 'Av. Los Pajaritos 4550')

/*Rellenar tabla profesores*/
INSERT INTO profesores (id_profesor, nombre, fec_nac, asignatura, activo, fk_colegio) VALUES (1, 'Franco Caballero', '1992-03-13', 'Matemáticas', 'Si', 1)
INSERT INTO profesores (id_profesor, nombre, fec_nac, asignatura, activo, fk_colegio) VALUES (2, 'Javiera Sepúlveda', '1993-08-25', 'Lenguaje', 'No', 2)

/*Rellenar tabla asignaturas*/
INSERT INTO asignaturas (id_asignatura, nombre) VALUES (1, 'Lenguaje')
INSERT INTO asignaturas (id_asignatura, nombre) VALUES (2, 'Matemáticas')
INSERT INTO asignaturas (id_asignatura, nombre) VALUES (3, 'Historia')
INSERT INTO asignaturas (id_asignatura, nombre) VALUES (4, 'Biología')
INSERT INTO asignaturas (id_asignatura, nombre) VALUES (5, 'Física')
INSERT INTO asignaturas (id_asignatura, nombre) VALUES (6, 'Ingles')

/*Rellenar tabla alumnos*/
INSERT INTO alumnos (id_alumno, nombre, fec_nac) VALUES (1, 'Felipe', '1990-12-25')
INSERT INTO alumnos (id_alumno, nombre, fec_nac) VALUES (2, 'Sofía', '2012-11-10')
INSERT INTO alumnos (id_alumno, nombre, fec_nac) VALUES (3, 'Matías', '2014-11-14')
INSERT INTO alumnos (id_alumno, nombre, fec_nac) VALUES (4, 'Christopher', '2018-01-16')

INSERT INTO notas (id_nota, nota, fk_alumno, fk_asignatura) VALUES (1, 3 , 1, 1)
INSERT INTO notas (id_nota, nota, fk_alumno, fk_asignatura) VALUES (2, 6, 2, 1)
INSERT INTO notas (id_nota, nota, fk_alumno, fk_asignatura) VALUES (3, 5, 3, 5)
INSERT INTO notas (id_nota, nota, fk_alumno, fk_asignatura) VALUES (4, 3, 4, 6)