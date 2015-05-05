/**
 * Created by tarunbajaj on 20/04/15.
 */

appRoot.controller("BookingController", ['$scope', function ($scope) {

    createDatePicker('pickupDate');

    $scope.isAvail = true;
    $scope.setFocus = setFocus;

    $scope.checkAvail = function ()
    {
        $scope.isAvail = !$scope.isAvail;
        $scope.cls = $scope.isAvail ? 'btn-success' : 'btn-danger';
    };
}]);