package com.hto56.p2p.service.user.test;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServiceProvider {
	private static final Log log = LogFactory.getLog(ServiceProvider.class);

	public static void main(String[] args) {
		
		try {
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/spring-context.xml");
			context.start();
		} catch (Exception e) {
			log.error("== ServiceProvider context start error:",e);
		}
		synchronized (ServiceProvider.class) {
			while (true) {
				try {
					ServiceProvider.class.wait();
				} catch (InterruptedException e) {
					log.error("== synchronized error:",e);
				}
			}
		}
		
		
	}
}
