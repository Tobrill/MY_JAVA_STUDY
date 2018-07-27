package icehs.science.chapter10;

public class BirdTest {

	public static void main(String[] args) {
		Bird bird1 = new Bird("독수리", 3, "바위산 등");
		System.out.println(bird1.getKind() + " ( " + bird1.getAge() + "살) : " + bird1.getHabitat());
		bird1.spreadWings();
		bird1.Fly();
	}

}
