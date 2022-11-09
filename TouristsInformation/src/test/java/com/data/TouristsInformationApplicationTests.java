package com.data;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.data.entity.Tourists;
import com.data.repository.TouristsRepository;
import com.data.service.TouristsServiceImple;


@RunWith(SpringRunner.class)
@SpringBootTest
class TouristsInformationApplicationTests {
	
	
	@MockBean
	private TouristsRepository repository;
	@Autowired
	private TouristsServiceImple service;
	
	@Test
	public void gettouristTest() {
		when(repository.findByOrderByFnameDesc()).thenReturn(Stream.of(new Tourists(1,"Shireesha","Thati","female",22,"Atp",2), new Tourists(2,"Divya","Tiruveedula","female",27,"kurnool",3)).collect(Collectors.toList()));
		assertEquals(2, service.gettourist().size());
	}
	@Test
	public void createTouristTest() {
		Tourists tourists = new Tourists(1,"Siri","Thati","female",22,"kadapa",7);
		when(repository.save(tourists)).thenReturn(tourists);
		assertEquals(tourists,service.addtourist(tourists));
	}
}

