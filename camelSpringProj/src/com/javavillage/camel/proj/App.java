package com.javavillage.camel.proj;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AbstractApplicationContext ctx = 
				new ClassPathXmlApplicationContext("ApplicationContext.xml");
    	ctx.start();
    	System.out.println("Entered>>>>>");
    	ctx.stop();
    }
}