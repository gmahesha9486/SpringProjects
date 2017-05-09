package com.vrtoonjava.invoices;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InvoicesApplication {

    public static void main(String[] args) throws Exception {
        new ClassPathXmlApplicationContext("/invoices-context.xml");
        Thread.sleep(90000);
    }

}
