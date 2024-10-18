package be.pxl.services.services;

import be.pxl.services.domain.Organization;

public interface IOrganizationService {

    Organization findById(Long id);

    Organization findByIdWithDepartments(Long id);

    Organization findByIdWithDepartmentsAndEmployees(Long id);

    Organization findByIdWithEmployees(Long id);
}
