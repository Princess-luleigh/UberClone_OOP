/** superclass: Person 
 * 
 * CHECK: I understand how Inheritance works
 * EXPLANATION: It works by deriving attributes and methods from one class to another. It is grouped into two categories: subclass (child) - the class that derives from another class, superclass (parent) - the class being derived from.
 * 
 * CHECK: I know how to use inheritance
 * EXPLANATION: "Extends" words are used, e.g DDD extends AAA - DDD is child class & AAA is parent class
 *  
 * CHECK: I know how encapsulation works
 * EXPLANATION: In encapsulation, the variables or data of a class is hidden from any other class and can be accessed only through any member function of own class in which they are declared
 */

public class Person {

/** CHECK: I can create Instance variables and am able to to use another class type variable in another class
 *  EXPLANATION: Instance variables store the objects states, these are important parts that must be held throughtout the class
 * */

    // instance variables
    private String name;
    private String surname;
    private String phone_number;
    private double cash;

/** CHECK:I am able to create constructors and understand what a constructor does
 *  EXPLANATION: Constructors initialise objects, similar to a method that's called when an instance of an object is created
 * */ 

    // constructor
    /** CHECK: I can add other necessary functions for the class and am able to take in other class parameters e.g testFunction(Driver D, String s)
     *  EXPLANATION: Takes in other funtions
     */
    Person(String name, String surname, String phone_number, double cash) {
        this.name = name;
        this.surname = surname;
        this.phone_number = phone_number;
        this.cash = cash;
    }

    // methods

/**
 * CHECK: I know how to create setters and getters
 * EXPLANATION: Setters and getters protect your data; in each instance variable, getters return its value and setters set or update the value
 * 
 * CHECK: I know why I am creating setters & getters (ie. I understand encapsulation?)
 * EXPLANATION: Encapsulation is wrapping of variables and code acting on methods  together as a single unit, it is hiding data or sensitive details from users, by making the instances private and provide public set & get methods
 */

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setSurame(String surname) {
        this.surname = surname;
    }

    public void setPhoneNumber(String phone_number) {
        this.phone_number = phone_number;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }



    // getters
    public String getName() {
        return this.name;
    }

    public String getSurame() {
        return this.surname;
    }

    public String getPhoneNumber() {
        return this.phone_number;
    }

    public double getCash() {
        return this.cash;
    }

/**
 * CHECK: I know how to create a toString() function
 * EXPLANATION: On the off chance that the method takes a primitive data(int, char or String) as an argument, then the st
 * ring representing that data is returned. If the method takes two arguments, then a String representation of the first argument in the radix9base, # digits) specified by the second argument will be returned.
 * 
 * CHECK: I know what a toString() function does
 * EXPLANATION: The toString function returns the string representation of the object
 */

    public String toString() {
        return this.name + " " + this.surname;
    }
}