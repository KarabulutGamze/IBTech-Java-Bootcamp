package com.godoro.composition.manager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseManager {
	
	private String url = "jdbc:postgresql://localhost/postgres";
	private String user = "postgres";
	private String password = "gamze1999";
	private String driver="org.postgresql.Driver";
	
	protected Connection connection;
	
	public BaseManager() {
		try {
	Class.forName(driver);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	protected void connect() throws SQLException {
		connection = DriverManager.getConnection(url,user,password);
	}
	
	protected void disconnect() throws SQLException {
		if (connection!=null) {
			connection.close();
		}
	}
}
