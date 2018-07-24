package ichs.science.chapter04;

public class GradeIfElseIfTest {

	public static void main(String[] args) {
		
		int gildongScore = 92;
		
		if (gildongScore >= 90 && gildongScore <= 100) {
			System.out.println("A학점입니다.");
		} else if (gildongScore >= 80 && gildongScore < 90) {
			System.out.println("B학점입니다.");
		} else if (gildongScore >= 70 && gildongScore < 80) {
			System.out.println("C학점입니다.");
		} else if (gildongScore >= 60 && gildongScore < 70) {
			System.out.println("D학점입니다.");
		} else {
			System.out.println("F학점입니다.");
		}

	}

}
