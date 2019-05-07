routing.$inject = ['$stateProvider', '$urlRouterProvider'];

export default function routing($stateProvider, $urlRouterProvider) {
    let homeState = {
        name: 'home',
        url: '/home',
        templateUrl: './modulos/home/home.view.html',
        controller: 'HomeController',
        controllerAs: 'vm'
      }
      $stateProvider.state(homeState);
      
      let documentoState = {
        name: 'documento',
        url: '/documento',
        templateUrl: './modulos/documento/documento.view.html',
        controller: 'DocumentoController',
        controllerAs: 'vm'
      }
      $stateProvider.state(documentoState);

      let cadastroState = {
    		  name: 'cadastro',
    		  url: '/documento/cadastro',
    		  templateUrl: './modulos/documento/cadastro/cadastro.html',
    		  controller: 'DocumentoCadastroController',
    		  controllerAs: 'vm'
      }
      $stateProvider.state(cadastroState);
      
      $urlRouterProvider.otherwise('/home')  
}