package icehs.science.chapter09;

public class Television extends Product {
	private String description;
	
	public Television(String name, int price, int discountRate, String description) {
		super(name, price, discountRate);
		this.description = description;
	}

}
