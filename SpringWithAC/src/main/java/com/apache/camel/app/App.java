package com.apache.camel.app;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	AbstractApplicationContext ctx = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
    	ctx.start();
    	//Thread.sleep(5000);
    	System.out.println("Entered>>>>>");
    	ctx.stop();
    }
}