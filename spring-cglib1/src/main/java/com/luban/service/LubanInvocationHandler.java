package com.luban.service;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;


public class LubanInvocationHandler implements InvocationHandler {
	Object object;
	public LubanInvocationHandler(Object o) {
		this.object = o;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("---------AOP---------");
		Object result = method.invoke(object);
		System.out.println("After ---------AOP----------");
		return result;
	}
}
