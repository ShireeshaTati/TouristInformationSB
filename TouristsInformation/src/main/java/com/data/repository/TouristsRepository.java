package com.data.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.data.entity.Tourists;

@Repository
public interface TouristsRepository extends JpaRepository<Tourists,Integer> {

	List<Tourists> findByOrderByFnameDesc();

	

}
