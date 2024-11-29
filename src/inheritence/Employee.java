package inheritence;

public class Employee {
    String name;
    int age;
    double salary;
    String location;
    boolean goodEmployee = false;
    static String companyName = "ABC";

    Employee(String name, int age, double salary, String location) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.location = location;
    }

    void raiseSalary() {
        this.salary = this.salary + this.salary*(goodEmployee ? 0.25 : 0.1);
    }

    void printSalary() {
        System.out.println(name + " has a current CTC of " + salary);
    }
}
