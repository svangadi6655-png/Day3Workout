class Parent{
    Parent(){
        System.out.println("parent method");
    }
}
class Child extends Parent{
    Child(){
        super();
        System.out.println("child method");

    }
}
public class Superconstructor{
    public static void main(String[] args) {
    new Child();
    }
}