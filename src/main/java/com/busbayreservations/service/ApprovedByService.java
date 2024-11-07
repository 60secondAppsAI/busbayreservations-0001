package com.busbayreservations.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;

import com.busbayreservations.domain.ApprovedBy;
import com.busbayreservations.dto.ApprovedByDTO;
import com.busbayreservations.dto.ApprovedBySearchDTO;
import com.busbayreservations.dto.ApprovedByPageDTO;
import com.busbayreservations.dto.ApprovedByConvertCriteriaDTO;
import com.busbayreservations.service.GenericService;
import com.busbayreservations.dto.common.RequestDTO;
import com.busbayreservations.dto.common.ResultDTO;
import java.util.List;
import java.util.Optional;





public interface ApprovedByService extends GenericService<ApprovedBy, Integer> {

	List<ApprovedBy> findAll();

	ResultDTO addApprovedBy(ApprovedByDTO approvedByDTO, RequestDTO requestDTO);

	ResultDTO updateApprovedBy(ApprovedByDTO approvedByDTO, RequestDTO requestDTO);

    Page<ApprovedBy> getAllApprovedBys(Pageable pageable);

    Page<ApprovedBy> getAllApprovedBys(Specification<ApprovedBy> spec, Pageable pageable);

	ResponseEntity<ApprovedByPageDTO> getApprovedBys(ApprovedBySearchDTO approvedBySearchDTO);
	
	List<ApprovedByDTO> convertApprovedBysToApprovedByDTOs(List<ApprovedBy> approvedBys, ApprovedByConvertCriteriaDTO convertCriteria);

	ApprovedByDTO getApprovedByDTOById(Integer approvedById);







}





