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
@Table(name="requested_bys")
@Getter @Setter @NoArgsConstructor
public class RequestedBy {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
  	@Column(name="requested_by_id")
	private Integer requestedById;
    
  	@Column(name="issue_id")
	private Issue issueId;
    
  	@Column(name="requester_id")
	private User requesterId;
    
  	@Column(name="request_date")
	private Date requestDate;
    
	




}
