import { inherit } from "@uirouter/core";

export default class DocumentoFormController {

  constructor(documentoService) {
    var vm = this;

    init();

    function init(){

        vm.cadastrarDocumento = function (){
       	 console.log(vm.documento);
       	  documentoService.post(vm.documento)
       	  	.then(function response(resp){ // Retorno positivo
       	  		console.log(resp);
       	  }).catch(function (error) { // Retorno negativo -> erro, exceção
       		  console.log(error);     		  
       	  });
         }	    	
    	
    }
  }
  
}
DocumentoFormController.$inject = ['documentoService'];
