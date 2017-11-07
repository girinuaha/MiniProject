package com.xsis.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xsis.project.dao.BookTransactionDao;
import com.xsis.project.model.BookTransaction;
import com.xsis.project.model.BorrowTransaction;

@Transactional
@Service
public class BookTransactionService {
	
	@Autowired
	BookTransactionDao bookTransactionDao;
	
	public List<BookTransaction> getBookTransactionByBorrowTransaction(BorrowTransaction borrowTransaction) {
		return bookTransactionDao.getBookTransactionByBorrowTransaction(borrowTransaction);
	}

}
