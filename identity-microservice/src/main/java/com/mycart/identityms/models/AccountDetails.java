package com.mycart.identityms.models;

public class AccountDetails {

	private Integer accountId;
	private String accountType;
	private OrderDetails order;
	public Integer getAccountId() {
		return accountId;
	}
	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public OrderDetails getOrder() {
		return order;
	}
	public void setOrder(OrderDetails order) {
		this.order = order;
	}
	
	
}
