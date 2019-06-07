package com.sistemacolegio.app.models.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "Alumnos")
public class Alumno implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_alumno")
	private Long id;

	private String nombre;

	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "fec_nac")
	private Date fechaNacimiento;

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "alumnoNota")
	private List<Nota> nota;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "alumnoAsignatura")
	private List<Asignatura> asignaturaAlumno;

	public List<Asignatura> getAsignaturaAlumno() {
		return asignaturaAlumno;
	}

	public void setAsignaturaAlumno(List<Asignatura> asignaturaAlumno) {
		this.asignaturaAlumno = asignaturaAlumno;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public List<Nota> getNota() {
		return nota;
	}

	public void setNota(List<Nota> nota) {
		this.nota = nota;
	}

	private static final long serialVersionUID = 1L;

}
