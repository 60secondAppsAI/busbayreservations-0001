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

import com.busbayreservations.domain.Quote;
import com.busbayreservations.dto.QuoteDTO;
import com.busbayreservations.dto.QuoteSearchDTO;
import com.busbayreservations.dto.QuotePageDTO;
import com.busbayreservations.service.QuoteService;
import com.busbayreservations.dto.common.RequestDTO;
import com.busbayreservations.dto.common.ResultDTO;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.multipart.MultipartFile;




@CrossOrigin(origins = "*")
@RequestMapping("/quote")
@RestController
public class QuoteController {

	private final static Logger logger = LoggerFactory.getLogger(QuoteController.class);

	@Autowired
	QuoteService quoteService;



	@RequestMapping(value="/", method = RequestMethod.GET)
	public List<Quote> getAll() {

		List<Quote> quotes = quoteService.findAll();
		
		return quotes;	
	}

	@GetMapping(value = "/{quoteId}")
	@ResponseBody
	public QuoteDTO getQuote(@PathVariable Integer quoteId) {
		
		return (quoteService.getQuoteDTOById(quoteId));
	}

 	@RequestMapping(value = "/addQuote", method = RequestMethod.POST)
	public ResponseEntity<?> addQuote(@RequestBody QuoteDTO quoteDTO, HttpServletRequest request) {

		RequestDTO requestDTO = new RequestDTO(request);
		ResultDTO result = quoteService.addQuote(quoteDTO, requestDTO);
		
		return result.asResponseEntity();
	}

	@GetMapping("/quotes")
	public ResponseEntity<QuotePageDTO> getQuotes(QuoteSearchDTO quoteSearchDTO) {
 
		return quoteService.getQuotes(quoteSearchDTO);
	}	

	@RequestMapping(value = "/updateQuote", method = RequestMethod.POST)
	public ResponseEntity<?> updateQuote(@RequestBody QuoteDTO quoteDTO, HttpServletRequest request) {
		RequestDTO requestDTO = new RequestDTO(request);
		ResultDTO result = quoteService.updateQuote(quoteDTO, requestDTO);
		
//		if (result.isSuccessful()) {
//		}

		return result.asResponseEntity();
	}



}
