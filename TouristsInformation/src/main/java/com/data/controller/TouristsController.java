package com.data.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.data.entity.Tourists;
import com.data.service.TouristsServiceImple;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("/tourist")
public class TouristsController {
	
	@Autowired
	private TouristsServiceImple touristsServiceImple;
	
	@PostMapping("/addtourist")
	public Tourists addtourist(@RequestBody Tourists tourists) {
		return touristsServiceImple.addtourist(tourists);
	}

	@RequestMapping("/gettourist")
	public List<Tourists> gettourist(){
		return touristsServiceImple.gettourist();
	}
}
