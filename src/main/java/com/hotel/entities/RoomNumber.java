package com.hotel.entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RoomNumber {

	@Id
	private String id;
	private int number;
	private ArrayList<LocalDateTime>unavailableDates;
	public RoomNumber() {
		super();
	}
	public RoomNumber(String id, int number, ArrayList<LocalDateTime> unavailableDates) {
		super();
		this.id = id;
		this.number = number;
		this.unavailableDates = unavailableDates;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public ArrayList<LocalDateTime> getUnavailableDates() {
		return unavailableDates;
	}
	public void setUnavailableDates(ArrayList<LocalDateTime> unavailableDates) {
		this.unavailableDates = unavailableDates;
	}
	@Override
	public String toString() {
		return "RoomNumber [id=" + id + ", number=" + number + ", unavailableDates=" + unavailableDates + "]";
	}
	
	
}
