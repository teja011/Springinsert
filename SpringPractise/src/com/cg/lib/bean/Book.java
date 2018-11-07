package com.cg.lib.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
@Table(name="book")
public class Book {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="bookid")
	private int bookid;
	
	private String bookname;
	private String bookauthor;
	private int bookdate;
	private int bookprice;
	
	
	
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getBookauthor() {
		return bookauthor;
	}
	public void setBookauthor(String bookauthor) {
		this.bookauthor = bookauthor;
	}
	public int getBookdate() {
		return bookdate;
	}
	public void setBookdate(int bookdate) {
		this.bookdate = bookdate;
	}
	public int getBookprice() {
		return bookprice;
	}
	public void setBookprice(int bookprice) {
		this.bookprice = bookprice;
	}
	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", bookname=" + bookname + ", bookauthor=" + bookauthor + ", bookdate="
				+ bookdate + ", bookprice=" + bookprice + "]";
	}
	
	
	
	
	
	

}
