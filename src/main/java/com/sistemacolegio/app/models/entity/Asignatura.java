package com.sistemacolegio.app.models.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "asignaturas")
public class Asignatura implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_asignatura")
	private Long id;

	private String nombre;

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "asignaturaNota")
	private List<Nota> notaAsignatura;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_alumno")
	private Alumno alumnoAsignatura;

	public Alumno getAlumnoAsignatura() {
		return alumnoAsignatura;
	}

	public void setAlumnoAsignatura(Alumno alumnoAsignatura) {
		this.alumnoAsignatura = alumnoAsignatura;
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

	public List<Nota> getNotaAsignatura() {
		return notaAsignatura;
	}

	public void setNotaAsignatura(List<Nota> notaAsignatura) {
		this.notaAsignatura = notaAsignatura;
	}

	private static final long serialVersionUID = 1L;

}
