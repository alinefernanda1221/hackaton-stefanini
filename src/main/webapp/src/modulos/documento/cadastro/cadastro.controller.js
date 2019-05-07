import { inherit } from "@uirouter/core";

export default class DocumentoCadastroController {

  constructor(documentoService) {
    var vm = this;
    vm.cadastrarDocumento = null;
    vm.cadastrarPagina = null;
    vm.adicionaPagina = null;
    vm.paginas = null;
    init();

    
    function init(){ 
     vm.paginas = [];
     vm.adicionaPagina = adicionaPagina;
     vm.cadastrarDocumento = function (){
    	 vm.documento.paginas = [];
    	 vm.documento.paginas = getPaginas();
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
     
     function adicionaPagina(pagina) { //Adiciona pagina num Array de Object
		vm.paginas.push(pagina);
     }
     
     function getPaginas(){
    	 return vm.paginas;
     }

  }
 }
}//Fim classe
DocumentoCadastroController.$inject = ['documentoService'];
