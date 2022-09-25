package com.demo.service;

import java.util.ArrayList;
import java.util.Date;

import com.demo.beans.Customer;
import com.demo.beans.Employee;
import com.demo.beans.Invoice;
import com.demo.beans.OrderManagementEmployee;
import com.demo.beans.Product;
import com.demo.exception.NoCustomerFoundException;
import com.demo.exception.NoEmplyeeFoundException;

public interface OrderProcessingServices {
	public String sanatiseTheInput(String s);
	public boolean checkEmployeeCredentials(Employee employee) throws NoEmplyeeFoundException;
	public boolean checkCustomerCredentials(Customer customer) throws NoCustomerFoundException;
	public boolean checkAlreadyLoginEmployee(Employee employee);
	public ArrayList<OrderManagementEmployee> getAllOrder();
	public Invoice getInvoiceForTheGivenOrder(int orderId);
	public ArrayList<Product> removeDuplicateProduct(ArrayList<Product> productArray) ;
	public double calculateShoppingCost(ArrayList<Product> productArray);
	public double totalOrderValue(ArrayList<Product> productArray);
	public boolean addCustomerDetails(Customer customer);
	public boolean checkCustomerExist(Customer customer);
	public boolean addProductDetails(ArrayList<Product> product);
	public boolean addnewQuote(Date orderDate,Customer customer,ArrayList<Product> product);
	
	
	
	
	

}
