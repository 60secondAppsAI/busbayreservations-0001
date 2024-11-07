package com.busbayreservations.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Date;
import java.util.List;
import java.sql.Timestamp;
import java.time.Year;
import jakarta.persistence.Transient;



@Entity
@Table(name="routes")
@Getter @Setter @NoArgsConstructor
public class Route {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
  	@Column(name="route_id")
	private Integer routeId;
    
  	@Column(name="start_location")
	private String startLocation;
    
  	@Column(name="end_location")
	private String endLocation;
    
  	@Column(name="distance")
	private double distance;
    
  	@Column(name="price")
	private double price;
    
	




}
