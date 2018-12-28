package com.Duan.pruebatecnica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Duan.pruebatecnica.model.Cliente;
import com.Duan.pruebatecnica.model.ClienteDao;


@Controller
public class ClienteController {
	@Autowired
	private ClienteDao clienteDao;
	
	@RequestMapping("/clientes")
	public String index(Model model) {
		List<Cliente> clientes = (List<Cliente>) clienteDao.findAll();
		model.addAttribute("clientes", clientes);
		return "clientes";
	}

}
