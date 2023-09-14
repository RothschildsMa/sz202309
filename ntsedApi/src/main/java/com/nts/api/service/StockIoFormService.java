package com.nts.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nts.api.dao.IOTypeMapper;
import com.nts.api.dao.StockIoFormMapper;
import com.nts.api.entity.InOutType;
import com.nts.api.entity.StockIo;

@Service
public class StockIoFormService {
	
	@Autowired
	private StockIoFormMapper stockIoFormMapper;
	
	@Autowired
	private IOTypeMapper ioTypeMapper;
	
	public StockIo getStocInfokById(String id) {
		return stockIoFormMapper.getStockInfoById(id);
	}
	
	public List<InOutType> getInOutType(){
		return ioTypeMapper.getInOutType();
	}
	
	public void createStockIo(StockIo stockIo ) {
		
		stockIoFormMapper.insertStockIoForm(stockIo);
	}
	
	
	
	

}
