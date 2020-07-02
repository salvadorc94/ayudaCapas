package com.example.demo.domain;

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
@Table(schema="public",name="alumnoxmateria")
public class AlumnoMateria {
	@Id
    @Column(name = "idalumnoxmateria")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAlumnoMateria;
	
	@Column(name = "notamateria")
	private Double notaMateria;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idalumno")
	private Alumno alumno;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idmateria")
	private Materia materia;
	
	public Integer getIdAlumnoMateria() {
		return idAlumnoMateria;
	}

	public void setIdAlumnoMateria(Integer idAlumnoMateria) {
		this.idAlumnoMateria = idAlumnoMateria;
	}

	public Double getNotaMateria() {
		return notaMateria;
	}

	public void setNotaMateria(Double notaMateria) {
		this.notaMateria = notaMateria;
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}
	
	
	

}
