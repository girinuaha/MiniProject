package com.xsis.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xsis.project.dao.BookStockDao;
import com.xsis.project.dao.BorrowTransactionDao;
import com.xsis.project.dao.RentHistoryDao;
import com.xsis.project.dao.ReturnTransactionDao;
import com.xsis.project.model.BookStock;
import com.xsis.project.model.BookTransaction;
import com.xsis.project.model.BorrowTransaction;
import com.xsis.project.model.RentHistory;
import com.xsis.project.model.ReturnTransaction;

@Transactional
@Service
public class RentHistoryService {
	
	@Autowired
	RentHistoryDao rentHistoryDao;
	@Autowired
	ReturnTransactionDao returnTransactionDao;
	@Autowired
	BookStockDao bookStockDao;
	@Autowired
	BorrowTransactionDao borrowTransactionDao;
	
	public List<RentHistory> getAllHistories() {
		return rentHistoryDao.getAllHistories(); 
	}

	public RentHistory getHistoryById(int id) {
		return rentHistoryDao.getHistoryById(id);
	}

	public void update(RentHistory rentHistory) {
		ReturnTransaction returnTransaction = rentHistory.getReturnTransaction();
		returnTransactionDao.save(returnTransaction);
		
		rentHistory.setReturnTransaction(returnTransaction);
		rentHistory.setStatus("Book has been Returned");
		rentHistoryDao.update(rentHistory);	
		
		BorrowTransaction borrowTransaction = borrowTransactionDao.getBorrowTransactionById(rentHistory.getBorrowTransaction().getId());
		List<BookTransaction> bookTransactions = borrowTransaction.getBookTransaction();
	
		for (BookTransaction bookTransaction : bookTransactions) {
			BookStock bookStock = bookTransaction.getBook().getBookStock();
			bookStock.setStock(bookStock.getStock() + 1);
		}
	}
}
