package webSpringBootApp;

import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;

//	http://localhost:8080/name

@RestController
public class WhatIsYourNameController {

	 @Autowired
	    private ConfigurableApplicationContext applicationContext;	
	
	@RequestMapping("/name")
	public String myName() {
		
		/*
		System.out.println("Press 'Enter' to terminate");
	    new Scanner(System.in).nextLine();
	    System.out.println("Exiting");
	    System.exit(1);
		*/
		
		//ApplicationContext.
		//getApplicationContext().close();
        //System.exit(-1);
		
		//SpringApplication.
		//System.out.println("closing");
		//applicationContext.close();
		
		return "Lukasz application";
	}
	
	
	//	void CommandLineRunner::run(String args)
	
	@Bean
	public CommandLineRunner commandLineRunner1(ApplicationContext ctx) {
		
		System.out.println("\tWhatIsYourNameController RestController commandLineRunner1()");
		
		CommandLineRunner cmdLinerImpl = args -> {	System.out.println("\targs: " + args);
													System.out.println("\tWhatIsYourNameController commandLineRunner");
		};
/*		
		return args -> {
			System.out.println("\targs: " + args);
			System.out.println("\tWhatIsYourNameController commandLineRunner");
		};
*/	

		return cmdLinerImpl;
	}
	

	@Bean 
	public CommandLineRunner commandLineRunner2(ApplicationContext ctx) {
		
		System.out.println("\nCommandLineRunner2()");
		
		return null;
	}
}
