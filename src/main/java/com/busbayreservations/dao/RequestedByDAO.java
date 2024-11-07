package com.busbayreservations.dao;

import java.util.List;

import com.busbayreservations.dao.GenericDAO;
import com.busbayreservations.domain.RequestedBy;





public interface RequestedByDAO extends GenericDAO<RequestedBy, Integer> {
  
	List<RequestedBy> findAll();
	






}


