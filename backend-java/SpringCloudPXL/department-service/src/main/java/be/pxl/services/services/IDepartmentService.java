package be.pxl.services.services;

import be.pxl.services.domain.Department;
import be.pxl.services.domain.dto.DepartmentRequest;
import be.pxl.services.domain.dto.DepartmentResponse;

import java.util.List;
import java.util.Optional;

public interface IDepartmentService {

    void add(Department department);

    Department findById(Long id);

    List<DepartmentResponse> findAll();

    Optional<Department> findByOrganizationId(Long organizationId);

    Optional<Department> findByOrganizationIdWithEmployees(Long organizationId);

    void addDepartment(DepartmentRequest departmentRequest);
}
