package com.busbayreservations.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;

import com.busbayreservations.domain.Comment;
import com.busbayreservations.dto.CommentDTO;
import com.busbayreservations.dto.CommentSearchDTO;
import com.busbayreservations.dto.CommentPageDTO;
import com.busbayreservations.dto.CommentConvertCriteriaDTO;
import com.busbayreservations.service.GenericService;
import com.busbayreservations.dto.common.RequestDTO;
import com.busbayreservations.dto.common.ResultDTO;
import java.util.List;
import java.util.Optional;





public interface CommentService extends GenericService<Comment, Integer> {

	List<Comment> findAll();

	ResultDTO addComment(CommentDTO commentDTO, RequestDTO requestDTO);

	ResultDTO updateComment(CommentDTO commentDTO, RequestDTO requestDTO);

    Page<Comment> getAllComments(Pageable pageable);

    Page<Comment> getAllComments(Specification<Comment> spec, Pageable pageable);

	ResponseEntity<CommentPageDTO> getComments(CommentSearchDTO commentSearchDTO);
	
	List<CommentDTO> convertCommentsToCommentDTOs(List<Comment> comments, CommentConvertCriteriaDTO convertCriteria);

	CommentDTO getCommentDTOById(Integer commentId);







}





