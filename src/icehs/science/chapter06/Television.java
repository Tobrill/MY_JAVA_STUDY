package icehs.science.chapter06;

public class Television {
	String name;
	int price;
	String description;
	
	
	public Television(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public Television(String name, String description, int price) {
		this.name = name;
		this.price = price;
		this.description = description;
	}
	
	void televisionInfo() {
		if (description == null) {
			System.out.println(name + " : " + price);
		}else {
			System.out.println(name + " ( " + description + " ) "+ price);
		}
	}
	
}
