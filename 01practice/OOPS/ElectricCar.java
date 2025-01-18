// Define the parent class Automobile
class Automobile {
    // Declare a private method drive that returns a String
    private String drive() {
        // Return a message indicating the vehicle is being driven
        return "Driving vehicle";
    }
}

// Define a subclass Car that extends Automobile
class Car extends Automobile {
    // Declare a protected method drive that overrides the private method in Automobile
    protected String drive() {
        // Return a message indicating the car is being driven
        return "Driving car";
    }
}

// Define a public subclass ElectricCar that extends Car
public class ElectricCar extends Car {
    // Override the drive method from Car, marking it as final
    @Override
    public final String drive() {
        // Return a message indicating the electric car is being driven
        return "Driving electric car";
    }

    // Main method to execute the program
    public static void main(String[] wheels) {
        // Create an instance of ElectricCar and assign it to a Car reference
        final Car car = new ElectricCar();
        // Call the drive method on the Car reference, which actually invokes ElectricCar's drive method
        System.out.print(car.drive());
    }
}

