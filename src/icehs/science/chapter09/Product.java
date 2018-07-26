package icehs.science.chapter09;

public class Product {
	private String name;
	private int price;
	private int discountRate;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(int discountRate) {
		this.discountRate = discountRate;
	}
	
	public void printProductInfo() {
		
	}
	
	public int calculateDiscountPrice() {
		return 0;
	}
	
}
