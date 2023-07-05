package com.santilasconi.spring.SistemaTaller.ImplementacionService;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.santilasconi.spring.SistemaTaller.Entity.Repuesto;
import com.santilasconi.spring.SistemaTaller.Entity.moto;
import com.santilasconi.spring.SistemaTaller.Service.ServicioRepuesto;

@Service
public class implementacionServicioRepuesto implements ServicioRepuesto{

	@Override
	public int NuevoRespuesto(Repuesto repuesto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Repuesto> listarRepuesto() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminarRepuesto(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<Repuesto> buscarRepuesto(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<moto> modificarRepuesto(Repuesto repuesto) {
		// TODO Auto-generated method stub
		return null;
	}

}
