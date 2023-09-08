package com.nts.api.dao;

import org.apache.ibatis.annotations.Mapper;

import com.nts.api.entity.InOutStock;

@Mapper
public interface InOutStockListMapper {
	
	//取得当前商品在库信息
	InOutStock getStockDataById(String id);
}
