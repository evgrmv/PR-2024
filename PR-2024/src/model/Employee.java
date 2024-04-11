package model;
//todo поменять age на дату рождения и sallary убрать
public class Employee {
    private String firstName;
    private String lastName;
    private int age;
    private String position;
    private double salary;

    public Employee(String firstName, String lastName, int age, String position, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.position = position;
        this.salary = salary;
    }

    // Методы для установки и получения значений полей
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Евгений", "Громов", 24, "Менеджер", 5000.0);
        System.out.println(employee.getFirstName());  // Выводит "John"
    }
}

