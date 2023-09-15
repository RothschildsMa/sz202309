package com.nts.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/inventory")
public class InventoryController {

    @GetMapping("/form")
    public String showInventoryForm(Model model) {
       
        return "inventory";
    }

    @PostMapping("/submit")
    public String submitInventoryForm(
        @RequestParam("stockName") String stockName,
        @RequestParam("unitSelect") String unitSelect,
        @RequestParam("remarks") String remarks,
        Model model
    ) {
        
        return "redirect:/inventory/form";
    }
}