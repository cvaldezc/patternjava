package org.cvaldezchavez.pc01;

import org.cvaldezchavez.pc01.dao.ClienteDAOImpl;
import org.cvaldezchavez.pc01.model.Cliente;

public class App {

	public static void main(String[] args) {
		Cliente cl = new Cliente();
		cl.setId(2);
		cl.setFirstname("Sthepanie");
		cl.setLastname("Calderon Vargas");
		
		ClienteDAOImpl ex = new ClienteDAOImpl();
		
		System.out.println(ex.insertEntity(cl));
	}

}
