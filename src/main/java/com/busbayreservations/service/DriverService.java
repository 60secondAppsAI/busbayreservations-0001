package com.busbayreservations.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;

import com.busbayreservations.domain.Driver;
import com.busbayreservations.dto.DriverDTO;
import com.busbayreservations.dto.DriverSearchDTO;
import com.busbayreservations.dto.DriverPageDTO;
import com.busbayreservations.dto.DriverConvertCriteriaDTO;
import com.busbayreservations.service.GenericService;
import com.busbayreservations.dto.common.RequestDTO;
import com.busbayreservations.dto.common.ResultDTO;
import java.util.List;
import java.util.Optional;





public interface DriverService extends GenericService<Driver, Integer> {

	List<Driver> findAll();

	ResultDTO addDriver(DriverDTO driverDTO, RequestDTO requestDTO);

	ResultDTO updateDriver(DriverDTO driverDTO, RequestDTO requestDTO);

    Page<Driver> getAllDrivers(Pageable pageable);

    Page<Driver> getAllDrivers(Specification<Driver> spec, Pageable pageable);

	ResponseEntity<DriverPageDTO> getDrivers(DriverSearchDTO driverSearchDTO);
	
	List<DriverDTO> convertDriversToDriverDTOs(List<Driver> drivers, DriverConvertCriteriaDTO convertCriteria);

	DriverDTO getDriverDTOById(Integer driverId);







}





