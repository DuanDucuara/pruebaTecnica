package com.Duan.pruebatecnica.controller;

import java.util.List;
//import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Duan.pruebatecnica.model.ContactoDao;
import com.Duan.pruebatecnica.model.Cliente;
import com.Duan.pruebatecnica.model.ClienteDao;
//import com.Duan.pruebatecnica.model.ClienteDao;
import com.Duan.pruebatecnica.model.Contacto;


@Controller
public class ContactoController {

	@Autowired
	private ContactoDao contactoDao;
	
	@Autowired
	private ClienteDao clineteDao;

	
	@RequestMapping("/contactos")
	public String index(Model model) {
		List<Contacto> contactos = (List<Contacto>) contactoDao.findAll();
		List<Cliente> clientes = (List<Cliente>) clineteDao.findAll();
		model.addAttribute("contactos", contactos);
		model.addAttribute("clientes", clientes);
		return "contactos";
	}
	
	  @RequestMapping(value = "add", method=RequestMethod.GET)
	    public String agregarContacto(  Model model){
		  try {
			  model.addAttribute("contacto", new Contacto());
			  return "agregarContacto";
		} catch (Exception e) {
			return "error";
		}
	    	
	        
	    }
	  
	  @RequestMapping(value = "save", method = RequestMethod.POST)
	    public String save(Contacto contacto){
	        contactoDao.save(contacto);
	    	return "redirect:/contactos";
	    }
	  	
}
