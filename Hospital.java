abstract class Patient {
    int patientId;
    String name;
Patient(int patientId, String name) {
        this.patientId = patientId;
        this.name = name;
    }
abstract double calculateBill();
}
class InPatient extends Patient {
    int days;
    double chargePerDay;
InPatient(int id, String name, int days, double chargePerDay) {
        super(id, name);
        this.days = days;
        this.chargePerDay = chargePerDay;
    }
double calculateBill() {
        return days * chargePerDay;
    }
}
class OutPatient extends Patient {
    double consultationFee;
OutPatient(int id, String name, double consultationFee) {
        super(id, name);
        this.consultationFee = consultationFee;
    }
double calculateBill() {
        return consultationFee;
    }
}
public class Hospital {
    public static void main(String[] args) {
        Patient p1 = new InPatient(1, "Ravi", 3, 2000);
        Patient p2 = new OutPatient(2, "Anu", 500);
        System.out.println("InPatient Bill: " + p1.calculateBill());
        System.out.println("OutPatient Bill: " + p2.calculateBill());
    }
}