package com.nts.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nts.api.entity.InOutStock;
import com.nts.api.service.InOutStockListService;

@Controller
@RequestMapping("/inventory")
public class InoutStockListController {
	
	@Autowired
	InOutStockListService inOutStockListService;
	
	@GetMapping("/{id}/inoutstocklist")
	public String showInOutStockList(@PathVariable("id") String id, Model model) {
		
		InOutStock inOutStock = inOutStockListService.getStockDataById(id);
		model.addAttribute("inOutStock",inOutStock);
		
		return "inout_stock_list";
	}
	
}
