package com.microService.controller;

import java.math.BigDecimal;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.microService.entity.ExchangeValue;
import com.microService.repository.ExchangeValueRepository;

@RestController
public class ForexController {
  
  @Autowired
  private Environment environment;
  
  @Autowired
  private ExchangeValueRepository repository;

  @PostConstruct
  public void initExchangeValue(){
    	repository.save(new ExchangeValue("USD", "INR", new BigDecimal(65.0), Integer.parseInt(environment.getProperty("server.port"))));
    	repository.save(new ExchangeValue("EUR", "INR", new BigDecimal(75.0), Integer.parseInt(environment.getProperty("server.port"))));
    	repository.save(new ExchangeValue("AUD", "INR", new BigDecimal(25.0), Integer.parseInt(environment.getProperty("server.port"))));
    	repository.flush();
    }
  
  @GetMapping("/currency-exchange/from/{from}/to/{to}")
  public ExchangeValue retrieveExchangeValue(@PathVariable String from, @PathVariable String to){
    
    ExchangeValue exchangeValue = repository.findByFromAndTo(from, to);
    
    return exchangeValue;
  }
}
