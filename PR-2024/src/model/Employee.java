package model;
import java.time.LocalDate;
//todo добавить Login и ID базы данных
public class Employee {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String position;
    private String login;
    private int databaseId;

    public Employee(String firstName, String lastName, LocalDate dateOfBirth, String position, String login, int databaseId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.position = position;
        this.login = login;
        this.databaseId = databaseId;
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

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getLogin() {
        return login;
    }

    public void setDatabaseId(int databaseId) {
        this.databaseId = databaseId;
    }

    public int getDatabaseId() {
        return databaseId;
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Евгений", "Громов", LocalDate.of(2005, 9, 22), "Менеджер", "egromov", 1001);
        System.out.println(employee.getFirstName());  // Выводит "Евгений"
        System.out.println(employee.getLogin());  // Выводит "egromov"
        System.out.println(employee.getDatabaseId());  // Выводит 1001
    }
}
