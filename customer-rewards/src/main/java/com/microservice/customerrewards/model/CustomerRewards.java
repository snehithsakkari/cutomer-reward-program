package com.microservice.customerrewards.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CustomerRewards {
	
	@Id
	private String id;
	
	private String name;
	
	private float transactionAmount;
	
	@SuppressWarnings("unused")
	private Date date;

	public CustomerRewards() {
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(float transactionAmount) {
		this.transactionAmount = transactionAmount;
	}
	
	public Date getDate() {
		return new Date(System.currentTimeMillis());
	}

	public void setDate(Date date) {
		this.date = date;
	}
	

}
