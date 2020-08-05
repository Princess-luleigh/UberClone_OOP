import javax.swing.tree.VariableHeightLayoutCache;
/** 
 * Subclass of Person
 */
public class Driver extends Person {
    //instance variables
    Car car;
    String licenseID;

    //constructor
    Driver(Car car, String licenseID, String name, String surname, String phone_number, int cash) {
        super(name, surname, phone_number, cash);
        this.car = car;
        this.licenseID = licenseID;
        

    }

    //method

    //setters
    public void setCar(Car car) {
        this.car = car;
    }

    public void setlicenseID(String licenseID){
        this.licenseID = licenseID;
    }

    public Car getCar(){
        return this.car;
    }

    public String getlicenseID(){
        return  this.licenseID;
    }

    public String toString(){
        return super.toString() + " and I am a driver";
    }
    
}