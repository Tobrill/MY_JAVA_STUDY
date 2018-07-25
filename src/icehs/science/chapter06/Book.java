package icehs.science.chapter06;

public class Book {
	String title;
	String author;
	int price;
	
	Book(){
		
		
	}
	
	Book(String title, int price){
		this.title = title;
		this.price = price;
	}
	Book(String title, String author, int price){
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	Book(String title, String author){
		this.title = title;
		this.author = author;
	}
	
	void printBookInfo() {
		System.out.println("책 제목 : " + this.title);
		System.out.println("작가명 : " + this.author);
		System.out.println("가격 : " + this.price);
	}
}
