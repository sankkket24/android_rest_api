package com.android.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.android.pojo.Inventory;
import com.android.service.InventoryService;

@RestController
public class InventoryController {

	@Autowired
	private InventoryService service;
	
	
	@GetMapping("/inv")
	public List<Inventory> getAllInventory(){
		return service.getAllInventory();
	}
	
	@PostMapping("/save_inv")
	public void saveInventory(@RequestBody Inventory inv) {
		service.saveInventory(inv);
	}
	
	
}
