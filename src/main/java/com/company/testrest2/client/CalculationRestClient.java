package com.company.testrest2.client;

import com.company.testrest2.domain.Operation;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class CalculationRestClient {


    Client client = ClientBuilder.newClient();
    WebTarget webTarget = client.target("http://localhost:8080/calc");

    public void executeJSON(){

        WebTarget operationTarget = webTarget.path("/add/10/5.json");
        Invocation.Builder invocationBuilder = operationTarget.request(MediaType.APPLICATION_JSON);
        Operation response = invocationBuilder.get(Operation.class);

        System.out.println("ADDICTION");
        System.out.println(response);
        operationTarget = webTarget.path("/sub/10/5.json");
        invocationBuilder = operationTarget.request(MediaType.APPLICATION_JSON);
        response = invocationBuilder.get(Operation.class);

        System.out.println("SUBTRACTION");
        System.out.println(response);
        operationTarget = webTarget.path("/mult/10/5.json");
        invocationBuilder = operationTarget.request(MediaType.APPLICATION_JSON);
        response = invocationBuilder.get(Operation.class);

        System.out.println("MULTIPLICATION");
        System.out.println(response);
        operationTarget = webTarget.path("/div/10/5.json");
        invocationBuilder = operationTarget.request(MediaType.APPLICATION_JSON);
        response = invocationBuilder.get(Operation.class);

        System.out.println("DIVISION");
        System.out.println(response);
    }

    public void executeText(){

        System.out.println("ADDICTION(JSON)");
        System.out.println(webTarget.path("/add/10/5").request(MediaType.APPLICATION_JSON).get(Operation.class));
        System.out.println("ADDICTION(Text)");
        System.out.println(webTarget.path("/add/10/5").request(MediaType.TEXT_PLAIN).get(String.class));

        System.out.println("SUBTRACTION(JSON)");
        System.out.println(webTarget.path("/sub/10/5").request(MediaType.APPLICATION_JSON).get(Operation.class));
        System.out.println("SUBTRACTION(Text)");
        System.out.println(webTarget.path("/sub/10/5").request(MediaType.TEXT_PLAIN).get(String.class));

        System.out.println("MULTIPLICATION(JSON)");
        System.out.println(webTarget.path("/mult/10/5").request(MediaType.APPLICATION_JSON).get(Operation.class));
        System.out.println("MULTIPLICATION(Text)");
        System.out.println(webTarget.path("/mult/10/5").request(MediaType.TEXT_PLAIN).get(String.class));

        System.out.println("DIVISION(JSON)");
        System.out.println(webTarget.path("/div/10/5").request(MediaType.APPLICATION_JSON).get(Operation.class));
        System.out.println("DIVISON(Text)");
        System.out.println(webTarget.path("/div/10/5").request(MediaType.TEXT_PLAIN).get(String.class));


    }
}
