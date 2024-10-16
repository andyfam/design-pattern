# Why design pattern

![](/resources/design-pattern.png)

More readable and maintainable, formalized best practices for problems solving.

# 3 Groups of Pattern

- Creational Patterns  
Provide more flexibility on how objects are created  

- Structural  Patterns  
Deal with how inheritance and composition can be used to provide extra functionality  

- and Behavioral Patterns  
Are about communication and assignment of responsibilities between objects  

# Singleton

Is a creational design pattern, ensure only one instance of this kind exists, and provides a single point access to it.

![](/resources/singleton-1.png)

![](/resources/singleton-2.png)

# Factory

Is a creational design pattern, used in occasions when our client need a superclass with some subclass, in order to take out the responsibility of initializing the classes from client to a factory class.

![](/resources/factory-1.png)

![](/resources/factory-2.png)

![](/resources/factory-3.png)

![](/resources/factory-4.png)

![](/resources/factory-5.png)

![](/resources/factory-6.png)

![](/resources/factory-7.png)

![](/resources/factory-8.png)

# Builder

![](/resources/builder.png)

The builder pattern was introduced to solve some of the problems with factory and abstract Factory design patterns when **the object contains a lot of attributes**. This pattern solves the issue with a large number of optional parameters and inconsistent state by providing a way to **build the object step-by-step** and provide a method that will actually return the final Object.

# Fly Weight

![](/resources/fly-weight.png)

# Moment

![](/resources/moment.png)

# Dependencies Injection

- The dependency is pushed into the class from outside, rather than initiate using the new operator.
- There are two method for DI: Construction Injection and Setter Injection
- It also called Dependency Inversion which means depend on abstraction then you can substitute different dependencies as long as they implement the same interface.
- Dependency Injection Container
