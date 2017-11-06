package com.xsis.project.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xsis.project.model.BookTransaction;

@Repository
public class BookTransactionDaoImpl implements BookTransactionDao{
	
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public void save(BookTransaction bookTransaction) {
		Session session = sessionFactory.getCurrentSession();
		session.save(bookTransaction);
		session.flush();
	}
	
	
}
