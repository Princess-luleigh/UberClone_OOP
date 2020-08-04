/** superclass: Person
 * 
 * Inheritence
 * 
 * Encapsulation
 */

public class Person {

    // instance 
    private String name;
    private String surname;
    private String phone_number;
    private double cash;

    // constructor
    Person(String name, String surname, String phone_number, double cash) {
        this.name = name;
        this.surname = surname;
        this.phone_number = phone_number;
        this.cash = cash;
    }

    // methods
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

}