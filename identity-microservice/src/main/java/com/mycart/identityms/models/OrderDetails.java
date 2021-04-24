package com.mycart.identityms.models;

import java.time.LocalDate;

public class OrderDetails {

	private Integer orderId;
	private ProductDetails product;
	private LocalDate deliveryDate;
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public ProductDetails getProduct() {
		return product;
	}
	public void setProduct(ProductDetails product) {
		this.product = product;
	}
	public LocalDate getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(LocalDate deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	
	
}
