package com.demo.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import com.demo.beans.Customer;
import com.demo.beans.Employee;
import com.demo.beans.Invoice;
import com.demo.beans.Order;
import com.demo.beans.OrderManagementEmployee;
import com.demo.beans.Product;

public interface OrderProcessingDao {
	public Customer getCustomerDetails(int uniqCustomerID);
	public Order getOrderDetails(int uniqOrderId);
	
	
	public ArrayList<Product> getProductDetails(int uniqOrderId);

	boolean checkEmployeeCredentials(Employee employee) ;

	boolean checkCustomerCredentials(Customer customer);

	boolean checkAlreadyLoginEmployee(Employee employee);

	ArrayList<OrderManagementEmployee> getAllOrder();

	Invoice getInvoiceForTheGivenOrder(int orderId);

	boolean addCustomerDetails(Customer customer);

	boolean checkCustomerExist(Customer customer);

	boolean addProductDetails(ArrayList<Product> product);

	boolean addNewQuote(Date orderDate, Customer customer, ArrayList<Product> product);

}
