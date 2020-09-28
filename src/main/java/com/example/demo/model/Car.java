package com.example.demo.model;

import javax.persistence.Entity;

@Entity
public class Car extends Passenger {
int noOfdoors;

public int getNoOfdoors() {
	return noOfdoors;
}

public void setNoOfdoors(int noOfdoors) {
	this.noOfdoors = noOfdoors;
}




}
