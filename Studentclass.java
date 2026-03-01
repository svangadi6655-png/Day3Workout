class Student {
    private String name;
    private int marks;
void setName(String name) {
        this.name = name;
    }
void setMarks(int marks) {
        this.marks = marks;
    }
String getName() {
        return name;
    }
int getMarks() {
        return marks;
    }
char calculateGrade() {
        if (marks >= 80) return 'A';
        else if (marks >= 60) return 'B';
        else if (marks >= 40) return 'C';
        else return 'F';
    }
}
class GraduateStudent extends Student {
    int bonus = 5;
    char calculateGrade() {
        int total = getMarks() + bonus;
         if (total >= 80) return 'A';
        else if (total >= 60) return 'B';
        else if (total >= 40) return 'C';
        else return 'F';
    }
}
public class Studentclass {
    public static void main(String[] args) {
        GraduateStudent g = new GraduateStudent();
        g.setName("Ravi");
        g.setMarks(75);
        System.out.println("Name: " + g.getName());
        System.out.println("Marks: " + g.getMarks());
        System.out.println("Grade: " + g.calculateGrade());
    }
}