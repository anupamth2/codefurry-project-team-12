package com.demo.test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.demo.beans.Customer;
import com.demo.beans.Invoice;
import com.demo.beans.Order;
import com.demo.beans.Product;
import com.demo.dao.DBUtil;
import com.demo.dao.OrderProcessingDao;
import com.demo.dao.OrderProcessingDaoImpl;

public class TestCodeFurry {
	public static void main(String []args)
	{
		System.out.println("hi i m anupam ");
		DBUtil dbutil=new DBUtil();
		OrderProcessingDao order=new OrderProcessingDaoImpl();
			try {
				Connection conn=dbutil.getMyConnection();
				Statement st=conn.createStatement();
				ResultSet rs=st.executeQuery("select *  from myOrder");
				//Customer customer=order.getCustomerDetails(13);
				//Order order1=order.getOrderDetails(8554);
				//System.out.println(order1);
				//Invoice invoice=order.getInvoiceForTheGivenOrder(8554);
				//System.out.println(invoice);
				//ArrayList<Product> arr=order.getProductDetails(8554);
				//System.out.println(arr);
				//Customer c=new Customer(15,"anand","somewhere","pune","anand@4445gmail.com",Integer.toString(780));
				//System.out.println(order.addCustomerDetails(c));
				ArrayList<Product> arr=new ArrayList<>();
 				Product p=new Product(8501,"physice","book",149.9f,8556);
				arr.add(p);
				System.out.println(order.addProductDetails(arr));
 				//System.out.println(arr);
				
	
		
				while(rs.next())
				{
					System.out.println(rs.getInt(1)+" "+rs.getString(2));
				}
				
						} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("error occured ");
				e.printStackTrace();
			}
	}

}
