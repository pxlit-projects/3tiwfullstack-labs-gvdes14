package be.pxl.services.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name="organisation")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Organization {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String address;
    // TODO : check the lists in a micriservice
    //private List<Employee> employees ;
    //private List<Department> departments;
}
