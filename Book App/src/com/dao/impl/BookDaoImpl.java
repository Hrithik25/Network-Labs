package com.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.dao.BookDao;
import com.dbutil.DBConnection;
import com.entity.Book;

public class BookDaoImpl implements BookDao {
	
	
	private String jdbcUrl = "jdbc:postgresql://localhost:5432/lmsdb";
	private String userName = "postgres";
	private String userPassword = "Admin@123";
	
	@Override
	public void add(Book book) {
		final String INSERT_QUERY = "insert into lms_book values(?, ?, ?, ?);";
		DBConnection db = new DBConnection();
		try {
			Connection connection = db.getConnection(jdbcUrl, userName, userPassword);
			PreparedStatement psmt = connection.prepareStatement(INSERT_QUERY);
			
			psmt.setInt(1, book.getBook_id());
			psmt.setString(2, book.getBook_name());
			psmt.setString(3, book.getIsbn_no());
			psmt.setDouble(4, book.getPrice());
			
			int row = psmt.executeUpdate();
			
			psmt.close();
			connection.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void update(Book book) {
		final String UPDATE_QUERY = "update lms_book set book_name = ?, isbn = ?, price = ?"
				+ "where book_id = ?;";
		DBConnection db = new DBConnection();
		try {
			Connection connection = db.getConnection(jdbcUrl, userName, userPassword);
			PreparedStatement psmt = connection.prepareStatement(UPDATE_QUERY);
			
			psmt.setInt(4, book.getBook_id());
			psmt.setString(1, book.getBook_name());
			psmt.setString(2, book.getIsbn_no());
			psmt.setDouble(3, book.getPrice());
			
			int row = psmt.executeUpdate();
			
			psmt.close();
			connection.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void delete(Book book) {
		final String DELETE_QUERY = "delete from lms_book where book_id = ?;";
		DBConnection db = new DBConnection();
		try {
			Connection connection = db.getConnection(jdbcUrl, userName, userPassword);
			PreparedStatement psmt = connection.prepareStatement(DELETE_QUERY);
			
			psmt.setInt(1, book.getBook_id());
			
			int row = psmt.executeUpdate();
			
			psmt.close();
			connection.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public Book getBook(int book_no) {
		final String SEARCH_QUERY = "select * from lms_book where book_id = ?;";
		Book book = new Book();
		DBConnection db = new DBConnection();
		try {
			Connection connection = db.getConnection(jdbcUrl, userName, userPassword);
			PreparedStatement psmt = connection.prepareStatement(SEARCH_QUERY);
			
			psmt.setInt(1, book_no);
			
			ResultSet rs = psmt.executeQuery();
			
			book.setBook_id(rs.getInt("book_id"));
			book.setBook_name(rs.getString("book_name"));
			book.setIsbn_no(rs.getString("isbn"));
			book.setPrice(rs.getDouble("price"));
			
			rs.close();
			psmt.close();
			connection.close();
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return book;
		
	}
	
	@Override
	public ArrayList<Book> getBookList() {
		final String FETCH_QUERY = "select * from lms_book;";
		ArrayList<Book> list = new ArrayList<Book>();
		Book book = new Book();
		DBConnection db = new DBConnection();
		try {
			Connection connection = db.getConnection(jdbcUrl, userName, userPassword);
			PreparedStatement psmt = connection.prepareStatement(FETCH_QUERY);
			
			
			ResultSet rs = psmt.executeQuery();
			
			while(rs.next()) {
				book.setBook_id(rs.getInt("book_id"));
				book.setBook_name(rs.getString("book_name"));
				book.setIsbn_no(rs.getString("isbn"));
				book.setPrice(rs.getDouble("price"));
				
				list.add(book);
			}
			
			rs.close();
			psmt.close();
			connection.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

}
