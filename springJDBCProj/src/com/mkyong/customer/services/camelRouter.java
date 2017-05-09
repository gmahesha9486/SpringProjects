package com.mkyong.customer.services;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class camelRouter extends RouteBuilder {

	
	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("=========================Configure method of router class");
	}

}
