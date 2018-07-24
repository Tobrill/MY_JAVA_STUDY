package ichs.science.chapter04;

public class SeperateNumberTest {

	public static void main(String[] args) {
		
		int number = 456;
		
		System.out.println( "숫자 : " + number);
		System.out.println( "백의 자리 수 : " + (number - number % 100)/100 );
		System.out.println( "십의 자리 수 : " + (number - (number - number % 100) - ((number - (number - number % 100)) % 10)) / 10 );
		System.out.println( "일의 자리 수 : " + (number - (number - number % 100)) % 10);
	}

}
