package ichs.science.chapter04;

public class GradeTest {

	public static void main(String[] args) {

		int score = 75;
		
		boolean agrade = score >= 90 && score <= 100;
		boolean bgrade = score >= 80 && score < 90;
		boolean cgrade = score >= 70 && score < 80;
		boolean dgrade = score >= 60 && score < 70;
		
		System.out.println( "A학점 : " + agrade);
		System.out.println( "B학점 : " + bgrade);
		System.out.println( "C학점 : " + cgrade);
		System.out.println( "D학점 : " + dgrade);

	}

}
