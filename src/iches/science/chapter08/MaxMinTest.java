package iches.science.chapter08;

public class MaxMinTest {

	public static void main(String[] args) {
		int[] arr = {12, 53, 24, 10, 22, 38, 64, 39};
		int max = arr[0];
		int min = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}else if (arr[i] < min) {
				min = arr[i];
			}
		}
		
		
			
		}
		System.out.println("배열 데이터 : " );
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);

	}

}
