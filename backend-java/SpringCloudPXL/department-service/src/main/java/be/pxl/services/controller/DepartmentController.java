package be.pxl.services.controller;

import be.pxl.services.domain.Department;
import be.pxl.services.services.IDepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/department/")
@RequiredArgsConstructor
public class DepartmentController {

    private final IDepartmentService departmentService ;

    @PostMapping
    public ResponseEntity add(@RequestBody Department department) {
        departmentService.add(department);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable Long id) {
        return new ResponseEntity(departmentService.findById(id), HttpStatus.OK);
    }


    @GetMapping("/")
    public ResponseEntity findAll() {
        return new ResponseEntity(departmentService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/organization/{organizationId}")
    public ResponseEntity findByOrganization(@PathVariable String organizationId) {
        return new ResponseEntity (departmentService.findByOrganization(organizationId), HttpStatus.OK);
    }

    @GetMapping("/organization/{organizationId}/with-employees")
    public ResponseEntity findByOrganizationWithEmployees(@PathVariable Long organizationId) {
        return new ResponseEntity(departmentService.findByOrganizationWithEmployees(organizationId), HttpStatus.OK);
    }

}
