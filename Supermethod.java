class Parent{
    void display(){
        System.out.println("parent method");
    }
}
class Child extends Parent{
    void display(){
        System.out.println("child method");
    }
    void show(){
        super.display();
        display();
    }
}
public class Supermethod{
    public static void main(String[] args) {
        Child obj=new Child();
        obj.show();
    }
}