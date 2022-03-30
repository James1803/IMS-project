package com.qa.ims.persistence.domain;

import java.util.Objects;

public class Item {
	
	private long id;
	private String itemName;
	private String itemDesc;
	private Long price;
	
	public Item(String itemName, String itemDesc, Long price) {
		this.setItemName(itemName);
		this.setItemDesc(itemDesc);
		this.setPrice(price);
	}
	
	public Item(Long id, String itemName, String itemDesc, Long price) {
		this.setId(id);
		this.setItemName(itemName);
		this.setItemDesc(itemDesc);
		this.setPrice(price);
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemDesc() {
		return itemDesc;
	}

	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", itemName=" + itemName + ", itemDesc=" + itemDesc + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, itemDesc, itemName, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		return id == other.id && Objects.equals(itemDesc, other.itemDesc) && Objects.equals(itemName, other.itemName)
				&& Objects.equals(price, other.price);
	}

	
	
	
	
	
	
	
}

