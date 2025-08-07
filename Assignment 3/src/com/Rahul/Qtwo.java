package com.Rahul;

import java.util.Scanner;

import com.Rahul.example.Auther;
import com.Rahul.example.Book;
import com.Rahul.example.Publication;

public class Qtwo {

	public static void main(String[] args) {
		Book[] b=new Book[4];
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<b.length;i++)
		{
			b[i]=new Book();
			System.out.println("Enter Book Details : ");
			System.out.println("Enter Book ID : ");
			int bookid=sc.nextInt();
			System.out.println("Enter Book Name : ");
			String bookname=sc.next();
			System.out.println("Enter Auther ID : ");
			int auther_id=sc.nextInt();
			System.out.println("Enter Auther Name : ");
			String auther_name=sc.next();
			Auther a=new Auther();
			a.createNewAuther(auther_id,auther_name);
			System.out.println("Enter Publication ID : ");
			int publication_id=sc.nextInt();
			System.out.println("Enter Publication Name : ");
			String publication_name=sc.next();
			Publication p=new Publication();
			p.createNewPublication(publication_id,publication_name);
			System.out.println();
			b[i].addBook(bookid,bookname,a,p);
		}
		System.out.println("Enter Auther Name to Search books :");
		String auther_name=sc.next();
		searchBookByAuther(b,auther_name);
		
		sortBookByName(b);
		
	}

	public static void searchBookByAuther(Book[] b, String auther_name) 
	{
		boolean found=false;
		for(Book b1:b)
		{
			if(b1.auther_obj.auther_name.equalsIgnoreCase(auther_name))
			{
				System.out.println(b1.toString());
				found=false;
			}
		}
		if(!found)
		{
			System.out.println("No Book found for this Author " );
		}
	}
	public static void sortBookByName(Book[] b) 
	{
		for(int i=0;i<b.length-1;i++)
		{
			for(int j=i+1;j<b.length;j++)
			{
				if(b[i].bookname.compareToIgnoreCase(b[j].bookname)>0)
				{
					Book t=b[i];
					b[i]=b[j];
					b[j]=t;
				}
			}
		}
		System.out.println("Sorted Book Array : ");
		
		for(Book b1:b)
		{
			System.out.println(b1.toString());
		}
	}
		
	}


