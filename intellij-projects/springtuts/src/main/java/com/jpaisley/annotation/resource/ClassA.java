package com.jpaisley.annotation.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;

import javax.annotation.Resource;

/**
 * Created by jpaisley on 11/11/15.
 */
@Import({ ClassCConfig.class })
public class ClassA {

    @Autowired
    public ClassCConfig.ClassC cC;


}
