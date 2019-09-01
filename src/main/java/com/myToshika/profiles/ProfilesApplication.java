package com.myToshika.profiles;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

@SpringBootApplication
public class ProfilesApplication {
	
	private static Logger logger = LoggerFactory.getLogger(ProfilesApplication.class);

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = new SpringApplicationBuilder(ProfilesApplication.class)
	            .properties("spring.config.name:application,local,prod,test",
	                    "spring.config.location:classpath:/src/main/resources,classpath:/src/main/resources/local,classpath:/src/main/resources/Prod,classpath:/src/main/resources/test")
	            .build().run(args);

	    ConfigurableEnvironment environment = applicationContext.getEnvironment();

	    logger.info(environment.getProperty("cmdb.resource-url"));
	}
	}

    
