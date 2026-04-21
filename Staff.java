class Employee {
    String name, address, jobTitle;
    double salary;

    public Employee(String name, String address, double salary, String jobTitle) {
        this.name = name; this.address = address;
        this.salary = salary; this.jobTitle = jobTitle;
    }

    public double calculateBonus() { return salary * 0.05; }

    public void performanceReport() {
        System.out.println("Employee: " + name + " | Title: " + jobTitle +
                           " | Salary: " + salary + " | Bonus: " + calculateBonus());
    }
}

class Manager extends Employee {
    String projectManaged;

    public Manager(String name, String address, double salary) {
        super(name, address, salary, "Manager");
    }

    @Override
    public double calculateBonus() { return salary * 0.20; }

    public void manageProject(String project) {
        projectManaged = project;
        System.out.println(name + " is managing project: " + project);
    }
}

class Developer extends Employee {
    String programmingLanguage;

    public Developer(String name, String address, double salary, String lang) {
        super(name, address, salary, "Developer");
        this.programmingLanguage = lang;
    }

    @Override
    public double calculateBonus() { return salary * 0.15; }
}

class Programmer extends Employee {
    public Programmer(String name, String address, double salary) {
        super(name, address, salary, "Programmer");
    }

    @Override
    public double calculateBonus() { return salary * 0.10; }
}

public class Staff {
    public static void main(String[] args) {
        Manager m = new Manager("abc", "NY", 90000);
        Developer d = new Developer("lmn", "LA", 75000, "Java");
        Programmer p = new Programmer("xyz", "SF", 60000);

        m.performanceReport();
        m.manageProject(" System");
        d.performanceReport();
        p.performanceReport();
    }
}
