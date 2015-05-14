/**
 * Created by tarunbajaj on 20/04/15.
 */

appRoot.controller("BookingController", ['$scope', function ($scope) {

    createDatePicker('pickupDate');

    $scope.setFocus = setFocus;

    var checkAvail = function ()
    {
        return true;
    };

    $scope.book = function ()
    {
        if(!($scope.isAvail = checkAvail()))
        {
            $scope.cls = 'btn-danger';
        }else
        {
            $scope.alert = true;
        }
    };

    $scope.reset = function ()
    {
        $scope.isAvail = null;
        $scope.pickupDate = null;
    }
}]);