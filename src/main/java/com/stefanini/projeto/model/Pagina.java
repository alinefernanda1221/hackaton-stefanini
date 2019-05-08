package com.stefanini.projeto.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Pagina implements Serializable{
	private static final long serialVersionUID = -2036682200117940628L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID_PAGINA")
	private Long id;
	
	@Column(name = "CONTEUDO")
	private String conteudo;
	
	@Column(name = "NUM_PAGINA")
	private Integer numeroPagina;
	
	@ManyToOne
	@com.fasterxml.jackson.annotation.JsonIgnore	
	@JoinColumn(name = "ID_DOCUMENTO", referencedColumnName = "ID_DOCUMENTO")
	private Documento documento;

	public Pagina() {}

	public Pagina(String conteudo, Integer numeroPagina, Documento documento) {
		super();
		this.conteudo = conteudo;
		this.numeroPagina = numeroPagina;
		this.documento = documento;
	}
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public Integer getNumeroPagina() {
		return numeroPagina;
	}

	public void setNumeroPagina(Integer numeroPagina) {
		this.numeroPagina = numeroPagina;
	}

	public Documento getDocumento() {
		return documento;
	}

	public void setDocumento(Documento documento) {
		this.documento = documento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((conteudo == null) ? 0 : conteudo.hashCode());
		result = prime * result + ((documento == null) ? 0 : documento.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((numeroPagina == null) ? 0 : numeroPagina.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pagina other = (Pagina) obj;
		if (conteudo == null) {
			if (other.conteudo != null)
				return false;
		} else if (!conteudo.equals(other.conteudo))
			return false;
		if (documento == null) {
			if (other.documento != null)
				return false;
		} else if (!documento.equals(other.documento))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (numeroPagina == null) {
			if (other.numeroPagina != null)
				return false;
		} else if (!numeroPagina.equals(other.numeroPagina))
			return false;
		return true;
	}	
}
