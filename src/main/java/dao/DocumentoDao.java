package dao;

import java.util.List;
import java.util.Optional;

import javax.persistence.Query;

import com.stefanini.projeto.model.Documento;
import com.stefanini.projeto.repository.DocumentoRepository;

public class DocumentoDao implements DocumentoRepository{

	public String getTableName() {
		return Documento.class.getSimpleName();
	}
	
	@Override
	public <S extends Documento> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Documento> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Documento> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Documento> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Documento> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Documento entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Documento> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	
	public List<Documento> findAllByName(String nome) {
//		StringBuilder sb = new StringBuilder();
//		sb.append("SELECT e FROM")
//		  .append(getTableName() + " e ")
//		  .append("WHERE e.nome: LIKE nome");
//		Documento em = new Documento();
//		Query query = 
//
//		if(nome != null) {
//			query.setParameter("nome", nome);			
//		}
		
//		return query.getResultList();
		return null;
	}

}
