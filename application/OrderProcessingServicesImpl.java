package com.demo.service;

import java.util.ArrayList;
import java.util.Date;

import com.demo.beans.Customer;
import com.demo.beans.Employee;
import com.demo.beans.Invoice;
import com.demo.beans.OrderManagementEmployee;
import com.demo.beans.Product;
import com.demo.dao.OrderProcessingDao;
import com.demo.dao.OrderProcessingDaoImpl;
import com.demo.exception.NoCustomerFoundException;
import com.demo.exception.NoEmplyeeFoundException;

public class OrderProcessingServicesImpl implements OrderProcessingServices {
   OrderProcessingDao orderProcessingDao =new OrderProcessingDaoImpl();
	@Override
	public String sanatiseTheInput(String s) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public boolean checkEmployeeCredentials(Employee employee) throws NoEmplyeeFoundException {
		// TODO Auto-generated method stub
		return  orderProcessingDao.checkEmployeeCredentials(employee);
	}

	@Override
	public boolean checkCustomerCredentials(Customer customer) throws NoCustomerFoundException {
		// TODO Auto-generated method stub
		return orderProcessingDao.checkCustomerCredentials(customer);
		
		
		
	}

	@Override
	public boolean checkAlreadyLoginEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return orderProcessingDao.checkAlreadyLoginEmployee(employee);
		
	}

	@Override
	public ArrayList<OrderManagementEmployee> getAllOrder() {
		
		// TODO Auto-generated method stub
		return orderProcessingDao.getAllOrder();
	}

	@Override
	public Invoice getInvoiceForTheGivenOrder(int orderId) {
		// TODO Auto-generated method stub
		return orderProcessingDao.getInvoiceForTheGivenOrder(orderId);
		
	}

	@Override
	public ArrayList<Product> removeDuplicateProduct(ArrayList<Product> productArray) {
		// TODO Auto-generated method stub
		
 		for(int i=0;i<productArray.size();i++)
		{
			for(int j=0;j<productArray.size();j++)
			{
				if(i!=j)
				{
					if(productArray.get(i).getUniqueProductId()==productArray.get(j).getUniqueProductId())
					{
						productArray.remove(j);
						break;
					}
				}
			}
		}
		return productArray;
	}

	@Override
	public double calculateShoppingCost(ArrayList<Product> productArray) {
		// TODO Auto-generated method stub
		double sum=0;
		for(int i=0;i<productArray.size();i++)
		{
			sum+=productArray.get(i).getPrice();
		}
		return sum;
	}

	@Override
	public double totalOrderValue(ArrayList<Product> productArray) {
		// TODO Auto-generated method stub
		double sum=0;
		for(int i=0;i<productArray.size();i++)
		{
			sum+=productArray.get(i).getPrice();
		}
		return sum;
		
	}

	@Override
	public boolean addCustomerDetails(Customer customer) {
		// TODO Auto-generated method stub
		
		return orderProcessingDao.addCustomerDetails(customer);
	}

	@Override
	public boolean checkCustomerExist(Customer customer) {
		// TODO Auto-generated method stub
		
		return orderProcessingDao.checkCustomerExist(customer);
	}

	@Override
	public boolean addProductDetails(ArrayList<Product> product) {
		// TODO Auto-generated method stub
		return orderProcessingDao.addProductDetails(product);
		
	}

	@Override
	public boolean addnewQuote(Date orderDate, Customer customer, ArrayList<Product> product) {
		// TODO Auto-generated method stub
		
		return orderProcessingDao.addNewQuote(orderDate,customer,product);
	}

}
