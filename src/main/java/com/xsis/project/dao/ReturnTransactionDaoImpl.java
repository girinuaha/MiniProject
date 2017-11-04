package com.xsis.project.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xsis.project.model.ReturnTransaction;

@Repository
public class ReturnTransactionDaoImpl implements ReturnTransactionDao{

	@Autowired
	SessionFactory sessionFactory;
	
	public void save(ReturnTransaction returnTransaction) {
		Session session = sessionFactory.getCurrentSession();
		session.save(returnTransaction);
		session.flush();
	}
}
