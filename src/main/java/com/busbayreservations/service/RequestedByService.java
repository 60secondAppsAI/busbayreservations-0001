package com.busbayreservations.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;

import com.busbayreservations.domain.RequestedBy;
import com.busbayreservations.dto.RequestedByDTO;
import com.busbayreservations.dto.RequestedBySearchDTO;
import com.busbayreservations.dto.RequestedByPageDTO;
import com.busbayreservations.dto.RequestedByConvertCriteriaDTO;
import com.busbayreservations.service.GenericService;
import com.busbayreservations.dto.common.RequestDTO;
import com.busbayreservations.dto.common.ResultDTO;
import java.util.List;
import java.util.Optional;





public interface RequestedByService extends GenericService<RequestedBy, Integer> {

	List<RequestedBy> findAll();

	ResultDTO addRequestedBy(RequestedByDTO requestedByDTO, RequestDTO requestDTO);

	ResultDTO updateRequestedBy(RequestedByDTO requestedByDTO, RequestDTO requestDTO);

    Page<RequestedBy> getAllRequestedBys(Pageable pageable);

    Page<RequestedBy> getAllRequestedBys(Specification<RequestedBy> spec, Pageable pageable);

	ResponseEntity<RequestedByPageDTO> getRequestedBys(RequestedBySearchDTO requestedBySearchDTO);
	
	List<RequestedByDTO> convertRequestedBysToRequestedByDTOs(List<RequestedBy> requestedBys, RequestedByConvertCriteriaDTO convertCriteria);

	RequestedByDTO getRequestedByDTOById(Integer requestedById);







}





