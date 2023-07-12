package com.android.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.android.model.SumCountModel;
import com.android.pojo.Inventory;
import com.android.repo.InventoryRepo;

@Service
public class InventoryService {

	
	@Autowired
	private InventoryRepo jpaInventoryRepo;
	
	public List<Inventory> getAllInventory(){
		return jpaInventoryRepo.getAllInventory();
	}
	
	public Inventory saveInventory(Inventory inv) {
		return jpaInventoryRepo.save(inv);
	}
	
	@Cacheable(value="Inventory", key = "#id")
	public Inventory getInventory(int id) {
		return jpaInventoryRepo.findById(id).get();
	}
	
	public SumCountModel getSumAndCount(){
		int sum = jpaInventoryRepo.getSum();
		int count = jpaInventoryRepo.getCount();
		
		SumCountModel model = new SumCountModel();
		model.setCount(count);
		model.setSum(sum);
		return model;
	}
}

