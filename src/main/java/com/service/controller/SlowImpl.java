package com.service.controller;

import com.service.model.Person;

import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringCodegen", date = "2017-11-18T07:20:16.200Z")

@RestSchema(schemaId = "slow")
@RequestMapping(path = "/dumpname", produces = MediaType.APPLICATION_JSON)
public class SlowImpl {

    @Autowired
    private SlowDelegate userSlowDelegate;


    @RequestMapping(value = "/add",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public Integer add( @RequestParam(value = "a", required = true) Integer a, @RequestParam(value = "b", required = true) Integer b){

        return userSlowDelegate.add(a, b);
    }


    @RequestMapping(value = "/sayhei",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String sayHei( @RequestHeader(value="name", required=true) String name){

        return userSlowDelegate.sayHei(name);
    }


    @RequestMapping(value = "/sayhello/{name}",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    public String sayHello( @PathVariable("name") String name){

        return userSlowDelegate.sayHello(name);
    }


    @RequestMapping(value = "/sayhi",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String sayHi( @RequestParam(value = "name", required = true) String name){

        return userSlowDelegate.sayHi(name);
    }


    @RequestMapping(value = "/saysomething",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    public String saySomething( @RequestParam(value = "prefix", required = true) String prefix, @RequestBody Person user){

        return userSlowDelegate.saySomething(prefix, user);
    }

}
