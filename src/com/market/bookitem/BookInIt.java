package com.market.bookitem;

import java.io.*;
import java.util.ArrayList;

public class BookInIt {
	private static ArrayList<Book> mBookList;
	private static int mTotalBook = 0;
	
	public static void init() {
		mTotalBook = totalFileToBookList();
		mBookList = new ArrayList<Book>();
		setFileToBookList(mBookList);
	}
	
	public static int totalFileToBookList() {
		try {
			FileReader fr = new FileReader("book.txt");
			BufferedReader reader = new BufferedReader(fr);
			
			String str;
			int num = 0;
			while ((str = reader.readLine()) != null) {
				if (str.contains("ISBN"))
					++num;
			}
			
			reader.close();
			fr.close();
			return num;
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}
	public static void setFileToBookList(ArrayList<Book> booklist) {
		try {
			FileReader fr = new FileReader("book.txt");
			BufferedReader reader =  new BufferedReader(fr);
			
			String str2;
			String[] readbook = new String[7];
			
			while ((str2 = reader.readLine()) != null) {
				if (str2.contains("ISBN")) {
					readbook[0] = str2;
					readbook[1] = reader.readLine();
					readbook[2] = reader.readLine();
					readbook[3] = reader.readLine();
					readbook[4] = reader.readLine();
					readbook[5] = reader.readLine();
					readbook[6] = reader.readLine();
				}
				
				Book bookitem = new Book(readbook[0], readbook[1], Integer.parseInt(readbook[2]), readbook[3], readbook[4], readbook[5], readbook[6]);
				booklist.add(bookitem);
			} 
			reader.close();
			fr.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static ArrayList<Book> getmBookList() {
		return mBookList;
	}
	
	public static void setmBookList(ArrayList<Book> mBookList) {
		BookInIt.mBookList = mBookList;
	}
	
	public static int getmTotalBook() {
		return mTotalBook;
	}
	
	public static void setmTotalBook(int mTotalBook) {
		BookInIt.mTotalBook = mTotalBook;
	}
}
