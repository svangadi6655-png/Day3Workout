class Vehicle{
    Vehicle(){
        System.out.println("this is a vehical");
    }
}
class Fourwheeler extends Vehicle{
    Fourwheeler(){
        System.out.println("4 wheeler vehicle");
    }
}
class Car extends Fourwheeler{
    Car(){
        System.out.println("this Foue wheeler vehicle is car");
    }
}
public class Multilevel {
    public static void main(String[] args) {
        new Car();
    }
}
