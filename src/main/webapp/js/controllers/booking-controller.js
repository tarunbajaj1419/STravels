/**
 * Created by tarunbajaj on 20/04/15.
 */

appRoot.controller("BookingController", ['$scope', '$location', function ($scope, $location) {

    $scope.path = $location.path();
    $scope.hide = $scope.path !== '/outstationBooking' ;
    $scope.setFocus = setFocus;
    $scope.getFormControlClass = getFormControlClass;
    $scope.getFormControlOffsetClass = getFormControlOffsetClass;

    var checkAvail = function ()
    {
        return true;
    };

    $scope.book = function ()
    {
        $scope.isAvail = checkAvail();
    };

    $scope.reset = function ()
    {
        $scope.isAvail = null;
        $scope.pickupDate = null;
    };

    createDatePicker('pickupDate');
}]);