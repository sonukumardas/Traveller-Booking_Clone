package com.digitbus.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.digitbus.entity.Traveller;

public interface ITravellerService {

	Traveller createTraveller(Traveller travellerEntity);

	List<Traveller> retriveTraveller();

	Traveller retriveTravellerById(int id);

	Traveller updateTravellerById(int id, Traveller newTraveller);

	Traveller deleteTravellerById(int id);

	List<Traveller> showTravellerByarrivalLocation(String arrivalLocation);

	List<Traveller> showTravellerByarrivalTime(String arrivalTime);

	List<Traveller> showTravellerByavailableSeats(int availableSeats);

	List<Traveller> showTravellerByamenities(String amenities);

	Traveller showTravellerBybusNumber(int busNumber);

	Traveller showTravellerBybusNumberAndPassword(int busNumber,String password);
	
	List<Traveller> showTravellerBybusOperator(String busOperator);

	List<Traveller> showTravellerBybusType(String busType);

	List<Traveller> showTravellerByboardingPoint(String boardingPoint);

	List<Traveller> showTravellerBydepartureLocation(String departureLocation);

	List<Traveller> showTravellerBydepartureTime(String departureTime);

	List<Traveller> showTravellerByduration(String duration);

	List<Traveller> showTravellerBydroppingPoint(String droppingPoint);

	List<Traveller> showTravellerByfare(double fare);

	List<Traveller> showTravellerBytotalSeats(int totalSeats);

	// sorting
	List<Traveller> sortbybusoperator();

	// paging
	Page<Traveller> paging();

	
}
