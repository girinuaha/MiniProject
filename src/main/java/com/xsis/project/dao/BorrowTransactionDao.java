package com.xsis.project.dao;

import com.xsis.project.model.BorrowTransaction;

public interface BorrowTransactionDao {

	void save(BorrowTransaction borrowTransaction);

	BorrowTransaction getBorrowTransactionById(int id);

}
