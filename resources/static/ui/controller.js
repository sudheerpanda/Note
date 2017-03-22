var app = angular.module('myApp', []);
	app.controller('noteController', function($scope, $http) {
		$http({
				method:'GET',
				url:'/note/get',
				params:{'name':454}
			}).then(function(response){
  		$scope.note=response.data;
  		});
  		$http({
				method:'GET',
				url:'/note/get/ALL'			
			}).then(function(response){
  		$scope.notes=response.data;
  		});
  	});