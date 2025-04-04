// Base class
class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("Name: " + name + ", Salary: $" + salary);
    }
}

// Derived class (inherits from Employee)
class Manager extends Employee {
    String department;

    Manager(String name, double salary, String department) {
        super(name, salary); // Call parent constructor
        this.department = department;
    }

    void displayManager() {
        display(); // Call parent method
        System.out.println("Department: " + department);
    }
}

public class EmpManagerSI1 {
    public static void main(String[] args) {
        Manager manager = new Manager("John Doe", 60000, "IT");
        manager.displayManager();
    }
}