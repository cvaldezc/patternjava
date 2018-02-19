package org.cvaldezchavez.pc01.generic;

import java.util.List;

public interface ModelGeneric<T> {

	List<T> getList();

	T getEntity(int id);

	int insertEntity(T param);

	boolean updateEntity(T param);

	boolean deleteEntity(T param);

}
