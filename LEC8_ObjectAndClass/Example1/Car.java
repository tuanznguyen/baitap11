
package LEC8_ObjectAndClass.Example1;

public class Car {

    private String model;
    private int year;
    // Constructor to initialize the Car object

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }
    // Method to display car details

    public void displayDetails() {
        System.out.println("Car Model: " + model + ", Year: " + year);
    }

}
