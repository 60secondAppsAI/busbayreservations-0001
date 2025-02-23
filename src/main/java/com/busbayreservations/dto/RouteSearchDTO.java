package com.busbayreservations.dto;

import java.sql.Timestamp;
import java.time.Year;
import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class RouteSearchDTO {

	private Integer page = 0;
	private Integer size;
	private String sortBy;
	private String sortOrder;
	private String searchQuery;

	private Integer routeId;
	
	private String startLocation;
	
	private String endLocation;
	
	private double distance;
	
	private double price;
	
}
