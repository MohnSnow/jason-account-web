"use strict"

app.directive('confirm', [function () {
    return {
        restrict: "EA",
        replace: true,
        scope: {
            /**
             * handler must be an object which is used to operate the confirm dialog:
             */
            handler: "="
        },
        template: '<div role="dialog" class="modal fade"' +
        'data-keyboard="true">' +
        '<div class="modal-dialog modal-sm">' +
        '<div class="modal-content">' +
        '<div class="modal-header">' +
        '<a class="close" data-dismiss="modal">×</a>' +
        '<h3>{{title}}</h3>' +
        '</div>' +
        '<div class="modal-body">' +
        '<p>{{message}}</p>' +
        '</div>' +
        '<div class="modal-footer">' +
        '<a href="#" class="btn btn-success" ng-click="ok()">确认</a>' +
        '<a href="#" class="btn btn-default" data-dismiss="modal" ng-show="cancelButton">取消</a>' +
        '</div>' +
        '</div>' +
        '</div>' +
        '</div>',
        link: function (scope, element, attrs) {
            var handler = scope.handler;
            scope.title=null;
            scope.message = null;
            scope.cancelButton = false;
            scope.dialog = $(element);
            scope.message = null;
            scope.callback = null;

            scope.ok = function(){
                if (scope.callback!=null) {
                    scope.callback();
                    handler.hide();
                } else {
                    handler.hide();
                }
            };

            handler.confirm = function(message, title, callback){
                handler.show(message, title, true, callback);
            };

            handler.alert = function(message, title, callback){
                handler.show(message, title, false, callback);
            };

            handler.hide = function(){
                scope.dialog.modal('hide');
            };

            handler.show = function(message, title, cancelButton, callback){
                scope.message = message;
                scope.title = title || '消息';
                if (cancelButton != null) {
                    scope.cancelButton = cancelButton;
                }
                scope.callback = callback;
                scope.dialog.modal('show');
            };
        }
    }
}]);