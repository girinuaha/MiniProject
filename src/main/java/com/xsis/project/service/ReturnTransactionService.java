package com.xsis.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xsis.project.dao.ReturnTransactionDao;
import com.xsis.project.model.ReturnTransaction;

@Transactional
@Service
public class ReturnTransactionService {
	
	@Autowired
	ReturnTransactionDao returnTransactionDao;

	public void save(ReturnTransaction returnTransaction) {
		returnTransactionDao.save(returnTransaction);
	}

	public List<ReturnTransaction> getAllReturnTransactions() {
		return returnTransactionDao.getAllReturnTransactions();
	}

}
