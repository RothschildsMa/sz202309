package com.nts.api.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class testController {

	@GetMapping("/inventoryTest")
	public String testi() {
		return "test";
	}
}