"use strict";

var React = require('react');
var Redirect = require('react-router').Redirect;

var Redirects = React.createMixin({
  render: function() {
    return (
        <Redirect from="creators" to="authors" />
    );
  }
});

module.exports = Redirects;