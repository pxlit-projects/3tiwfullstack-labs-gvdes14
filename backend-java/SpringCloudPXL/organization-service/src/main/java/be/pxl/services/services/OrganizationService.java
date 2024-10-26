package be.pxl.services.services;

import be.pxl.services.domain.Organization;
import be.pxl.services.repository.OrganizationRepository;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrganizationService implements IOrganizationService {

    private final OrganizationRepository organizationRepository;

    private static final Logger log = LoggerFactory.getLogger(OrganizationService.class);


    //todo : Implement the

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
