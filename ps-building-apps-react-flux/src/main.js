"use strict";

var React = require('react');
var Router = require('react-router');
var routes = require('./routes');
var InitializeActions = require('./actions/initializeActions');

InitializeActions.initApp();

Router.run(routes, function (RouteHandler) {
    React.render(<RouteHandler/>, document.getElementById('app'));
});