package com.mkyong.customer.dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CustomerDAO
{
	
	@Value("${testVal}") 
	private String test;
	
	@Override
	public String toString() {
		return "Hello , This is CustomerDAO. Value of testVal="+test;
		
	}
}