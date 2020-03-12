package com.dmo1.entities;

public class BookPk {
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
