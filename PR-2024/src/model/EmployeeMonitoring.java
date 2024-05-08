package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmployeeMonitoring {
    private final List<Employee> employees;

    public EmployeeMonitoring() {
        this.employees = new ArrayList<>();
    }

    // Метод для добавления сотрудника в мониторинг
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Метод для удаления сотрудника из мониторинга
    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    // Метод для поиска сотрудника по имени
    public Employee findEmployeeByName(String firstName, String lastName) {
        for (Employee employee : employees) {
            if (employee.getFirstName().equalsIgnoreCase(firstName) &&
                    employee.getLastName().equalsIgnoreCase(lastName)) {
                return employee;
            }
        }
        return null; // Сотрудник не найден
    }

    // Метод для поиска сотрудников по должности
    public List<Employee> findEmployeesByPosition(String position) {
        List<Employee> foundEmployees = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getPosition().equalsIgnoreCase(position)) {
                foundEmployees.add(employee);
            }
        }
        return foundEmployees;
    }

    // Метод для получения всех сотрудников
    public List<Employee> getAllEmployees() {
        return employees;
    }

    public static void main(String[] args) {
        EmployeeMonitoring monitoring = new EmployeeMonitoring();

        // Добавляем несколько сотрудников
        monitoring.addEmployee(new Employee("Евгений", "Громов", LocalDate.of(2005, 9, 22), "Менеджер", "egromov", 1001));
        monitoring.addEmployee(new Employee("Алексей", "Петров", LocalDate.of(1995, 10, 25), "Разработчик", "apetrov", 1002));
        monitoring.addEmployee(new Employee("Мария", "Сидорова", LocalDate.of(1988, 6, 12), "Тестировщик", "msidorova", 1003));

        // Поиск сотрудника по имени
        Employee foundEmployee = monitoring.findEmployeeByName("Евгений", "Громов");
        if (foundEmployee != null) {
            System.out.println("Найден сотрудник: " + foundEmployee.getFirstName() + " " + foundEmployee.getLastName());
        } else {
            System.out.println("Сотрудник не найден");
        }

        // Поиск сотрудников по должности
        List<Employee> developers = monitoring.findEmployeesByPosition("Разработчик");
        System.out.println("Разработчики:");
        for (Employee developer : developers) {
            System.out.println(developer.getFirstName() + " " + developer.getLastName());
        }
    }
}
