package icehs.science.chapter06;

public class CoffeeTest {

	public static void main(String[] args) {
		Coffee americano = new Coffee();
		americano.name = "�Ƹ޸�ī��";
		americano.price = 3500;
		americano.printCoffeeInfo();
		
		Coffee cafelatte = new Coffee();
		cafelatte.name = "ī���";
		cafelatte.price = 4000;
		cafelatte.printCoffeeInfo();
		
		Coffee makiiyatto = new Coffee();
		makiiyatto.name = "�����߶�";
		makiiyatto.price = 4500;
		makiiyatto.printCoffeeInfo();
		
		
		int totalPrice = americano.getPrice() + cafelatte.getPrice() + makiiyatto.getPrice();
		System.out.println("�� �ݾ� : " + totalPrice + "��");

	}

}
