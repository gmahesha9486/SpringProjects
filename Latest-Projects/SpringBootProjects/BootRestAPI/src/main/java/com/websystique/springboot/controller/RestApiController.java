package com.websystique.springboot.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/api")
public class RestApiController {

	 public static final Logger logger = LoggerFactory.getLogger(RestApiController.class);
	 
	    
	 
	    // -------------------Retrieve All Users---------------------------------------------
	 
	    @RequestMapping(value = "/user/", method = RequestMethod.GET)
	    public ResponseEntity<List<String>> listAllUsers() {
	          
	    		System.out.println("=============list all users ============");
	    		
	    		 List<String> users =  new ArrayList<>();
	    		 users.add("test");
	    		 users.add("test890");
	    		 
	    		return new ResponseEntity<List<String>>(users, HttpStatus.OK);
	    }
	     
	 
	    
	
}
