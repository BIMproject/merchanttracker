package com.event.Model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "merchants")
public class Merchant {

	private Integer merchant_id;

	private String merchantName;

	private String merchantAddress;

	private User created_by;

	@DateTimeFormat(pattern = "dd/MM/yyyy")
	Date created_date;

	public Merchant() {

	}

	public Merchant(Integer id, String merchantName, String merchantAddress,
			Date date) {
		super();
		this.merchant_id = id;

		this.merchantName = merchantName;

		this.merchantAddress = merchantAddress;

		this.created_date = date;
	}

	@Id
	@GeneratedValue
	public Integer getMerchant_id() {
		return merchant_id;
	}

	public void setMerchant_id(Integer merchant_id) {
		this.merchant_id = merchant_id;
	}

	public String getMerchantName() {
		return merchantName;
	}

	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public String getMerchantAddress() {
		return merchantAddress;
	}

	public void setMerchantAddress(String merchantAddress) {
		this.merchantAddress = merchantAddress;
	}

	public Date getCreated_date() {
		return created_date;
	}

	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id")
	public User getCreated_by() {
		return created_by;
	}

	public void setCreated_by(User created_by) {
		this.created_by = created_by;
	}

}
