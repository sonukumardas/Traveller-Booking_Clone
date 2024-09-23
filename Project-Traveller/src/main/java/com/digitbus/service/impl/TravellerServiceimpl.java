package com.digitbus.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.digitbus.entity.Traveller;
import com.digitbus.repo.TravellerRepo;
import com.digitbus.service.ITravellerService;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class TravellerServiceimpl implements ITravellerService {

	@Autowired
	private TravellerRepo travellerRepo;

	@Override
	public Traveller createTraveller(Traveller travellerEntity) {
		int busNumber = travellerEntity.getBusNumber();
		if (travellerRepo.findBybusNumber(busNumber) != null) {
			throw new RuntimeException("bus number already exists");
		} else {
			Traveller savebus = travellerRepo.save(travellerEntity);
			return savebus;
		}
	}
	
	

	@Override
	public List<Traveller> retriveTraveller() {
		List<Traveller> all = travellerRepo.findAll();
		if (all.size() == 0) {
			throw new RuntimeException("Traveller list is empty");
		} else
			return all;
	}

	@Override
	public Traveller retriveTravellerById(int id) {
		Optional<Traveller> byId = travellerRepo.findById(id);
		if (byId.isPresent()) {
			return byId.get();
		} else {
			throw new RuntimeException("Traveller not exists");
		}
	}

	@Override
	public Traveller updateTravellerById(int travellerId, Traveller newTraveller) {
		Traveller traveller = travellerRepo.findById(travellerId).get();
		traveller.setArrivalLocation(newTraveller.getArrivalLocation());
		traveller.setArrivalTime(newTraveller.getArrivalTime());
		traveller.setAvailableSeats(newTraveller.getAvailableSeats());
		traveller.setAmenities(newTraveller.getAmenities());
		traveller.setBusOperator(newTraveller.getBusOperator());
		traveller.setBusType(newTraveller.getBusType());
		traveller.setBoardingPoint(newTraveller.getBoardingPoint());
		traveller.setDepartureLocation(newTraveller.getDepartureLocation());
		traveller.setDepartureTime(newTraveller.getDepartureTime());
		traveller.setDuration(newTraveller.getDuration());
		traveller.setDroppingPoint(newTraveller.getDroppingPoint());
		traveller.setFare(newTraveller.getFare());
		traveller.setTotalSeats(newTraveller.getTotalSeats());
		Traveller updatefTraveller = travellerRepo.save(traveller);
		return updatefTraveller;
	}

	@Override
	public Traveller deleteTravellerById(int id) {
		Traveller traveller = travellerRepo.findById(id).get();

		if (traveller != null) {
			travellerRepo.deleteById(id);
		} else {
			throw new RuntimeException("traveller not exixts");
		}
		return traveller;
	}

	@Override
	public List<Traveller> showTravellerByarrivalLocation(String arrivalLocation) {
		List<Traveller> byarrivalLocation = travellerRepo.findByarrivalLocation(arrivalLocation);
		if (byarrivalLocation.isEmpty()) {
			throw new RuntimeException(" no traveller with " + arrivalLocation);
		} else
			return byarrivalLocation;
	}

	@Override
	public List<Traveller> showTravellerByarrivalTime(String arrivalTime) {
		List<Traveller> byarrivalTime = travellerRepo.findByarrivalLocation(arrivalTime);
		if (byarrivalTime.isEmpty()) {
			throw new RuntimeException(" Bus with arrivalTime :" + arrivalTime);
		} else
			return byarrivalTime;
	}

	@Override
	public List<Traveller> showTravellerByavailableSeats(int availableSeats) {
		List<Traveller> byavailableSeats = travellerRepo.findByavailableSeats(availableSeats);
		if (byavailableSeats.isEmpty()) {
			throw new RuntimeException("Bus with available Seats  are :" + availableSeats);
		} else
			return byavailableSeats;
	}

	@Override
	public List<Traveller> showTravellerByamenities(String amenities) {
		List<Traveller> byamenities = travellerRepo.findByamenities(amenities);
		if (byamenities.isEmpty()) {
			throw new RuntimeException(" Bus with amenities are : " + amenities);
		} else
			return byamenities;
	}

	@Override
	public Traveller showTravellerBybusNumber(int busNumber) {
		Traveller bybusNumber = travellerRepo.findBybusNumber(busNumber);
		if (bybusNumber == null) {
			throw new RuntimeException(" Bus with bus number :" + busNumber);
		} else
			return bybusNumber;
	}

	@Override
	public Traveller showTravellerBybusNumberAndPassword(int busNumber, String password) {
		Traveller bybusNumberAndPassword = travellerRepo.findBybusNumberAndPassword(busNumber, password);
		if (bybusNumberAndPassword != null) {
			return bybusNumberAndPassword;
		} else
			throw new RuntimeException(" bus number or password not found");
	}

	
		


	@Override
	public List<Traveller> showTravellerBybusOperator(String busOperator) {
		List<Traveller> bybusOperator = travellerRepo.findBybusOperator(busOperator);
		if (bybusOperator.isEmpty()) {
			throw new RuntimeException("Bus with busOperator are :" + busOperator);
		} else
			return bybusOperator;
	}

	@Override
	public List<Traveller> showTravellerBybusType(String busType) {
		List<Traveller> bybusType = travellerRepo.findBybusType(busType);
		if (bybusType.isEmpty()) {
			throw new RuntimeException("Bus with busType are :" + busType);
		} else
			return bybusType;
	}

	@Override
	public List<Traveller> showTravellerByboardingPoint(String boardingPoint) {
		List<Traveller> byboardingPoint = travellerRepo.findByboardingPoint(boardingPoint);
		if (byboardingPoint.isEmpty()) {
			throw new RuntimeException("Bus with boarding Point are :" + boardingPoint);
		} else
			return byboardingPoint;
	}

	@Override
	public List<Traveller> showTravellerBydepartureLocation(String departureLocation) {
		List<Traveller> bydepartureLocation = travellerRepo.findBydepartureLocation(departureLocation);
		if (bydepartureLocation.isEmpty()) {
			throw new RuntimeException("Bus with departure Location are :" + departureLocation);
		} else
			return bydepartureLocation;
	}

	@Override
	public List<Traveller> showTravellerBydepartureTime(String departureTime) {
		List<Traveller> bydepartureTime = travellerRepo.findBydepartureTime(departureTime);
		if (bydepartureTime.isEmpty()) {
			throw new RuntimeException("Bus with departure Time are :" + departureTime);
		} else
			return bydepartureTime;
	}

	@Override
	public List<Traveller> showTravellerByduration(String duration) {
		List<Traveller> byduration = travellerRepo.findByduration(duration);
		if (byduration.isEmpty()) {
			throw new RuntimeException("Bus with duration are :" + duration);
		} else
			return byduration;
	}

	@Override
	public List<Traveller> showTravellerBydroppingPoint(String droppingPoint) {
		List<Traveller> bydroppingPoint = travellerRepo.findBydroppingPoint(droppingPoint);
		if (bydroppingPoint.isEmpty()) {
			throw new RuntimeException("Bus with dropping Point are :" + droppingPoint);
		} else
			return bydroppingPoint;
	}

	@Override
	public List<Traveller> showTravellerByfare(double fare) {
		List<Traveller> byfare = travellerRepo.findByfare(fare);
		if (byfare.isEmpty()) {
			throw new RuntimeException("Bus fare is :" + fare);
		} else
			return byfare;
	}

	@Override
	public List<Traveller> showTravellerBytotalSeats(int totalSeats) {
		List<Traveller> bytotalSeats = travellerRepo.findBytotalSeats(totalSeats);
		if (bytotalSeats.isEmpty()) {
			throw new RuntimeException("Bus with totalSeats are :" + totalSeats);
		} else
			return bytotalSeats;
	}

	@Override
	public List<Traveller> sortbybusoperator() {
		List<Traveller> sortName = travellerRepo.findAll(Sort.by("busOperator"));

		return sortName;
	}

	@Override
	public Page<Traveller> paging() {
		Page<Traveller> page = travellerRepo.findAll(PageRequest.of(0, 3));
		return page;
	}

}
