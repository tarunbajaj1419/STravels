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
        showOptions: {direction: "down"}
    });
};

var setFocus = function (id) {
    $('#' + id).focus();
};

var getFormControlClass = function (lg, md, sm, xs) {

    var result = "";
    var grids = [
        {id: 'lg', factor: lg >= 0 ? lg : 1},
        {id: 'md', factor: md >= 0 ? md : lg},
        {id: 'sm', factor: sm >= 0 ? sm : lg},
        {id: 'xs', factor: xs >= 0 ? xs : lg}
    ];

    grids.forEach(function (grid) {
        result = result + ' col-' + grid.id + '-' + grid.factor;
    });

    return result;
};
var getFormControlOffsetClass = function (lg, md, sm, xs) {

    var result = "";
    var grids = [
        {id: 'lg', factor: lg >= 0 ? lg : 0},
        {id: 'md', factor: md >= 0 ? md : lg},
        {id: 'sm', factor: sm >= 0 ? sm : lg},
        {id: 'xs', factor: xs >= 0 ? xs : lg}
    ];

    grids.forEach(function (grid) {
        result = result + ' col-' + grid.id + '-offset-' + grid.factor;
    });

    return result;
};
