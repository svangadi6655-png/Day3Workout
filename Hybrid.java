class Animal{
    Animal(){
        System.out.println("animal eats");
    }
}
class Dog extends Animal{
    Dog(){
        System.out.println("dog is created");
    }
}
class Puppy extends Dog{
    Puppy(){
        System.out.println("puppy weeps");
    }
}
class Cat extends Animal{
    Cat(){
        System.out.println("cat meows");
    }
}
public class Hybrid {
    public static void main(String[] args) {
        new Puppy();
        new Cat();
    }
}
