package com.luban.test;

import com.luban.app.Appconfig;
import com.luban.service.CityService;
import com.luban.service.L;
import com.luban.service.TestService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Appconfig.class);
		L l = ac.getBean(L.class);
		l.query();
		//		RootBeanDefinition beanDefinition = new RootBeanDefinition();
	}
}
