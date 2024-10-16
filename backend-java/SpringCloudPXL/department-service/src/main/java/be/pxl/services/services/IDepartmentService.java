package be.pxl.services.services;

import be.pxl.services.domain.Department;

import java.util.List;

public interface IDepartmentService {

    void add(Department department);

    Department findById(Long id);

    List<Department> findAll();

    List<Department> findByOrganization(String organizationId);

    List<Department> findByOrganizationWithEmployees(Long organizationId);
}
