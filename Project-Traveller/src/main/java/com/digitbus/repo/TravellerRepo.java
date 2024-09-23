package com.digitbus.repo;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.digitbus.entity.Traveller;

@Repository
public interface TravellerRepo extends JpaRepository<Traveller, Serializable> {
	
	
	List<Traveller> findByarrivalLocation(String arrivalLocation);
	List<Traveller> findByarrivalTime(String arrivalTime);
	List<Traveller> findByavailableSeats(int availableSeats);
	List<Traveller> findByamenities(String amenities);
	Traveller findBybusNumber(int busNumber);
	Traveller findBybusNumberAndPassword(int busNumber,String password);
	List<Traveller> findBybusOperator(String busOperator);
	List<Traveller> findBybusType(String busType);
	List<Traveller> findByboardingPoint(String boardingPoint);
	List<Traveller> findBydepartureLocation(String departureLocation);
	List<Traveller> findBydepartureTime(String departureTime);
	List<Traveller> findByduration(String duration);
	List<Traveller> findBydroppingPoint(String droppingPoint);
	List<Traveller> findByfare(double fare);
	List<Traveller> findBytotalSeats(int totalSeats);
	Traveller findByPassword(String password);
	
}
