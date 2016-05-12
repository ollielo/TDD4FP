title: Test Driven Development for Functional Programming
output: index.html
theme: sjaakvandenberg/cleaver-dark
controls: true

--

# TDD4FP
## Test Driven Development for Functional Programming

--

### Test Driven Development

1. Write a failing test
2. Make the test pass
3. Refactor
4. Goto 1

--

### Source of Inspirations

1. Why functional programming matters - John Hughes
2. Functional programming in Scala - Paul Chiusano and Runar Bjrnason
3. Venkat Subramaniam

--

### Format
* Slides + Live Coding
* Incremental development
* Language/IDE features
* Interrupt me anytime

--

### Linked List
* Can be empty, called *Nil*, or
* Non-empty, consisted of *head* and a list as *tail*
* Operations: construct, fold and map
* Functional-Objective programming

--

### Linked List Constructors
* Singleton object
* Case class
* Trait
* Bottom type
* Type variance

--

### Companion Object
* apply() and object factory
* Variadic function
* Pattern match

--

### Summing a List
* Recursion
* Pattern match with *extractor*

--

### Folding a List (Standalone Version)
* Nil and Cons
* Lambda and currying
* Target typing (or lack of)

--

### Refactor to List.fold()
* Nil and Cons
* Sum in fold()

--

### Refactoring List.fold()
* Why type inference did not work
* Refactor to the new List.fold()
--

### Mapping a List
* Nil and Cons
* List.map in List.fold

--

### Multi-Way Tree
* Non-trivial structure recursion
* Non-trivial type-fu

--

### Tree.map()
* Much easier than Tree.fold()
* Follow the type

--

### Tree.fold()
* Type *algebra* on Whiteboard
* Refactor Tree.map()

--

### Tic-Tac-Toe
* Functional *state*