package com.busbayreservations.controller;

import java.io.IOException;
import java.text.MessageFormat;
import java.util.List;
import java.util.ArrayList;


import com.busbayreservations.util.Util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.sql.Timestamp;
import java.util.Date;

import com.busbayreservations.domain.Driver;
import com.busbayreservations.dto.DriverDTO;
import com.busbayreservations.dto.DriverSearchDTO;
import com.busbayreservations.dto.DriverPageDTO;
import com.busbayreservations.service.DriverService;
import com.busbayreservations.dto.common.RequestDTO;
import com.busbayreservations.dto.common.ResultDTO;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.multipart.MultipartFile;




@CrossOrigin(origins = "*")
@RequestMapping("/driver")
@RestController
public class DriverController {

	private final static Logger logger = LoggerFactory.getLogger(DriverController.class);

	@Autowired
	DriverService driverService;



	@RequestMapping(value="/", method = RequestMethod.GET)
	public List<Driver> getAll() {

		List<Driver> drivers = driverService.findAll();
		
		return drivers;	
	}

	@GetMapping(value = "/{driverId}")
	@ResponseBody
	public DriverDTO getDriver(@PathVariable Integer driverId) {
		
		return (driverService.getDriverDTOById(driverId));
	}

 	@RequestMapping(value = "/addDriver", method = RequestMethod.POST)
	public ResponseEntity<?> addDriver(@RequestBody DriverDTO driverDTO, HttpServletRequest request) {

		RequestDTO requestDTO = new RequestDTO(request);
		ResultDTO result = driverService.addDriver(driverDTO, requestDTO);
		
		return result.asResponseEntity();
	}

	@GetMapping("/drivers")
	public ResponseEntity<DriverPageDTO> getDrivers(DriverSearchDTO driverSearchDTO) {
 
		return driverService.getDrivers(driverSearchDTO);
	}	

	@RequestMapping(value = "/updateDriver", method = RequestMethod.POST)
	public ResponseEntity<?> updateDriver(@RequestBody DriverDTO driverDTO, HttpServletRequest request) {
		RequestDTO requestDTO = new RequestDTO(request);
		ResultDTO result = driverService.updateDriver(driverDTO, requestDTO);
		
//		if (result.isSuccessful()) {
//		}

		return result.asResponseEntity();
	}



}
