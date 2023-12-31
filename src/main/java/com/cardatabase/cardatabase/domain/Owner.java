package com.cardatabase.cardatabase.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer",
"handler"})
public class Owner 
{
 
	
 private @Id long ownerid;
 @GeneratedValue(strategy=GenerationType.AUTO)
 private String firstname, lastname;

 @JsonIgnore

 @OneToMany(cascade=CascadeType.ALL, mappedBy="owner")
 private List<Car> cars;

 public List<Car> getCars() {
  return cars;
 }

 public void setCars(List<Car> cars) {
  this.cars = cars;
 }




public Owner() {
	super();
	// TODO Auto-generated constructor stub
}







public Owner(long ownerid, String firstname, String lastname) {
	super();
	this.ownerid = ownerid;
	this.firstname = firstname;
	this.lastname = lastname;
}







public long getOwnerid() {
	return ownerid;
}







public void setOwnerid(long ownerid) {
	this.ownerid = ownerid;
}







public String getFirstname() {
	return firstname;
}







public void setFirstname(String firstname) {
	this.firstname = firstname;
}







public String getLastname() {
	return lastname;
}







public void setLastname(String lastname) {
	this.lastname = lastname;
}


	
	
}
