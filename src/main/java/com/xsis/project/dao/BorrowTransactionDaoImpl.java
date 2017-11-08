package com.xsis.project.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xsis.project.model.BorrowTransaction;
import com.xsis.project.service.RentHistoryService;

@Repository
public class BorrowTransactionDaoImpl implements BorrowTransactionDao {
	
	@Autowired
	SessionFactory sessionFactory;
	@Autowired
	RentHistoryService rentHistoryService;
	
	public void save(BorrowTransaction borrowTransaction) {
		Session session = sessionFactory.getCurrentSession();
		session.save(borrowTransaction);
		session.flush();
	}

	public BorrowTransaction getBorrowTransactionById(int id) {
		Session session = sessionFactory.getCurrentSession();
		BorrowTransaction borrowTransaction = session.get(BorrowTransaction.class, id);
		return borrowTransaction;
	}
	
	
}
