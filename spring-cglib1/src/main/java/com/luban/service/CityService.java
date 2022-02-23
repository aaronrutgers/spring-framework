package com.luban.service;

import org.springframework.stereotype.Component;

@Component("c")
public class CityService implements L{
	public CityService(){
		System.out.println("city init");
	}

	@Override
	public void query() {
		System.out.println("query logic----db");
	}
}
