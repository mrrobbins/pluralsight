"use strict";

var Dispatcher = require('../dispatcher/appDispatcher');
var AuthorApi = require('../api/authorApi');
var ActionTypes = require('../constants/actionTypes');

var AuthorActions = {
  createAuthor: function (author) {
    var newAuthor = AuthorApi.saveAuthor(author);

    // notify stores of this new author
    Dispatcher.dispatch({
      actionType: ActionTypes.CREATE_AUTHOR,
      author: newAuthor
    });
  },

  updateAuthor: function (author) {
    var newAuthor = AuthorApi.saveAuthor(author);

    Dispatcher.dispatch({
      actionType: ActionTypes.UPDATE_AUTHOR,
      author: newAuthor
    });
  },

  deleteAuthor: function (id) {
    AuthorApi.deleteAuthor(id);
    Dispatcher.dispatch({
      actionType: ActionTypes.DELETE_AUTHOR,
      id: id
    });
  }

};

module.exports = AuthorActions;