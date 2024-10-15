package be.pxl.services.controller;

import be.pxl.services.services.IEmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/department")
@RequiredArgsConstructor
public class DepartmentController {

    private final IEmployeeService employeeService;

    //todo : implement controller calls

    @PostMapping("/")
    public ResponseEntity add() {
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).body("This method is not yet implemented.");

    }

    @GetMapping("/{id}")
     public ResponseEntity findById(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).body("This method is not yet implemented.");

     }

    @GetMapping("/")
    public ResponseEntity findAll() {
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).body("This method is not yet implemented.");

    }

    @GetMapping("/organization/{organizationId}")
     public ResponseEntity findByOrganization(@PathVariable String organizationId) {
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).body("This method is not yet implemented.");

     }


    @GetMapping("/organization/{organizationId}/with-employees")
    public ResponseEntity findByOrganizationWithEmployees(@PathVariable String organizationId) {
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).body("This method is not yet implemented.");

    }


}
