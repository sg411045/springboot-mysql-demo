package com.example.springbootmysqldemo.employees;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
public class EmployeeControllerTest {

  @Autowired
  private TestRestTemplate restTemplate;

  @Test
  public void exampleTest() {
    String body = this.restTemplate.getForObject("/employee/1001", String.class);
    System.out.println(body);
    assertThat(body).isEqualTo("{\"empNo\":\"1001\",\"empName\":\"Kohli\",\"department\":\"ATA\"}");
  }
}
