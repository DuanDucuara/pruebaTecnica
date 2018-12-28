package com.Duan.pruebatecnica.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class Cliente {
	
	private Long idCliente;
	private String nombreCli;
	private String direccionCli;
	private String telefonoCli;
	private Date fechaCreacion;
	private Set<Contacto> contacto;
	

	
	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	public Long getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}
	@Column(name="nombreCli")
	public String getNombreCli() {
		return nombreCli;
	}
	public void setNombreCli(String nombreCli) {
		this.nombreCli = nombreCli;
	}
	@Column(name="direccionCli")
	public String getDireccionCli() {
		return direccionCli;
	}
	public void setDireccionCli(String direccionCli) {
		this.direccionCli = direccionCli;
	}
	@Column(name="telefonoCli")
	public String getTelefonoCli() {
		return telefonoCli;
	}
	public void setTelefonoCli(String telefonoCli) {
		this.telefonoCli = telefonoCli;
	}

	@Column(name="fecha_creacion")
	@Temporal(TemporalType.DATE)
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	@OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
	public Set<Contacto> getContacto() {
		return contacto;
	}
	public void setContacto(Set<Contacto> contacto) {
		this.contacto = contacto;
	}
	
	

}
