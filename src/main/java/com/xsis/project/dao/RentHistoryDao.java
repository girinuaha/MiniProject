package com.xsis.project.dao;

import java.util.List;

import com.xsis.project.model.RentHistory;

public interface RentHistoryDao {

	List<RentHistory> getAllHistories();

	RentHistory getHistoryById(int id);

	void save(RentHistory rentHistory);

	void update(RentHistory rentHistory);

}
