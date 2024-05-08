package view.console; //todo каким то образом переделать именнования пакетов
import model.Employee;
import model.EmployeeMonitoring;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeMonitoring monitoring = new EmployeeMonitoring();
        Controller controller = new Controller();
        boolean running = true;
        while (running) {
            System.out.println(controller.showActions());
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    controller.processActions();
                    String firstName = scanner.next();
                    String lastName = scanner.next();
                    LocalDate dateOfBirth = LocalDate.parse(scanner.next());
                    String position = scanner.next();
                    String login = scanner.next();
                    int databaseId = scanner.nextInt();
                    monitoring.addEmployee(new Employee(firstName, lastName, dateOfBirth, position, login, databaseId));
                    break;
                case 2:
                    // Удаление сотрудника
                    System.out.print("Введите имя сотрудника для удаления: ");
                    String deleteFirstName = scanner.next();
                    System.out.print("Введите фамилию сотрудника для удаления: ");
                    String deleteLastName = scanner.next();
                    Employee employeeToDelete = monitoring.findEmployeeByName(deleteFirstName, deleteLastName);
                    if (employeeToDelete != null) {
                        monitoring.removeEmployee(employeeToDelete);
                        System.out.println("Сотрудник удален.");
                    } else {
                        System.out.println("Сотрудник не найден.");
                    }
                    break;
                case 3:
                    // Поиск сотрудника по имени
                    System.out.print("Введите имя сотрудника для поиска: ");
                    String searchFirstName = scanner.next();
                    System.out.print("Введите фамилию сотрудника для поиска: ");
                    String searchLastName = scanner.next();
                    Employee foundEmployee = monitoring.findEmployeeByName(searchFirstName, searchLastName);
                    if (foundEmployee != null) {
                        System.out.println("Найден сотрудник: " + foundEmployee.getFirstName() + " " + foundEmployee.getLastName());
                    } else {
                        System.out.println("Сотрудник не найден.");
                    }
                    break;
                case 4:
                    // Поиск сотрудников по должности
                    System.out.print("Введите должность для поиска: ");

                    String searchPosition = scanner.next();
                    List<Employee> employeesByPosition = monitoring.findEmployeesByPosition(searchPosition);
                    if (!employeesByPosition.isEmpty()) {
                        System.out.println("Сотрудники с должностью '" + searchPosition + "':");
                        for (Employee employee : employeesByPosition) {
                            System.out.println(employee.getFirstName() + " " + employee.getLastName());
                        }
                    } else {
                        System.out.println("Сотрудники с должностью '" + searchPosition + "' не найдены.");
                    }
                    break;
                case 5:
                    // Показать всех сотрудников
                    List<Employee> allEmployees = monitoring.getAllEmployees();
                    if (!allEmployees.isEmpty()) {
                        System.out.println("Список всех сотрудников:");
                        for (Employee employee : allEmployees) {
                            System.out.println(employee.getFirstName() + " " + employee.getLastName() + " (" + employee.getPosition() + ")");
                        }
                    } else {
                        System.out.println("Список сотрудников пуст.");
                    }
                    break;
                case 0:
                    // Выход из программы
                    running = false;
                    System.out.println("Программа завершена.");
                    break;
                default:
                    System.out.println("Неправильный выбор. Попробуйте снова.");
                    break;
            }
        }
    }
}
