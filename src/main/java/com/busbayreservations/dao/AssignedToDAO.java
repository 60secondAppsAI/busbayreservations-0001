package com.busbayreservations.dao;

import java.util.List;

import com.busbayreservations.dao.GenericDAO;
import com.busbayreservations.domain.AssignedTo;





public interface AssignedToDAO extends GenericDAO<AssignedTo, Integer> {
  
	List<AssignedTo> findAll();
	






}


