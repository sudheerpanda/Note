
//create a angular module to handle save/delete/edit
var myApp = angular.module('myApp', []);

// Controller function and passing $http service and $scope var.

myApp.controller('noteController', function($scope, $http) {	
  
    init();
    
    //get all notes
   	function getAllNotes() {
   		$http({
        method:'GET',
        url:'/note/get/ALL'
    }).then(function(response){
        $scope.notes=response.data;
    });
   		
   	}

	//get all notes available in map at starting time
   	function init() {
   		getAllNotes();
   	}
   	
   	  // create a note blank object to handle form data.
    $scope.note = {};
    
    
    //save the note
    $scope.save = function() {
        $http({
            method  : 'POST',
            url     : 'note/add',
            data    : $scope.note, //forms user object
            headers : {'Content-Type': 'application/json'}
        })
            .success(function(data) {

                    $scope.notes = data;

            });
    };
    
    //edit a note by note name
    $scope.edit=function(note){
             $http({
                method:'GET',
                url:'/note/get',
                params:{'name':note.name}
            }).then(function(response){
                $scope.note=response.data;
            });
    };
    
    //Delete a note by note name
    $scope.delete=function(note){
    $http({
            method  : 'DELETE',
            url     : 'note/delete',
            params    : {name:note.name}, //forms user object
            headers : {'Content-Type': 'application/json'}
        }).success(function(data){
        //get all notes once delete the note 	
       		getAllNotes();
       		note={};
           return;
        });
    };
});