package view.console;

import model.Employee;

import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;

//todo
public class Controller {

    private model.EmployeeMonitoring EmployeeMonitoring;

    public static String showActions() {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("Меню:");
        stringbuilder.append(System.lineSeparator());
        stringbuilder.append("1. Добавить сотрудника");
        stringbuilder.append(System.lineSeparator());
        stringbuilder.append("2. Удалить сотрудника");
        stringbuilder.append(System.lineSeparator());
        stringbuilder.append("3. Поиск сотрудника по имени");
        stringbuilder.append(System.lineSeparator());
        stringbuilder.append("4. Поиск сотрудников по должности");
        stringbuilder.append(System.lineSeparator());
        stringbuilder.append("5. Показать всех сотрудников");
        stringbuilder.append(System.lineSeparator());
        stringbuilder.append("0. Выйти из программы");
        stringbuilder.append(System.lineSeparator());
        stringbuilder.append("Выберите действие: ");
        return stringbuilder.toString();
    }
    public void processActions(Employee employee, int action){
        switch (action)
        {
            case 1:
                return EmployeeMonitoring.addEmployee(employee);
            case 2:
                return EmployeeMonitoring.removeEmployee(employee);
            case 3:
                return EmployeeMonitoring.findEmployeeByName(employee);
            case 4:
                return EmployeeMonitoring.findEmployeesByPosition(employee);
            case 5:
                return EmployeeMonitoring.getAllEmployees(employee);
            case 0:
                LOGGER.info("Программа завершена.");
                return false;
            default:
                throw new IllegalArgumentException("Неверный выбор.");
        }
    }
}

