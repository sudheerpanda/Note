(function(angular) {
	angular.module('myApp', []);
  	angular.module("myApp.controllers", []);
  angular.module("myApp.services", []);
  angular.module("myApp", ["ngResource", "myApp.controllers", "myApp.services"]);
}(angular));


angular.module('myApp', [])
.controller('controller', myController);

myController.$inject = ['$scope', '$http', 'myService'];

function myController($scope, $http, myService) {
	
	$scope.noteDetails = [];
	
	myService.getNoteDetails().then(function(response) {
		$scope.noteDetails = response;
	})
	
	$scope.updateItem = function(item) {
		
	}
	
	
	
}
