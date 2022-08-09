package com.dao.impl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.entity.Book;

class BookDaoImplTest {

	@Test
	void testGetBook() {

			BookDaoImpl obj = new BookDaoImpl();
			Book book = null;
			book = obj.getBook(111);
			
			System.out.println(book);
		
		
		
		//assertEquals(book1.getPrice(), book2.getPrice());
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
