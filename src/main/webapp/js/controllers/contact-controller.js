/**
 * Created by tarunbajaj on 20/04/15.
 */


appRoot.controller("ContactController", ['$scope', '$location', function ($scope, $location) {

    function initialize() {
        var mapCanvas = document.getElementById('map-canvas');
        var myLatlng = new google.maps.LatLng(28.620693, 77.303711);
        var mapOptions = {
            center: myLatlng,
            zoom: 17,
            mapTypeId: google.maps.MapTypeId.ROADMAP
        };

        var map = new google.maps.Map(mapCanvas, mapOptions);

        var marker = new google.maps.Marker({
            position: myLatlng,
            map: map,
            title: 'Sainik Travels'
        });
    }

    $scope.$on('$routeChangeSuccess', function () {
        initialize();
    });

}]);