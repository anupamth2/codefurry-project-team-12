package com.demo.beans;

import java.util.Objects;

public class Customer {
	private int uniqueCustomerId,pincode,phone;
	private String name,GSTNumber,address,city,email;
	
	public Customer(int uniqueCustomerId, String name, String address, String city, String email, String gSTNumber) {
		super();
		this.uniqueCustomerId = uniqueCustomerId;
		this.name = name;
		this.address = address;
		this.city = city;
		this.email = email;
		GSTNumber = gSTNumber;
		this.phone=0;
		this.pincode=544322;
	}

	public Customer(int uniqueCustomerId, int pincode, int phone, String name, String GSTNumber,String address,
			String city, String email) {
		super();
		this.uniqueCustomerId = uniqueCustomerId;
		this.GSTNumber = GSTNumber;
		this.pincode = pincode;
		this.phone = phone;
		this.name = name;
		this.address = address;
		this.city = city;
		this.email = email;
	}

	@Override
	public int hashCode() {
		return Objects.hash(uniqueCustomerId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return uniqueCustomerId == other.uniqueCustomerId;
	}

	public int getUniqueCustomerId() {
		return uniqueCustomerId;
	}

	public void setUniqueCustomerId(int uniqueCustomerId) {
		this.uniqueCustomerId = uniqueCustomerId;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGSTNumber() {
		return GSTNumber;
	}

	public void setGSTNumber(String gSTNumber) {
		GSTNumber = gSTNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Customer [uniqueCustomerId=" + uniqueCustomerId + ", pincode=" + pincode + ", phone=" + phone
				+ ", name=" + name + ", GSTNumber=" + GSTNumber + ", address=" + address + ", city=" + city + ", email="
				+ email + "]";
	}
}
