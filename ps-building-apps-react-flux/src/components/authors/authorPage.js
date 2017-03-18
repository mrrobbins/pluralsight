"use strict";

var React = require('react');
var Link = require('react-router').Link;
var AuthorStore = require('../../stores/authorStore');
var AuthorActions = require('../../actions/authorActions');
var AuthorList = require('./authorList');

var marginBottomStyle = {
  marginBottom: '20px'
};

var AuthorPage = React.createClass({
  getInitialState: function () {
    return {
      authors: AuthorStore.getAllAuthors()
    };
  },

  // before the component mounts, register our change callback with the author store so this page is notified anytime an author changes and can update its state
  componentWillMount: function() {
    AuthorStore.addChangeListener(this._onChange);
  },

  componentWillUnmount: function() {
    AuthorStore.removeChangeListener(this._onChange);
  },

  _onChange: function () {
    this.setState({authors: AuthorStore.getAllAuthors()});
  },

  render: function () {
    return (
      <div>
        <h1>Authors</h1>
        <Link to="addAuthor" className="btn btn-default" style={marginBottomStyle}>Add Author</Link>
        <AuthorList authors={this.state.authors}/>
      </div>
    );
  }
});

module.exports = AuthorPage;