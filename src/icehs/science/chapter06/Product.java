package icehs.science.chapter06;

public class Product {
	String name;
	int price;
	int discount;
	
	Product(String name, int price){
		this.name = name;
		this.price = price;
		
	}
	
	Product(String name, int price, int discount){
		this.name = name;
		this.price = price;
		this.discount = discount;
	}
	
	void printProductInfo() {
		System.out.println("===== " + this.name + " =====");
		System.out.println("정가 " + this.price);
		if (discount == 0) {
			System.out.println("할인율 : 할인하지 않음");
		}else {
			System.out.println("할인율 : " + this.discount);
		}
	}
}
