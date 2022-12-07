package com.android.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.android.pojo.Inventory;

@Repository
public interface InventoryRepo extends JpaRepository<Inventory, Integer>{
	
	@Query("SELECT i FROM Inventory i order by i.id desc")
	public List<Inventory> getAllInventory();
	
	@Query("SELECT SUM(i.amount) FROM Inventory i")
	public int getSum();
	
	@Query("SELECT COUNT(i) FROM Inventory i")
	public int getCount();

}
