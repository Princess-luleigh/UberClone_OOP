/**
 * CHECK: I understand how interfaces work
 * EXPLANATION: An interface is a reference. It is similar to class. It is a collection of abstract methods. A class implements an interface, thereby inheriting the abstract methods of the interface.
 * 
 * CHECK: I understand how to use interfaces
 * EXPLANATION: The interface keyword is used to declare an interface. When a class implements an interface, it is like agreeing to perform the specific behaviors of the interface 
 */

interface Vehicle {

    public String getNumberPlate();
    public String getColor();
    public String getModel();
}