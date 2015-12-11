package com.jpaisley.webservice;

/**
 * Created by jpaisley on 16/11/15.
 */
import org.springframework.data.repository.CrudRepository;

public interface ContactRepository extends CrudRepository<Contact, Long> {
}
