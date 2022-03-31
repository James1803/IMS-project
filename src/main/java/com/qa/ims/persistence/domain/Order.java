package com.qa.ims.persistence.domain;

import java.util.Objects;

public class Order {
	
	private Long id;
	private String items;
	
	
	public Order(String items) {
		this.setItems(items);
		
	}
	
	public Order(Long id, String items) {
		this.setId(id);
		this.setItems(items);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getItems() {
		return items;
	}

	public void setItems(String items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", items=" + items + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, items);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		return Objects.equals(id, other.id) && Objects.equals(items, other.items);
	}

	
	
	
}
