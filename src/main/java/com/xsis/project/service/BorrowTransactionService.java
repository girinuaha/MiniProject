package com.xsis.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xsis.project.dao.BorrowTransactionDao;
import com.xsis.project.model.BorrowTransaction;

@Transactional
@Service
public class BorrowTransactionService {
	
	@Autowired
	BorrowTransactionDao borrowTransactionDao;
	
	public void save(BorrowTransaction borrowTransaction) {
		borrowTransactionDao.save(borrowTransaction);
	}
	
}
