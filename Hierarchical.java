class Vehicle{
    Vehicle(){
        System.out.println("this is a vehicle");
    }
}
class Car extends Vehicle{
    Car(){
        System.out.println("this vehicle is a car");
    }
}
class Bus extends Vehicle{
    Bus(){
        System.out.println("this vehicle is a bus");
    }
}
public class Hierarchical {
    public static void main(String[] args) {
        new Car();
        new Bus();
    }
}
