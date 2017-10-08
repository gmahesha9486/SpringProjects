package com.javainuse;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyRoute extends RouteBuilder {

	@Autowired
	MyProcess process;
	
	@Override
	public void configure() throws Exception {
		from("file:/home/hduser/Documents/workspace/testFolder/input?noop=true")
		.to("file:/home/hduser/Documents/workspace/testFolder/output")
		.process(process);
	}
}