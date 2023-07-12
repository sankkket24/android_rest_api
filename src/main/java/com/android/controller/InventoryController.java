package com.android.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.android.model.SumCountModel;
import com.android.pojo.Inventory;
import com.android.service.InventoryService;

import jakarta.annotation.Resource;

@RestController
public class InventoryController {

	@Autowired
	private InventoryService service;
	
	@Resource
	RedisTemplate<String, Object> redisTemplate;
	
	@GetMapping("/inv")
	public List<Inventory> getAllInventory(){
		return service.getAllInventory();
	}
	
	@GetMapping("/inv/{id}")
	public Inventory getInventory(@PathVariable int id) {
		return service.getInventory(id);
	}
	
	@GetMapping("/sumcount")
	public SumCountModel getSumAndCount() {
		return service.getSumAndCount();
	}
	
	@PostMapping("/save_inv")
	public void saveInventory(@RequestBody Inventory inv) {
		Inventory i=service.saveInventory(inv);
	}
		
	
}
