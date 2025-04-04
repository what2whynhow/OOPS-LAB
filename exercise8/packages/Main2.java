import employee.*;

public class Main2 {
    public static void main(String[] args) {
        Employee emp = new Employee("Bob", 50000);
        HRManager hr = new HRManager();

        hr.processSalary(emp);
    }
}