package com.myToshika.profiles.controller;


//import javax.annotation.PostConstruct;
//
//import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {

//	@Value("${app.message}") 
	private String welcomeMessage;
	
//	@Value("${spring.profiles.active}")
//	private String profile;
	
	@GetMapping("/welcome")
	public String getDataBaseConnectionDetails() {
		return welcomeMessage;
	}
	
//	@PostConstruct
//	public void checkProfile() {
//		
//		System.out.println("\n\n\n profile = "+profile);
//		
//	}
	
}


