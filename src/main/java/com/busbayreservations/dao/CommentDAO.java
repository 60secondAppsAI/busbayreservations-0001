package com.busbayreservations.dao;

import java.util.List;

import com.busbayreservations.dao.GenericDAO;
import com.busbayreservations.domain.Comment;





public interface CommentDAO extends GenericDAO<Comment, Integer> {
  
	List<Comment> findAll();
	






}


