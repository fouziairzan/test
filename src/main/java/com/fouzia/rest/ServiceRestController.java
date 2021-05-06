package com.fouzia.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fouzia.model.Contatto;

@RestController
public class ServiceRestController {

	@RequestMapping("test")
	public List<Contatto> serviceTest() {
		List<Contatto> lista = new ArrayList<Contatto>();
		lista.add(new Contatto("ciao", "boh", "ok"));
		lista.add(new Contatto("ciao", "bohss", "ok"));
		lista.add(new Contatto("ciaoewe", "bohwew", "ok"));
		return lista;
	}

}
