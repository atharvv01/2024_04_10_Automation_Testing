package OOPS;
//Parent class representing a Vehicle
//Parent class representing a Vehicle
class Vehicle {
 protected String brand;

 // Constructor to initialize the brand
 public Vehicle(String brand) {
     this.brand = brand;
 }

 // Method to display vehicle information
 public void displayInfo() {
     System.out.println("Vehicle brand: " + brand);
 }
}

//Child class Car inheriting from Vehicle
class Car extends Vehicle {
 private String model;

 // Constructor to initialize brand and model
 public Car(String brand, String model) {
     super(brand); // Call superclass constructor
     this.model = model;
 }

 // Method to display car information
 public void displayCarInfo() {
     System.out.println("Car: " + brand + " " + model);
 }
}

//Class representing a Person with encapsulation
class Person {
 private String name;
 private int age;

 // Constructor to initialize name and age
 public Person(String name, int age) {
     this.name = name;
     this.age = age;
 }

 // Getter for name
 public String getName() {
     return name;
 }

 // Setter for age with encapsulation (age cannot be negative)
 public void setAge(int age) {
     if (age > 0) {
         this.age = age;
     }
 }

 // Method to display person information
 public void displayInfo() {
     System.out.println("Name: " + name + ", Age: " + age);
 }
}

//Main class named OOP
public class oops {
 public static void main(String[] args) {
     // Create a new Car object
     Car myCar = new Car("Toyota", "Corolla");
     // Call method from Vehicle class (inheritance)
     myCar.displayInfo();    // Output: Vehicle brand: Toyota
     // Call method from Car class
     myCar.displayCarInfo(); // Output: Car: Toyota Corolla

     // Create a new Person object
     Person person = new Person("John", 30);
     // Call getter method
     System.out.println("Person's Name: " + person.getName()); // Output: John
     // Call setter method (encapsulation)
     person.setAge(31);
     // Call method to display person information
     person.displayInfo(); // Output: Name: John, Age: 31

     // Demonstrating polymorphism
     // Creating an array of Vehicle objects
     Vehicle[] vehicles = new Vehicle[2];
     vehicles[0] = new Car("Honda", "Civic");
     vehicles[1] = new Car("Ford", "Fusion");

     // Loop through the array and call displayInfo method
     for (Vehicle vehicle : vehicles) {
         vehicle.displayInfo(); // Calls displayInfo of Car (polymorphism)
     }
 }
}
