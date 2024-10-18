package be.pxl.service;

import be.pxl.services.EmployeeServiceApplication;
import be.pxl.services.domain.Employee;
import be.pxl.services.repository.EmployeeRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestComponent;
import org.springframework.http.MediaType;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.testcontainers.containers.MySQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest (classes = EmployeeServiceApplication.class) // todo : Added, was not mentioned in the video
@Testcontainers
@AutoConfigureMockMvc
public class EmployeeTest {

    // Todo : VRAAG - Checken met Tom of dit ok is. Toegevoegd om zeker te zijn dat de container start

    @BeforeAll
    public static void setUp() {
        sqlContainer.start();
    }

    @Autowired
    MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper ;

    @Autowired
    private EmployeeRepository employeeRepository ;

    @Container
    private static MySQLContainer sqlContainer = new MySQLContainer("mysql:5.7.37"); // Todo : VRAAG - hoe de versie wordt bepaald
    // TODO : VRAAG - Wat is de meerwaarde van een testcontainer? Bij dev wordt er reedt een container in gebruik genomen?


    @DynamicPropertySource
    static void registerMySQLProperties(DynamicPropertyRegistry registry) {
        registry.add("spring.datasource.url", sqlContainer::getJdbcUrl);
        registry.add("spring.datasource.username", sqlContainer::getUsername);
        registry.add("spring.datasource.password", sqlContainer::getPassword);

    }

    @Test
    public void testCreateEmployee() throws Exception {

        Employee employee = Employee.builder()
                .age(24)
                .name("Gregory")
                .position("student")
                .build();

        String employeeString = objectMapper.writeValueAsString(employee);

        mockMvc.perform(MockMvcRequestBuilders.post("/api/employee")
                .contentType(MediaType.APPLICATION_JSON)
                .content(employeeString))
                .andExpect(status().isCreated());

        assertEquals(1, employeeRepository.findAll().size());

    }
}
