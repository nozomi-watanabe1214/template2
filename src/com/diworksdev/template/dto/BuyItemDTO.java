package com.diworksdev.template.dto;

public class BuyItemDTO {
	private int id;
	private String itemName;
	private String itemPrice;

	public String getItemName(){
		return itemName;
		}
	public void setItemName(String itemName){
		this.itemName = itemName;
		}

	public String getItemPrice(){
		return itemPrice;
		}
	public void setItemPrice(String itemPrice){
		this.itemPrice = itemPrice;
		}

	public int getID(){
		return id;
		}
	public void setID(int id){
		this.id = id;
		}
}
