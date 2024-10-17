package be.pxl.services.services;

import be.pxl.services.domain.Department;
import be.pxl.services.domain.dto.DepartmentRequest;
import be.pxl.services.domain.dto.DepartmentResponse;
import be.pxl.services.repository.DepartmentRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DepartmentService implements IDepartmentService {

    private final DepartmentRepository departmentRepository ;

    @Override
    public void add(Department department) {
        departmentRepository.save(department);
    }

    @Override
    public Department findById(Long id) {
        return  departmentRepository.findById(id).orElse(null);
    }

    @Override
    public List<DepartmentResponse> findAll() {
        //return departmentRepository.findAll();
        List<Department> departments = departmentRepository.findAll();
        return departments.stream().map(department -> mapToDepartmentResponse(department)).toList();
    }

    private DepartmentResponse mapToDepartmentResponse(Department department) {
        return DepartmentResponse.builder()
                .name(department.getName())
                .position(department.getPosition())
                .employees(department.getEmployees())
                .organizationId(department.getOrganizationId())
                .build();
    }

    @Override
    public Optional<Department> findByOrganizationId(Long organizationId) {
        return departmentRepository.findByOrganizationId(organizationId);
    }

    @Override
    public Optional<Department> findByOrganizationIdWithEmployees(Long organizationId) {
        return departmentRepository.findByOrganizationIdAndEmployeesIsNotEmpty( organizationId );
    }

    @Override
    public void addDepartment(DepartmentRequest departmentRequest) {
        Department department = Department.builder()
                .name(departmentRequest.getName())
                .position(departmentRequest.getPosition())
                .employees(departmentRequest.getEmployees())
                .organizationId(departmentRequest.getOrganizationId())
                .build();
        departmentRepository.save(department);
    }


}
