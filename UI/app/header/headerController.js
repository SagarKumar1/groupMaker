/**
 * Created by tusanand on 6/28/2017.
 */
"use strict";
angular.module("GroupApp").controller("headerController", function($scope, $http, Upload) {
    var hCtrl = this;
    hCtrl.imageSelect = true;
    hCtrl.showModal = function () {
        $("#createGroup").modal("show");
    };

    hCtrl.showUploadModal = function(file) {
        if(file.length > 0){
            hCtrl.imageSelect = false;
        }
        hCtrl.ImageSrc = [];
        for (var i = 0; i < file.length; i++) {
            var reader = new FileReader();
            reader.readAsDataURL(file[i]);
            reader.onload = function(e) {
                $scope.$apply(function(){
                    hCtrl.ImageSrc.push(e.target.result);
                });
            };
        }
    };
    hCtrl.cancelProcess = function () {
        $("#createGroup").modal("hide");
        hCtrl.imageSelect = true;
        hCtrl.ImageSrc = "";
    };
    hCtrl.removeImage = function (indexPosition) {
        hCtrl.ImageSrc.splice(indexPosition, 1);
        if(hCtrl.ImageSrc.length === 0){
            hCtrl.imageSelect = true;
        }
    }
});
