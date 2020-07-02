package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Materia;
import com.example.demo.repositories.MateriaRepository;

@Service
public class MateriaServiceImpl implements MateriaService{
	
	
	@Autowired
	MateriaRepository materiaRepository;

	@Override
	public List<Materia> findAll() {
		return materiaRepository.findAll();
	}
	
	

}
