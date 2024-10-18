package be.pxl.services.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Notification {
/*
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "\"from\"")
    private String from ;
    @Column(name = "\"to\"")
    private String to ;
    private String subject ;
    private String message ;
*/
    private String message ;
    private String sender ;


}
