package com.nts.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nts.api.dao.Api;
import com.nts.api.dao.LoginMapper;
import com.nts.api.entity.LoginEntity;
@Service
public class LoginService {
	
	@Autowired
	LoginMapper loginmapper;

	public Api getLoginInfo(LoginEntity dto) {
		
		Api api = new Api();
		
		Integer touRokuKkakuNin = loginmapper.getLoginInfo(dto);
		
		if(touRokuKkakuNin == 0) {
			api.success = false;
			api.massage = "社員IDはたパスワードが違います。";
		}
		
		return api;
	};

}
