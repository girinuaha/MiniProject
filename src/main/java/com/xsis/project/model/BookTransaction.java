package com.xsis.project.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
	@OneToOne(mappedBy="bookTransaction")
	private BorrowTransaction borrowTransaction;
	@OneToMany(mappedBy="bookTransaction")
	private List<Book> book;
	
	public BookTransaction() { }
	
	public BookTransaction(int id, BorrowTransaction borrowTransaction, List<Book> book) {
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

	public List<Book> getBook() {
		return book;
	}

	public void setBook(List<Book> book) {
		this.book = book;
	}	
}
