package com.nts.api.entity;

import java.util.List;

import lombok.Data;

@Data
public class InOutStockList {

	private String stockName; //在庫名称
	private String unitName; //单位名称
	private int stockNum; //在庫数量
	
	private List<InOutItem> inOutItemList;
	
	@Data
    public static class InOutItem {
		private String iOTypeName; //入出庫タイプ名称
		private int iONumber; //入出庫数量
		private String iODate; //入出庫日時
		private String iOUser; //入出庫者
		private String remarks; //備考
    }
}
