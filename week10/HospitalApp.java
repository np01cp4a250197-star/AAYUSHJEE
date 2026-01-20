package week10;
public class HospitalApp
{
    public static void main(String[] args)
    {
        Doctor d1 = new Doctor(101, "Dr. Aayush", 50000," Cardiology", 15000);
        Nurse n1 = new Nurse(201, "Alika", 30000, "Night", 5000);
        System.out.println("----- Doctor Details -----");
        System.out.println(d1);
        System.out.println("Salary (Normal): " + d1.calculateSalary());
        System.out.println("Salary (With Emergency): " + d1.calculateSalary(3));

        System.out.println();

        System.out.println("----- Nurse Details -----");
        System.out.println(n1);
        System.out.println("Salary: " + n1.calculateSalary());
    }
}
