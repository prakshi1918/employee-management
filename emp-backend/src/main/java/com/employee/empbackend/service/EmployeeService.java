package com.employee.empbackend.service;

import ch.qos.logback.core.model.conditional.ElseModel;
import com.employee.empbackend.dto.EmployeeDto;
import com.employee.empbackend.entity.Employee;

import java.util.List;

public interface EmployeeService {
    Employee createEmployee(Employee employee);

    EmployeeDto getEmployeeById(Long employeeId);

    List<EmployeeDto> getAllEmployees();

    EmployeeDto updateEmployee (Long employeeId, EmployeeDto updatedEmployee);

    void deleteEmployee(Long employeeId);
}
