import { inherit } from "@uirouter/core";

export default class DocumentoEdicaoController {

  constructor(documentoService, $stateParams) {
    var vm = this;
    vm.documento = $stateParams.documento; //Recebe documento do state anterior :)
    vm.salvarEdicao = null;
    vm.documentoEditado = null;
    init();

    
    function init(){
    vm.salvarEdicao = salvarEdicao;
    vm.documentoEditado = vm.documento;
    vm.limparTela = limparTela;
     
     function salvarEdicao(documento) {
    	 console.log(documento);
    	 documentoService.patch(documento)
    	 .then(function (resp) {
			console.log(resp);
		}).catch(function (error) {
			console.log(error);
		});
     }

  }
 }
}//Fim classe
DocumentoEdicaoController.$inject = ['documentoService', '$stateParams'];
