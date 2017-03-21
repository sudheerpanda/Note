(function(angular) {
  var ItemFactory = function($resource, $http) {
  	
    return $resource('//:id', {
      id: '@id'
    }, {
      update: {
        method: "PUT"
      },
      remove: {
        method: "DELETE"
      }
    });
  };
  
  ItemFactory.$inject = ['$resource'];
  angular.module("myApp.services").factory("Item", ItemFactory);
}(angular));


angular.module('myApp', [])
.factory('myService', myService);

myService.$inject = ['$http'];

function myService($http) {

var serviceUrl = 

	var getNoteDetails = function() {
	
		return $http.get('url');
	}
	
	return {
	getNoteDetails: getNoteDetails
}