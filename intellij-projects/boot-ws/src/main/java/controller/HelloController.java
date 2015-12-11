package controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jpaisley on 04/12/15.
 */

@RestController
public class HelloController {


    @RequestMapping("/message")
    public String getMessage(){

        return "Joe";

    }




}
