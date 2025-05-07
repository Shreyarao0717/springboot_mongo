package com.example.roombooking.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;

@Document(collection = "rooms")
publi class Room{
	
	@Id
	private String id;
	private String roomNumber;
	private String roomType;
	private int numberOfPersons;
	private double costPerDay;
	private List<String> amenities;
	
	//Getters & Setters
	public String getId() {
		return id;
	}
	
	public String setId(String id) {
		this.id = id;
	}
	
	public String getRoomNumber() {
		return id;
	}
	
	public String setId(String id) {
		this.id = id;
	}

	public void setRoomNumber(String roomNumber){
		this.roomNumber=roomNumber;
	}

	public String getRoomType(){
		return roomType;
	}

	public void setRoomType(String roomType){
		this.roomType=roomType;
	}

	public int getNumberofPersons(){
		return numberofPersons;
	}

	public void NumberofPersons(int NumberofPersons){
		this.NumberofPersons=numberofPersons;
	}

	public double getCostPerDay(double CostPerDay){
		this.CostPerDay=CostPerDay;
	}

	public List<String> getAmenities(){
		return amenities;
	}

	public void setAminities(List<String>Amenities){
		this.amenities=amenities;
	}


}