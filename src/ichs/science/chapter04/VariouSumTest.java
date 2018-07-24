package ichs.science.chapter04;

public class VariouSumTest {

	public static void main(String[] args) {
		int sumTotal = 0;
		int sumOdd = 0;
		int sumEven = 0;
		
		for(int i = 1; i <= 1000; i++) {
			if ((i%2) == 0) {
				sumOdd += i;	
			}else {
				sumEven += i;
				
			}
		}
		sumTotal = sumOdd + sumEven;
		
		System.out.println("1부터 1000까지의 합 : " + sumTotal);
		System.out.println("1부터 1000까지의 짝수의 합 : " + sumOdd);
		System.out.println("1부터 1000까지의 홀수의 합 : " + sumEven);
	}
	

}
