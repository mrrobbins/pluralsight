"use strict";

var React = require('react');
var Link = require('react-router').Link;
var AuthorActions = require('../../actions/authorActions');
var toastr = require('toastr');

var AuthorList = React.createClass({
  propTypes: {
    authors: React.PropTypes.array.isRequired
  },

  deleteAuthor: function (id, event) {
    event.preventDefault();
    AuthorActions.deleteAuthor(id);
    toastr.success('Author Deleted');
  },

  render: function () {
    var createAuthorRow = function (author) {
      return (
        <tr key={author.id}>
          <td><Link to="manageAuthor" params={{id: author.id}}>{author.id}</Link></td>
          <td>{author.firstName} {author.lastName}</td>
          <td><a href="#" className="btn btn-danger btn-sm" onClick={this.deleteAuthor.bind(this, author.id)}>Delete</a>
          </td>
        </tr>
      );
    };

    return (
      <table className="table">
        <thead>
        <th>ID</th>
        <th>Name</th>
        <th>Actions</th>
        </thead>
        <tbody>
        {this.props.authors.map(createAuthorRow, this)}
        </tbody>
      </table>
    );
  }
});

module.exports = AuthorList;