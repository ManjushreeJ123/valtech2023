package com.valtech.training.hibernate;

import java.io.Serializable;
import java.util.Objects;

public class OrderSummaryId implements Serializable {
	
	private int orderId;
	
	private int itemId;
	
	
	

	@Override
	public int hashCode() {
		return Objects.hash(itemId, orderId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderSummaryId other = (OrderSummaryId) obj;
		return itemId == other.itemId && orderId == other.orderId;
	}

	public OrderSummaryId(int orderId, int itemId) {
		
		this.orderId = orderId;
		this.itemId = itemId;
	}

	public OrderSummaryId() {
		
		
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	
	

}
