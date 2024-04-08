package com.employee.empbackend.service;

import ch.qos.logback.core.model.conditional.ElseModel;
import com.employee.empbackend.entity.Employee;

import java.util.List;

public interface EmployeeService {
    Employee createEmployee(Employee employee);

    Employee getEmployeeById(Long employeeId);

    List<Employee> getAllEmployees();

    Employee updateEmployee (Long employeeId, Employee updatedEmployee);

    void deleteEmployee(Long employeeId);
}
