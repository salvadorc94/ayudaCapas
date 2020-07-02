package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.AlumnoMateria;
import com.example.demo.repositories.AlumnoMateriaRepository;

@Service
public class AlumnoMateriaServiceImpl implements AlumnoMateriaService {
	
	@Autowired
	AlumnoMateriaRepository alumnoMateriaRepository;

	@Override
	public List<AlumnoMateria> findAll() {
		return alumnoMateriaRepository.findAll();
	}
	
	

}
