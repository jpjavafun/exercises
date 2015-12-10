/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.packtpub.jaxb.jaxrs.example;

/**
 *
 * @author jpaisley
 */
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/xml/customer")
public class XMLService {

	@GET
	@Path("/{pin}")
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public Customer getCustomerInXML(@PathParam("pin") int pin) {
            
            System.out.println("JOE:XMLService getCustomerInXML");

		Customer customer = new Customer();
		customer.setName("jpaisley");
		customer.setPin(pin);

		return customer;

	}

}
