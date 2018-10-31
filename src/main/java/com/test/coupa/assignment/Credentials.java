package com.test.coupa.assignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
@Configuration
@PropertySource("classpath:application.properties")
public class Credentials {
	
	public String userName;
	public String password;
	
	 @Autowired
	 private Environment env;
	
	@Autowired
	public String getUserName() {
		
		 return env.getProperty("spring.username");
		
			}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Autowired
	public String getPassword() {
		 return env.getProperty("spring.password");
		
			}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
