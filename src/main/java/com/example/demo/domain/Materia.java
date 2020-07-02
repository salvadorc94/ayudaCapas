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
@Table(schema="public",name="materia")
public class Materia {
	@Id
    @Column(name = "idmateria")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMateria;
	
	@Column(name = "nombremateria")
	private String nombreMateria;
	
	@OneToMany(mappedBy = "materia", fetch = FetchType.LAZY, cascade=CascadeType.ALL)
	private List<AlumnoMateria> alumnoMaterias;

	public Integer getIdMateria() {
		return idMateria;
	}

	public void setIdMateria(Integer idMateria) {
		this.idMateria = idMateria;
	}

	public String getNombreMateria() {
		return nombreMateria;
	}

	public void setNombreMateria(String nombreMateria) {
		this.nombreMateria = nombreMateria;
	}
	
	

}
