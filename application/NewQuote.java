package com.demo.beans;

import java.util.ArrayList;
import java.util.Date;

public class NewQuote {
	private Date orderDate;
	private int customerID;
	ArrayList<Product> productArray;
	public NewQuote(Date orderDate, int customerID, ArrayList<Product> productArray) {
		super();
		this.orderDate = orderDate;
		this.customerID = customerID;
		this.productArray = productArray;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public ArrayList<Product> getProductArray() {
		return productArray;
	}
	public void setProductArray(ArrayList<Product> productArray) {
		this.productArray = productArray;
	}
	

}
