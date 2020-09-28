package com.example.demo.model;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Inheritance; 
 import javax.persistence.InheritanceType;
import javax.persistence.TableGenerator;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "Type")
@TableGenerator(name = "Vehicule_GEN", table = "Id_GEN",
pkColumnName = "GEN_name", valueColumnName = "GEN_value", allocationSize
= 1)
public class Vehicule {
@Id
long idVehicule;
String manufacturer;
public long getIdVehicule() {
	return idVehicule;
}
public void setIdVehicule(long idVehicule) {
	this.idVehicule = idVehicule;
}
public String getManufacturer() {
	return manufacturer;
}
public void setManufacturer(String manufacturer) {
	this.manufacturer = manufacturer;
}



}
