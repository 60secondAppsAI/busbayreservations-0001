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

import com.busbayreservations.domain.Bus;
import com.busbayreservations.dto.BusDTO;
import com.busbayreservations.dto.BusSearchDTO;
import com.busbayreservations.dto.BusPageDTO;
import com.busbayreservations.service.BusService;
import com.busbayreservations.dto.common.RequestDTO;
import com.busbayreservations.dto.common.ResultDTO;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.multipart.MultipartFile;




@CrossOrigin(origins = "*")
@RequestMapping("/bus")
@RestController
public class BusController {

	private final static Logger logger = LoggerFactory.getLogger(BusController.class);

	@Autowired
	BusService busService;



	@RequestMapping(value="/", method = RequestMethod.GET)
	public List<Bus> getAll() {

		List<Bus> buss = busService.findAll();
		
		return buss;	
	}

	@GetMapping(value = "/{busId}")
	@ResponseBody
	public BusDTO getBus(@PathVariable Integer busId) {
		
		return (busService.getBusDTOById(busId));
	}

 	@RequestMapping(value = "/addBus", method = RequestMethod.POST)
	public ResponseEntity<?> addBus(@RequestBody BusDTO busDTO, HttpServletRequest request) {

		RequestDTO requestDTO = new RequestDTO(request);
		ResultDTO result = busService.addBus(busDTO, requestDTO);
		
		return result.asResponseEntity();
	}

	@GetMapping("/buss")
	public ResponseEntity<BusPageDTO> getBuss(BusSearchDTO busSearchDTO) {
 
		return busService.getBuss(busSearchDTO);
	}	

	@RequestMapping(value = "/updateBus", method = RequestMethod.POST)
	public ResponseEntity<?> updateBus(@RequestBody BusDTO busDTO, HttpServletRequest request) {
		RequestDTO requestDTO = new RequestDTO(request);
		ResultDTO result = busService.updateBus(busDTO, requestDTO);
		
//		if (result.isSuccessful()) {
//		}

		return result.asResponseEntity();
	}



}
