package com.stefanini.projeto.service;
/**
 * @author Aline
 * Provê serviço entre controller e banco de dados
 */

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stefanini.projeto.exception.NegocioException;
import com.stefanini.projeto.model.Documento;
import com.stefanini.projeto.model.Pagina;
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
	
	public void save(Documento documento) throws NegocioException {
		if(documento.getNome().length() > 20) {
			throw new NegocioException("Ocorreu um erro: Nome acima do permitido");
		}
		if(documento.getPaginas().size() > 5) {
			throw new NegocioException("Ocorreu um erro: Quantidade de páginas");
		}else {
			for(Pagina pagina : documento.getPaginas()) {
				pagina.setDocumento(documento);
			}
			repo.save(documento);			
		}
	}
	
	public void deleteById(Long id) {
		repo.deleteById(id);
	}
	
	public Optional<Documento> findByID(Long id) {
		return repo.findById(id);
	}
	
	public void update(Documento documento) {
		repo.save(documento);
	}
	
}
