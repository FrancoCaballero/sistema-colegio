package com.sistemacolegio.app.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "notas")
public class Nota implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_nota")
	private Long id;

	private float nota;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_alumno")
	private Alumno alumnoNota;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_asignatura")
	private Asignatura asignaturaNota;

	public Alumno getAlumnoNota() {
		return alumnoNota;
	}

	public void setAlumnoNota(Alumno alumnoNota) {
		this.alumnoNota = alumnoNota;
	}

	public Asignatura getAsignaturaNota() {
		return asignaturaNota;
	}

	public void setAsignaturaNota(Asignatura asignaturaNota) {
		this.asignaturaNota = asignaturaNota;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public float getNota() {
		return nota;
	}

	public void setNota(float nota) {
		this.nota = nota;
	}

	private static final long serialVersionUID = 1L;

}
