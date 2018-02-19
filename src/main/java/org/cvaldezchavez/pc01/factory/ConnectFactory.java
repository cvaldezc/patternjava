package org.cvaldezchavez.pc01.factory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectFactory<T> {

	private final ConnectUtil db;
	
	public ConnectFactory()
	{
		db = new ConnectUtil();
	}
	
	public int executePreparedStatement(String query, Object[] param)
	{
		int status = 0;
		try (
				Connection cn = db.getConnection();
				PreparedStatement ps = cn.prepareStatement(query)
		){
			for (int i = 0; i < param.length; i++) {
				Object object = param[i];
				ps.setObject(i+1, object);
			}
			status = ps.executeUpdate();
		} catch (Exception e) {
			status = 0;
			e.printStackTrace();
		}
		return status;
	}
	
	public ResultSet getEntities(String query, Object[] params)
	{
		try (Connection cn = db.getConnection();
                PreparedStatement ps = cn.prepareStatement(query);
                ResultSet rs = ps.executeQuery()) {

            return rs;

        } catch (SQLException e) {
            e.printStackTrace();
        }
		return null;
	}
	
}
