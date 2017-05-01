package com.apache.camel.transfermor;

import org.apache.activemq.command.ActiveMQTextMessage;

public class MQTransformer {
	public String transformContent( ActiveMQTextMessage am) throws Exception
	{
		System.out.println("Inside MQTrans"+am);
		return am.getText();
	}

}
