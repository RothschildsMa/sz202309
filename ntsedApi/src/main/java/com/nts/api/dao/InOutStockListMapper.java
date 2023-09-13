package com.nts.api.dao;

import java.util.List;


import org.apache.ibatis.annotations.Mapper;

import com.nts.api.entity.InOutStockList;


@Mapper
public interface InOutStockListMapper {
	
	//取得当前商品在库信息
	InOutStockList getStockDataById(String id);
	
	//取得当前商品出入库记录
	List<InOutStockList.InOutItem> getIODataListById(String id, String ioDateFrom, String ioDateTo, int iOTypeId);

}
