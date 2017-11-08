package com.xsis.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xsis.project.model.BookStock;
import com.xsis.project.dao.BookDao;
import com.xsis.project.dao.BookStockDao;
import com.xsis.project.model.Book;

@Transactional
@Service
public class BookService {
	
	@Autowired
	BookDao bookDao;
	@Autowired
	BookStockDao bookStockDao;
	
	public List<Book> getAllBook() {
		return bookDao.getAllBook();
	}
	
	public void save(Book book) {
		BookStock bookStock = book.getBookStock();
		bookStockDao.save(bookStock);
		
		book.setBookStock(bookStock);
		bookDao.save(book);
	}

	public Book getBookById(int id) {
		return bookDao.getBookById(id);
	}

	public void update(Book book) {
		bookDao.update(book);
		bookStockDao.update(book.getBookStock());
	}

	public void delete(int id) {
		bookDao.delete(id);
	}
}
