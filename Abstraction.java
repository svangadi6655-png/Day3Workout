abstract class Student{
    abstract void study();
        void attendclass(){
            System.out.println("attenting class");
        }
    }
class Section extends Student{
    @Override
    void study(){
 System.out.println("studying for exams");
    }
}
public class Abstraction{
    public static void main(String[] args) {
        Section sc=new Section();
        sc.attendclass();
        sc.study();
    }
}