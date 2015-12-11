package com.jpaisley.webservice;

/**
 * Created by jpaisley on 16/11/15.
 */
import java.util.List;

public interface ContactService {
    List<Contact> findAll();
    Contact findById(Long id);
    Contact save(Contact contact);
}
