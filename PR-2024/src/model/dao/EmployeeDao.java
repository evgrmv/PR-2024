package model.dao;

import model.Employee;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {

    public List<Employee> get_all_employee(){
        List<Employee> employeeList = new ArrayList();
        //todo создать несколько пользователей (ученики 81/2021)
        Employee employee1 = new Employee("Евгений", "Громов", LocalDate.of(2005, 9, 22), "Менеджер", "egromov", 1001);
        Employee employee2 = new Employee("Алексей", "Петрова", LocalDate.of(1995, 10, 25), "Разработчик", "apetrov", 1002);
        Employee employee3 = new Employee("Мария", "Сидорова", LocalDate.of(1988, 6, 12), "Тестировщик", "msidorov", 1003);

        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        return employeeList;
    }
    public void deleteEmployee(int employee_id){

    }
}
