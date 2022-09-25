package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import com.demo.beans.Customer;
import com.demo.beans.Employee;
import com.demo.beans.Invoice;
import com.demo.beans.Order;
import com.demo.beans.OrderManagementEmployee;
import com.demo.beans.Product;

public class OrderProcessingDaoImpl implements OrderProcessingDao {
	Connection conn=null;
	PreparedStatement pr=null;
	public OrderProcessingDaoImpl(){
		DBUtil dbutil=new DBUtil();
		try {
			conn=dbutil.getMyConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Override
	public boolean checkEmployeeCredentials(Employee employee)  {
		// TODO Auto-generated method stub
		String sql ="select * from Employee where employeeName=? and employeePassword=?  ";
		try {
		PreparedStatement pr=conn.prepareStatement(sql);
		pr.setString(1, employee.getUserName());
		pr.setString(2, employee.getPassword());
		
		return executePreparedStatment(pr);
			
		}
		catch(Exception e)
		{
			return false;
		}
		
		
		
	}

	@Override
	public boolean checkCustomerCredentials(Customer customer) {
		// TODO Auto-generated method stub
		String sql ="select * from Customer where customerName=?  ";
		try {
		PreparedStatement pr=conn.prepareStatement(sql);
		pr.setString(1, customer.getName());
		return executePreparedStatment(pr);
		
		}
		catch(Exception e)
		{
		return false;
		}
	}
	
	@Override
	public boolean checkAlreadyLoginEmployee(Employee employee) {
		// TODO Auto-generated method stub
		try {
			String sql="select * from Session where uniqEmployeeId=?";
			PreparedStatement pr=conn.prepareStatement(sql);
			pr.setInt(1, employee.getEmployeeID());
			
			
		}
		catch(Exception e)
		{
			return false;
		}
		return false;
	}

	@Override
	public ArrayList<OrderManagementEmployee> getAllOrder() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Invoice getInvoiceForTheGivenOrder(int orderId) {
		// TODO Auto-generated method stub
	
		try {
		pr=conn.prepareStatement("select * from Invoice where uniqOrderId=?");
		pr.setInt(1,orderId);
		ResultSet rs=pr.executeQuery();
		if(rs.next())
		{
			//Invoice invoice=new Invoice(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4),rs.getInt(5));
			int uniqInvoiceId=rs.getInt(1);
		    String date=rs.getString(2);
			Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(date); 
		    int totalGSTAmount=rs.getInt(3);
		    System.out.println(rs.getInt(4)+" o a a ");
		    Order order=getOrderDetails(rs.getInt(4));
		    //System.out.println(order);
		    Customer customer=getCustomerDetails(rs.getInt(5));
		    Invoice invoice=new Invoice(uniqInvoiceId,date1,totalGSTAmount,order,customer);
		    
		    return invoice;
		    

		    
		}
		}
		catch(Exception e)
		{
		return null;
		}
		return null;
	}
	@Override
	public Customer getCustomerDetails(int uniqCustomerID)
	{
		try {
			pr=conn.prepareStatement("select * from Customer where uniqCustomerId=?");
			pr.setInt(1, uniqCustomerID);
			ResultSet rs=pr.executeQuery();
			if(rs.next())
			{
				Customer cs=new Customer(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),Integer.toString(rs.getInt(6)));
				return cs;
				
			}
			
		}
		catch(Exception e)
		{
			return null;
		}
		return null;
	}
	@Override
	public ArrayList<Product> getProductDetails(int uniqOrderId)
	{
		ArrayList<Product> arrProduct=new ArrayList<>();
		try {
			pr=conn.prepareStatement("select * from Product where uniqOrderId=?");
			pr.setInt(1, uniqOrderId);
			ResultSet rs=pr.executeQuery();
			while((rs.next()))
			{
				Product product =new Product(rs.getInt(1),rs.getString(2),rs.getString(4),(float)rs.getInt(3),rs.getInt(5));
				arrProduct.add(product);
			}
			return arrProduct;
		}
		catch(Exception e)
		{
			return null;
		}
		
		
	}
	@Override
	public Order getOrderDetails(int uniqOrderId)
	{
		try {
			pr=conn.prepareStatement("select * from myOrder where uniqOrderId=?");
					pr.setInt(1, uniqOrderId);
			ResultSet rs=pr.executeQuery();
			if(rs.next())
			{
				//Order order=new Order(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getInt(5),rs.getInt(6));
				int uniqOrderId1=rs.getInt(1);
				String orderDate=rs.getString(2);
				Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(orderDate); 
				int shippingCost=rs.getInt(3);
				String shippingAgency=rs.getString(4);
				int status=rs.getInt(5);
				Customer customer=getCustomerDetails(rs.getInt(6));
				ArrayList<Product> productArray=getProductDetails(uniqOrderId1);
				Order order=new Order(uniqOrderId1,date1,shippingCost,shippingAgency,status,customer,productArray);
				return order;
				
			}
		}catch(Exception e)
			{
				return null;
			}
		return null;
			
		}
	

	@Override
	public boolean addCustomerDetails(Customer customer) {
		// TODO Auto-generated method stub
		//insert into customer values(12,"anupam","sajay park","pune","tanupm695@gmail.com",780);
	 String sql="insert into customer values(?,?,?,?,?,?)";
			 try {
				pr=conn.prepareCall(sql);
				 pr.setInt(1,customer.getUniqueCustomerId());
				 pr.setString(2, customer.getName());
				 pr.setString(3, customer.getAddress());
				 pr.setString(4,customer.getCity());
				 pr.setString(5,customer.getEmail());
				 pr.setInt(6,Integer.parseInt(customer.getGSTNumber()));
				 int n=pr.executeUpdate();
			
				 if(n>0)
					 return true;
				 else
					 return false;
				 
			} catch (SQLException e) {
				// TODO Auto-generated catch block
			//	e.printStackTrace();
				return false;
			}
			
		
		
	}

	@Override
	public boolean checkCustomerExist(Customer customer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addProductDetails(ArrayList<Product> product) {
		// TODO Auto-generated method stub
		String sql="insert into product values(?,?,?,?,?,?)";
		for(int i=0;i<product.size();i++)
		{
			try {
			pr=conn.prepareStatement(sql);
			pr.setInt(1, product.get(i).getUniqueProductId());
			pr.setString(2, product.get(i).getName());
			pr.setInt(3,(int)product.get(i).getPrice() );
			pr.setString(4, product.get(i).getProductCategory());
			
			pr.setInt(5, product.get(i).getUniqGSTid());
			pr.setInt(6, product.get(i).getOrderId());
			pr.executeUpdate();
			
		}
			catch(Exception e){
				e.printStackTrace();
				return false;
			}
			
		}
		
		
		return true;
	}

	@Override
	public boolean addNewQuote(Date orderDate, Customer customer, ArrayList<Product> product) {
		// TODO Auto-generated method stub
		boolean b1=addCustomerDetails(customer);
		boolean b2=addProductDetails(product);
		
		return b1&&b2;
	}
	private boolean executePreparedStatment(PreparedStatement pr)
	{
		
		try {
			ResultSet rs=pr.executeQuery();
		if(rs.next())
		{
			return true;
		}
		}
		
		catch(Exception e)
		{
			return false;
		}
		return false;
		
	}
	

}
