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

import com.busbayreservations.domain.BusAssignment;
import com.busbayreservations.dto.BusAssignmentDTO;
import com.busbayreservations.dto.BusAssignmentSearchDTO;
import com.busbayreservations.dto.BusAssignmentPageDTO;
import com.busbayreservations.service.BusAssignmentService;
import com.busbayreservations.dto.common.RequestDTO;
import com.busbayreservations.dto.common.ResultDTO;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.multipart.MultipartFile;




@CrossOrigin(origins = "*")
@RequestMapping("/busAssignment")
@RestController
public class BusAssignmentController {

	private final static Logger logger = LoggerFactory.getLogger(BusAssignmentController.class);

	@Autowired
	BusAssignmentService busAssignmentService;



	@RequestMapping(value="/", method = RequestMethod.GET)
	public List<BusAssignment> getAll() {

		List<BusAssignment> busAssignments = busAssignmentService.findAll();
		
		return busAssignments;	
	}

	@GetMapping(value = "/{busAssignmentId}")
	@ResponseBody
	public BusAssignmentDTO getBusAssignment(@PathVariable Integer busAssignmentId) {
		
		return (busAssignmentService.getBusAssignmentDTOById(busAssignmentId));
	}

 	@RequestMapping(value = "/addBusAssignment", method = RequestMethod.POST)
	public ResponseEntity<?> addBusAssignment(@RequestBody BusAssignmentDTO busAssignmentDTO, HttpServletRequest request) {

		RequestDTO requestDTO = new RequestDTO(request);
		ResultDTO result = busAssignmentService.addBusAssignment(busAssignmentDTO, requestDTO);
		
		return result.asResponseEntity();
	}

	@GetMapping("/busAssignments")
	public ResponseEntity<BusAssignmentPageDTO> getBusAssignments(BusAssignmentSearchDTO busAssignmentSearchDTO) {
 
		return busAssignmentService.getBusAssignments(busAssignmentSearchDTO);
	}	

	@RequestMapping(value = "/updateBusAssignment", method = RequestMethod.POST)
	public ResponseEntity<?> updateBusAssignment(@RequestBody BusAssignmentDTO busAssignmentDTO, HttpServletRequest request) {
		RequestDTO requestDTO = new RequestDTO(request);
		ResultDTO result = busAssignmentService.updateBusAssignment(busAssignmentDTO, requestDTO);
		
//		if (result.isSuccessful()) {
//		}

		return result.asResponseEntity();
	}



}
