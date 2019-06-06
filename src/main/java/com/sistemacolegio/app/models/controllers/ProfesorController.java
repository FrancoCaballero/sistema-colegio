package com.sistemacolegio.app.models.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.sistemacolegio.app.models.entity.Profesor;
import com.sistemacolegio.app.models.services.IColegioService;

@Controller
@SessionAttributes("profesor")
public class ProfesorController {
	
	@Autowired
	private IColegioService colegioService;
	
	@RequestMapping(value="profesor", method=RequestMethod.GET)
	public String listar(Model model) {
		model.addAttribute("titulo", "Listado de Profesores");
		model.addAttribute("profesores", colegioService.findAllProfesor());
		return "profesor";
	}
	
	@RequestMapping(value="/eliminarProfesor/{id}")
	public String eliminar(@PathVariable(value="id") Long id) {
		
		if(id > 0) {
			colegioService.deleteProfesor(id);
		}
		
		return "redirect:/profesor";
	}
	
	@RequestMapping(value="/form-profesor", method=RequestMethod.GET)
	public String crearProfesor(Map<String, Object> model) {
		Profesor profesor = new Profesor();
		model.put("titulo", "Formulario de Profesor");
		model.put("profesor", profesor);
		model.put("boton", "Crear Profesor");
		model.put("colegios", colegioService.findAllColegio());
		model.put("asignaturas", colegioService.findAllAsignatura());
		return "form-profesor";
	}
	
	@RequestMapping(value="/form-profesor", method=RequestMethod.POST)
	public String guardarProfesor(Profesor profesor, SessionStatus status){
		colegioService.saveProfesor(profesor);
		status.setComplete();
		return "redirect:profesor";
	}
	
	@RequestMapping(value="/form-profesor/{id}")
	public String editarProfesor(@PathVariable(value="id") Long id, Map<String, Object> model) {
		
		Profesor profesor = null;
		
		if (id > 0) {
			profesor = colegioService.findOneProfesor(id);
		}else {
			return "redirect:/profesor";
		}
		model.put("profesor", profesor);
		model.put("titulo", "Editar Profesor");
		model.put("boton", "Editar Profesor");
		return "form-profesor";
	}
	
}
