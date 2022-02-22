package com.luban.app;

import com.luban.service.CityService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.luban")
@Configuration
public class Appconfig {
	@Bean
	public CityService cityService(){
		return new CityService();
	}
}
