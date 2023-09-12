package com.nts.api.service;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nts.api.dao.IOTypeMapper;
import com.nts.api.dao.InOutStockListMapper;
import com.nts.api.entity.InOutStockList;
import com.nts.api.entity.InOutType;

@Service
public class InOutStockListService {
	
	@Autowired
	private IOTypeMapper iOTypeMapper;
	
	@Autowired
	private InOutStockListMapper inOutStockListMapper;

	
	//入出庫タイププルダウンリストを取得
	public List<InOutType> getInOutType(){
		return iOTypeMapper.getInOutType();
	}

	//取得当前商品在库信息和出入库记录
	public InOutStockList getInOutStockListById(String id, int iOTypeId){
		InOutStockList inOutStockList = inOutStockListMapper.getStockDataById(id);//在库信息
		inOutStockList.setInOutItemList(inOutStockListMapper.getIODataListById(id,iOTypeId));//出入库记录
		return inOutStockList;
	}
	
	

}
