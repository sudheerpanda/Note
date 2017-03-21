var app = angular.module('myApp', []);
app.controller('noteController', function($scope, $http) {
  $http({
    method : 'GET',
    url : 'note/get',
    params:'name=454'
  }).then(function mySucces(response) {
      $scope.name = response.message;
    }, function myError(response) {
      $scope.name = response.name;
  });
