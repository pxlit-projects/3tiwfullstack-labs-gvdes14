package be.pxl.services.domain.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.codec.multipart.DefaultPartHttpMessageReader;

import java.util.List;

@Entity
@Table(name="organization")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Organization {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long id;

    private String name;
    private String address;

    // Todo : To Check With Tom
    //private List<Employee> employees ;
    //private List<Department> departments ;

}
