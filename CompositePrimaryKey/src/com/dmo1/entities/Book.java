package com.dmo1.entities;

import java.io.Serializable;
import java.util.Date;

public class Book implements Serializable {
	protected String bookName;
	protected Date publishedDt;
	protected String isbn;
	protected BookPk pk;

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
