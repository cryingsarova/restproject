package com.company.testrest2;

import com.company.testrest2.client.CalculationRestClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class TestRest2Application extends SpringBootServletInitializer {

    public static void main(String[] args)
    {
        new TestRest2Application().configure(new SpringApplicationBuilder(TestRest2Application.class)).run(args);
        CalculationRestClient calculationRestClient = new CalculationRestClient();
        calculationRestClient.executeText();

    }

}
