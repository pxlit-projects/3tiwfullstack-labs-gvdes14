package be.pxl.services.services;

import be.pxl.services.domain.Employee;
import be.pxl.services.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EmployeeService implements IEmployeeService{

    private final EmployeeRepository employeeRepository ;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
//        return null ;
    }

    @Override
    public void add(Employee employee) {
        employeeRepository.save(employee);
    }


    @Override
    public Optional<Employee> findById(Long id) {
        return employeeRepository.findById(id);
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll() ;
    }

    @Override
    public Optional<Employee>findByOrganization(Long organizationId) {
        return employeeRepository.findByOrganizationId(organizationId) ;
    }

    @Override
    public Optional<Employee>findByDepartment(Long departmentId) {
        return employeeRepository.findByDepartmentId(departmentId) ;
    }
}
