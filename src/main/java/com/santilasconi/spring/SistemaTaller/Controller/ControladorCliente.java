package com.santilasconi.spring.SistemaTaller.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.santilasconi.spring.SistemaTaller.Entity.cliente;
import com.santilasconi.spring.SistemaTaller.ImplementacionService.ImplementationServiceCliente;

@Controller
@RequestMapping
public class ControladorCliente {
   
	@Autowired
	private ImplementationServiceCliente impCliSer;
	
	@GetMapping("/listar")
	private String listarClientes(Model model) {
		List<cliente> listaclientes = impCliSer.listar();
		model.addAttribute("listaclientes", listaclientes);
		
		return "index";
	}
	
	@GetMapping("/nuevo")
	private String agregar(Model model) {
		model.addAttribute("cliente", new cliente());
		return "NuevoCliente";
	}
	
	@PostMapping("/guardar")
	private String guardar(@Valid cliente c ,Model model) {
		impCliSer.crearCliente(c);
		return "redirect:/listar";
	}
	
	
}
