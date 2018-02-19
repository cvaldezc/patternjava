package org.cvaldezchavez.pc01.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectUtil {
	
	private final String dbname;
	
	public ConnectUtil()
	{
		this.dbname = "test";
	}
	
	public ConnectUtil(String dbname)
	{
		this.dbname = dbname;
	}
	
	public Connection getConnection()
	{
		Connection cn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			cn = DriverManager.getConnection("jdbc:mysql://192.168.2.116:3306/" + dbname, "root", "qwerty");
		} catch (SQLException | InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return cn;
	}

}
