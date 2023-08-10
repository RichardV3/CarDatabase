package com.packt.cardatabase.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cardatabase.cardatabase.domain.Car;
import com.cardatabase.cardatabase.domain.CarRepository;

@RestController
@RequestMapping("/cars")
public class CarController {

	@Autowired
	 private CarRepository repository;
	
//	@GetMapping("/cars")
//	Iterable<Car> getCars(){
//	return repository.findAll();
//	}
	
//	
//	   @GetMapping("/all") // sara infatti una richiesta GET che ritorna tutte le info
//	    public ResponseEntity<List<Car>> getAllEmployee () {
//	        List<Car> employees = (List<Car>) repository.findAll();
//	        return new ResponseEntity<>(employees, HttpStatus.OK);
//	    }
	
	
	
}
