package com.employee.empbackend.mapper;


import com.employee.empbackend.dto.EmployeeDto;
import com.employee.empbackend.entity.Employee;

public class EmployeeMapper {

    public static EmployeeDto mapToEmployeeData(Employee employee){
        return new EmployeeDto(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmailId()
        );
    }
    public static Employee mapToEmployee(EmployeeDto employeeDto){
        return new Employee(
            employeeDto.getId(),
                employeeDto.getFirstName(),
                employeeDto.getLastName(),
                employeeDto.getEmailId()
        );
    }
}
