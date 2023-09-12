package com.nts.api.dao;

import org.apache.ibatis.annotations.Mapper;

import com.nts.api.entity.StockIo;

@Mapper
public interface StockIoFormMapper {
	
	StockIo getStockInfoById(String id);
	
	void insertStockIoForm(StockIo stockIo);
	
	
}
