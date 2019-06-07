package com.sistemacolegio.app.models.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "profesores")
public class Profesor implements Serializable {

	@Id
	@Column(name = "id_profesor")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nombre;

	@Temporal(TemporalType.DATE)
	@Column(name = "fec_nac")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fechaNacimiento;

	private String asignatura;
	private String activo;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_colegio")
	private Colegio colegio;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_asignatura")
	private Asignatura asignaturaProfesor;

	public Asignatura getAsignaturaProfesor() {
		return asignaturaProfesor;
	}

	public void setAsignaturaProfesor(Asignatura asignaturaProfesor) {
		this.asignaturaProfesor = asignaturaProfesor;
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

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	public String getActivo() {
		return activo;
	}

	public void setActivo(String activo) {
		this.activo = activo;
	}

	public Colegio getColegio() {
		return colegio;
	}

	public void setColegio(Colegio colegio) {
		this.colegio = colegio;
	}

	private static final long serialVersionUID = 1L;

}
