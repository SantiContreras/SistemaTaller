package com.santilasconi.spring.SistemaTaller.Entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.core.sym.Name;

import lombok.Data;

@Entity
@Table(name = "moto")
@Data
public class moto implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String patente;
	private String marca;
	private String modelo;
	
	@ManyToOne(fetch = FetchType.LAZY )
	@JoinColumn(name="cliente_id")
	private cliente cliente;
	
	

}
