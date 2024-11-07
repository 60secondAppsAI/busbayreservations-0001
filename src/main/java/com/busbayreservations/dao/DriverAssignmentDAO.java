package com.busbayreservations.dao;

import java.util.List;

import com.busbayreservations.dao.GenericDAO;
import com.busbayreservations.domain.DriverAssignment;





public interface DriverAssignmentDAO extends GenericDAO<DriverAssignment, Integer> {
  
	List<DriverAssignment> findAll();
	






}


