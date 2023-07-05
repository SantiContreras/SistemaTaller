package com.santilasconi.spring.SistemaTaller.Controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.santilasconi.spring.SistemaTaller.Entity.cliente;
import com.santilasconi.spring.SistemaTaller.Entity.moto;
import com.santilasconi.spring.SistemaTaller.ImplementacionService.ImplementacionServicioMoto;
import com.santilasconi.spring.SistemaTaller.ImplementacionService.ImplementationServiceCliente;

@Controller
@RequestMapping
public class ControladorMoto {
      
	@Autowired
	private ImplementacionServicioMoto impMotSer;
	
	@GetMapping("/listarMotos")
	private String listarMotos(Model model) {
		List<moto> listamotos = impMotSer.listar();
		model.addAttribute("listamotos", listamotos);
		
		return "index";
	}
	
	@GetMapping("/motos/eliminar/{id}")
	private String EliminarMoto(@PathVariable long  id , Model model) {
	 impMotSer.eliminarMoto(id);
	 return "redirect:/listarMotos";
	}
	
	@PostMapping("motos/save")
	private String SaveMoto(@Valid moto moto , Model model ) {
		
		impMotSer.crearMoto(moto);
		
		return "redirect:/listarMotos";
	} 
	
	@GetMapping("/motos/modificar/{id}")
	private String modificarMoto(@PathVariable ("id") long id ,Model model) {
		moto motobuscada = impMotSer.buscarMotoPorId(id).get();
		model.addAttribute("motobuscada", motobuscada);
		return "ModificarMoto";
	}
	
	
	
}
