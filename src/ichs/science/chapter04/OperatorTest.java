package ichs.science.chapter04;

public class OperatorTest {

	public static void main(String[] args) {

		int number = 64;
		
		boolean isOdd = number % 2 == 0;
		boolean multiOf3 = number % 3 == 0;
		boolean multiOf2And7 = number % 2 == 0 && number % 7 == 0;
		boolean multiOf2Or7 = number % 2 == 0 || number % 7 == 0;
		
		System.out.println( " 짝수 입니까? : " + isOdd );
		System.out.println( " 3의 배수입니까? : " + multiOf3);
		System.out.println( " 2의 배수이면서 7의 배수입니까? : " + multiOf2And7 );
		System.out.println( " 2의 배수이거나 7의 배수입니까? : " + multiOf2Or7 );

	}

}
