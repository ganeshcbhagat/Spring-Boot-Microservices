package com.microService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microService.entity.ExchangeValue;

@Repository
public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long>{
  
	public ExchangeValue findByFromAndTo(String from, String to);
  
}