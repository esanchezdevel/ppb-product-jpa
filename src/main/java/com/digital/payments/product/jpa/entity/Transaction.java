package com.digital.payments.product.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "transactions")
public class Transaction extends BaseEntity {

	@Column(name  = "user_ip")
	private String userIp;
	
	@Column(name = "user_email")
	private String userEmail;

	public String getUserIp() {
		return userIp;
	}

	public void setUserIp(String userIp) {
		this.userIp = userIp;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	@Override
	public String toString() {
		return "Transaction [" + (userIp != null ? "userIp=" + userIp + ", " : "")
				+ (userEmail != null ? "userEmail=" + userEmail + ", " : "") + "id=" + id + ", "
				+ (created != null ? "created=" + created + ", " : "") + (updated != null ? "updated=" + updated : "")
				+ "]";
	}
}
