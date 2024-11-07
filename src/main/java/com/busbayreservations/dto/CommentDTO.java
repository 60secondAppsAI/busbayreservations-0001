package com.busbayreservations.dto;

import java.util.List;
import java.util.Date;
import java.sql.Timestamp;
import java.time.Year;

import lombok.Getter;
import lombok.Setter;


@Getter @Setter
public class CommentDTO {

	private Integer commentId;

	private Issue issueId;

	private User commenterId;

	private String content;

	private Date createdDate;






}
