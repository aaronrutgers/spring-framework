package com.luban.test;

import com.luban.app.Appconfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Appconfig.class);
		System.out.println(ac.getBean(CityService.class));
	}
}
