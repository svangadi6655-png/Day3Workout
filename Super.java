class Parent{
    int x=10;
}
class Child extends Parent{
    int x=20;
    void show(){
        System.out.println("child x: "+x);
        System.out.println("parent x: "+super.x);
    }
}
public class Super {
    public static void main(String[] args) {
        Child obj=new Child();
        obj.show();
    }
}
