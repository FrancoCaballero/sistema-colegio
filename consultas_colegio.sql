SELECT profesores.nombre 
FROM colegios, profesores 
WHERE id_colegio = 2
AND id_colegio = profesores.fk_colegio;

SELECT asignaturas.nombre as asignatura, alumnos.nombre as nombre_alumno, notas.nota
FROM alumnos, notas, asignaturas, profesores 
WHERE notas.nota < 4 
AND id_alumno = notas.fk_alumno
AND id_asignatura = notas.fk_asignatura
GROUP BY asignaturas.nombre;

SELECT asignaturas.nombre, alumnos.nombre , MAX(nota) AS nota
FROM alumnos, notas, profesores, asignaturas
WHERE id_alumno = notas.fk_alumno
And id_asignatura = notas.fk_asignatura
GROUP BY asignaturas.nombre;
