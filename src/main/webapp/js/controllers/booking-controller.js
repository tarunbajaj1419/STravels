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

    $scope.$root.attributeModified = function ()
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

    $scope.$root.booking = {
        pickupDate: new Date().toDateString(),
        pickupHour: "10",
        pickupMin: "30",
        ride: "4",
        type: "1",
        for: "1",
        days: 3,
        dayList: [1,2,3,4,5,6,7,8,9,10],
        sameAddr: true,
        message: function(){
            return this.pickupDate
            + ' @' + this.pickupHour + ':'
            + this.pickupMin + ' - '
            + this.ride + ' Seater '
            + (this.for === "2" ? 'for ' + this.days + ' days' : '');
        }
    };

    createDatePicker('pickupDate');
}]);