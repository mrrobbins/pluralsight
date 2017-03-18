## Resources

* [https://app.pluralsight.com/library/courses/react-flux-building-applications]
* [https://github.com/coryhouse/react-flux-starter-kit]
* [https://github.com/coryhouse/react-flux-building-applications]

### Challenge

* API: [http://bit.ly/courseapi]
* Data [http://bit.ly/mockcoursedata]

## Flux

A pattern for uni-directional data flows.

Key ideas:
* Centralized dispatcher

Alternatives:
* Facebook's Flux
* Alt
* Reflux
* Redux
* Flummox
* Marty
* Fluxible
* NuclearJS
* Delorean
* Fluxxor

### Two-way bindings vs undirectional

#### Two-way binding

* Viewmodel <--> View 
* Eg.g textbox change, immediately visible in dom

#### Undirectional

* Creates code that is easy to navigate and reason about because it's very explicit, at the cost of extra boiler plate.
* Action --> Dispatcher --> Store --> React View
* Views don't directly update state. View changes (e.g. textbox input) fires action events and the processing changes starts over.
* The unidirectional model just seems like a further reduction of the working parts of two-way binding behind the scenes. Or perhaps it's introducing a store which temporarily holds the state change until and view event cycles picks it up. Perhaps this has some performance benefits over the immediacy of two-way binding?
* Easy to update multiple stores when an action occurs. Why would I want multiple stores (copies) of my data?

#### Action

* Payload of type (enum) and data fields

#### Dispatcher

* Helps gets messages from views to stores
* singleton registry of callbacks
* dispatches actions to registered stores
* **Important** Callback invocations can be ordered. By ordering callback calls to stores, you can enforce behavior.
    * waitFor API

#### Stores

* holds ap state, logic, data retrieval
* not a model, but contains models
* one or many stores per app
* only stores can register callbacks. don't register react components directly
* uses Node's EventEmitter to update react components
* stores have no set method, only updatable via callbacks

##### Traits

* `extend EventEmitter`
* `addChangeListener` and `removeChangeListener`
* `emitChange`


### Flux

* constant files are useful
* provides high level view of what the app can do
* By best practice React components can be deeply nested, but only the top level component should be interacting with the store and pushing large objects down to its children via props.

#### Differences from Pub-Sub pattern

* **Every** payload is dispatched to **every** registered callback
* Callbacks **can** wait for other callbacks.