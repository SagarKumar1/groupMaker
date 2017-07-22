/**
 * Created by tusanand on 6/24/2017.
 */
var GroupApp = angular.module("GroupApp", ["ui.router", "ngFileUpload"]); //Module
GroupApp.config(
    ["$stateProvider", "$urlRouterProvider",
        function($stateProvider, $urlRouterProvider) {

            $urlRouterProvider.otherwise("/home");
            $stateProvider
                .state("home", {
                    url: "/home",
                    templateUrl: "components/home/home.html",
                })
                .state("profile", {
                    url: "/profile",
                    templateUrl: "components/profile/profile.html",
                });

        }
    ]);