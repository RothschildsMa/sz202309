package com.nts.api.entity;


import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class StockIo {
	
	private String id;
	private String name;
	private int unitId;
	private int stockNum;
	
	@NotNull(message = " ※ 入出庫タイプを入力してください")
	private Integer ioTypeId;
	
	@NotNull(message = " ※ 入出庫数を入力してください")
	private Integer ioNum;
	
	private String remarks;
	
}
