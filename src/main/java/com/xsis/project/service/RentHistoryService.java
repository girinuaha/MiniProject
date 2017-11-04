package com.xsis.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xsis.project.dao.RentHistoryDao;
import com.xsis.project.dao.ReturnTransactionDao;
import com.xsis.project.model.RentHistory;
import com.xsis.project.model.ReturnTransaction;

@Transactional
@Service
public class RentHistoryService {
	
	@Autowired
	RentHistoryDao rentHistoryDao;
	@Autowired
	ReturnTransactionDao returnTransactionDao;
	
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
		rentHistoryDao.update(rentHistory);
		
	}
}
