package com.professionalportfolio;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({RunApp.PACKAGE_NAME})
public class RunApp extends SpringBootServletInitializer {
	public static final String PACKAGE_NAME = "com.professionalportfolio";
	
	public static void main(String[] args){
		SpringApplication.run(RunApp.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application){
		return application.sources(RunApp.class);
	}
}