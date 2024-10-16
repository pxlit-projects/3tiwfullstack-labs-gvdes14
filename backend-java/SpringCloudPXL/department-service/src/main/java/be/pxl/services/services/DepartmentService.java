package be.pxl.services.services;

import be.pxl.services.domain.Department;
import be.pxl.services.repository.DepartmentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DepartmentService implements IDepartmentService {

    private final DepartmentRepository departmentRepository ;


    @Override
    public void add( Department department ) {
        departmentRepository.save(department);
    }

    @Override
    public Department findById(Long id) {
        return null;
    }

    @Override
    public List<Department> findAll() {
        return List.of();
    }

    @Override
    public List<Department> findByOrganization(String organizationId) {
        return List.of();
    }

    @Override
    public List<Department> findByOrganizationWithEmployees(Long organizationId) {
        return List.of();
    }
}
