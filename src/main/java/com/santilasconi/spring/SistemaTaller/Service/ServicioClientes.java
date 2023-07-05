package com.santilasconi.spring.SistemaTaller.Service;

import java.util.List;
import java.util.Optional;

import com.santilasconi.spring.SistemaTaller.Entity.cliente;



public interface ServicioClientes {
	
	public int crearCliente(cliente cliente);
	public List<cliente> listar();
	public void eliminarCliente(long id);
	public Optional<cliente> buscarCliente(long id);
	public Optional<cliente> modificarCliente(cliente cliente);
}
