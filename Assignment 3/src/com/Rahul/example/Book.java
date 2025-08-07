package com.Rahul.example;

public class Book {
	public int bookid;
	public String bookname;
	public Auther auther_obj=new Auther();
	public Publication publication_obj =new Publication();
	
	public void addBook(int bookid, String bookname, Auther a, Publication p) 
	{
		this.bookid=bookid;
		this.bookname=bookname;
		this.auther_obj=a;
		this.publication_obj=p;
	}
	
	public String toString(){
		return String.format("Book ID: %d\tBook Name: %s\n%s\n%s",bookid, bookname, auther_obj.toString(), publication_obj.toString());
	}
	

}
