package com.dmo.entities;

public class BookPk {
	protected int bookId;
	protected String author;
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
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
