package com.luban.mybatis;

import com.luban.service.LubanInvocationHandler;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Proxy;


@Component
public class AOPTest implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if (beanName.equals("c")) {
			Class<?> anInterface = bean.getClass().getInterfaces()[0];
			Class<?>[] cs = new Class<?>[]{anInterface};
			Object o = Proxy.newProxyInstance(AOPTest.class.getClassLoader(), cs, new LubanInvocationHandler(bean));
			return o;
		}
		return bean;
	}
}
