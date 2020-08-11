/**
 * CHECK: I know how to use ArrayLists
 * EXPLANATION: ArrayList class uses a dynamic array for storing the elements,  It inherits the AbstractList class and implements List interface.
 * 
 * CHECK: I know how to use arrays
 * EXPLANATION:- Declare a variable to hold the array.
               - Create a new array object and assign it to the array variable.
               - Store things in that array
 */
	
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.Random;
import com.google.gson.*;

/**
 * CHECK: I understand Polymorphism
 * EXPLANATION: Polymorphism is the ability of an object to take on many forms, occurs when we have many classes that are related to each other by inheritence
 * 
 * CHECK: I know how to use Polymorphism
 * EXPLANATION: There is a parent class and child classes related to that class, make parent (main) class and child (subclasses) classes
 */


public class UberRide extends Ride {

/** CHECK: I can create Instance variables and am able to to use another class type variable in another class
 *  EXPLANATION: Instance variables store the objects states, these are important parts that must be held throughtout the class
 * */

    //instance variables
    String startpoint;
    String endpoint;
    double price;
    double rate;
    Driver driver;
    Passenger passenger;
    double distance;


    UberRide() {}

/** CHECK:I am able to create constructors and understand what a constructor does
 *  EXPLANATION: Constructors initialise objects, similar to a method that's called when an instance of an object is created
 * */ 

    /** CHECK: I can add other necessary functions for the class and am able to take in other class parameters e.g testFunction(Driver D, String s)
     *  EXPLANATION: Takes in other funtions
     */
    UberRide(final String startpoint, final String endpoint, final Passenger passenger){
        super();
        this.startpoint = startpoint;
        this.endpoint = endpoint;
        this.price = price;
        this.rate = rate;
        this.driver = null;
        this.passenger = passenger;
    }


    public Driver assignDriver() {
        //connect to database and fetch list of drivers DB
        //call the function that takes X/XL - from user
            /**
             * read data from csv
             * create car object using last 4 columns
             * create driver object using first 5 columns
             * add driver to Driver[]
             */

        /**CHECK: I have the ability to call created class objects e.g Car c = new Car()
         * */
        //call the function that return random driver
        final Database DB = new Database();
        DB.getDriversArray();
        final Driver[] drivers = DB.getArrayByVehicleType("XL");
        // DB.printArray(drivers);


        final Random ran = new Random();
        final int randomIndex = ran.nextInt(drivers.length-1);


        this.driver = drivers[randomIndex];
        
        return drivers[randomIndex];
    }
    
    public void completePayment(final Driver driver, final Passenger passenger) {
       /**
        * Add money to driver
        * Deduct money from passenger
        */


        
        final double driverBalance = driver.getCash();
        driver.setCash(driverBalance + this.price);
        System.out.println("Adding R" + (int)this.price + " to driver account. Account bal: R" + driver.getCash());


        final double passengerBalance = passenger.getCash();
        passenger.setCash(passengerBalance - this.price);
        System.out.println("Deducting R" + (int)this.price + " from passenger account. Account bal: R" + passenger.getCash());
    }


    public double calculateDistance(final String startingPoint, final String endingPoint) {
        double distance = 0.0;
        try {
            final UberRide uberRide = new UberRide();
            distance = uberRide.MyGETRequest(startingPoint, endingPoint);
        }
        catch(final IOException ex){
            System.out.println (ex.toString());
        }


        this.distance = distance/1000;
        System.out.println("The distance is: " + this.distance + " km");
        return (distance/1000);
    }
    public double calculateCost(final String startingPoint, final String endingPoint) {


        double cost = 0.0;
        final UberRide uberRide = new UberRide();
        final double distance = uberRide.calculateDistance(startingPoint, endingPoint);
        cost = distance * this.driver.getCar().getBaseRate();
        this.price = cost;
        System.out.println("The cost is: R" + (int)this.price);
        return cost;
    }
    public double MyGETRequest(final String startingPoint, final String endingPoint) throws IOException {
        final URL urlForGetRequest = new URL("https://maps.googleapis.com/maps/api/distancematrix/json?origins=" + startingPoint +",SA&destinations=" + endingPoint + ",SA&departure_time=now&key=AIzaSyCs2UIPeA_ygj6aDL45ta9ZdJu3Mo1PIOs");
        String readLine = null;
        final HttpURLConnection conection = (HttpURLConnection) urlForGetRequest.openConnection();
        conection.setRequestMethod("GET");
        final int responseCode = conection.getResponseCode();




        final UberRide uberRide = new UberRide();
        double distance = 0.0;
        if (responseCode == HttpURLConnection.HTTP_OK) {
            final BufferedReader in = new BufferedReader(
                new InputStreamReader(conection.getInputStream()));
            final StringBuffer response = new StringBuffer();
            while ((readLine = in.readLine()) != null) {
                response.append(readLine);
            } in .close();


            final String distanceAsString = uberRide.retrieveDistanceAsString(response.toString());
            distance = Double.parseDouble(distanceAsString);
        } else {
            // response = error;
            System.out.println("GET NOT WORKED");
        }

        return distance;
    }
    /**
     * converts jsonstring to gson object, then it returns the text length
     * can access elements using: 
     * getAsJsonObject
     * getAsJsonArray
     */
    public String retrieveDistanceAsString(final String jsonString) {
        final GsonBuilder builder = new GsonBuilder(); 
        builder.setPrettyPrinting(); 
        final Gson gson = builder.create(); 
        JsonObject jsonObject = gson.fromJson(jsonString, JsonObject.class); 
        JsonArray jsonArray = jsonObject.getAsJsonArray("rows");
           
        JsonElement je = null;
        Iterator<JsonElement> iterator = jsonArray.iterator();
         while(iterator.hasNext()) {
             je = iterator.next();
             jsonArray = je.getAsJsonObject().getAsJsonArray("elements");
         }


         iterator = jsonArray.iterator();
         while(iterator.hasNext()) {
             je = iterator.next();
             jsonObject = je.getAsJsonObject().get("distance").getAsJsonObject();

         }

         return jsonObject.get("value")+"";


    }
}






































        









        


        




