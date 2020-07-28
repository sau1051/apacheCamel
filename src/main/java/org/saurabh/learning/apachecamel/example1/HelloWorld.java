package org.saurabh.learning.apachecamel.example1;

import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;

public class HelloWorld {

	public static void main(String[] args) throws Exception {
		
		CamelContext camelContext = new DefaultCamelContext();
		
		camelContext.addRoutes(new HelloWorldRoutes());
		
		camelContext.start();

	}

}
