package com.dao;

import java.util.ArrayList;

import com.entity.Book;

public interface BookDao {
	
	public void add(Book book);
	public void update(Book book);
	public void delete(Book book);
	public Book getBook(int book_no);
	public ArrayList<Book> getBookList();
}
