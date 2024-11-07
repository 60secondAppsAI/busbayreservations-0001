package com.busbayreservations.dto;

import java.util.List;
import java.util.Date;
import java.sql.Timestamp;
import java.time.Year;

import lombok.Getter;
import lombok.Setter;


@Getter @Setter
public class RouteDTO {

	private Integer routeId;

	private String startLocation;

	private String endLocation;

	private double distance;

	private double price;






}
