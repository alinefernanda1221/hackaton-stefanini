package com.stefanini.projeto.service;
/**
 * @author Aline
 * Provê serviço entre controller e banco de dados
 */

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stefanini.projeto.model.Documento;
import com.stefanini.projeto.repository.DocumentoRepository;

@Service
public class DocumentoService {
	
	@Autowired
	private DocumentoRepository repo;
	
	public List<Documento> findAll() {
		return (List<Documento>) repo.findAll();
	}
	
	public List<Documento> findByNome(String nome) {
		return (List<Documento>) repo.findByNome(nome);
	}
	
	public void save(Documento documento) {
		repo.save(documento);
	}
	
	public void deleteById(Long id) {
		repo.deleteById(id);
	}
	
	public Optional<Documento> findByID(Long id) {
		return repo.findById(id);
	}
}
