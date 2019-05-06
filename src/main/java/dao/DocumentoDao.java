package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.stefanini.projeto.model.Documento;
import com.stefanini.projeto.repository.RepositoryBase;

public class DocumentoDao implements RepositoryBase<Documento, Long>{
	
	@PersistenceContext
	private EntityManager entityManager;

	public String getTableName() {
		return Documento.class.getSimpleName();
	}
	
	public EntityManager getEntityManager() {
		return entityManager;
	}
	

	@Override
	public List<Documento> findByNome(String nome) {
		StringBuilder sb = new StringBuilder();
		sb.append("SELECT e FROM")
		  .append(getTableName() + " e ")
		  .append("WHERE e.nome = LIKE :nome");
		Documento em = new Documento();
		Query query = entityManager.createQuery(sb.toString());

		if(nome != null) {
			query.setParameter("nome", nome);			
		}
		
		return query.getResultList();
	}

}
