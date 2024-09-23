package com.digitbus.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Version;

@Entity
public class Traveller implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Bus_id")
	public int id;

	@Column(name = "Destination", columnDefinition = "varchar(30)")
	private String arrivalLocation;

	@Column(columnDefinition = "varchar(30)")
	private String arrivalTime;

	private int availableSeats;
	private String amenities;

	@Column(name = "Bus_number", unique = true)
	private int busNumber;
	private String password;
	private String busOperator;
	private String busType;
	private String boardingPoint;
	private String departureLocation;
	private String departureTime;
	private String duration;
	private String droppingPoint;
	private double fare;
	private int totalSeats;

	@CreationTimestamp
	@Column(name = "Created")
	private Timestamp createdDate;
	@UpdateTimestamp
	@Column(name = "Modified")
	public Timestamp modifiedDate;
	@Version
	public int version;

	public Traveller() {

	}


	public String getArrivalLocation() {
		return arrivalLocation;
	}

	public void setArrivalLocation(String arrivalLocation) {
		this.arrivalLocation = arrivalLocation;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public int getAvailableSeats() {
		return availableSeats;
	}

	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}

	public String getAmenities() {
		return amenities;
	}

	public void setAmenities(String amenities) {
		this.amenities = amenities;
	}

	public int getBusNumber() {
		return busNumber;
	}

	public void setBusNumber(int busNumber) {
		this.busNumber = busNumber;
	}

	public Traveller(String password) {
		this.password = password;
	}
	

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}



	public String getBusOperator() {
		return busOperator;
	}

	public void setBusOperator(String busOperator) {
		this.busOperator = busOperator;
	}

	public String getBusType() {
		return busType;
	}

	public void setBusType(String busType) {
		this.busType = busType;
	}

	public String getBoardingPoint() {
		return boardingPoint;
	}

	public void setBoardingPoint(String boardingPoint) {
		this.boardingPoint = boardingPoint;
	}

	public String getDepartureLocation() {
		return departureLocation;
	}

	public void setDepartureLocation(String departureLocation) {
		this.departureLocation = departureLocation;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getDroppingPoint() {
		return droppingPoint;
	}

	public void setDroppingPoint(String droppingPoint) {
		this.droppingPoint = droppingPoint;
	}

	public double getFare() {
		return fare;
	}

	public void setFare(double fare) {
		this.fare = fare;
	}

	public int getTotalSeats() {
		return totalSeats;
	}

	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}
	
	public Timestamp getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}



	public Traveller( String arrivalLocation, String arrivalTime, int availableSeats, String amenities,
			int busNumber, String password, String busOperator, String busType, String boardingPoint,
			String departureLocation, String departureTime, String duration, String droppingPoint, double fare,
			int totalSeats) {
		
		this.arrivalLocation = arrivalLocation;
		this.arrivalTime = arrivalTime;
		this.availableSeats = availableSeats;
		this.amenities = amenities;
		this.busNumber = busNumber;
		this.password = password;
		this.busOperator = busOperator;
		this.busType = busType;
		this.boardingPoint = boardingPoint;
		this.departureLocation = departureLocation;
		this.departureTime = departureTime;
		this.duration = duration;
		this.droppingPoint = droppingPoint;
		this.fare = fare;
		this.totalSeats = totalSeats;
		
	}


	@Override
	public String toString() {
		return "Traveller [id=" + id + ", arrivalLocation=" + arrivalLocation + ", arrivalTime=" + arrivalTime
				+ ", availableSeats=" + availableSeats + ", amenities=" + amenities + ", busNumber=" + busNumber
				+ ", password=" + password + ", busOperator=" + busOperator + ", busType=" + busType
				+ ", boardingPoint=" + boardingPoint + ", departureLocation=" + departureLocation + ", departureTime="
				+ departureTime + ", duration=" + duration + ", droppingPoint=" + droppingPoint + ", fare=" + fare
				+ ", totalSeats=" + totalSeats + ", createdDate=" + createdDate + ", modifiedDate=" + modifiedDate
				+ ", version=" + version + "]";
	}

	
	
	
	
}
