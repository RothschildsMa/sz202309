package com.nts.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nts.api.dao.StockIoFormMapper;
import com.nts.api.entity.StockIo;

@Service
public class StockIoFormService {
	
	@Autowired
	private StockIoFormMapper stockIoFormMapper;
	
	public StockIo getStocInfokById(String id) {
		return stockIoFormMapper.getStockInfoById(id);
	}
	
	
	public void createStockIo(StockIo stockIo) {
		stockIoFormMapper.insertStockIoForm(stockIo);
	}
	
	
	
	

}
