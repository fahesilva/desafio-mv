package com.desafiomv.models;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "ACCOUNT")
public class Account implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "ID", unique = true, nullable = false)
	@SequenceGenerator(name = "ACCOUNT_SQ", sequenceName = "ACCOUNT_SQ", allocationSize = 1)
	@GeneratedValue(generator = "ACCOUNT_SQ", strategy = GenerationType.SEQUENCE)
	private long id;
	
	@Column(name= "ACC_NUMBER", nullable = false)
	private String accNumber;
	
	@Column(name = "CREATED_AT", nullable = false)
	private Date createdAt;
	
	@Column(name = "OPENING_BALANCE", nullable = false)
	private Float openingBalance;
	
	@Column(name = "CURRENT_BALANCE", nullable = false)
	private Float current_balance;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Float getOpeningBalance() {
		return openingBalance;
	}

	public void setOpeningBalance(Float openingBalance) {
		this.openingBalance = openingBalance;
	}

	public Float getCurrent_balance() {
		return current_balance;
	}

	public void setCurrent_balance(Float current_balance) {
		this.current_balance = current_balance;
	}

}