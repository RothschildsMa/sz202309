package com.nts.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nts.api.dao.Api;
import com.nts.api.entity.LoginEntity;
import com.nts.api.service.LoginService;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	LoginService loginservice;
	
	@PostMapping("/touroku")
	public Api login(LoginEntity dto) {
		return loginservice.getLoginInfo(dto);
	}
	
}
