import { inherit } from "@uirouter/core";

export default class DocumentoCadastroController {

  constructor(documentoService) {
    var vm = this;
    vm.cadastrarDocumento = null;
    vm.adicionaPagina = null;
    vm.paginas = null;
    vm.status = null;
    vm.limparTela = null;
    init();

    
    function init(){
     /*inits*/
     vm.paginas = [];
     vm.adicionaPagina = adicionaPagina;
     vm.excluirPagina = excluirPagina;
     vm.limparTela = limparTela;
     
     vm.cadastrarDocumento = function (){
    	 vm.documento.paginas = [];
    	 vm.documento.paginas = getPaginas();
    	 documentoService.post(vm.documento)
    	 .then(function response(resp){
    		 vm.status = 'Gravado com sucesso!';
             limparTela();
    	 }).catch(function (error) {
    		 vm.status = '';
    		 vm.status = error.data.message;
    	  });
      }
     
     function adicionaPagina(pagina) { //Adiciona pagina num Array de Object
		vm.paginas.push(pagina);
     }

     function excluirPagina(pagina) { //Remove pagina do Array
    	 var index = vm.paginas.indexOf(pagina);
    	 vm.paginas.splice(index, 1);
     }
     
     function getPaginas(){
    	 return vm.paginas;
     }
     
     function limparTela() {
		 document.getElementById("formCadastro").reset(); // Reseta Form
	 }

  }
 }
}//Fim classe
DocumentoCadastroController.$inject = ['documentoService'];
