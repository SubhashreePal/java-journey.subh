# java-journey.subh
This repository contains my daily Java learning progress.

## Goal
Learn Java consistently

Build strong programming fundamentals

Prepare for DSA and Backend Development

### daily GitHub contribution streak

Day 1 - Hello World

Day 2 - Variables and Data Types

Day 3 - Operators

Day 4 - User Input

Day 5 - If Else Statements

Day 6 - Switch Statements

Day 7 - For Loops

Day 8 - Nested Loops and Patterns

Day 9 - Arrays

Day 10 - Methods (Functions)

Day 11 - Strings

Day 12 - 2D Arrays

Day 13 - Classes and Objects

Day 14 - Constructors

Day 15 - Inheritance

Day 16 - Polymorphism

Day 17 - Encapsulation

Day 18 - Abstraction

Day 19 - Interfaces

Day 20 - Exception Handling

Day 21 - ArrayList

Day 22 - HashMap

Day 23 - File Handling


## **Day 1 - Hello World**
- Introduction to Java

- First Java Program

- Printing output using System.out.println()

## **Day 2 - Variables and Data Types**
- Variables

- int

- double

- char

- boolean

- String

## **Day 3 - Operators**

Arithmetic Operators

- Addition (+)

- Subtraction (-)

- Multiplication (*)

- Division (/)

- Modulus (%)

## **Day 4 - User Input**

- Scanner Class

- Taking input from users

- Reading Strings and Numbers

## **Day 5 - If Else Statements**

Conditional Statements :

- if

- else if

- else

Decision Making

## **Day 6 - Switch Statements**

- switch case

- break

- default

Building simple menu-driven programs

## Day 7 - For Loops

- Introduction to Loops
- for Loop Syntax
- Printing Numbers using Loops
- Printing Repeated Text
- Even Number Programs

## Day 8 - Nested Loops and Patterns

- Nested Loops
- Star Patterns
- Reverse Star Patterns
- Number Patterns
- Understanding Rows and Columns

## Day 9 - Arrays

- Introduction to Arrays
- Array Declaration and Initialization
- Accessing Elements using Index
- Traversing Arrays using Loops
- Finding Sum of Array Elements

## Day 10 - Methods (Functions)

- Creating Methods
- Calling Methods
- Methods with Parameters
- Return Values
- Code Reusability using Functions

## Day 11 - Strings

- Introduction to Strings
- String Declaration and Initialization
- String Methods
  - length()
  - toUpperCase()
  - toLowerCase()
  - charAt()
  - contains()
- Taking String Input using Scanner

## Day 12 - 2D Arrays

- Introduction to 2D Arrays
- Matrix Representation
- Accessing Elements using Row and Column Index
- Traversing 2D Arrays using Nested Loops
- Finding Sum of Matrix Elements

## Day 13 - Classes and Objects

- Introduction to Object-Oriented Programming (OOP)
- Creating Classes
- Creating Objects
- Instance Variables
- Methods inside Classes
- Working with Multiple Objects

## Day 14 - Constructors

- Introduction to Constructors
- Parameterized Constructors
- Object Initialization
- Using this Keyword
- Creating Objects with Constructors

## Day 15 - Inheritance

Inheritance allows one class to acquire the properties and methods of another class.

Syntax:

class Child extends Parent {
}

Benefits:
- Code Reusability
- Reduced Duplication
- Better Organization

## Day 16 - Polymorphism

- Introduction to Polymorphism
- Method Overriding
- Runtime Polymorphism
- Parent Class Reference
- Child Class Object
- Using @Override Annotation

Example:

Animal a = new Dog();
a.sound();

Output:
Dog barks

## Day 17 - Encapsulation

- Introduction to Encapsulation
- Data Hiding
- private Access Modifier
- Getter Methods
- Setter Methods
- Controlling Access to Data

Example:

private String name;

public void setName(String name) {
    this.name = name;
}

public String getName() {
    return name;
}

## Day 18 - Abstraction

- Introduction to Abstraction
- Abstract Classes
- Abstract Methods
- Hiding Implementation Details
- Achieving Abstraction in Java

Example:

abstract class Animal {
    abstract void sound();
}

## Day 19 - Interfaces

- Introduction to Interfaces
- Defining Methods in Interfaces
- Implementing Interfaces
- Multiple Classes Using the Same Interface
- Achieving Abstraction with Interfaces

Example:

interface Animal {
    void sound();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}

## Day 20 - Exception Handling

- Introduction to Exceptions
- try Block
- catch Block
- finally Block
- Handling Runtime Errors
- Preventing Program Crashes

Example:

try {
    int result = 10 / 0;
}
catch(Exception e) {
    System.out.println("Cannot divide by zero");
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

## Day 21 - ArrayList

- Introduction to Collections Framework
- ArrayList Creation
- Adding Elements
- Accessing Elements
- Removing Elements
- Iterating through ArrayList

Example:

ArrayList<String> names = new ArrayList<>();

names.add("Java");
names.add("GitHub");

System.out.println(names);

## Day 22 - HashMap

- Introduction to HashMap
- Key-Value Pairs
- Adding Entries with put()
- Retrieving Values with get()
- Removing Entries with remove()
- Iterating Through a HashMap using keySet()

Example:

HashMap<String, Integer> marks = new HashMap<>();

marks.put("Java", 95);
marks.put("Python", 90);

System.out.println(marks.get("Java"));

## Day 23 - File Handling

- Creating Files
- Writing to Files
- Reading Files
- Handling File Exceptions
- Using File, FileWriter, and Scanner

Example:

File file = new File("notes.txt");

FileWriter writer =
        new FileWriter("notes.txt");

writer.write("Hello from Java!");
