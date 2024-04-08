package com.employee.empbackend.service.impl;

import com.employee.empbackend.EmpBackendApplication;
import com.employee.empbackend.entity.Employee;
import com.employee.empbackend.exception.ResourceNotFoundException;
import com.employee.empbackend.repository.EmployeeRepository;
import com.employee.empbackend.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;
    @Override
    public Employee createEmployee(Employee employee) {
//        Employee employee = EmployeeMapper.mapToEmployee(employee);
        Employee savedEmployee = employeeRepository.save(employee);
      //  return EmployeeMapper.mapToEmployeeData(savedEmployee);
        return employeeRepository.save(employee);
    }

    @Override
    public Employee getEmployeeById(Long employeeId) {
       Employee employee = employeeRepository.findById(employeeId)
                .orElseThrow(()->new ResourceNotFoundException("Employee does not exists with given id:"+employeeId));
        return employee;
    }

    @Override
    public List<Employee> getAllEmployees() {
        List<Employee> employees = employeeRepository.findAll();
        return employees;
    }

    @Override
    public Employee updateEmployee(Long employeeId, Employee updatedEmployee) {
        Employee employee = employeeRepository.findById(employeeId).orElseThrow(
                ()->new ResourceNotFoundException("Employee does not exists with given id:"+employeeId));

        employee.setFirstName(updatedEmployee.getFirstName());
        employee.setLastName(updatedEmployee.getLastName());
        employee.setEmailId(updatedEmployee.getEmailId());

        Employee updatedEmployeeObj = employeeRepository.save(employee);
        return updatedEmployeeObj;
    }

    @Override
    public void deleteEmployee(Long employeeId) {
        Employee employee = employeeRepository.findById(employeeId)
                .orElseThrow(()->new ResourceNotFoundException("Employee does not exists with given id:"+employeeId));

        employeeRepository.deleteById(employeeId);
    }
}

