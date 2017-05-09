package com.vrtoonjava.routes;


import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class RouterTest extends RouteBuilder {

    @Override
    public void configure() throws Exception { 
    	
    	System.out.println("===================new router================");
    	from("file:/home/hduser/Documents/workspace/testFolder/output?noop=true").to("file:/home/hduser/Documents/workspace/testFolder/output2");
    	
    }

}
