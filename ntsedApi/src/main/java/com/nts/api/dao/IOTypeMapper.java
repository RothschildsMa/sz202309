package com.nts.api.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.nts.api.entity.InOutType;

@Mapper
public interface IOTypeMapper {

	//入出庫タイププルダウンリストを取得
	List<InOutType>getInOutType();

}
