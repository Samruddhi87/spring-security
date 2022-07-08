package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



import lombok.Data;

@Data
@Entity
@Table(name="customer_table")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customer_id;
	@Column(name="CustName")
	private String CustName;
	@Column(name="App_ID")
	private String App_ID;
	@Column(name="completed_date")
	private String completed_date;
	@Column(name="city")
	private String city;
	@Column(name="loan_product")
	private String loan_product;
	@Column(name="beaure_score")
	private int beaure_score;
	@Column(name="user_stage")
	private String user_stage;
	@Column(name="loan_offered")
	private  int loan_offered;
	@Column(name="user")
	private String user;
	
	public Customer() {
		
	}
	public Customer(int customer_id, String custName, String app_ID, String completed_date, String city,
			String loan_product, int beaure_score, String user_stage, int loan_offered, String user) {
		super();
		this.customer_id = customer_id;
		this.CustName = custName;
		this.App_ID = app_ID;
		this.completed_date = completed_date;
		this.city = city;
		this.loan_product = loan_product;
		this.beaure_score = beaure_score;
		this.user_stage = user_stage;
		this.loan_offered = loan_offered;
		this.user = user;
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getCustName() {
		return CustName;
	}
	public void setCustName(String custName) {
		CustName = custName;
	}
	public String getApp_ID() {
		return App_ID;
	}
	public void setApp_ID(String app_ID) {
		App_ID = app_ID;
	}
	public String getCompleted_date() {
		return completed_date;
	}
	public void setCompleted_date(String completed_date) {
		this.completed_date = completed_date;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getLoan_product() {
		return loan_product;
	}
	public void setLoan_product(String loan_product) {
		this.loan_product = loan_product;
	}
	public int getBeaure_score() {
		return beaure_score;
	}
	public void setBeaure_score(int beaure_score) {
		this.beaure_score = beaure_score;
	}
	public String getUser_stage() {
		return user_stage;
	}
	public void setUser_stage(String user_stage) {
		this.user_stage = user_stage;
	}
	public int getLoan_offered() {
		return loan_offered;
	}
	public void setLoan_offered(int loan_offered) {
		this.loan_offered = loan_offered;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "Customer [customer_id=" + customer_id + ", CustName=" + CustName + ", App_ID=" + App_ID
				+ ", completed_date=" + completed_date + ", city=" + city + ", loan_product=" + loan_product
				+ ", beaure_score=" + beaure_score + ", user_stage=" + user_stage + ", loan_offered=" + loan_offered
				+ ", user=" + user + "]";
	}
	
	

}

