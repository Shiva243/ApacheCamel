package com.apache.camel.processor;

import org.apache.activemq.command.ActiveMQTextMessage;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class MQProcessor implements Processor{

	public void process(Exchange exchange) throws Exception {
//		System.out.println("MQTest");
//		String payload = exchange.getIn().getBody(String.class);    
//		System.out.println(">>>>>>>>>>>>"+payload);
		ActiveMQTextMessage am =exchange.getIn().getBody(ActiveMQTextMessage.class);
		System.out.println(">>>>>>>>>>>>"+am.getText());
	}

}
