/**
 * Subclass of Person
 *
 * CHECK: I understand Polymorphism
 * EXPLANATION: Polymorphism is the ability of an object to take on many forms, occurs when we have many classes that are related to each other by inheritence
 * 
 * CHECK: I know how to use Polymorphism
 * EXPLANATION: There is a parent class and child classes related to that class, make parent (main) class and child (subclasses) classes
 */

public class Driver extends Person {

/** CHECK: I can create Instance variables and am able to to use another class type variable in another class
 *  EXPLANATION: Instance variables store the objects states, these are important parts that must be held throughtout the class
 * */

    //instance variables
    Car car;
    String licenseID;

/** CHECK:I am able to create constructors and understand what a constructor does
 *  EXPLANATION: Constructors initialise objects, similar to a method that's called when an instance of an object is created
 * */ 

    //constructor
    Driver(Car car, String licenseID, String name, String surname, String phone_number, int cash) {
        super(name, surname, phone_number, cash);
        this.car = car;
        this.licenseID = licenseID;
        

    }

    //method
/**
 * CHECK: I know how to create setters and getters
 * EXPLANATION: Setters and getters protect your data; in each instance variable, getters return its value and setters set or update the value
 * 
 * CHECK: I know why I am creating setters & getters (ie. I understand encapsulation?)
 * EXPLANATION: Encapsulation is wrapping of variables and code acting on methods  together as a single unit, it is hiding data or sensitive details from users, by making the instances private and provide public set & get methods
 */

    //setters
    public void setCar(Car car) {
        this.car = car;
    }

    public void setlicenseID(String licenseID){
        this.licenseID = licenseID;
    }

    public String getSurname() {
		return null;
	}

    public Car getCar(){
        return this.car;
    }

    public String getlicenseID(){
        return  this.licenseID;
    }

/**
 * CHECK: I know how to create a toString() function
 * EXPLANATION: On the off chance that the method takes a primitive data(int, char or String) as an argument, then the st
 * ring representing that data is returned. If the method takes two arguments, then a String representation of the first argument in the radix9base, # digits) specified by the second argument will be returned.
 * 
 * CHECK: I know what a toString() function does
 * EXPLANATION: The toString function returns the string representation of the object
 */

    public String toString(){
        return super.toString() + " and I am a driver";
    }

	
    
}