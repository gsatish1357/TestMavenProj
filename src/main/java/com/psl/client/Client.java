package com.psl.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psl.entity.Employee;
public class Client {
	
	public static void main(String[] args){
		
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		
		//Employee e = (Employee)context.getBean("emp");
		
		//System.out.println(e.toString());
	}

}
