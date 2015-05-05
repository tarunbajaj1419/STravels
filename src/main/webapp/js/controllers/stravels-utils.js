/**
 * Created by tarunbajaj on 27/04/2015.
 */

var createDatePicker = function (id) {
    $('#' + id).datepicker({
        //showOn: "both",
        //buttonImageOnly: true,
        //buttonImage: "calendar.gif",
        //buttonText: "Calendar",
        gotoCurrent: true,
        showAnim: "slide",
        showOptions: { direction: "down" }
    });
};

var setFocus = function(id) {
    $('#' + id).focus();
};