package com.busbayreservations.dto;

import java.sql.Timestamp;
import java.time.Year;
import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class RequestedBySearchDTO {

	private Integer page = 0;
	private Integer size;
	private String sortBy;
	private String sortOrder;
	private String searchQuery;

	private Integer requestedById;
	
	private Issue issueId;
	
	private User requesterId;
	
	private Date requestDate;
	
}
