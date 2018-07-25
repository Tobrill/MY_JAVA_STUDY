package icehs.science.chapter06;

public class CoffeeTest {

	public static void main(String[] args) {
		Coffee americano = new Coffee();
		americano.name = "아메리카노";
		americano.price = 3500;
		americano.printCoffeeInfo();
		
		Coffee cafelatte = new Coffee();
		cafelatte.name = "카페라떼";
		cafelatte.price = 4000;
		cafelatte.printCoffeeInfo();
		
		Coffee makiiyatto = new Coffee();
		makiiyatto.name = "마끼야또";
		makiiyatto.price = 4500;
		makiiyatto.printCoffeeInfo();
		
		
		int totalPrice = americano.getPrice() + cafelatte.getPrice() + makiiyatto.getPrice();
		System.out.println("총 금액 : " + totalPrice + "원");

	}

}
