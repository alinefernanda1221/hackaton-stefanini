package com.stefanini.projeto.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.stefanini.projeto.model.Documento;
import com.stefanini.projeto.service.DocumentoService;

@CrossOrigin /*Aceita requisições de endereços locais*/
@RestController
@RequestMapping(value = "/documento", produces = MediaType.APPLICATION_JSON_VALUE)
public class DocumentoController {
	
	@Autowired
	private DocumentoService servico;

	/**
	 * Buscar Todos
	 * @return List<Documento>
	 */
	@RequestMapping(method = RequestMethod.GET)
		public @ResponseBody List<Documento> findAll(){
			return servico.findAll();
		}

//	@RequestMapping(value = "/{nome}", method = RequestMethod.GET)
//	public @ResponseBody List<Documento> findAllByName(@PathVariable(name = "nome") String nome){
//		return servico.findAllByName(nome);
//	}

	/**
	 * Buscar por ID
	 * @param id
	 * @return Documento
	 */
	@RequestMapping(value = "{id}", method = RequestMethod.GET)
	public @ResponseBody Optional<Documento> findById(@PathVariable(name = "id") Long id){
		return servico.findByID(id);
	}
	
	/**
	 * Excluir documento
	 * @param id
	 */
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteById(@PathVariable(name = "id") Long id){
		servico.deleteById(id);
	}

	/**
	 * Criar documento
	 * @param documento
	 * @return
	 */
	@RequestMapping(method = RequestMethod.POST)
		public void save(@RequestBody Documento documento) {
//			Documento doc = (Documento) documento;
			servico.save(documento);
//			return "redirect:/home";
	}

}
