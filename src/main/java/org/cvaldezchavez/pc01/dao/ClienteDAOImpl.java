package org.cvaldezchavez.pc01.dao;

import java.util.List;

import org.cvaldezchavez.pc01.factory.ConnectFactory;
import org.cvaldezchavez.pc01.generic.ModelGeneric;
import org.cvaldezchavez.pc01.model.Cliente;

public class ClienteDAOImpl implements ModelGeneric<Cliente> {

	@Override
	public List<Cliente> getList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente getEntity(int id) {
		return null;
	}

	@Override
	public int insertEntity(Cliente param) {
		
		return new ConnectFactory<Cliente>().executePreparedStatement(ClientUtil.INSERT.getQuery(), param.toArray());
	}

	@Override
	public boolean updateEntity(Cliente param) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEntity(Cliente param) {
		// TODO Auto-generated method stub
		return false;
	}


}
