/**
 * CHECK: I understand how Abstract classes work
 * EXPLANATION: - Abstraction is a process of hiding the implementation details from the user, only the functionality will be provided to the user. 
 * 				- To create an abstract class, just use the abstract keyword before the class keyword, in the class declaration
 * 	
 * CHECK: I understand how to use abstract classes			
 * EXPLANATION: - To use an abstract class, you have to inherit it from another class, provide implementations to the abstract methods in it.
 * 
 * Makes it possible to create UberRide, TaxifyRide or BoltRide
 * 
 */
	

    public abstract class Ride {
	

	    //variables
	    String estartingPoint;
	    String endingPoint;
	

	    //methods that can be overriden
	    public abstract double calculateDistance(String startingPoint, String endingPoint);
	    public abstract Driver assignDriver();
	    public abstract double calculateCost(String startingPoint, String endingPoint);
	    public abstract void completePayment(Driver driver, Passenger passenger);
	

	 }

