package com.demo.beans;

import java.util.Objects;

public class Product {
	private int uniqueProductId;
	private String name,productCategory;
	private float price;
	private int orderId;
	private int uniqGSTid;
	
	public Product(int uniqueProductId, String name, String productCategory, float price, int orderId) {
		super();
		this.uniqueProductId = uniqueProductId;
		this.name = name;
		this.productCategory = productCategory;
		this.price = price;
		this.orderId = orderId;
		this.uniqGSTid=782;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public Product(int uniqueProductId, String name, String productCategory, float price) {
		super();
		this.uniqueProductId = uniqueProductId;
		this.name = name;
		this.productCategory = productCategory;
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(uniqueProductId);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return uniqueProductId == other.uniqueProductId;
	}

	public int getUniqueProductId() {
		return uniqueProductId;
	}

	public void setUniqueProductId(int uniqueProductId) {
		this.uniqueProductId = uniqueProductId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [uniqueProductId=" + uniqueProductId + ", name=" + name + ", productCategory=" + productCategory
				+ ", price=" + price + "]";
	}

	public int getUniqGSTid() {
		return uniqGSTid;
	}

	public void setUniqGSTid(int uniqGSTid) {
		this.uniqGSTid = uniqGSTid;
	}
	
	
	

}
