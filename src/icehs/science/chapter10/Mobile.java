package icehs.science.chapter10;

public class Mobile {
	
	private String production;
	private int price;
	
	public String getProduction() {
		return production;
	}

	public void setProduction(String production) {
		this.production = production;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void call(int time) {
		System.out.println(production + " : " + time + "분 통화했습니다.");
	}
	
	public void charge(int time) {
		System.out.println(production + " : " + time + "분 충전했습니다.");
	}
	
	public void a(String osVersion) {
		System.out.println(production + " : " + osVersion);
	}
	
	public void b(String color) {
		System.out.println(production + " : " + color);
	}

	

	

}
