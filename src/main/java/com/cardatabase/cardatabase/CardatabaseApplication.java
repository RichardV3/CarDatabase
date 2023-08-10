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

		Owner owner1 = new Owner(0, "John" , "Johnson");
		Owner owner2 = new Owner(1, "Mary" , "Robinson");
		orepository.saveAll(Arrays.asList(owner1,
				owner2));
		// Add car object and link to owners and save these to db

		Car car1 = new Car(0, "Ford", "Mustang", "Red",
				"ADF-1121", 2021, 59000, "", owner1);
		Car car2 = new Car(1, "Nissan", "Leaf", "White",
				"SSJ-3002", 2019, 29000,"", owner2);
		Car car3 = new Car(2, "Toyota", "Prius", "Silver",
				"KKO-0212", 2020, 39000,"", owner2);
		repository.saveAll(Arrays.asList(car1, car2,
				car3));
		for (Car car : repository.findAll()) {
			logger.info(car.getBrand() + "" +
					car.getModel());
		}
	}




}
