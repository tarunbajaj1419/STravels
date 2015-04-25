/**
 * Created by tarunbajaj on 20/04/15.
 */

var appRoot = angular.module('STravels', ['ngRoute']);

appRoot.config(['$routeProvider',
    function($routeProvider) {
        $routeProvider.
            when('/booking', {
                templateUrl: 'tabs/booking.html',
                controller: 'BookingController'
            }).
            when('/packages', {
                templateUrl: 'tabs/packages.html',
                controller: 'PackagesController'
            }).
            otherwise({
                redirectTo: '/'
            });
    }]);

appRoot.controller('HomeController', ['$scope', '$http', function ($scope, $http) {

        $scope.loadPeople = function() {
            var httpRequest = $http({
                method: 'POST',
                url: '/ajax/getPeople',
                data: 'TestData'

            }).success(function(data, status) {
                $scope.people = data;
            });

        };

    }]);