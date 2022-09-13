package com.godoro.composition.manager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.godoro.composition.Employee;
import com.godoro.pattern.Product;

public class EmployeeManager extends BaseManager{
	
	public Employee find(long employeeId) throws Exception {
		Employee employee = null;
		connect();
	    String sql = "select * from Employee where employeeId = ?";
	    PreparedStatement statement = connection.prepareStatement(sql);
		statement.setLong(1, employeeId);
	    ResultSet resultSet= statement.executeQuery();
		if(resultSet.next()) {
			employee.parse(resultSet);
		}
		disconnect();
		return employee;
	}
	

	private Employee parse(ResultSet resultSet) throws Exception{
		long employeeId=resultSet.getLong("employeeId");
		String employeeName = resultSet.getString("employeeName");
		double monthlySalary=resultSet.getDouble("monthlySalary");
		Employee employee = new Employee(employeeId, employeeName, monthlySalary);
        return employee;
	}
}
