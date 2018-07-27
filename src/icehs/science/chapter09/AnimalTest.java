package icehs.science.chapter09;

public class AnimalTest {

	public static void main(String[] args) {
		Animal[] anis = {
				new Cat(3, "슈퍼 제너럴 킹 갓 미스터 톰", "톰"),
				new Dog(2, "시바", "뭉멍")
		};
		
	
		
		for(int i = 0; i < anis.length; i++) {
			anis[i].run();
			anis[i].hunt();
		}
		
		
	}

}
