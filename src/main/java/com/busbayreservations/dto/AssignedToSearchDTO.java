package com.busbayreservations.dto;

import java.sql.Timestamp;
import java.time.Year;
import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class AssignedToSearchDTO {

	private Integer page = 0;
	private Integer size;
	private String sortBy;
	private String sortOrder;
	private String searchQuery;

	private Integer assignedToId;
	
	private Issue issueId;
	
	private User assigneeId;
	
	private Date assignmentDate;
	
}
