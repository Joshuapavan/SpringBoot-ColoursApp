package com.josh.springbeanslearning;

import com.josh.springbeanslearning.services.ColourPrinter;
import com.josh.springbeanslearning.services.impl.ColourPrinterImpl;
import lombok.extern.java.Log;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Log
public class SpringBeansLearningApplication implements CommandLineRunner {

	private final ColourPrinter colourPrinter;

	// Constructor Injection
	public SpringBeansLearningApplication(ColourPrinter colourPrinter){
		this.colourPrinter = colourPrinter;
	}


	public static void main(String[] args) {
		SpringApplication.run(SpringBeansLearningApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info(colourPrinter.printColors());
	}
}
