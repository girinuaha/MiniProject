package com.xsis.project.service;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xsis.project.dao.BookDao;
import com.xsis.project.dao.BookStockDao;
import com.xsis.project.dao.BookTransactionDao;
import com.xsis.project.dao.BorrowTransactionDao;
import com.xsis.project.dao.RentHistoryDao;
import com.xsis.project.model.Book;
import com.xsis.project.model.BookStock;
import com.xsis.project.model.BookTransaction;
import com.xsis.project.model.BorrowTransaction;
import com.xsis.project.model.RentHistory;

@Transactional
@Service
public class BorrowTransactionService {
	
	@Autowired
	BorrowTransactionDao borrowTransactionDao;
	@Autowired
	RentHistoryDao rentHistoryDao;
	@Autowired
	BookTransactionDao bookTransactionDao;
	@Autowired
	BookDao bookDao;
	@Autowired
	BookStockDao bookStockDao;
	
	public void save(BorrowTransaction borrowTransaction) {
		
		borrowTransactionDao.save(borrowTransaction);

		List<BookTransaction> bookTransactions = borrowTransaction.getBookTransaction();	
		
		for (BookTransaction bookTransaction : bookTransactions) {
			bookTransaction.setBorrowTransaction(borrowTransaction);
			Book book = bookDao.getBookById(bookTransaction.getBook().getId());
			BookStock bookStock = book.getBookStock();
			bookStock.setStock(bookStock.getStock() - 1);
			bookStockDao.update(bookStock);
			bookTransactionDao.save(bookTransaction);
		}
		
		Date dueDate = new Date();
		Calendar c = Calendar.getInstance(); 
		c.setTime(borrowTransaction.getBorrowDate()); 
		c.add(Calendar.DATE, 7);
		dueDate = c.getTime();
		
		RentHistory rentHistory = new RentHistory();
		rentHistory.setBorrowTransaction(borrowTransaction);
		rentHistory.setDueDate(dueDate);
		rentHistory.setStatus("Waiting for Return");
		
		rentHistoryDao.save(rentHistory);
	}
	
}
