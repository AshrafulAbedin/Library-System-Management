# Library Management System

## Course Information
**Course:** SWE 4304 - Software Engineering  
**Lab:** Lab 1 - Library Management System  

## Objective
This project demonstrates:
1. Review of Object-Oriented Programming (OOP) concepts
2. Implementation of inheritance, abstraction, and polymorphism
3. Clean, readable, and maintainable code practices

## Project Overview
A simplified Library Management System that models the relationship between people (Students and Faculty) and books they borrow from a library.

## Features
- ✅ Abstract class hierarchy with inheritance
- ✅ Polymorphism through method overriding
- ✅ Encapsulation with private fields and public getters/setters
- ✅ Composition (Person has a collection of Books)
- ✅ Static variable tracking total books issued
- ✅ Runtime polymorphism demonstration
- ✅ Parameterized and default constructors

## UML Diagram
![UML Class Diagram](UML Diagram.png)

### Class Structure
- **Person (Abstract)**: Base class for library users
- **Student**: Extends Person, represents student users
- **Faculty**: Extends Person, represents faculty members
- **Book**: Represents books in the library
- **Library**: Utility class with static methods
- **Main**: Entry point demonstrating the system

## Classes Description

### 1. Person (Abstract Class)
- **Attributes:**
  - `name` (String)
  - `email` (String)
- **Methods:**
  - `displayDetails()` - Abstract method implemented by subclasses

### 2. Student (extends Person)
- **Attributes:**
  - `books` (ArrayList\<Book\>)
- **Methods:**
  - `addBook(Book)` - Adds a book to the student's collection
  - `getBooks()` - Returns a list of borrowed books
  - `displayDetails()` - Displays student information

### 3. Faculty (extends Person)
- **Attributes:**
  - `books` (ArrayList\<Book\>)
- **Methods:**
  - `addBook(Book)` - Adds a book to the faculty's collection
  - `getBooks()` - Returns a list of borrowed books
  - `displayDetails()` - Displays faculty information

### 4. Book
- **Attributes:**
  - `title` (String)
  - `author` (String)
  - `isbn` (int)
  - `price` (int)
- **Methods:**
  - `displayInfo()` - Displays book information
  - `toString()` - Returns formatted book details

### 5. Library
- **Static Attributes:**
  - `totalBooksIssued` (int)
- **Static Methods:**
  - `printPersonDetails(Person)` - Demonstrates polymorphism
  - `getTotalBooksIssued()` - Returns total books issued
  - `incrementTotalBooksIssued()` - Increments the book counter




## Key OOP Concepts Demonstrated

### 1. Abstraction
- `Person` is an abstract class with abstract method `displayDetails()`

### 2. Inheritance
- `Student` and `Faculty` inherit from `Person`

### 3. Polymorphism
- Runtime polymorphism shown in `Library.printPersonDetails(Person p)`
- Method overriding of `displayDetails()` in subclasses

### 4. Encapsulation
- Private fields with public getters/setters
- Controlled access to class members

### 5. Composition
- Person "has-a" collection of Books (ArrayList\<Book\>)

### 6. Static Members
- `totalBooksIssued` tracks global state across all instances

## Project Structure
```
src/
│
├── Person.java          # Abstract base class
├── Student.java         # Student subclass
├── Faculty.java         # Faculty subclass
├── Book.java           # Book entity class
├── Library.java        # Utility class with static methods
├── Main.java           # Main driver class
UML/
└── uml_diagram.png     # UML class diagram
├── README.md           # This file

```

*Last Updated: December 2024*
