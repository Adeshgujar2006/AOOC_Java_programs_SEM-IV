class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = (monthlySalary > 0.0) ? monthlySalary : 0.0;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary > 0.0) {
            this.monthlySalary = monthlySalary;
        } else {
            this.monthlySalary = 0.0;
        }
    }

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public double getMonthlySalary() { return monthlySalary; }
    
    public double getYearlySalary() { 
        return monthlySalary * 12; 
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee em1 = new Employee("lmn", "pqr", 9000.00);
        Employee em2 = new Employee("abc", "xyz", 7500.00);

        System.out.println("--- Employee Yearly Salaries (Initial) ---");
        System.out.printf("%s %s: Rs.%.2f%n", em1.getFirstName(), em1.getLastName(), em1.getYearlySalary());
        System.out.printf("%s %s: Rs.%.2f%n", em2.getFirstName(), em2.getLastName(), em2.getYearlySalary());

        em1.setMonthlySalary(em1.getMonthlySalary() * 1.10);
        em2.setMonthlySalary(em2.getMonthlySalary() * 1.10);

        System.out.println("\n--- After 10% Raise ---");
        System.out.printf("%s %s: Rs.%.2f%n", em1.getFirstName(), em1.getLastName(), em1.getYearlySalary());
        System.out.printf("%s %s: Rs.%.2f%n", em2.getFirstName(), em2.getLastName(), em2.getYearlySalary());
    }
}
