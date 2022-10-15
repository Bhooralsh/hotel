package com.hotel.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Room {

	@Id
	private String id;
	private String title;
	private double price;
	private int maxPeople;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
	  @JoinColumn(name = "room_id")
	private List<RoomNumber> roomNumber = new ArrayList<>();

	public Room() {
		super();
	}

	public Room(String id, String title, double price, int maxPeople, ArrayList<RoomNumber> roomNumber) {
		super();
		this.id = id;
		this.title = title;
		this.price = price;
		this.maxPeople = maxPeople;
		this.roomNumber = roomNumber;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getMaxPeople() {
		return maxPeople;
	}

	public void setMaxPeople(int maxPeople) {
		this.maxPeople = maxPeople;
	}

	public List<RoomNumber> getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(ArrayList<RoomNumber> roomNumber) {
		this.roomNumber = roomNumber;
	}

	@Override
	public String toString() {
		return "Room [id=" + id + ", title=" + title + ", price=" + price + ", maxPeople=" + maxPeople + ", roomNumber="
				+ roomNumber + "]";
	}

}
