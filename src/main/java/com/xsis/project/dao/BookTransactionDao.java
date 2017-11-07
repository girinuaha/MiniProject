package com.xsis.project.dao;

import java.util.List;

import com.xsis.project.model.BookTransaction;
import com.xsis.project.model.BorrowTransaction;

public interface BookTransactionDao {

	void save(BookTransaction bookTransaction);

	List<BookTransaction> getBookTransactionByBorrowTransaction(BorrowTransaction borrowTransaction);

}
