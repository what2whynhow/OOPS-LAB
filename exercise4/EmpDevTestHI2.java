// Base class
class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    void work() {
        System.out.println(name + " is working.");
    }
}

// Derived class 1
class Developer extends Employee {
    String language;

    Developer(String name, String language) {
        super(name);
        this.language = language;
    }

    void code() {
        System.out.println(name + " is coding in " + language);
    }
}

// Derived class 2
class Tester extends Employee {
    String tool;

    Tester(String name, String tool) {
        super(name);
        this.tool = tool;
    }

    void test() {
        System.out.println(name + " is testing with " + tool);
    }
}

public class EmpDevTestHI2 {
    public static void main(String[] args) {
        Developer dev = new Developer("Alice", "Java");
        Tester tester = new Tester("Bob", "Selenium");

        dev.work();
        dev.code();

        tester.work();
        tester.test();
    }
}