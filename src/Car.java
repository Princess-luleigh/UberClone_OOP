public class Car implements Vehicle {

/** CHECK: I can create Instance variables and am able to to use another class type variable in another class
 *  EXPLANATION: Instance variables store the objects states, these are important parts that must be held throughtout the class
 * */

    //instance variables
    String numberPlate;
    String color;
    String model;
    String type;
    double base_rate;

/** CHECK:I am able to create constructors and understand what a constructor does
 *  EXPLANATION: Constructors initialise objects, similar to a method that's called when an instance of an object is created
 * */ 

    //constructor
    Car(String numberPlate, String color, String model, String type) {
        this.numberPlate = numberPlate;
        this.color = color;
        this.model = model;
        this.type = type;
        if(type.equals("XL")) {
            this.base_rate = 15.00;
        } else {
            this.base_rate = 10.00;
        }
    }

    //methods
    public String getNumberPlate() {
        return this.numberPlate;
    }

    public double getBaseRate() {
        return this.base_rate;
    }

    public String getColor() {
        return this.color;
    }
    public String getModel() {
        return this.model;
    }

    public String getVehicleType() {
        return this.type;
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
        return this.model + " car of " + this.color + " color, with number plate: " + this.numberPlate;
    }
}