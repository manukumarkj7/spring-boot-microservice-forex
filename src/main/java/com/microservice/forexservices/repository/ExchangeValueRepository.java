package com.microservice.forexservices.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.microservice.forexservices.model.ExchangeValue;

public interface ExchangeValueRepository extends 
    JpaRepository<ExchangeValue, Long>{
  ExchangeValue findByFromAndTo(String from, String to);
}