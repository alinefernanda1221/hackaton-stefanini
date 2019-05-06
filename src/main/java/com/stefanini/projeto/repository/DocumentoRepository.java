package com.stefanini.projeto.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
/**
 * @author Aline
 * Interface que permite execução de CRUD para a entidade Documento
 */
import org.springframework.data.repository.CrudRepository;

import com.stefanini.projeto.model.Documento;

public interface DocumentoRepository extends CrudRepository<Documento, Long> /*RepositoryBase<Documento, Long>, JpaRepository<Documento, Long>*/{
	
	List<Documento> findByNome(String nome);
	
//	List<Documento> findByPlaceContaining(String nome);
}

