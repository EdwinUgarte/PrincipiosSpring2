package com.bolsadeideas.springboot.di.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.bolsadeideas.springboot.di.app.models.services.IServicio;


@Controller
public class indexController {

	@Autowired //Estamos inyectando la instancia que creamos en MiServicio, esto sirve para llamar al objeto no teniendo que estar creando la instancia con el new
	@Qualifier("miServicioSimple")//Esto nos sirve para saber que metodo estamos llamando con el Autowired, tiene mas jerarquia que la notacion @Primary
	private IServicio service;//Se inyecta el objeto de tipo generico o sea Interface 
	
	@GetMapping({"/index", "/", "", "/home"})
	public String index(Model model) {
		model.addAttribute("objeto", service.operacion());
		return "index";//Aqui se retorna la vista que se encuentra en templates
	}
	
}
