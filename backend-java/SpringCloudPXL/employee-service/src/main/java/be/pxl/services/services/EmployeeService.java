package be.pxl.services.services;

import be.pxl.services.domain.Employee;
import be.pxl.services.repository.DepartmentRepository;
import be.pxl.services.repository.EmployeeRepository;
import be.pxl.services.repository.OrganizationRepository;
import jdk.jshell.spi.ExecutionControl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService implements IEmployeeService{

    private final EmployeeRepository employeeRepository ;
    private final DepartmentRepository departmentRepository ;
    private final OrganizationRepository organizationRepository ;

    @Override
    public List<Employee> getAllEmployees() {
//        return employeeRepository.findAll();
        return null ;
    }
}
