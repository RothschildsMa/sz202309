package com.nts.api.entity;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class StockIo {
	
	private String id;
	private String name;
	private Integer unitId;
	private Integer stockNum;
	
	@NotEmpty(message = " ※ 入出庫タイプを入力してください")
	private Integer ioType;
	
	@NotEmpty(message = " ※ 入出庫数を入力してください")
	private Integer ioNum;
	
	private String remarks;
	
}
