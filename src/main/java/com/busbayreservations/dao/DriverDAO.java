package com.busbayreservations.dao;

import java.util.List;

import com.busbayreservations.dao.GenericDAO;
import com.busbayreservations.domain.Driver;





public interface DriverDAO extends GenericDAO<Driver, Integer> {
  
	List<Driver> findAll();
	






}


