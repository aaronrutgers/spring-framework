package com.luban.app;

import com.luban.test.CityService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Appconfig {
	@Bean
	public CityService cityService(){
		return new CityService();
	}
}
