/**
 * Created by tarunbajaj on 27/04/2015.
 */

var createDatePicker = function (id) {
    $('.' + id).datepicker({
        format: $.datepicker.RSS
    });
    //$.datepicker.formatDate( "yy-mm-dd", new Date( 2007, 1 - 1, 26 ) );
};

var setFocus = function (id) {
    $('#' + id).focus();
};

