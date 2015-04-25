/**
 * Created by tarunbajaj on 20/04/15.
 */

appRoot.controller("BookingController", ['$scope', '$http', function ($scope, $http) {

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