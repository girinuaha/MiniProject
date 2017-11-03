package com.xsis.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xsis.project.dao.RentHistoryDao;
import com.xsis.project.model.RentHistory;

@Transactional
@Service
public class RentHistoryService {
	
	@Autowired
	RentHistoryDao rentHistoryDao;
	
	public List<RentHistory> getAllHistories() {
		return rentHistoryDao.getAllHistories(); 
	}
}
