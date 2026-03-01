class Vehicle {
    String type;
Vehicle() {
        type = "Vehicle";
    }
Vehicle(String type) {
        this.type = type;
    }
void startEngine() {
        System.out.println("Engine started");
    }
}
class Car extends Vehicle {
    Car() {
        super("Car");
    }
Car(String type) {
        super(type);
    }
void startEngine() {
        System.out.println("Car engine started");
    }
}
class Bike extends Vehicle {
    Bike() {
        super("Bike");
    }
Bike(String type) {
        super(type);
    }
void startEngine() {
        System.out.println("Bike engine started");
    }
}
public class Testvehicle {
    public static void main(String[] args) {
        Car c = new Car();
        Bike b = new Bike("Sports Bike");
       c.startEngine();
        b.startEngine();
    }
}