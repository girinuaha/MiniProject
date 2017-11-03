package com.xsis.project.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xsis.project.model.RentHistory;

@Repository
@SuppressWarnings("unchecked")
public class RentHistoryDaoImpl implements RentHistoryDao {
	
	@Autowired
	SessionFactory sessionFactory;
	
	public List<RentHistory> getAllHistories() {
		Session session = sessionFactory.getCurrentSession();
		String hql = "from RentHistory";
		List<RentHistory> rentHistory = session.createQuery(hql).list();
		if (rentHistory.isEmpty()) {
			return null;
		}
		return rentHistory;
	}
}
