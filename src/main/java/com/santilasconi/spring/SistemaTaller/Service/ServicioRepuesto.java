package com.santilasconi.spring.SistemaTaller.Service;

import java.util.List;
import java.util.Optional;

import com.santilasconi.spring.SistemaTaller.Entity.Repuesto;
import com.santilasconi.spring.SistemaTaller.Entity.moto;

public interface ServicioRepuesto {

	
	public int NuevoRespuesto(Repuesto repuesto);
	public List<Repuesto> listarRepuesto();
	public void eliminarRepuesto(long id);
	public Optional<Repuesto> buscarRepuesto(long id);
	public Optional<moto> modificarRepuesto(Repuesto repuesto);
	
}

