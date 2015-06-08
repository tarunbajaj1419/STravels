/**
 * Created by tarunbajaj on 20/04/15.
 */

appRoot.controller("BookingController", ['$scope', '$location', function ($scope, $location) {

    $scope.path = $location.path();
    $scope.hide = $scope.path !== '/outstationBooking' ;
    $scope.setFocus = setFocus;

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

}]);

appRoot.controller("CheckAvailabilityController", ['$scope', '$location', function ($scope, $location) {

    $scope.setFocus = setFocus;

    $scope.attributeModified = function ()
    {
        $scope.isAvail = false;
    };

    $scope.checkAvail = function ()
    {
        $scope.isAvail = true;
        $('.btn').blur();
    };

    $scope.book = function ()
    {
        $location.path('booking');
    };

    $scope.reset = function ()
    {
        $scope.isAvail = null;
        $scope.pickupDate = null;
    };

    $scope.booking = {
        pickupDate: new Date().toDateString(),
        pickupHour: "10",
        pickupMin: "30",
        ride: "4",
        type: "1"

    };

    createDatePicker('pickupDate');
}]);