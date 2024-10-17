package be.pxl.services.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name="department")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long organizationId;
    private String name ;

    // Todo Check this config, info from ChatGPT ! --> Check with Tom

    @ElementCollection
    @CollectionTable(name = "department_employees", joinColumns = @JoinColumn(name = "department_id"))
    @Column(name = "employee_id")
    private List<Long> employees;

    private String position;

}