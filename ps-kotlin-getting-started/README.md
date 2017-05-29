# Kotlin: Getting Started by Kevin Jones

## Project structure

* `src/main/{java|kotlin}`
* `src/test{java|kotlin}`

## Running locally

## Run main snippets

* A collection of classes with main function to execute

## Run tests

* A set of unit tests
* Note using junit 5
* Get spek plugin for intellij for right-click run IDE integration

## Key features

* null types must be explicit
    * elvis operator like groovy - null check/dereference value in a single line
* no `static` keyword
* functional programming
    * supports/encourages immutability
    * higher order functions
* less boilerplate than java
    * no getters/setters
    * extensive type inference
* Using Kotlin to write DSLs

## Mechanics

* Visibility is public: classes, interfaces, methods
* Method expressions - simple method bodies can be RHS expressions, omitting curly braces and return keyword
* Classes are final by default

### Equality

Equality Type|Java|Kotlin
------|------|------
Object equality|`Object.$equals()`|`==`
Reference equality|`==`|`===`

### Exceptions

* No Checked Exceptions

## Interoperability with Java
