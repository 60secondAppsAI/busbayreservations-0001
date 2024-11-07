package com.busbayreservations.dao;

import java.util.List;

import com.busbayreservations.dao.GenericDAO;
import com.busbayreservations.domain.Quote;





public interface QuoteDAO extends GenericDAO<Quote, Integer> {
  
	List<Quote> findAll();
	






}


