package com.spring.data.redis.crud.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.spring.data.redis.crud.example.domain.StockDataDto;

public interface StockDataRepository extends CrudRepository<StockDataDto, String> {

	public StockDataDto findByCompanyId(String companyId);
	
}