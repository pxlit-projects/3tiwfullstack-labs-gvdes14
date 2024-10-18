package be.pxl.services.services;

import be.pxl.services.domain.Organization;
import be.pxl.services.repository.OrganizationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrganizationService implements IOrganizationService {

    private final OrganizationRepository organizationRepository;

    @Override
    public Organization findById(Long id) {
        return organizationRepository.findById(id).orElse(null);
    }

    @Override
    public Organization findByIdWithDepartments(Long id) {
        // todo : Adapt this
        return organizationRepository.findById(id).orElse(null);
    }

    @Override
    public Organization findByIdWithDepartmentsAndEmployees(Long id) {
        // todo : Adapt this
        return organizationRepository.findById(id).orElse(null);
    }

    @Override
    public Organization findByIdWithEmployees(Long id) {
        // todo : Adapt this
        return organizationRepository.findById(id).orElse(null);
    }
}
