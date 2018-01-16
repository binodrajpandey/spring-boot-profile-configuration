package com.example.springbootprofile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(ServerProperties.class)
public class SpringBootProfileApplication implements CommandLineRunner{
	 @Autowired
	    private ServerProperties serverProperties;
	 
	public static void main(String[] args) {
		SpringApplication.run(SpringBootProfileApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(serverProperties);
		
	}
}
