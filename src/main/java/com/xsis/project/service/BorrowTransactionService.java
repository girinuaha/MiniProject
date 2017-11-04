package com.xsis.project.service;

import java.util.Calendar;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xsis.project.dao.BorrowTransactionDao;
import com.xsis.project.dao.RentHistoryDao;
import com.xsis.project.model.BorrowTransaction;
import com.xsis.project.model.RentHistory;

@Transactional
@Service
public class BorrowTransactionService {
	
	@Autowired
	BorrowTransactionDao borrowTransactionDao;
	@Autowired
	RentHistoryDao rentHistoryDao;
	
	public void save(BorrowTransaction borrowTransaction) {
		borrowTransactionDao.save(borrowTransaction);
		
		Date dueDate = new Date();
		Calendar c = Calendar.getInstance(); 
		c.setTime(borrowTransaction.getBorrowDate()); 
		c.add(Calendar.DATE, 7);
		dueDate = c.getTime();
		
		RentHistory rentHistory = new RentHistory();
		rentHistory.setBorrowTransaction(borrowTransaction);
		rentHistory.setDueDate(dueDate);
		
		rentHistoryDao.save(rentHistory);
	}
	
}
