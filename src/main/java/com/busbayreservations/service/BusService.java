package com.busbayreservations.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;

import com.busbayreservations.domain.Bus;
import com.busbayreservations.dto.BusDTO;
import com.busbayreservations.dto.BusSearchDTO;
import com.busbayreservations.dto.BusPageDTO;
import com.busbayreservations.dto.BusConvertCriteriaDTO;
import com.busbayreservations.service.GenericService;
import com.busbayreservations.dto.common.RequestDTO;
import com.busbayreservations.dto.common.ResultDTO;
import java.util.List;
import java.util.Optional;





public interface BusService extends GenericService<Bus, Integer> {

	List<Bus> findAll();

	ResultDTO addBus(BusDTO busDTO, RequestDTO requestDTO);

	ResultDTO updateBus(BusDTO busDTO, RequestDTO requestDTO);

    Page<Bus> getAllBuss(Pageable pageable);

    Page<Bus> getAllBuss(Specification<Bus> spec, Pageable pageable);

	ResponseEntity<BusPageDTO> getBuss(BusSearchDTO busSearchDTO);
	
	List<BusDTO> convertBussToBusDTOs(List<Bus> buss, BusConvertCriteriaDTO convertCriteria);

	BusDTO getBusDTOById(Integer busId);







}





