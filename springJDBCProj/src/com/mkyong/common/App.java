package com.mkyong.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mkyong.customer.services.CustomerService;
import org.apache.camel.spring.Main;


public class App
{
    public static void main( String[] args ) throws Exception
    {
    	ApplicationContext context =  new ClassPathXmlApplicationContext(new String[] {"ApplicationContext.xml"});
  
    	//new Main().run(args);	
    	 
    	CustomerService cust = (CustomerService)context.getBean("customerService");
    	System.out.println(cust);

    }
}

