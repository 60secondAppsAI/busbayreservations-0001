package com.busbayreservations.dao;

import java.util.List;

import com.busbayreservations.dao.GenericDAO;
import com.busbayreservations.domain.Assignment;





public interface AssignmentDAO extends GenericDAO<Assignment, Integer> {
  
	List<Assignment> findAll();
	






}


