package com.nts.api.dao;

import org.apache.ibatis.annotations.Mapper;

import com.nts.api.entity.LoginEntity;

@Mapper
public interface LoginMapper {
	
	Integer getLoginInfo(LoginEntity dto);
	
}
