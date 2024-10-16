package be.pxl.services.repository;

import be.pxl.services.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    Optional<Employee> findByOrganizationId(Long organizationId);

    Optional<Employee> findByDepartmentId(Long departmentId);
}
