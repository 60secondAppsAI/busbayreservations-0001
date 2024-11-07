package com.busbayreservations.dao;

import java.util.List;

import com.busbayreservations.dao.GenericDAO;
import com.busbayreservations.domain.Reservation;





public interface ReservationDAO extends GenericDAO<Reservation, Integer> {
  
	List<Reservation> findAll();
	






}


