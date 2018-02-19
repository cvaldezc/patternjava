package org.cvaldezchavez.pc01.dao;

public enum ClientUtil {

	INSERT("INSERT INTO CLIENTE VALUES(?, ?, ?)"),
	UPDATE("UPDATE CLIENTE SET WHERE id = ?"),
	DELETE("DELETE FROM CLIENTE WHERE id = ?");
	
	private final String query; 
	
	ClientUtil(String query) {
		this.query = query;
	}
	
	public String getQuery() {
		return this.query;
	}
}
