package be.pxl.services.domain.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeResponse {
    private long organizationId ;
    private long departmentId ;
    private String name ;
    private int age ;
    private String position ;
}
