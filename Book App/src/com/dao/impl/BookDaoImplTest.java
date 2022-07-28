package com.dao.impl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.entity.Book;

class BookDaoImplTest {

	@Test
	void testAdd() {
		BookDaoImpl obj = new BookDaoImpl();
		Book book1 = new Book();
		Book book2 = new Book(obj.getBook(111));
		
		book1.setBook_id(111);
		book1.setBook_name("Gullivers Travels");
		book1.setIsbn_no("VVBH426GB7");
		book1.setPrice(250.0);
		
		//book2 = obj.getBook(111);
		
		assertEquals(book1.getPrice(), book2.getPrice());
	}

	/*@Test
	void testUpdate() {
		fail("Not yet implemented");
	}

	@Test
	void testDelete() {
		fail("Not yet implemented");
	}

	@Test
	void testGetBook() {
		fail("Not yet implemented");
	}

	@Test
	void testGetBookList() {
		fail("Not yet implemented");
	}*/

}
