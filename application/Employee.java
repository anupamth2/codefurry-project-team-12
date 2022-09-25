package com.demo.beans;

import java.util.Objects;

public class Employee {
	private int employeeID;
	private String userName,password;
	
	public Employee(int employeeID, String userName, String password) {
		super();
		this.employeeID = employeeID;
		this.userName = userName;
		this.password = password;
	}

	@Override
	public int hashCode() {
		return Objects.hash(employeeID);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return employeeID == other.employeeID;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Employee [employeeID=" + employeeID + ", userName=" + userName + ", password=" + password + "]";
	}
	
	

}
