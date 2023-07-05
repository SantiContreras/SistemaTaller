package com.santilasconi.spring.SistemaTaller.ImplementacionService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.santilasconi.spring.SistemaTaller.Entity.cliente;
import com.santilasconi.spring.SistemaTaller.RepositoryPerson.ClienteRepo;
import com.santilasconi.spring.SistemaTaller.Service.ServicioClientes;

@Service
public class ImplementationServiceCliente implements ServicioClientes {
    
	@Autowired
	public ClienteRepo clirepo;
	
	@Override
	public int crearCliente(cliente cliente) {
		clirepo.save(cliente);
		return 0;
	}

	@Override
	public List<cliente> listar() {
		// TODO Auto-generated method stub
		return (List<cliente>) clirepo.findAll();
	}

	@Override
	public void eliminarCliente(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<cliente> buscarCliente(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<cliente> modificarCliente(cliente cliente) {
		// TODO Auto-generated method stub
		return null;
	}

}
