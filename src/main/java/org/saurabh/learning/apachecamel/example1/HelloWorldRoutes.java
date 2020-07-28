package org.saurabh.learning.apachecamel.example1;

import org.apache.camel.builder.RouteBuilder;

public class HelloWorldRoutes extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		System.out.println("Hello World in Apache Camel");
		
	}

}
