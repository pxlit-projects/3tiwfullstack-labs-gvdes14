package be.pxl.services.controller;

import be.pxl.services.services.IEmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employee")
@RequiredArgsConstructor
public class EmployeeController {

//    @Autowired OPTIE 1
    private final IEmployeeService employeeService ;

    /* OPTIE 2
    public EmployeeController(IEmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    */

    @GetMapping
    public ResponseEntity getEmployees() {
        return new ResponseEntity(employeeService.getAllEmployees(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity add(){
        return new ResponseEntity(HttpStatus.CREATED); // Todo Post schrijven
    }

    @GetMapping("/{id}")
    public ResponseEntity findById (@PathVariable Long id){
        return null ; // todo : schrijven
    }

    @GetMapping("/department/{departmentId}")
    public ResponseEntity findByDepartmentId(@PathVariable Long departmentId){
        return null ;
    }

    @GetMapping("/organization/{organizationId}")
    public ResponseEntity findByOrganizationId(@PathVariable Long organizationId){
        return null ;
    }

}
