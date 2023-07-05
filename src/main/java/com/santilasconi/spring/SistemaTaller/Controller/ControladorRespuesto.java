package com.santilasconi.spring.SistemaTaller.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.santilasconi.spring.SistemaTaller.Entity.Repuesto;
import com.santilasconi.spring.SistemaTaller.Entity.moto;
import com.santilasconi.spring.SistemaTaller.ImplementacionService.implementacionServicioRepuesto;



@RestController
@RequestMapping
public class ControladorRespuesto {
	
	@Autowired
	private implementacionServicioRepuesto impSerRep;
	
	@RequestMapping("/repuestos/listarRespuestos")
	public String  listarRepuestos(Model model) {
		
		List<Repuesto> Respuestos = impSerRep.listarRepuesto();
		model.addAttribute("Repuestos", Respuestos);
		return "ListaRespuestos";
	}
	
	@GetMapping("/repuestos/eliminar/{id}")
	private String EliminarMoto(@PathVariable long  id , Model model) {
	 impSerRep.eliminarRepuesto(id);
	 return "redirect:/listarRepuestos";
	}
	
	@PostMapping("/respuestos/save")
	private String SaveMoto(@Valid Repuesto repuesto , Model model ) {
		
		impSerRep.NuevoRespuesto(repuesto);
		
		return "redirect:/listarMotos";
	
	}
	
	@GetMapping("/motos/modificar/{id}")
	private String modificarMoto(@PathVariable ("id") long id ,Model model) {
		Repuesto Repuestobuscado = impSerRep.buscarRepuesto(id).get();
		model.addAttribute("Respuestobuscado", Repuestobuscado);
		return "ModificarRepuesto";
	}


}
