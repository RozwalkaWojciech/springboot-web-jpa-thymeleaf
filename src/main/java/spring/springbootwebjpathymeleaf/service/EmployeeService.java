package spring.springbootwebjpathymeleaf.service;

import spring.springbootwebjpathymeleaf.model.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

    Employee getEmployeeById(Long id);
}
