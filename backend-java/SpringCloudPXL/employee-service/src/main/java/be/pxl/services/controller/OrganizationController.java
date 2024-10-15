package be.pxl.services.controller;

import be.pxl.services.services.IEmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/organisation")
@RequiredArgsConstructor
public class OrganizationController {

    private final IEmployeeService employeeService;

    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).body("This method is not yet implemented.");
    }

    @GetMapping("/{id}/with-departments")
    public ResponseEntity findByIdWithDepartments(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).body("This method is not yet implemented.");
    }

    @GetMapping("/{id}/with-departments-and-employees")
    public ResponseEntity findByIdWithDepartmentsAndEmployees(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).body("This method is not yet implemented.");
    }
    @GetMapping("/{id}/with-employees")
    public ResponseEntity findByIdWithEmployees(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).body("This method is not yet implemented.");
    }


}
