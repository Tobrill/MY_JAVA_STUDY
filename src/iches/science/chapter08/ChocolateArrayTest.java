package iches.science.chapter08;

public class ChocolateArrayTest {

	public static void main(String[] args) {
		
		Chocolate [] choco = { new Chocolate("아마도라", "다크", 2200), new Chocolate("카페 키리쉬", "다크", 2500), new Chocolate("트리플 블랑", "화이트", 2300)};
		
		int sum = 0;
		
		for (int i = 0; i < choco.length; i++) {
			if (choco[i].getType().equals("화이트")) {
				sum += choco[i].getPrice() * 80/100;
			}else {
				sum += choco[i].getPrice();
			}
		}
		
		for (int i = 0; i < choco.length; i++) {
			System.out.println("이름 : " + choco[i].getName() + ", 종류 : " + choco[i].getType() + ", 가격 : " + choco[i].getPrice());
			
		}
		
		System.out.println("하나씩 구매했을 떄 총 가격 : " + sum);

		}

}
