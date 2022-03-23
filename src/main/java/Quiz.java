public class Quiz {


//    What does the word 'polymorphism' mean?

    Polymorphism is when an object can be of multiple Class types
//
//    What does it mean when we apply polymorphism to OO design? Give a simple Java example.

    Its when an Object has the access to multiple classes aka it has inherited a super class or it is implementing an interface

    public class Car extends Vehicle implements IDrive{
        Car(String model, Double price, Etc etc)
    }

    The above example is of Type Car, but can also be Type Vehicle as it is inheriting from the Vehicle class, and can be Type IDrive as it is implementing the IDrive interface

//
//    What can we use to implement polymorphism in Java?

Abstract Classes, Parent Classes, Interfaces

//    How many 'forms' can an object take when using polymorphism?

    as many as you want
//
//    Give an example of when you could use polymorphism.

    A shop could sell many different types of product (Dairy, Meat, Alcohol, Clothes, Electronics, Beauty Products etc),
        all of which have their own properties. But chances are they are all sellable, so they could be extended an interface
    such as ISell, which could contain a method called sell(), and this would allow objects of any of the above Types to be grouped together in an arrayList and "sold".
//
//    Composition and Aggregation
//    What do we mean by 'composition' in reference to object-oriented programming?

    Composition is when one Object is composed of instances of another Object, i.e one Object HAS another Object
//

//    When would you use composition? Provide a simple example in Java.
    You would use composition when one object HAS another object aka a person HAS organs.

    Person(String name, int age, Heart heart, Kidney kidney, Liver liver)

//
//    Give a difference between composition and aggregation?
    In aggregation the objects that another object is composed of can exist independently as objects whereas in composition the objects are "owned" by the container object and cannot exist without it.
//
//    What is/are the advantage(s) of using composition/aggregation?
    composition allows an Object access to the functionality that another object has but without having to inherit it along with other limitations from a super class.
    Aggregation helps in scaling as the functionality of an object can be assigned to multiple objects without too much refactoring.

//
//    When using composition, when an object is destroyed, what happens to all the objects it is composed of?
    They are also destroyed
//
//    When using aggregation, when an object is destroyed, what happens to all the objects it is composed of?
    They continue to exist as independent objects
}
