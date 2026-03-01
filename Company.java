abstract class Employee {
    String name;
    int id;
    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
   abstract double calculateSalary();
}
class FullTimeEmployee extends Employee {
    double monthlySalary;
    FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }
    double calculateSalary() {
        return monthlySalary;
    }
}
class PartTimeEmployee extends Employee {
    int hours;
    double rate;
PartTimeEmployee(String name, int id, int hours, double rate) {
        super(name, id);
        this.hours = hours;
        this.rate = rate;
    }
double calculateSalary() {
        return hours * rate;
    }
}
public class Company {
    public static void main(String[] args) {
        FullTimeEmployee f = new FullTimeEmployee("Ravi", 101, 50000);
        PartTimeEmployee p = new PartTimeEmployee("Anu", 102, 5, 500);
        System.out.println("Full Time Salary: " + f.calculateSalary());
        System.out.println("Part Time Salary: " + p.calculateSalary());
    }
}