package be.pxl.services.services;
import be.pxl.services.domain.Employee;
import be.pxl.services.domain.dto.EmployeeRequest;
import be.pxl.services.domain.dto.EmployeeResponse;

import java.util.List;
import java.util.Optional;

public interface IEmployeeService {
    List<EmployeeResponse> getAllEmployees();

    void add( Employee employee );

    Optional<Employee> findById(Long id);

    List<Employee> findAll();

    Optional<Employee> findByOrganization(Long organizationId);

    Optional<Employee> findByDepartment(Long organizationId);

    void addEmployee(EmployeeRequest employeeRequest);
}
