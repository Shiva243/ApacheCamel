package com.apache.camel.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class RestProcessor implements Processor{

	public void process(Exchange exchange) throws Exception {
		System.out.println("RestTest");
		//String payload = exchange.getIn().getBody(String.class);    
		//System.out.println(">>>>>>>>>>>>"+payload);
	}

}
