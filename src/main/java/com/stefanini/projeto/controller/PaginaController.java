package com.stefanini.projeto.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;

import com.stefanini.projeto.model.Pagina;
import com.stefanini.projeto.service.PaginaService;

@CrossOrigin
@RestController
@RequestMapping(value = "/pagina", produces = MediaType.APPLICATION_JSON_VALUE)
public class PaginaController {

	@Autowired
	private PaginaService servico;
	
	@RequestMapping(method = RequestMethod.POST)
		public void save(@RequestBody Pagina pagina) {
		servico.save(pagina);
	}
	
}
