import { inherit } from "@uirouter/core";

export default class DocumentoController {

  constructor(documentoService) {
    var vm = this;
    vm.documentos = {};
    vm.resp = null;
    vm.buscarTodos = null;
    vm.pesquisa = null;
    vm.excluir = null;
    /*Cadastro*/
    vm.cadastrarDocumento = null;
    vm.maxSize = 20;
    vm.cadastrarPagina = null;
    init();
    
    function init(){ 
    	
     vm.cadastrarDocumento = function (){
    	 console.log(vm.documento);
    	 vm.documento.path = null;
    	  documentoService.post(vm.documento)
    	  	.then(function response(resp){ //Retorno positivo
    	  		console.log(resp);
    	  }).catch(function (error) { //Retorno negativo -> erro, exceção
    		  console.log(error);     		  
    	  });
      }	

     vm.cadastrarPagina = function (){
    	 console.log(vm.pagina);
    	 documentoService.postPagina(vm.pagina)
    	 .then(function response(resp){ //Retorno positivo
    		 console.log(resp);
    	 }).catch(function (error) { //Retorno negativo -> erro, exceção
    		 console.log(error);     		  
    	 });
     }	

     vm.buscarTodos = function (){
    	 documentoService.get()
    	   .then(function response(resp){ //Retorno positivo
    		   vm.documentos = resp.data;
    	 }).catch(function (error) { //Retorno negativo -> erro, exceção
    		 console.log(error);     		  
    	 });	
     } 

     vm.buscarPorNome = function (){
    	 documentoService.getByName(vm.pesquisa)
    	 .then(function response(resp){ //Retorno positivo
    		 vm.documentos = resp.data;
    	 }).catch(function (error) { //Retorno negativo -> erro, exceção
    		 console.log(error);     		  
    	 });	
     }
     
     vm.excluir = function (id) {
		documentoService.deleteById(id)
		.then(function response(resp) {
			console.log(resp);
		}).catch(function error(error) {
			console.log(error);
		});
	}
  
    
  }
 }
}//Fim classe
DocumentoController.$inject = ['documentoService'];
