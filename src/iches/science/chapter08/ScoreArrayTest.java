package iches.science.chapter08;

public class ScoreArrayTest {

	public static void main(String[] args) {
		int [] scores = new int [4];
		scores[0] = 93;
		scores[1] = 87;
		scores[2] = 90;
		scores[3] = 55;
		
		String [] subjects = {"국어", "영어", "수학", "사회"};
		
		int sum = 0;
		
		for (int i = 0; i < scores.length; i++) {
			System.out.println(subjects[i] + " : " + scores[i]);
			sum += scores[i];
		}
		
		double avg = (double)sum / scores.length;
		
		
		/*for (int i = 0; i < subjects.length; i++) {
			System.out.println(subjects[i] + " : " + scores[i]);
		}*/
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		
		/*System.out.println("국어 : " + scores[0]);
		System.out.println("영어 : " + scores[1]);
		System.out.println("수학 : " + scores[2]);
		System.out.println("사회 : " + scores[3]);*/
		
		

	}

}
