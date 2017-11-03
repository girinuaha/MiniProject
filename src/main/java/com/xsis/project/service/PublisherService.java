package com.xsis.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xsis.project.dao.PublisherDao;
import com.xsis.project.model.Publisher;

@Transactional
@Service
public class PublisherService {
	
	@Autowired
	PublisherDao publisherDao;
	
	public List<Publisher> getAllPublisher() {
		return publisherDao.getAllPublisher();
	}

	public void save(Publisher publisher) {
		publisherDao.save(publisher);
	}

	public Publisher getPublisherById(int id) {
		return publisherDao.getPublisherById(id);
	}

	public void update(Publisher publisher) {
		publisherDao.update(publisher);
	}

	public void delete(int id) {
		publisherDao.delete(id);
	}

}
