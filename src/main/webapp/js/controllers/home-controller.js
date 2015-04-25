/**
 * Created by tarunbajaj on 20/04/15.
 */

angular.module("STravels", [])
    .controller("homeController", function ($scope, $http) {

        $scope.loadPeople = function() {
            var httpRequest = $http({
                method: 'POST',
                url: '/ajax/getPeople',
                data: 'TestData'

            }).success(function(data, status) {
                $scope.people = data;
            });

        };

    });