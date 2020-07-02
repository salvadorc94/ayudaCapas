package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Materia;

@Repository
public interface MateriaRepository extends JpaRepository<Materia, Integer> {

}
