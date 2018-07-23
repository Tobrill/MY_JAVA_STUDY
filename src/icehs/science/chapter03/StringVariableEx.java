package icehs.science.chapter03;

public class StringVariableEx {

	public static void main(String[] args) {
		
		String name = "홍길동";
		String mathScore = "96";
		int englishScore = 82;
		int intMathScore = Integer.parseInt(mathScore);
		
		System.out.println( name + mathScore + englishScore);
		System.out.println( name + intMathScore + englishScore);
		System.out.println( intMathScore + englishScore);	
	}

}
