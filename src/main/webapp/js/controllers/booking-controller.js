/**
 * Created by tarunbajaj on 20/04/15.
 */

appRoot.controller("BookingController", ['$scope', function ($scope) {

    $scope.isAvail = true;


    $scope.checkAvail = function ()
    {
        $scope.isAvail = !$scope.isAvail;
        $scope.cls = $scope.isAvail ? 'btn-success' : 'btn-danger';
    };
}]);