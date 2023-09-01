package com.example.spring.project.model;


import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Table;

@Entity
@Table(name="_location")
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int serial_no;
	private String shippingAdd;
	private String billingAdd;
	private String attachments;
	private String actions;
	

	public int getSerial_no() {
		return serial_no;
	}
	public void setSerial_no(int serial_no) {
		this.serial_no = serial_no;
	}
	public Address() {
		super();
	}
	public Address(String shippingAdd, String billingAdd, String attachments, String actions) {
		super();
		this.shippingAdd = shippingAdd;
		this.billingAdd = billingAdd;
		this.attachments = attachments;
		this.actions = actions;
	}
	public Address(int serial_no, String shippingAdd, String billingAdd, String attachments, String actions) {
		super();
		this.serial_no = serial_no;
		this.shippingAdd = shippingAdd;
		this.billingAdd = billingAdd;
		this.attachments = attachments;
		this.actions = actions;
	}
	public String getShippingAdd() {
		return shippingAdd;
	}
	public void setShippingAdd(String shippingAdd) {
		this.shippingAdd = shippingAdd;
	}
	public String getBillingAdd() {
		return billingAdd;
	}
	public void setBillingAdd(String billingAdd) {
		this.billingAdd = billingAdd;
	}
	public String getAttachments() {
		return attachments;
	}
	public void setAttachments(String attachments) {
		this.attachments = attachments;
	}
	public String getActions() {
		return actions;
	}
	public void setActions(String actions) {
		this.actions = actions;
	}
	
	
}
