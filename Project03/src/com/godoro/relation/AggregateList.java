package com.godoro.relation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AggregateList {
	public static void main(String[] args) throws Exception {
		
		String url="jdbc:postgresql://localhost/dbgodoro";
		String user="postgres";
		String password="987654";
		String driver="org.postgresql.Driver";
		Class.forName(driver);

		Connection connection=DriverManager.getConnection(url,user,password);
			
		String sql="select e.departmentid, departmentname,sum(monthlysalary) as salarySum from employee e \r\n"
				+ "	right join department d on e.departmentid = d.depratmentid \r\n"
				+ "group by e.departmentid,departmentname  ";
		PreparedStatement statement =connection.prepareStatement(sql);
		ResultSet resultSet= statement.executeQuery();

		while(resultSet.next()) {

			long departmentId=resultSet.getLong("departmentId");
			String departmentName=resultSet.getString("departmentName");
			double salarySum=resultSet.getDouble("salarySum");

			System.out.println(departmentId+" "+ departmentName+" "+salarySum);
		}
		 
		
		connection.close();
		
	}
}
