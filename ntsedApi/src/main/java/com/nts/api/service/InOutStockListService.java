package com.nts.api.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nts.api.dao.InOutStockListMapper;
import com.nts.api.entity.InOutStock;

@Service
public class InOutStockListService {
	
	@Autowired
	private InOutStockListMapper inOutStockListMapper;
	

	//取得当前商品在库信息
	public InOutStock getStockDataById(String id) {
		System.out.println("***********************");
		System.out.println(inOutStockListMapper.getStockDataById(id));
		return inOutStockListMapper.getStockDataById(id);
	}

}
