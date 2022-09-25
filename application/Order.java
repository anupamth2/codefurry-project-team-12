package com.demo.beans;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Objects;

public class Order {
	private int uniqueOrderId;
	private Date orderDate;
	private Customer customer;
	public Order(int uniqueOrderId, Date orderDate, float shippingCost, String shippingAgency, String status,
			Customer customer, ArrayList<Product> listOfProduct) {
		super();
		this.uniqueOrderId = uniqueOrderId;
		this.orderDate = orderDate;
		this.shippingCost = shippingCost;
		this.shippingAgency = shippingAgency;
		this.status = status;
		this.customer = customer;
		this.listOfProduct = listOfProduct;
	}
	private String shippingAgency,status;
	private ArrayList<Product> listOfProduct;
	private float totalOrderValue,shippingCost;
	public Order(int uniqueOrderId, Date orderDate, Customer customer, String shippingAgency, String status,
			ArrayList<Product> listOfProduct, float totalOrderValue, float shippingCost) {
		super();
		this.uniqueOrderId = uniqueOrderId;
		this.orderDate = orderDate;
		this.customer = customer;
		this.shippingAgency = shippingAgency;
		this.status = status;
		this.listOfProduct = listOfProduct;
		this.totalOrderValue = totalOrderValue;
		this.shippingCost = shippingCost;
	}
	public Order(int uniqOrderId1, Date date1, int shippingCost2, String shippingAgency2, int status2,
			Customer customer2, ArrayList<Product> productArray) {
		this.uniqueOrderId=uniqOrderId1;
		this.orderDate=date1;
		this.shippingCost=(float)shippingCost2;
		this.shippingAgency=shippingAgency2;
		this.status=Integer.toString(status2);
		this.totalOrderValue=0;
		this.customer=customer2;
		this.listOfProduct=productArray;
		
		
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		return Objects.hash(uniqueOrderId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		return uniqueOrderId == other.uniqueOrderId;
	}
	
	public int getUniqueOrderId() {
		return uniqueOrderId;
	}
	public void setUniqueOrderId(int uniqueOrderId) {
		this.uniqueOrderId = uniqueOrderId;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public String getShippingAgency() {
		return shippingAgency;
	}
	public void setShippingAgency(String shippingAgency) {
		this.shippingAgency = shippingAgency;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public ArrayList<Product> getListOfProduct() {
		return listOfProduct;
	}
	public void setListOfProduct(ArrayList<Product> listOfProduct) {
		this.listOfProduct = listOfProduct;
	}
	public float getTotalOrderValue() {
		return totalOrderValue;
	}
	public void setTotalOrderValue(float totalOrderValue) {
		this.totalOrderValue = totalOrderValue;
	}
	public float getShippingCost() {
		return shippingCost;
	}
	public void setShippingCost(float shippingCost) {
		this.shippingCost = shippingCost;
	}
	@Override
	public String toString() {
		return "Order [uniqueOrderId=" + uniqueOrderId + ", orderDate=" + orderDate + ", customer=" + customer
				+ ", shippingAgency=" + shippingAgency + ", status=" + status + ", listOfProduct="
				+ listOfProduct + ", totalOrderValue=" + totalOrderValue + ", shippingCost="
				+ shippingCost + "]";
	}
		
}