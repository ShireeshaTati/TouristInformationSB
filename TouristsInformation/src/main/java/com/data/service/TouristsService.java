package com.data.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.data.entity.Tourists;

@Service
public interface TouristsService {
	
	public Tourists addtourist(Tourists tourists);
	
	public List<Tourists> gettourist();

}
