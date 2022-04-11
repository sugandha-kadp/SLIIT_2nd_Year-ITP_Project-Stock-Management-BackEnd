package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.StockItem;
import com.example.demo.repository.StockItemRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class StockItemController {
	
	@Autowired
	private StockItemRepository StockItemRepository;
	
	//get all StockItem
	
	@GetMapping("/StockItem")
	public List<StockItem> getAllStockItem(){
		return StockItemRepository.findAll();
	}
	
	// create StockItem rest API
	@PostMapping("/StockItem")
	public StockItem createStockItem(@RequestBody StockItem stockItem) {
		return StockItemRepository.save(stockItem);
	
	}
	
	//get Stock Item by id rest API
	@GetMapping("/StockItem/{stockID}")
	public ResponseEntity<StockItem> getStockItemById(@PathVariable Long stockID) {
		StockItem stockItem = StockItemRepository.findById(stockID).orElseThrow(()-> new ResourceNotFoundException("Did not have StockItemID : " + stockID));
		return ResponseEntity.ok(stockItem);
	}
	
	
	//Update Stock Item rest API
	@PutMapping("/StockItem/{stockID}")
	public ResponseEntity<StockItem> updateStockItem(@PathVariable Long stockID, @RequestBody StockItem stockItems){
		
		StockItem stockItem = StockItemRepository.findById(stockID).orElseThrow(()-> new ResourceNotFoundException("Did not have StockItemID : " + stockID));

		stockItem.setItemCode(stockItems.getItemCode());
		stockItem.setItemName(stockItems.getItemName());
		stockItem.setDescription(stockItems.getDescription());
		stockItem.setPrice(stockItems.getPrice());

		StockItem updatedstockItem = StockItemRepository.save(stockItem);
		return ResponseEntity.ok(updatedstockItem);
	}
	
	
}
