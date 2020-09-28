package com.example.demo.model;

import javax.persistence.Entity;

@Entity
public class truck extends Transportation {
int noOfcontainers;

public int getNoOfcontainers() {
	return noOfcontainers;
}

public void setNoOfcontainers(int noOfcontainers) {
	this.noOfcontainers = noOfcontainers;
}



}
