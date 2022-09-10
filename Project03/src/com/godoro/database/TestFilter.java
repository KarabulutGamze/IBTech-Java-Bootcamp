package com.godoro.database;

public class TestFilter {
	public static void main(String[] args) throws Exception {

		String url="jdbc:postgresql://localhost/dbgodoro";
		String user="postgres";
		String password="987654";
		String driver ="org.postgresql.Driver";
		Class.forName(driver);
		
		Connection connection = DriverManager.getConnection(url,user,password);
		
		//String sql ="select * from product where salesprice < ?";
		String sql = "SELECT * FROM product WHERE productName like ?";	
		PreparedStatement statement =connection.prepareStatement(sql);
		statement.setString(1,"%ep Te%");
		ResultSet resultSet = statement.executeQuery();
		while(resultSet.next()) {
			long productId = resultSet.getLong("productId");
			String productName =resultSet.getString("productName");
			double salesPrice = resultSet.getDouble("salesPrice");
			System.out.println(productId + " " + productName + " " + salesPrice);
		}

		
		connection.close();
		

	}
}