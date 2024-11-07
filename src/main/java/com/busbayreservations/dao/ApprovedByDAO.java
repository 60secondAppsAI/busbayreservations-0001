package com.busbayreservations.dao;

import java.util.List;

import com.busbayreservations.dao.GenericDAO;
import com.busbayreservations.domain.ApprovedBy;





public interface ApprovedByDAO extends GenericDAO<ApprovedBy, Integer> {
  
	List<ApprovedBy> findAll();
	






}


