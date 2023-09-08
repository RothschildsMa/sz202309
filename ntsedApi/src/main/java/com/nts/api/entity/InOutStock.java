package com.nts.api.entity;

import lombok.Data;

@Data
public class InOutStock {

	private String stockName; //在库商品名称
	private String unitName; //单位名称
	private int stockNum; //在库数量 
}
