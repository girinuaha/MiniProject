package com.xsis.project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name="BOOK_TRANSACTION")
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class, property="@id")
public class BookTransaction {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@ManyToOne
	@JoinColumn(name="borrow_transaction_id")
	private BorrowTransaction borrowTransaction;
	@ManyToOne
	@JoinColumn(name="book_id")
	private Book book;
	
	public BookTransaction() { }
	
	public BookTransaction(int id, BorrowTransaction borrowTransaction, Book book) {
		super();
		this.id = id;
		this.borrowTransaction = borrowTransaction;
		this.book = book;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BorrowTransaction getBorrowTransaction() {
		return borrowTransaction;
	}

	public void setBorrowTransaction(BorrowTransaction borrowTransaction) {
		this.borrowTransaction = borrowTransaction;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}	
}
