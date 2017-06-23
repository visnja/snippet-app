/**
 * Created by Milica on 23-Jun-17.
 */
angular
    .module("SnippItApp")
    .config(
        function ($routeProvider) {
            $routeProvider
                .when
                ('/',
                    {
                        templateUrl: '/js/views/home.html',
                        controller: 'MainController'
                    })
                .when('/login', {
                    templateUrl: '/js/auth/login/login.html',
                    controller: 'MainController'
                }).when('/register', {
                templateUrl: '/js/auth/register/register.html',
                controller: 'MainController'
            }).otherwise({
                redirectTo: '/'
            });
        });
