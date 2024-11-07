package com.busbayreservations.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;

import com.busbayreservations.domain.DriverAssignment;
import com.busbayreservations.dto.DriverAssignmentDTO;
import com.busbayreservations.dto.DriverAssignmentSearchDTO;
import com.busbayreservations.dto.DriverAssignmentPageDTO;
import com.busbayreservations.dto.DriverAssignmentConvertCriteriaDTO;
import com.busbayreservations.service.GenericService;
import com.busbayreservations.dto.common.RequestDTO;
import com.busbayreservations.dto.common.ResultDTO;
import java.util.List;
import java.util.Optional;





public interface DriverAssignmentService extends GenericService<DriverAssignment, Integer> {

	List<DriverAssignment> findAll();

	ResultDTO addDriverAssignment(DriverAssignmentDTO driverAssignmentDTO, RequestDTO requestDTO);

	ResultDTO updateDriverAssignment(DriverAssignmentDTO driverAssignmentDTO, RequestDTO requestDTO);

    Page<DriverAssignment> getAllDriverAssignments(Pageable pageable);

    Page<DriverAssignment> getAllDriverAssignments(Specification<DriverAssignment> spec, Pageable pageable);

	ResponseEntity<DriverAssignmentPageDTO> getDriverAssignments(DriverAssignmentSearchDTO driverAssignmentSearchDTO);
	
	List<DriverAssignmentDTO> convertDriverAssignmentsToDriverAssignmentDTOs(List<DriverAssignment> driverAssignments, DriverAssignmentConvertCriteriaDTO convertCriteria);

	DriverAssignmentDTO getDriverAssignmentDTOById(Integer driverAssignmentId);







}





