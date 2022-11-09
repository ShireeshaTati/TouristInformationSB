package com.data.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.data.entity.Tourists;
import com.data.repository.TouristsRepository;

@Service
public class TouristsServiceImple implements TouristsService {
	
	@Autowired
	private TouristsRepository touristsRepository;

	@Override
	public Tourists addtourist(Tourists tourists) {
		return touristsRepository.save(tourists);
	}

	@Override
	public List<Tourists> gettourist() {
		return touristsRepository.findByOrderByFnameDesc();
	}

}
