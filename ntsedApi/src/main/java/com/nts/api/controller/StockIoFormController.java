package com.nts.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.nts.api.entity.StockIo;
import com.nts.api.service.StockIoFormService;

@Controller
public class StockIoFormController {
	
	@Autowired
	private StockIoFormService stockIoFormService;
	
	@GetMapping("/{id}/stockioregister")
	public String stockioForm(@PathVariable String id,Model model) {
		StockIo existingStock= stockIoFormService.getStocInfokById(id);
		model.addAttribute("stockIoForm", existingStock);
		
		return "stockIoForm";
	}
}
