package com.android.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.android.pojo.Inventory;
import com.android.repo.InventoryRepo;

@Service
public class InventoryService {

	
	@Autowired
	private InventoryRepo repo;
	
	public List<Inventory> getAllInventory(){
		return repo.getAllInventory();
	}
	
	public void saveInventory(Inventory inv) {
		repo.save(inv);
	}
}

