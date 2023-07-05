package com.santilasconi.spring.SistemaTaller.ImplementacionService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.santilasconi.spring.SistemaTaller.Entity.moto;
import com.santilasconi.spring.SistemaTaller.RepositoryPerson.MotoRepo;
import com.santilasconi.spring.SistemaTaller.Service.ServicioMoto;

@Service
public class ImplementacionServicioMoto implements ServicioMoto{
  
	@Autowired
	public MotoRepo motorep;
	 
	@Override
	public int crearMoto(moto moto) {
		motorep.save(moto);
		return 0;
	}

	@Override
	public List<moto> listar() {
		return (List<moto>) motorep.findAll();
	}

	@Override
	public void eliminarMoto(long id) {
		motorep.deleteById(id);
		
	}

	@Override
	public Optional<moto> buscarMotoPorId(long id) {
		return motorep.findById(id);
		
	}

	@Override
	public Optional<moto> modificarCliente(moto moto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<moto> buscarMoto(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	

}
