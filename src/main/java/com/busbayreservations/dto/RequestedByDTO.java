package com.busbayreservations.dto;

import java.util.List;
import java.util.Date;
import java.sql.Timestamp;
import java.time.Year;

import lombok.Getter;
import lombok.Setter;


@Getter @Setter
public class RequestedByDTO {

	private Integer requestedById;

	private Issue issueId;

	private User requesterId;

	private Date requestDate;






}
