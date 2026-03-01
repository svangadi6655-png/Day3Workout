interface Student{
     void study();
}
class Section implements Student{
    @Override
   public  void study(){
 System.out.println("studying for exams");
    }
}
public class Interface{
    public static void main(String[] args) {
        Section sc=new Section();
        sc.study();
    }
}
