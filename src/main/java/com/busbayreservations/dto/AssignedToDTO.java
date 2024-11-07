package com.busbayreservations.dto;

import java.util.List;
import java.util.Date;
import java.sql.Timestamp;
import java.time.Year;

import lombok.Getter;
import lombok.Setter;


@Getter @Setter
public class AssignedToDTO {

	private Integer assignedToId;

	private Issue issueId;

	private User assigneeId;

	private Date assignmentDate;






}
