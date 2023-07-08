package com.grizzlyweblab.springcore.noxml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.grizzlyweblab.springcore.noxml")
public class AppConfig {

	@Bean(name = {"abcd","ef"})
	public Demo getDemoObject()
	{
		return new Demo();
	}
}
