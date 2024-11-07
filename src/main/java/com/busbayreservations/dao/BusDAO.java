package com.busbayreservations.dao;

import java.util.List;

import com.busbayreservations.dao.GenericDAO;
import com.busbayreservations.domain.Bus;





public interface BusDAO extends GenericDAO<Bus, Integer> {
  
	List<Bus> findAll();
	






}


