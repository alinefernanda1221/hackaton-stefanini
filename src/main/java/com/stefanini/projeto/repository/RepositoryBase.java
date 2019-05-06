package com.stefanini.projeto.repository;

import java.io.Serializable;
import java.util.List;

import com.stefanini.projeto.model.Documento;

public interface RepositoryBase<T, ID extends Serializable>{

	List<Documento> findByNome(String nome);

}
