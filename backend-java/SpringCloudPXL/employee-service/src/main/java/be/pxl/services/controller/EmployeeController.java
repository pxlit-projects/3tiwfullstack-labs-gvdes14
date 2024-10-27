package be.pxl.services.controller;

import be.pxl.services.domain.Employee;
import be.pxl.services.domain.dto.EmployeeRequest;
import be.pxl.services.services.IEmployeeService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/api/employee")
@RequiredArgsConstructor
public class EmployeeController {

    private static final Logger log = LoggerFactory.getLogger(EmployeeController.class);


    //    @Autowired OPTIE 1
    private final IEmployeeService employeeService;

    /* OPTIE 2
    public EmployeeController(IEmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    */

    @GetMapping
    public ResponseEntity getEmployees() {
        return new ResponseEntity(employeeService.getAllEmployees(), HttpStatus.OK);
    }

    //TODO : Vragen aan Tom : Bij een API call rechtstreeks naar de service, is er géén logging in de logfile. Bij gebruik maken van de GW wél.
    // Dezelfde methode wordt aangeroepen?

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addEmployee(@RequestBody EmployeeRequest employeeRequest) {
        employeeService.addEmployee(employeeRequest);
        log.info("Added employee information: {}", employeeRequest);
    }

    // todo : Check response when not ok, is this needed ?

    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable Long id) {
        var employee = employeeService.findById(id);
        log.info("Search for employee by ID {}", id);
        return new ResponseEntity(employeeService.findById(id), HttpStatus.OK);
    }

    @GetMapping("/department/{departmentId}")
    public ResponseEntity findByDepartmentId(@PathVariable Long departmentId) {
        return new ResponseEntity(employeeService.findByDepartment(departmentId), HttpStatus.OK);
    }

    @GetMapping("/organization/{organizationId}")
    public ResponseEntity findByOrganizationId(@PathVariable Long organizationId) {
        return new ResponseEntity(employeeService.findByOrganization(organizationId), HttpStatus.OK);
    }
}
