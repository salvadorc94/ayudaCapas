package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.domain.AlumnoMateria;
import com.example.demo.services.AlumnoMateriaService;

@Controller
public class TestController {
	
	@Autowired
	AlumnoMateriaService alumnoMateriaService;
	
	@RequestMapping("/index")
	public ModelAndView inicio() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index");
		
		/*La lista que obtendremos es de la tabla Cruz ya que en esta se han definido los metedos para obtener el Alumno y la Materia
		
		@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idalumno")
	private Alumno alumno;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idmateria")
	private Materia materia;
	
	Luego en el index accedemos a cada Objeto de AlumnoMateria y a sus Getters que incluye Alumno entonces se puede hacer AlumnoMateria.getAlumno().getNombreAlumno
		Revisa el Index para que te quede mas claro.
		 */
		
		List<AlumnoMateria> listado = null;
		try {
			listado = alumnoMateriaService.findAll();
		} catch (Exception e) {
			// TODO: handle exception
		}
		mav.addObject("alumnoMaterias",listado);
		return mav;
	}

}
