package com.dmo1.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "b_tab")
public class Book implements Serializable {
	@EmbeddedId
	protected BookPk pk;

	@Column(name = "book_name")
	protected String bookName;
	
	@Column(name = "published_date")
	protected Date publishedDt;
	
	protected String isbn;
	

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public Date getPublishedDt() {
		return publishedDt;
	}

	public void setPublishedDt(Date publishedDt) {
		this.publishedDt = publishedDt;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public BookPk getPk() {
		return pk;
	}

	public void setPk(BookPk pk) {
		this.pk = pk;
	}

	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", publishedDt=" + publishedDt + ", isbn=" + isbn + ", pk=" + pk + "]";
	}

}
