package com.demo.springmvc.controller;

import com.demo.springmvc.domain.Message;
import org.springframework.web.bind.annotation.*;

/**
 * Created by vagrant on 11/26/16.
 */

@RestController
public class HelloWorldRestController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String welcome(){
        return "Hello Spring Uber";
    }

    @RequestMapping(value = "/hello/{carName}", method = RequestMethod.GET)
    public Message helloMessage(@PathVariable String carName){
        return new Message(carName, "Hello "+carName);
    }
}
