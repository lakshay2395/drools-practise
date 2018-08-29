package com.sample.models;

public class Product {
	
	public String type;
	
	public int discount;
	
	public String eventType;
	
	public String buyer;

	public Product() {
		super();
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public String getBuyer() {
		return buyer;
	}

	public void setBuyer(String buyer) {
		this.buyer = buyer;
	}

	@Override
	public String toString() {
		return "Product [type=" + type + ", discount=" + discount + ", eventType=" + eventType + ", buyer=" + buyer
				+ "]";
	}
	
}
