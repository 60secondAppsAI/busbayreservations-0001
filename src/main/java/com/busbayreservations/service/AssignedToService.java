package com.busbayreservations.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;

import com.busbayreservations.domain.AssignedTo;
import com.busbayreservations.dto.AssignedToDTO;
import com.busbayreservations.dto.AssignedToSearchDTO;
import com.busbayreservations.dto.AssignedToPageDTO;
import com.busbayreservations.dto.AssignedToConvertCriteriaDTO;
import com.busbayreservations.service.GenericService;
import com.busbayreservations.dto.common.RequestDTO;
import com.busbayreservations.dto.common.ResultDTO;
import java.util.List;
import java.util.Optional;





public interface AssignedToService extends GenericService<AssignedTo, Integer> {

	List<AssignedTo> findAll();

	ResultDTO addAssignedTo(AssignedToDTO assignedToDTO, RequestDTO requestDTO);

	ResultDTO updateAssignedTo(AssignedToDTO assignedToDTO, RequestDTO requestDTO);

    Page<AssignedTo> getAllAssignedTos(Pageable pageable);

    Page<AssignedTo> getAllAssignedTos(Specification<AssignedTo> spec, Pageable pageable);

	ResponseEntity<AssignedToPageDTO> getAssignedTos(AssignedToSearchDTO assignedToSearchDTO);
	
	List<AssignedToDTO> convertAssignedTosToAssignedToDTOs(List<AssignedTo> assignedTos, AssignedToConvertCriteriaDTO convertCriteria);

	AssignedToDTO getAssignedToDTOById(Integer assignedToId);







}





