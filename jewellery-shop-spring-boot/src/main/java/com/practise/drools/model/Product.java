package com.practise.drools.model;

public class Product {
	
	private String type;
	
	private Double discount = 0d;
	
	private String eventType;
	
	private String buyerType;

	public Product() {
		super();
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public String getBuyerType() {
		return buyerType;
	}

	public void setBuyerType(String buyerType) {
		this.buyerType = buyerType;
	}

	@Override
	public String toString() {
		return "Product [type=" + type + ", discount=" + discount + ", eventType=" + eventType + ", buyerType="
				+ buyerType + "]";
	}

}
