package com.myserv.dao;

import java.sql.Connection;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.myserv.dbutil.DbConnection;
import com.myserv.model.Product;

public class ProductDao {
	/*public String saveProduct(Product product)
	{
		try {
			Connection con= DbConnection.getConnect();
			String sql="insert into products values(?,?,?,?,?,?)";
			PreparedStatement stat=con.prepareStatement(sql);
			stat.setInt(1,product.getProdId());
			stat.setString(2,product.getProdName());
			stat.setFloat(3,product.getProdPrice());
			stat.setDate(4,new java.sql.Date(product.getMfd().getTime()));
			stat.setString(5,product.getColour());
			stat.setDate(6,new java.sql.Date(product.getExpDate().getTime()));
			
			int res=stat.executeUpdate();
			
			if(res>0)
				return"Product Created";
			
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return"cannot create product";
		}
		
		public ArrayList<Product>getAllProducts()
		{
			try
			{
		
		Connection con=DbConnection.getConnect();
					String sql="select * from products";
					
					PreparedStatement stat=con.prepareStatement(sql);
					ResultSet rs=stat.executeQuery();
					
					ArrayList<Product>productList=new ArrayList<>();
					while(rs.next())
					{
						int prodId=rs.getInt("prod_id");
						String prodName=rs.getString("prod_name");
						float prodPrice=rs.getFloat("prod_price");
						Date mfd=rs.getDate("mfd");
						String colour=rs.getString("colour");
						Date expDate=rs.getDate("exp_date");
						
						Product product = new Product(prodId,prodName,prodPrice,mfd,colour,expDate);
						productList.add(product);
						
					}
					return productList;
		
	}
	catch (Exception e) {
		e.printStackTrace();
		
	}
	return null;

}
		public String DeleteProduct(int prodId) {
		try {
			Connection connection=DbConnection.getConnect();
			String sql="delete from products where prod_id=?";
			PreparedStatement stat=connection.prepareStatement(sql);
			stat.setInt(1, prodId);
			int result=stat.executeUpdate();
			if(result>0)
				return"Product deleted";
			else
				return"Product cannot be deleted";
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return "Exception"+e;
			
		}*/
		public ArrayList<Product>getProductByName(String prodName){
			
			try {
				Connection connection=DbConnection.getConnect();
				String sql="select * from products where prod_name like '"+prodName+"%'";
				
				PreparedStatement stat=connection.prepareStatement(sql);
				
				ResultSet res=stat.executeQuery();
				
				ArrayList<Product>productList=new ArrayList<>();
				
				while(res.next()) {
					int prodId1=res.getInt(1);
					String prodName1=res.getString(2);
					float prodPrice = res.getFloat(3);
					Date mfg=res.getDate(4);
					String color=res.getString(5);
					Date expDate=res.getDate(6);
					Product product = new Product(prodId1,prodName1,prodPrice,mfg,color,expDate);
					productList.add(product);
				}
				return productList;
			}
			catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				
			}
			return null;
					
				}
				
				}
		
		
		

