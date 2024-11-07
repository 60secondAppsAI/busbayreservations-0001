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

import com.busbayreservations.domain.AssignedTo;
import com.busbayreservations.dto.AssignedToDTO;
import com.busbayreservations.dto.AssignedToSearchDTO;
import com.busbayreservations.dto.AssignedToPageDTO;
import com.busbayreservations.service.AssignedToService;
import com.busbayreservations.dto.common.RequestDTO;
import com.busbayreservations.dto.common.ResultDTO;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.multipart.MultipartFile;




@CrossOrigin(origins = "*")
@RequestMapping("/assignedTo")
@RestController
public class AssignedToController {

	private final static Logger logger = LoggerFactory.getLogger(AssignedToController.class);

	@Autowired
	AssignedToService assignedToService;



	@RequestMapping(value="/", method = RequestMethod.GET)
	public List<AssignedTo> getAll() {

		List<AssignedTo> assignedTos = assignedToService.findAll();
		
		return assignedTos;	
	}

	@GetMapping(value = "/{assignedToId}")
	@ResponseBody
	public AssignedToDTO getAssignedTo(@PathVariable Integer assignedToId) {
		
		return (assignedToService.getAssignedToDTOById(assignedToId));
	}

 	@RequestMapping(value = "/addAssignedTo", method = RequestMethod.POST)
	public ResponseEntity<?> addAssignedTo(@RequestBody AssignedToDTO assignedToDTO, HttpServletRequest request) {

		RequestDTO requestDTO = new RequestDTO(request);
		ResultDTO result = assignedToService.addAssignedTo(assignedToDTO, requestDTO);
		
		return result.asResponseEntity();
	}

	@GetMapping("/assignedTos")
	public ResponseEntity<AssignedToPageDTO> getAssignedTos(AssignedToSearchDTO assignedToSearchDTO) {
 
		return assignedToService.getAssignedTos(assignedToSearchDTO);
	}	

	@RequestMapping(value = "/updateAssignedTo", method = RequestMethod.POST)
	public ResponseEntity<?> updateAssignedTo(@RequestBody AssignedToDTO assignedToDTO, HttpServletRequest request) {
		RequestDTO requestDTO = new RequestDTO(request);
		ResultDTO result = assignedToService.updateAssignedTo(assignedToDTO, requestDTO);
		
//		if (result.isSuccessful()) {
//		}

		return result.asResponseEntity();
	}



}
