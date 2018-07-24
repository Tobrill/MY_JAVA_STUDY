package ichs.science.chapter04;

public class GradeIfElseTest {

	public static void main(String[] args) {
		
		int gildongScore = 92;
		int gilsoonScore = 85;
		
		if ( gildongScore >= 90 && gildongScore <= 100) {
			System.out.println( "홍길동 : A학점입니다.");
			
		}else {
			System.out.println( "홍길동 : A학점을 받지 못했습니다.");
		}
		if ( gilsoonScore >= 90 && gilsoonScore <= 100) {
			System.out.println( "홍길순 : A학점입니다.");
			
		}else {
			System.out.println( "홍길순 : A학점을 받지 못했습니다.");
		}
	}

}
