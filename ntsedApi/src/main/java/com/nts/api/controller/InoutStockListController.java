package com.nts.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.nts.api.entity.InOutStockList;
import com.nts.api.entity.InOutType;
import com.nts.api.service.InOutStockListService;


@Controller
@RequestMapping("/inventory")
public class InoutStockListController {

	@Autowired
	InOutStockListService inOutStockListService;
	
	@GetMapping("/{id}/inoutstocklist")
	public String searching(
			@PathVariable("id") String id,
			@RequestParam(value = "from", required = false, defaultValue = "") String ioDateFrom,
			@RequestParam(value = "to", required = false, defaultValue = "") String ioDateTo,
			@RequestParam(value = "type", required = false, defaultValue = "0") Integer iOTypeId,
			Model model) {
	
		List<InOutType> inOutType = inOutStockListService.getInOutType(); // 创建入出庫タイプ下拉列表
		model.addAttribute("inOutType",inOutType);

		InOutStockList inOutStockList = inOutStockListService.getInOutStockListById(id,ioDateFrom,ioDateTo,iOTypeId);
		model.addAttribute("inOutStockList",inOutStockList); // 显示当前商品在库信息和出入库记录
		model.addAttribute("id",id);
		
		// 以用户选择的条件填充表单字段
	    model.addAttribute("ioDateFrom", ioDateFrom);
	    model.addAttribute("ioDateTo", ioDateTo);
	    model.addAttribute("iOTypeId", iOTypeId);

		return "inout_stock_list";
	}
}
