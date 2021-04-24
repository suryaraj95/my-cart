package com.mycart.identityms.models;

import java.io.Serializable;

public class ProfileDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -716572344397029123L;
	private String name;
	private String mobile;
	private String address;
	private AccountDetails accountDetails;

	public ProfileDetails() {
	}

	private ProfileDetails(Builder builder) {
		this.name = builder.name;
		this.mobile = builder.mobile;
		this.address = builder.address;
		this.accountDetails = builder.accountDetails;
	}

	public String getName() {
		return name;
	}

	public String getMobile() {
		return mobile;
	}

	public String getAddress() {
		return address;
	}

	public AccountDetails getAccountDetails() {
		return accountDetails;
	}

	public static Builder builder() {
		return new Builder();
	}

	/**
	 * Builder to build {@link ProfileDetails}.
	 */
	public static final class Builder {
		private String name;
		private String mobile;
		private String address;
		private AccountDetails accountDetails;

		private Builder() {
		}

		public Builder withName(String name) {
			this.name = name;
			return this;
		}

		public Builder withMobile(String mobile) {
			this.mobile = mobile;
			return this;
		}

		public Builder withAddress(String address) {
			this.address = address;
			return this;
		}

		public Builder withAccountDetails(AccountDetails accountDetails) {
			this.accountDetails = accountDetails;
			return this;
		}

		public ProfileDetails build() {
			return new ProfileDetails(this);
		}
	}

}
