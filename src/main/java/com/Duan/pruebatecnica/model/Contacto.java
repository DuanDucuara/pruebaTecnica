package com.Duan.pruebatecnica.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Contacto {
	private long idContacto;
	private String nombreCont;
	private String direccionCont;
	private String telefonoCont;
	private Cliente cliente;
//	private Set<Cliente> cliente;
	

	public Contacto() {

	}

	public Contacto(String nombreCont, String direccionCont, String telefonoCont) {
		super();
		this.nombreCont = nombreCont;
		this.direccionCont = direccionCont;
		this.telefonoCont = telefonoCont;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getIdContacto() {
		return idContacto;
	}

	public void setIdContacto(long idContacto) {
		this.idContacto = idContacto;
	}

	@Column(name = "nombreCont")
	public String getNombreCont() {
		return nombreCont;
	}

	public void setNombreCont(String nombreCont) {
		this.nombreCont = nombreCont;
	}

	@Column(name = "direccionCont")
	public String getDireccionCont() {
		return direccionCont;
	}

	public void setDireccionCont(String direccionCont) {
		this.direccionCont = direccionCont;
	}

	@Column(name = "telefonoCont")
	public String getTelefonoCont() {
		return telefonoCont;
	}

	public void setTelefonoCont(String telefonoCont) {
		this.telefonoCont = telefonoCont;
	}

//	@OneToMany(mappedBy = "contacto", cascade = CascadeType.ALL)
//	
//	public Set<Cliente> getCliente() {
//		return cliente;
//	}
//
//	public void setCliente(Set<Cliente> cliente) {
//		this.cliente = cliente;
//	}
	@ManyToOne(optional = false) 
	@JoinColumn(name = "cliente_id")
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

//	public boolean hasCourse(Cliente cliente) {
//		Cliente studentCourse = null;
//		if (studentCourse.getIdCliente() == cliente.getIdCliente()) {
//		return true;
//	  }
//		return false;
//	
	
//}
}
