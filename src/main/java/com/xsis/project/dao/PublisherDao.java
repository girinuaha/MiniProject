package com.xsis.project.dao;

import java.util.List;

import com.xsis.project.model.Publisher;

public interface PublisherDao {

	List<Publisher> getAllPublisher();

	void save(Publisher publisher);

	Publisher getPublisherById(int id);

	void update(Publisher publisher);

	void delete(int id);

}
