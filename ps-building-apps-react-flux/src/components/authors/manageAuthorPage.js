"use strict";

var React = require('react');
var Router = require('react-router');
var AuthorForm = require('./authorForm');
var AuthorApi = require('../../api/authorApi');
var toastr = require('toastr');
var Link = Router.Link;

var ManageAuthorPage = React.createClass({
  statics: {
    willTransitionFrom: function (transition, component) {
      if (component.state.dirty) {
        if (!confirm('You have unsaved changes. Are you sure you want to leave?')) {
          transition.abort();
        }
      }
    }
  },

  mixins: [
    Router.Navigation
  ],
  
  getInitialState: function() {
    return {
      author: {id: '', firstName: '', lastName: ''},
      errors: {},
      dirty: false
    };
  },

  componentWillMount: function() {
    var authorId = this.props.params.id;
    if (authorId) {
      this.setState({author: AuthorApi.getAuthorById(authorId)});
    }
  },

  setAuthorState: function(event) {
    var field = event.target.name;
    var value = event.target.value;
    this.state.author[field] = value;
    this.setState({dirty: true});
    return this.setState({author: this.state.author});
  },

  authorFormIsValid: function() {
    var formIsValid = true;
    this.state.errors = {}; //clear previous errors.
    var firstName = this.state.author.firstName;
    if (firstName.length < 3) {
      formIsValid = false;
      this.state.errors.firstName = 'First name is required';
    } else if (firstName[0] !== firstName[0].toUpperCase()) {
      formIsValid = false;
      this.state.errors.firstName = 'First name must start with an uppercase letter';
    }
    var lastName = this.state.author.lastName;
    if (lastName.length < 3) {
      formIsValid = false;
      this.state.errors.lastName = 'Last name is required';
    } else if (lastName[0] !== lastName[0].toUpperCase()) {
      formIsValid = false;
      this.state.errors.lastName = 'Last name must start with an uppercase letter';
    }
    this.setState({errors: this.state.errors});
    return formIsValid;
  },

  saveAuthor: function(event) {
    event.preventDefault();
    if(!this.authorFormIsValid()) {
      return;
    }
    AuthorApi.saveAuthor(this.state.author);
    this.setState({dirty: false});
    toastr.success('Author saved. <a href="/#/authors">Go to Authors?</a>'); // TODO make this a Router Link
    //this.transitionTo('authors');
  },

  render: function() {
    return (
        <AuthorForm
            author={this.state.author}
            onChange={this.setAuthorState}
            onSave={this.saveAuthor}
            errors={this.state.errors}
        />
    );
  }
});

module.exports = ManageAuthorPage;