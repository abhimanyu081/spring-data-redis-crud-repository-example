package com.spring.data.redis.crud.example.service;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.data.redis.crud.example.domain.StockDataDto;
import com.spring.data.redis.crud.example.repository.StockDataRepository;

@Service
public class StockDataService {

	@Autowired
	StockDataRepository stockRepo;

	
	@PostConstruct
	public void basicCrudOperations() {

		StockDataDto stockDataDto = new StockDataDto();
		stockDataDto.setCompanyName("Acc Ltd");
		stockDataDto.setCompanyId("6");

		stockRepo.save(stockDataDto);

	

		//stockRepo.delete(stockDataDto);
	}
	
	public StockDataDto getAcc(String companyId) {
		return stockRepo.findById("6").get();
	}
	
	public StockDataDto getStockBySymbol(String companyId) {
		return stockRepo.findByCompanyId(companyId);
	}

}
