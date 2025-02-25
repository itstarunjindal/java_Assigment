package oop;

public class Employee {
    String name;
    int id;
    int salary;
    Employee(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Id: " + this.id);
        System.out.println("Salary: " + this.salary);
    }
    public static void main(String[] args) {
        Employee emp = new Employee("Varun",1, 10000);
        emp.displayDetails();
    }
}
