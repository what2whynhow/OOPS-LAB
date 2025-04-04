class Employee {
    private String name;
    private double salary;

    // Constructor
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary cannot be negative!");
        }
    }

    void display() {
        System.out.println("Name: " + name + ", Salary: $" + salary);
    }
}

public class EmpEncap {
    public static void main(String[] args) {
        Employee emp = new Employee("Alice", 50000);
        emp.display();

        emp.setSalary(60000);
        System.out.println("Updated Salary for " + emp.getName() + ": $" + emp.getSalary());
    }
}