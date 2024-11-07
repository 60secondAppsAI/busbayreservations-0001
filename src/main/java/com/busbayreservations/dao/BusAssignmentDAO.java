package com.busbayreservations.dao;

import java.util.List;

import com.busbayreservations.dao.GenericDAO;
import com.busbayreservations.domain.BusAssignment;





public interface BusAssignmentDAO extends GenericDAO<BusAssignment, Integer> {
  
	List<BusAssignment> findAll();
	






}


