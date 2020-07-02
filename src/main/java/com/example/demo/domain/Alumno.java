package com.example.demo.domain;

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

@Entity
@Table(schema="public",name="alumno")
public class Alumno {
	@Id
    @Column(name = "codigoestudiante")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigoEstudiante;
	
	@Column(name = "nombreestudiante")
	private String nombreEstudiante;
	
	@Column(name = "apellidoestudiante")
	private String apellidoEstudiante;
	
	@OneToMany(mappedBy = "alumno", fetch = FetchType.LAZY, cascade=CascadeType.ALL)
	private List<AlumnoMateria> alumnoMaterias;

	public Integer getCodigoEstudiante() {
		return codigoEstudiante;
	}

	public void setCodigoEstudiante(Integer codigoEstudiante) {
		this.codigoEstudiante = codigoEstudiante;
	}

	public String getNombreEstudiante() {
		return nombreEstudiante;
	}

	public void setNombreEstudiante(String nombreEstudiante) {
		this.nombreEstudiante = nombreEstudiante;
	}

	public String getApellidoEstudiante() {
		return apellidoEstudiante;
	}

	public void setApellidoEstudiante(String apellidoEstudiante) {
		this.apellidoEstudiante = apellidoEstudiante;
	}
	
	
	
	

}
