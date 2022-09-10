package com.godoro.pattern;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductManager {
	
	private String url="jdbc:postgresql://localhost/dbgodoro";
	private String user="postgres";
	private String password="987654";
	private String driver="org.postgresql.Driver";
	
	public ProductManager() {
		try {
			Class.forName(driver);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private List<Product> parseList(ResultSet resultSet) throws Exception {
		List<Product> productList=new ArrayList<>();
		while(resultSet.next()) {
			Product product=parse(resultSet);
			productList.add(product);
		}
		return productList;

	}
	
	private Product parse(ResultSet resultSet) throws SQLException {
		long productId=resultSet.getLong("productId");
		String productName=resultSet.getString("productName");
		double salesPrice=resultSet.getDouble("salesPrice");
		Product product=new Product(productId,productName,salesPrice);
		return product;
	}
	
	public List<Product> listByProductNameLike(String productNamePattern) throws Exception {

		Connection connection=DriverManager.getConnection(url,user,password);
		String sql="select * from Product where productName like ?";
		PreparedStatement statement =connection.prepareStatement(sql);
		statement.setString(1,"%"+productNamePattern+"%");
		ResultSet resultSet= statement.executeQuery();
		List<Product> productList=parseList(resultSet);
		 
		connection.close();
		
		return productList;
	}
	
	public List<Product> listBySalesPriceGreater(double salesPriceMin) throws Exception {

		Connection connection=DriverManager.getConnection(url,user,password);
		String sql="select * from Product where salesPrice >= ?";
		PreparedStatement statement =connection.prepareStatement(sql);
		statement.setDouble(1, salesPriceMin);
		ResultSet resultSet= statement.executeQuery();
		List<Product> productList=parseList(resultSet);
		 
		connection.close();
		
		return productList;
	}
	
	public Product find(long productId) throws Exception {
		
		Product product=null;
		Connection connection=DriverManager.getConnection(url,user,password);
				
		String sql="select * from Product where productId = ?";
		PreparedStatement statement =connection.prepareStatement(sql);
		statement.setLong(1, productId);
		ResultSet resultSet= statement.executeQuery();

		if(resultSet.next()) {
			product=parse(resultSet);
		}
		 
		connection.close();
		
		return product;
	}
	
	public List<Product> list() throws Exception {
		
		Connection connection=DriverManager.getConnection(url,user,password);

		String sql="select * from Product";
		PreparedStatement statement =connection.prepareStatement(sql);
		ResultSet resultSet= statement.executeQuery();

		List<Product> productList=parseList(resultSet);
		
		return productList;
		 
	}

	public boolean delete(long productId) throws Exception {
		
		Connection connection=DriverManager.getConnection(url,user,password);
		
		String sql="delete from Product where productId = ?";
		PreparedStatement statement =connection.prepareStatement(sql);
		statement.setLong(1, productId);
		int affected=statement.executeUpdate(); 
		
		connection.close();
				
		System.out.println("Etkilenmiş "+affected);
		return affected>0;
	}	
	
	public boolean update(Product product) throws Exception {
		
		Connection connection=DriverManager.getConnection(url,user,password);
		
		String sql="update Product set productName=?, salesPrice=? where productId = ?";
		PreparedStatement statement =connection.prepareStatement(sql);
		statement.setString(1, product.getProductName());
		statement.setDouble(2, product.getSalesPrice());
		statement.setLong(3, product.getProductId());
		
		int affected=statement.executeUpdate(); 
		
		connection.close();
			
		System.out.println("Etkilenmiş "+affected);
		return affected>0;
	}	
	
	public boolean insert(Product product) throws Exception {
		
		Connection connection=DriverManager.getConnection(url,user,password);
			
		String sql="insert into Product(productName,salesPrice) values(?,?)";
		PreparedStatement statement =connection.prepareStatement(sql);
		statement.setString(1, product.getProductName());
		statement.setDouble(2, product.getSalesPrice());
		int affected=statement.executeUpdate(); 
				
		connection.close();
		
		System.out.println("Etkilenmiş "+affected);		
		return affected>0;
	}
		
}
