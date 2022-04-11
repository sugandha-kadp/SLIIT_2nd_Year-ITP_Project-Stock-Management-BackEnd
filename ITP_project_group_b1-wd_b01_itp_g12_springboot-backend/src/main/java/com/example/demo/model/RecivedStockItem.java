package com.example.demo.model;

public class RecivedStockItem {

	private long stockID;
	private String itemCode;
	private String itemName;
	private String description;
	private String price;
	private String lotQuantity;
	
	public RecivedStockItem() {
		
	}
	
	
	public RecivedStockItem(long stockID, String itemCode, String itemName, String description, String price, String lotQuantity) {
		super();
		this.stockID = stockID;
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

