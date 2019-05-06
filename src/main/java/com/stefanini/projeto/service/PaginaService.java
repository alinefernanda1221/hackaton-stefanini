package com.stefanini.projeto.service;

import org.springframework.stereotype.Service;

import com.stefanini.projeto.model.Pagina;
import com.stefanini.projeto.repository.PaginaRepository;

@Service
public class PaginaService {
	private PaginaRepository repo;
	
	public void save(Pagina pagina) {
		repo.save(pagina);
	}
}
