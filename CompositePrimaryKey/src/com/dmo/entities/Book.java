package com.dmo.entities;

import java.io.Serializable;
import java.util.Date;

public class Book implements Serializable {
	protected int bookId;
	protected String bookName;
	protected String author;
	protected Date publishedDt;
	protected String isbn;

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
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

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", author=" + author + ", publishedDt="
				+ publishedDt + ", isbn=" + isbn + "]";
	}

}
