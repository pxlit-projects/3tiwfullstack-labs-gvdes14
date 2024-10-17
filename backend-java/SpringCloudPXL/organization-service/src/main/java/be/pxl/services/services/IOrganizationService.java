package be.pxl.services.services;

import be.pxl.services.domain.dto.Organization;
import be.pxl.services.domain.dto.OrganizationResponse;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IOrganizationService {

    Organization findById(Long id);

    Organization findByIdWithDepartments(Long id);

    Organization findByIdWithDepartmentsAndEmployees(Long id);

    Organization findByIdWithEmployees(Long id);
}
