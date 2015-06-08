/**
 * Created by tarunbajaj on 27/04/2015.
 */

var createDatePicker = function (id) {
    $('.' + id).datepicker({
        dateFormat: 'D M dd yy'
    });
};

var setFocus = function (id) {
    $('#' + id).focus();
};

