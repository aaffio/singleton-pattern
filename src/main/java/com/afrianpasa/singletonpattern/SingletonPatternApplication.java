package com.afrianpasa.singletonpattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.afrianpasa.singletonpattern.objects.SingleObject;

@SpringBootApplication
public class SingletonPatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(SingletonPatternApplication.class, args);
		
		SingleObject object = SingleObject.getInstance();
		object.showMessage();
	}
}
