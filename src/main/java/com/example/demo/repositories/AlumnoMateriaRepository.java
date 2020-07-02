package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.domain.AlumnoMateria;

@Repository
public interface AlumnoMateriaRepository extends JpaRepository<AlumnoMateria, Integer> {

}
