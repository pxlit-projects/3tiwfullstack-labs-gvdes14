package be.pxl.services.services;
import be.pxl.services.domain.Employee;

import java.util.List;
import java.util.Optional;

public interface IEmployeeService {
    List<Employee> getAllEmployees();

    void add( Employee employee );

    Optional<Employee> findById(Long id);

    List<Employee> findAll();

    Optional<Employee> findByOrganization(Long organizationId);

    Optional<Employee> findByDepartment(Long organizationId);


}
