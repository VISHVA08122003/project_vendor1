package com.example.spring.project.model;


import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="order_det")
public class ProjectModel {

	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int idno;
	private String products;
	private String order_date ;
	private String due_date;
	private long amount;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="idno")
	private List<Address> addres;


	

	@OneToOne(cascade=CascadeType.ALL,fetch= FetchType.EAGER)
	@JoinColumn(name="staus_id")
	private Status stat;




	public ProjectModel() {
		super();
		// TODO Auto-generated constructor stub
	}




	public ProjectModel(int idno, String products, String order_date, String due_date, long amount,
			List<Address> addres, Status stat) {
		super();
		this.idno = idno;
		this.products = products;
		this.order_date = order_date;
		this.due_date = due_date;
		this.amount = amount;
		this.addres = addres;
		this.stat = stat;
	}




	public int getIdno() {
		return idno;
	}




	public void setIdno(int idno) {
		this.idno = idno;
	}




	public String getProducts() {
		return products;
	}




	public void setProducts(String products) {
		this.products = products;
	}




	public String getOrder_date() {
		return order_date;
	}




	public void setOrder_date(String order_date) {
		this.order_date = order_date;
	}




	public String getDue_date() {
		return due_date;
	}




	public void setDue_date(String due_date) {
		this.due_date = due_date;
	}




	public long getAmount() {
		return amount;
	}




	public void setAmount(long amount) {
		this.amount = amount;
	}




	public List<Address> getAddres() {
		return addres;
	}




	public void setAddres(List<Address> addres) {
		this.addres = addres;
	}




	public Status getStat() {
		return stat;
	}




	public void setStat(Status stat) {
		this.stat = stat;
	}
	
	
	
}
