package ichs.science.chapter04;

public class CalculatorTest {

	public static void main(String[] args) {
		int firstNum = 20;
		int secondNum = 7;
		
		int addResult = firstNum + secondNum;
		int substractResult = firstNum - secondNum;
		int multiplyResult = firstNum * secondNum;
		int devideResult = firstNum / secondNum;
		int remainResult = firstNum % secondNum;
		
		System.out.println( "덧셈 결과 : " + addResult);
		System.out.println( "뺼셈 결과 : " + substractResult);
		System.out.println( "곱셈 결과 : " + multiplyResult);
		System.out.println( "나눗셈 결과 : " + devideResult);
		System.out.println( "나머지 : " + remainResult);
	}

}
