package com.busbayreservations.dto;

import java.util.List;
import java.util.Date;
import java.sql.Timestamp;
import java.time.Year;

import lombok.Getter;
import lombok.Setter;


@Getter @Setter
public class ApprovedByDTO {

	private Integer approvedById;

	private Issue issueId;

	private User approverId;

	private Date approvalDate;






}
