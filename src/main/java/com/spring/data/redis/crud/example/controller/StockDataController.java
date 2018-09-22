package com.spring.data.redis.crud.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.data.redis.crud.example.domain.StockDataDto;
import com.spring.data.redis.crud.example.service.StockDataService;

@RestController
public class StockDataController {
	
	@Autowired
	StockDataService service;
	
	@GetMapping(name="/getStock")
	public StockDataDto getStockByScripCode(@RequestParam(value="companyid",required=true)String companyId) {
		
		System.out.println("companyid = "+companyId);
		return service.getStockBySymbol("6");
	}
	
}
