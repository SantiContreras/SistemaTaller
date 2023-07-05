package com.santilasconi.spring.SistemaTaller.Entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "cliente")
@Data
public class cliente implements Serializable {
	/**
	* 
	*/
	private static final long serialVersionUID = 4961088911345885226L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
    
	@Column(name = "nombre")
	private String nombre;

	@Column(name = "apellido")
	private String apellido;

	@Column(name = "telefono")
	private int telefono;

	@Column(name = "email")
	private String email;

	@Column(name = "direccion")
	private String direccion;
	
	@OneToMany(fetch = FetchType.LAZY , mappedBy = "cliente")
	private List<moto> listamostos;
}
