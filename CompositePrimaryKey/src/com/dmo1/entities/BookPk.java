package com.dmo1.entities;

import java.io.Serializable;

public class BookPk implements Serializable{
	protected int bookId;
	protected String author;

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public int getBookId() {
		return bookId;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "BookPk [bookId=" + bookId + ", author=" + author + "]";
	}

}
