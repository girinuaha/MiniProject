package com.xsis.project.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xsis.project.model.BookTransaction;
import com.xsis.project.model.BorrowTransaction;

@Repository
@SuppressWarnings("unchecked")
public class BookTransactionDaoImpl implements BookTransactionDao{
	
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public void save(BookTransaction bookTransaction) {
		Session session = sessionFactory.getCurrentSession();
		session.save(bookTransaction);
		session.flush();
	}

	@Override
	public List<BookTransaction> getBookTransactionByBorrowTransaction(BorrowTransaction borrowTransaction) {
		Session session = sessionFactory.getCurrentSession();
		String hql = "from BookTransaction bt where bt.borrowTransaction = :borrowTransaction";
		List<BookTransaction> bookTransactions = session.createQuery(hql).setParameter("borrowTransaction", borrowTransaction).list();
		if (bookTransactions.isEmpty()) {
			return null;
		}
		return bookTransactions;
	}

}
