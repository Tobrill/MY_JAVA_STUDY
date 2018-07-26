package iches.science.chapter08;

public class ChocolateTest {

	public static void main(String[] args) {

		Chocolate [] choco = new Chocolate[3];
		
		choco[0] = new Chocolate("아마도라", "다크", 2200);
		choco[1] = new Chocolate("카페 키리쉬", "다크", 2500);
		choco[2] = new Chocolate("트리플 블랑", "화이트", 2300);
		
		choco[0].printChocolateInfo();
		choco[1].printChocolateInfo();
		choco[2].printChocolateInfo();

		
		
		
		
		

	}

}
