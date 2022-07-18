package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.VehicleEntity;

public interface VehicleRepository extends CrudRepository<VehicleEntity,String>{
	public VehicleEntity findByVehicleType(String vehicleType);
	public VehicleEntity findByRegistrationNo(String registrationNo);

}
