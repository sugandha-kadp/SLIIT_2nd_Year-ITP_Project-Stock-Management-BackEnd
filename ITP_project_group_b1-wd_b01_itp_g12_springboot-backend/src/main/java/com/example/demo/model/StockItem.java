package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "stockitems")
public class StockItem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long stockID;
	
	@Column(name = "itemCode")
	private String itemCode;
	
	@Column(name = "itemName")
	private String itemName;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "price")
	private String price;
	
	@Column(name = "lotQuantity")
	private String lotQuantity;
	
	public StockItem() {
		
	}
	
	
	public StockItem(String itemCode, String itemName, String description, String price, String lotQuantity) {
		super();
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.description = description;
		this.price = price;
		this.lotQuantity = lotQuantity;
	}

	public long getStockID() {
		return stockID;
	}


	public void setStockID(long stockID) {
		this.stockID = stockID;
	}


	public String getItemCode() {
		return itemCode;
	}


	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}


	public String getItemName() {
		return itemName;
	}


	public void setItemName(String itemName) {
		this.itemName = itemName;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getPrice() {
		return price;
	}


	public void setPrice(String price) {
		this.price = price;
	}


	public String getLotQuantity() {
		return lotQuantity;
	}


	public void setLotQuantity(String lotQuantity) {
		this.lotQuantity = lotQuantity;
	}
	
}
