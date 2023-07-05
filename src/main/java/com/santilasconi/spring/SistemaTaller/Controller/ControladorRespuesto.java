package com.santilasconi.spring.SistemaTaller.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.santilasconi.spring.SistemaTaller.Entity.Repuesto;
import com.santilasconi.spring.SistemaTaller.ImplementacionService.implementacionServicioRepuesto;



@RestController
@RequestMapping
public class ControladorRespuesto {
	
	@Autowired
	private implementacionServicioRepuesto impSerRep;
	
	public String  listarRepuestos(Model model) {
		
		List<Repuesto> Respuestos = impSerRep.listarRepuesto();
		model.addAttribute("Repuestos", Respuestos);
		return "ListaRespuestos";
	}

}
