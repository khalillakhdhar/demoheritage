package com.example.demo.model;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Transportation extends Vehicule {
int loadcapacity;

public int getLoadcapacity() {
	return loadcapacity;
}

public void setLoadcapacity(int loadcapacity) {
	this.loadcapacity = loadcapacity;
}



}
