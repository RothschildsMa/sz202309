package com.nts.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nts.api.entity.InOutType;
import com.nts.api.entity.StockIo;
import com.nts.api.service.StockIoFormService;

import jakarta.validation.Valid;

@Controller
public class StockIoFormController {
	
	@Autowired
	private StockIoFormService stockIoFormService;
	
	
	@GetMapping("/{id}/stockioregister")
	public String stockioForm(@PathVariable String id,Model model) {
		
		
		StockIo existingStock= stockIoFormService.getStocInfokById(id);
		model.addAttribute("stockIoForm", existingStock);
		
		List<InOutType> inOutType = stockIoFormService.getInOutType();
		model.addAttribute("inOutType", inOutType);
		
		return "stockIoForm";
	}
	
	@PostMapping("/submit")
	public String createStockio(@Valid StockIo stockIo,BindingResult bindingResult,
			@RequestParam("button") String button) {
		if ("登録".equals(button)) {
			if(bindingResult.hasErrors()) {
				return "stockIoForm";
			}
	
			stockIoFormService.createStockIo(stockIo);
		}	
		String url = "redirect:/inventory/" + stockIo.getId() + "/inoutstocklist";
		return url;

	}
}
