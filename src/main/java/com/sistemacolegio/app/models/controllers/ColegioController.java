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

import com.sistemacolegio.app.models.entity.Colegio;
import com.sistemacolegio.app.models.services.IColegioService;

@Controller
@SessionAttributes("colegio")
public class ColegioController {
	
	@Autowired
	private IColegioService colegioService;
	
	@RequestMapping(value="colegio", method=RequestMethod.GET)
	public String listar(Model model) {
		model.addAttribute("titulo","Listado de Colegios");
		model.addAttribute("colegios", colegioService.findAllColegio());
		return "colegio";
	}
	
	@RequestMapping(value="/eliminarColegio/{id}")
	public String eliminar(@PathVariable(value = "id") Long id) {
		
		if (id > 0) {
			colegioService.deleteColegio(id);
		}
		
		return "redirect:/colegio";
	}
	
	@RequestMapping(value="/form-colegio", method=RequestMethod.GET)
	public String crearColegio(Map<String, Object> model) {
		Colegio colegio = new Colegio();
		model.put("titulo", "Formulario de Colegio");
		model.put("colegio", colegio);
		model.put("boton", "Crear Colegio");
		return "form-colegio";
	}
	
	@RequestMapping(value="/form-colegio", method=RequestMethod.POST)
	public String guardarColegio(Colegio colegio, SessionStatus status){
		colegioService.saveColegio(colegio);
		status.setComplete();
		return "redirect:colegio";
	}
	
	@RequestMapping(value="/form-colegio/{id}")
	public String editarColegio(@PathVariable(value="id") Long id, Map<String, Object> model) {
		
		Colegio colegio = null;
		
		if (id > 0) {
			colegio = colegioService.findOneColegio(id);
		}else {
			return "redirect:/colegio";
		}
		model.put("colegio", colegio);
		model.put("titulo", "Editar Colegio");
		model.put("boton", "Editar Colegio");
		return "form-colegio";
	}
}
