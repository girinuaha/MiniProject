package com.xsis.project.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id")
public class Shelf {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id; 
	@Column(nullable = false)
	private String category;
	@Column(name="sub_category")
	private String subCategory;
	private String section;
	@OneToMany(mappedBy="shelf")
	private List<Book> book; 
	
	public Shelf() {
	}

	public Shelf(int id, String category, String subCategory, String section, List<Book> book) {
		super();
		this.id = id;
		this.category = category;
		this.subCategory = subCategory;
		this.section = section;
		this.book = book;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getSubCategory() {
		return subCategory;
	}

	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}
	
	public List<Book> getBook() {
		return book;
	}

	public void setBook(List<Book> book) {
		this.book = book;
	}
}
