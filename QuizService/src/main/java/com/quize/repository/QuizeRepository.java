package com.quize.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quize.entity.Quize;

@Repository
public interface QuizeRepository extends JpaRepository<Quize, Integer> {
	
	

}
