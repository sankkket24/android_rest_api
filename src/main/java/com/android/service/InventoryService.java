package com.android.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.android.model.SumCountModel;
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
	
	public SumCountModel getSumAndCount(){
		int sum = repo.getSum();
		int count = repo.getCount();
		
		SumCountModel model = new SumCountModel();
		model.setCount(count);
		model.setSum(sum);
		return model;
	}
}

