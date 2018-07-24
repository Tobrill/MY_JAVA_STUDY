package ichs.science.chapter04;

public class ConditionIfEx {

	public static void main(String[] args) {

		int age = 20;
		
		if ( age < 19) {
			System.out.println( "19세 이상만 입장 가능합니다.");
			System.out.println( "대단히 죄송합니다.");
		}
		
		if ( age >= 19) {
			System.out.println( "성인입니다");
			System.out.println( "좋은 시간보내시길 바랍니다.");
		}
	}

}
