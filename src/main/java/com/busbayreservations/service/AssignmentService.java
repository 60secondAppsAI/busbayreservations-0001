package com.busbayreservations.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;

import com.busbayreservations.domain.Assignment;
import com.busbayreservations.dto.AssignmentDTO;
import com.busbayreservations.dto.AssignmentSearchDTO;
import com.busbayreservations.dto.AssignmentPageDTO;
import com.busbayreservations.dto.AssignmentConvertCriteriaDTO;
import com.busbayreservations.service.GenericService;
import com.busbayreservations.dto.common.RequestDTO;
import com.busbayreservations.dto.common.ResultDTO;
import java.util.List;
import java.util.Optional;





public interface AssignmentService extends GenericService<Assignment, Integer> {

	List<Assignment> findAll();

	ResultDTO addAssignment(AssignmentDTO assignmentDTO, RequestDTO requestDTO);

	ResultDTO updateAssignment(AssignmentDTO assignmentDTO, RequestDTO requestDTO);

    Page<Assignment> getAllAssignments(Pageable pageable);

    Page<Assignment> getAllAssignments(Specification<Assignment> spec, Pageable pageable);

	ResponseEntity<AssignmentPageDTO> getAssignments(AssignmentSearchDTO assignmentSearchDTO);
	
	List<AssignmentDTO> convertAssignmentsToAssignmentDTOs(List<Assignment> assignments, AssignmentConvertCriteriaDTO convertCriteria);

	AssignmentDTO getAssignmentDTOById(Integer assignmentId);







}





