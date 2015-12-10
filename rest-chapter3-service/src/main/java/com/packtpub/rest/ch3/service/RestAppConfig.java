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
import java.util.Set;
import javax.ws.rs.core.Application;

@javax.ws.rs.ApplicationPath("webresources")
public class RestAppConfig extends Application {
// Get a set of root resource and provider classes.
  @Override
  public Set<Class<?>> getClasses() {
    Set<Class<?>> resources = 
      new java.util.HashSet<>();
    resources.add(com.packtpub.rest.ch3.service.DepartmentService.class);
    return resources;
  }
}
