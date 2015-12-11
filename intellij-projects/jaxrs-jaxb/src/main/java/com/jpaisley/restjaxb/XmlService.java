package com.jpaisley.restjaxb;

/**
 * Created by jpaisley on 20/11/15.
 */
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/xml/customer")
public class XmlService {

    @GET
    @Path("/{pin}")
    @Produces(MediaType.APPLICATION_XML)
    public Customer getCustomerInXML(@PathParam("pin") int pin) {

        Customer customer = new Customer();
        customer.setName("jpaisley");
        customer.setPin(pin);

        return customer;

    }

}