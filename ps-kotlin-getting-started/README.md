# Kotlin: Getting Started by Kevin Jones

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
