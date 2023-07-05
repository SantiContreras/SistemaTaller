package com.santilasconi.spring.SistemaTaller.Service;

import java.util.List;
import java.util.Optional;

import com.santilasconi.spring.SistemaTaller.Entity.cliente;
import com.santilasconi.spring.SistemaTaller.Entity.moto;

public interface ServicioMoto {
		
	
	public int crearMoto(moto moto);
	public List<moto> listar();
	public void eliminarMoto(long id);
	public Optional<moto> buscarMoto(long id);
	public Optional<moto> modificarCliente(moto moto);
	Optional<moto> buscarMotoPorId(long id);
}
