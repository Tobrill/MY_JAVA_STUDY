package icehs.science.chapter09;

public class AnimalTest {

	public static void main(String[] args) {
		Cat cat1 = new Cat();
		cat1.setName("야옹이");
		cat1.setAge(3);
		cat1.setKind("슈퍼 제너럴 킹 갓 미스터 톰");
		
		System.out.println("이름 : " + cat1.getName());
		System.out.println("나이 : " + cat1.getAge());
		System.out.println("종류 : " + cat1.getKind());
		cat1.run();
		cat1.hunt();
		cat1.play();
	}

}
