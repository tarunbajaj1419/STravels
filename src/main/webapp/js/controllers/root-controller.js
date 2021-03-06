/**
 * Created by tarunbajaj on 20/04/15.
 */

var appRoot = angular.module('STravels', ['ngRoute', 'ngAnimate']);

appRoot.config(['$routeProvider',
    function ($routeProvider) {
        $routeProvider.
            when('/', {
                templateUrl: 'tabs/home.html',
                controller: 'HomeController'
            }).
            when('/booking', {
                templateUrl: 'tabs/booking.html',
                controller: 'BookingController'
            }).
            when('/manageBooking', {
                templateUrl: 'tabs/manageBooking.html',
                controller: 'ManageBookingController'
            }).
            when('/packages', {
                templateUrl: 'tabs/packages.html',
                controller: 'PackagesController'
            }).
            when('/contact', {
                templateUrl: 'tabs/contact.html',
                controller: 'ContactController'
            }).
            otherwise({
                redirectTo: '/'
            });
    }]);

appRoot.controller('RootController', ['$scope', '$http', '$location', function ($scope, $http, $location) {

    $scope.isActive = function (viewLocation) {
        return viewLocation === $location.path();
    };

    $scope.loadPeople = function () {
            var httpRequest = $http({
                method: 'POST',
                url: '/ajax/getPeople',
                data: 'TestData'

        }).success(function (data, status) {
            $scope.people = data;
        });

    };

}]);