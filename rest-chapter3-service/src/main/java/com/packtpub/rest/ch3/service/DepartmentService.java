/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.packtpub.rest.ch3.service;

/**
 *
 * @author jpaisley
 */
import com.packtpub.rest.ch3.model.Departments;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.*;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("departments")
@Stateless
public class DepartmentService {
//Inject EntityManager instance
  @PersistenceContext(unitName =
    "com.packtpub_rest-chapter3-service_war_1.0-SNAPSHOTPU")
  private EntityManager entityManager;
  //Method that responds to HTTP GET request
  //Returns list of departments
  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public List<Departments> findAllDepartments() {
    //Find all departments from the data store
    javax.persistence.criteria.CriteriaQuery cq =  
      entityManager.getCriteriaBuilder()
        .createQuery();
    cq.select(cq.from(Departments.class));
    List<Departments> departments = 
      entityManager.createQuery(cq).getResultList();
    return departments;
  }

  //Method that responds to HTTP POST request
  //Creates a new department object 
  @POST
  @Consumes(MediaType.APPLICATION_JSON)
  public void createDepartment(Departments entity) {
    entityManager.persist(entity);
  }

  //Method that responds to HTTP PUT request
  //Modifies the department identified by ‘id' path param
  @PUT
    @Path("{id}")
  @Consumes(MediaType.APPLICATION_JSON)
  public void editDepartment(@PathParam("id") Short id, 
    Departments entity) {
    entityManager.merge(entity);
  }

  //Method that responds to HTTP DELETE request
  //Removes the department identified by ‘id' path param
  @DELETE
  @Path("{id}")
  public void removeDepartment(@PathParam("id") Short id)
  {

    Departments entity = 
      entityManager.find(Departments.class, 
        id);
    entityManager.remove(entityManager.merge(entity));

  }

}