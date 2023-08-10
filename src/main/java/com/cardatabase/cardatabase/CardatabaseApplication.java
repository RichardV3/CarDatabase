package com.cardatabase.cardatabase;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cardatabase.cardatabase.domain.Car;
import com.cardatabase.cardatabase.domain.CarRepository;
import com.cardatabase.cardatabase.domain.Owner;
import com.cardatabase.cardatabase.domain.OwnerRepository;

    @SpringBootApplication
    public class CardatabaseApplication implements CommandLineRunner 
{
    private static final Logger logger = LoggerFactory.getLogger(CardatabaseApplication.class);	
     
    @Autowired
    private CarRepository repository;
    
	public static void main(String[] args) 
	{
		SpringApplication.run(CardatabaseApplication.class, args);
	}
    
	@Autowired
	private OwnerRepository orepository;
	
	 
	 @Override
	 public void run(String... args) throws Exception 
	 {
         repository.findByBrandAndModel("Ford","Mustang") ;
	 }

    
}
