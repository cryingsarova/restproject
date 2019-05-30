package com.company.testrest2.service;

import com.company.testrest2.domain.Operation;
import org.springframework.http.ResponseEntity;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.NONE)
@Path("/calc")
public class CalculationRestService
{
    @GET
    @Path("/add/{a}/{b}")
    @Produces( MediaType.APPLICATION_JSON )
    public Operation addition(@PathParam("a") double a,
                             @PathParam("b") double b)
    {
        Operation operation = new Operation();
        operation.setA(a);
        operation.setB(b);
        operation.setResult(a+b);
        return operation;

    }

    @GET
    @Path("/add/{a}/{b}")
    @Produces(MediaType.TEXT_PLAIN)
    public String additionText(@PathParam("a") double a,
                                 @PathParam("b") double b)
    {
        Operation operation = new Operation();
        operation.setA(a);
        operation.setB(b);
        operation.setResult(a+b);

        return operation.toString();

    }

    @GET
    @Path("/add/{a}/{b}")
    @Produces(MediaType.TEXT_HTML)
    public String additionHTML(@PathParam("a") double a,
                               @PathParam("b") double b)
    {
        Operation operation = new Operation();
        operation.setA(a);
        operation.setB(b);
        operation.setResult(a+b);

        return ("<div>"+operation.toString()+"</div>");

    }


    @GET
    @Path("/sub/{a}/{b}")
    @Produces(MediaType.APPLICATION_JSON)
    public Operation subtraction(@PathParam("a") double a,
                                @PathParam("b") double b)
    {
        Operation operation = new Operation();
        operation.setA(a);
        operation.setB(b);
        operation.setResult(a-b);
        return operation;
    }
    @GET
    @Path("/sub/{a}/{b}")
    @Produces(MediaType.TEXT_PLAIN)
    public String subtractionText(@PathParam("a") double a,
                               @PathParam("b") double b)
    {
        Operation operation = new Operation();
        operation.setA(a);
        operation.setB(b);
        operation.setResult(a-b);

        return operation.toString();

    }

    @GET
    @Path("/sub/{a}/{b}")
    @Produces(MediaType.TEXT_HTML)
    public String subtractionHTML(@PathParam("a") double a,
                               @PathParam("b") double b)
    {
        Operation operation = new Operation();
        operation.setA(a);
        operation.setB(b);
        operation.setResult(a-b);

        return ("<div>"+operation.toString()+"</div>");

    }



    @GET
    @Path("/mult/{a}/{b}")
    @Produces( MediaType.APPLICATION_JSON)
    public Operation multiplication(@PathParam("a") double a,
                                   @PathParam("b") double b)
    {
        Operation operation = new Operation();
        operation.setA(a);
        operation.setB(b);
        operation.setResult(a*b);

        return operation;
    }

    @GET
    @Path("/mult/{a}/{b}")
    @Produces(MediaType.TEXT_PLAIN)
    public String multiplicationText(@PathParam("a") double a,
                                    @PathParam("b") double b)
    {
        Operation operation = new Operation();
        operation.setA(a);
        operation.setB(b);
        operation.setResult(a*b);

        return operation.toString();
    }

    @GET
    @Path("/mult/{a}/{b}")
    @Produces(MediaType.TEXT_HTML)
    public String multiplicationHTML(@PathParam("a") double a,
                                     @PathParam("b") double b)
    {
        Operation operation = new Operation();
        operation.setA(a);
        operation.setB(b);
        operation.setResult(a*b);

        return ("<div>"+operation.toString()+"</div>");
    }



    @GET
    @Path("/div/{a}/{b}")
    @Produces( MediaType.APPLICATION_JSON )
    public Operation division(@PathParam("a") double a,
                             @PathParam("b") double b)
    {
        Operation operation = new Operation();
        operation.setA(a);
        operation.setB(b);
        operation.setResult(a/b);

        return operation;
    }

    @GET
    @Path("/div/{a}/{b}")
    @Produces(MediaType.TEXT_PLAIN)
    public String divisionText(@PathParam("a") double a,
                                     @PathParam("b") double b)
    {
        Operation operation = new Operation();
        operation.setA(a);
        operation.setB(b);
        operation.setResult(a/b);

        return operation.toString();
    }

    @GET
    @Path("/div/{a}/{b}")
    @Produces(MediaType.TEXT_HTML)
    public String divisionHTML(@PathParam("a") double a,
                               @PathParam("b") double b)
    {
        Operation operation = new Operation();
        operation.setA(a);
        operation.setB(b);
        operation.setResult(a/b);

        return ("<div>"+operation.toString()+"</div>");
    }

}