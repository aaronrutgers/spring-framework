package com.luban.test;

import com.luban.app.Appconfig;
import com.luban.service.CityService;
import com.luban.service.TestService;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Appconfig.class);
		System.out.println(ac.getBean(TestService.class));
//		RootBeanDefinition beanDefinition = new RootBeanDefinition();
	}
}
