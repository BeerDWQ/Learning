package com.dongwenqi.sqltest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import org.junit.Test;
/*
 * version 1.0;
 * 缺少数据类型长度类型检测
 * 勉强实现
 */
public class HomeWork {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Book book=new Book();
		Scanner sc=new Scanner(System.in);
		System.out.println("Input name:");
		String name=sc.next();
		book.setName(name);
		System.out.println("Input type:");
		String type=sc.next();
		book.setType(type);
		System.out.println("Input author:");
		String author=sc.next();
		book.setAuthor(author);
		System.out.println("Input detail:");
		String detail=sc.next();
		book.setDetail(detail);
		add(book);
	}
	public static void add(Book book) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/MyResource","root","hero123456");
		String sql="insert into book_list (book_name,book_type,book_author,book_detail) values(?,?,?,?)";
		//String sql1="insert into book_list (book_name) values(?)";
		PreparedStatement stm=con.prepareStatement(sql);
		stm.setString(1, book.getName());
		stm.setString(2,book.getType());
		stm.setString(3,book.getAuthor());
		stm.setString(4, book.getDetail());
		stm.executeUpdate();
	}
}
class Book{
	private String name;
	private String type;
	private String author;
	private String detail;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	
}