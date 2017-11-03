package com.xsis.project.dao;

import java.util.List;

import com.xsis.project.model.ReturnTransaction;

public interface ReturnTransactionDao {

	public void save(ReturnTransaction returnTransaction);

	public List<ReturnTransaction> getAllReturnTransactions();

}
