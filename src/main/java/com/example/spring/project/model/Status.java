package com.example.spring.project.model;



import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Table;

@Entity
@Table(name="_statusDet")
public class Status {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int Status_id;
	private String Payment_sta;
	
//	@OneToMany(cascade = CascadeType.ALL,fetch=FetchType.EAGER)
//	@JoinColumn(name = "stat_status_",referencedColumnName = "status_id")
	

	public Status() {
		super();
	}
	public Status(int status, String payment_sta) {
		super();
		Status_id = status;
		Payment_sta = payment_sta;
	}
	public int getStatus() {
		return Status_id;
	}
	public void setStatus(int status) {
		Status_id = status;
	}
	public String getPayment_sta() {
		return Payment_sta;
	}
	public void setPayment_sta(String payment_sta) {
		Payment_sta = payment_sta;
	}

}
