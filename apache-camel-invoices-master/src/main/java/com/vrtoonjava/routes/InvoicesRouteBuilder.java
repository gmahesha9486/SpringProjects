package com.vrtoonjava.routes;

 
import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class InvoicesRouteBuilder extends RouteBuilder {

    @Override
    public void configure() throws Exception { 
    	
    	System.out.println("===================hello================");
    	from("file:/home/hduser/Documents/workspace/testFolder/input?noop=true").to("file:/home/hduser/Documents/workspace/testFolder/output");
    	
    }

}
