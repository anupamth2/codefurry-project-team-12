package com.demo.beans;

import java.util.Arrays;
import java.util.Date;
import java.util.Objects;

public class Invoice {
	private int uniqueInvoiceId;
	private Date invoiceDate;
	private Order order;
	private Customer customer;
	private String typeOfGST,status;
	private Product[] listOfProductWithGST;
	private float totalGSTAmount,totalInvoiceValue;
	
	public Invoice(int uniqueInvoiceId, Date invoiceDate, Order order, Customer customer, String typeOfGST,
			String status, Product[] listOfProductWithGST, float totalGSTAmount, float totalInvoiceValue) {
		super();
		this.uniqueInvoiceId = uniqueInvoiceId;
		this.invoiceDate = invoiceDate;
		this.order = order;
		this.customer = customer;
		this.typeOfGST = typeOfGST;
		this.status = status;
		this.listOfProductWithGST = listOfProductWithGST;
		this.totalGSTAmount = totalGSTAmount;
		this.totalInvoiceValue = totalInvoiceValue;
	}

	public Invoice(int uniqInvoiceId, Date date1, int totalGSTAmount2, Order order2, Customer customer2) {
		// TODO Auto-generated constructor stub
		this.uniqueInvoiceId=uniqInvoiceId;
		this.invoiceDate=date1;
		this.totalGSTAmount=totalGSTAmount;
		this.status=null;
		this.order=order2;
		this.customer=customer2;
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(uniqueInvoiceId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Invoice other = (Invoice) obj;
		return uniqueInvoiceId == other.uniqueInvoiceId;
	}

	public int getUniqueInvoiceId() {
		return uniqueInvoiceId;
	}

	public void setUniqueInvoiceId(int uniqueInvoiceId) {
		this.uniqueInvoiceId = uniqueInvoiceId;
	}

	public Date getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getTypeOfGST() {
		return typeOfGST;
	}

	public void setTypeOfGST(String typeOfGST) {
		this.typeOfGST = typeOfGST;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Product[] getListOfProductWithGST() {
		return listOfProductWithGST;
	}

	public void setListOfProductWithGST(Product[] listOfProductWithGST) {
		this.listOfProductWithGST = listOfProductWithGST;
	}

	public float getTotalGSTAmount() {
		return totalGSTAmount;
	}

	public void setTotalGSTAmount(float totalGSTAmount) {
		this.totalGSTAmount = totalGSTAmount;
	}

	public float getTotalInvoiceValue() {
		return totalInvoiceValue;
	}

	public void setTotalInvoiceValue(float totalInvoiceValue) {
		this.totalInvoiceValue = totalInvoiceValue;
	}

	@Override
	public String toString() {
		return "Invoice [uniqueInvoiceId=" + uniqueInvoiceId + ", invoiceDate=" + invoiceDate + ", order=" + order
				+ ", customer=" + customer + ", typeOfGST=" + typeOfGST + ", status=" + status
				+ ", listOfProductWithGST=" + Arrays.toString(listOfProductWithGST) + ", totalGSTAmount="
				+ totalGSTAmount + ", totalInvoiceValue=" + totalInvoiceValue + "]";
	}
	
	
	
}
