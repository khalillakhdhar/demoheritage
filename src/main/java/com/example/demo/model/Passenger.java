package com.example.demo.model;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Passenger extends Vehicule {
int noOfpassengers;

public int getNoOfpassengers() {
	return noOfpassengers;
}

public void setNoOfpassengers(int noOfpassengers) {
	this.noOfpassengers = noOfpassengers;
}



}
