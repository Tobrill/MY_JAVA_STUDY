package iches.science.chapter08;

public class ScoreArrayTest {

	public static void main(String[] args) {
		int [] scores = new int [4];
		scores[0] = 93;
		scores[1] = 87;
		scores[2] = 90;
		scores[3] = 55;
		
		String [] subjects = {"����", "����", "����", "��ȸ"};
		
		int sum = 0;
		
		for (int i = 0; i < scores.length; i++) {
			System.out.println(subjects[i] + " : " + scores[i]);
			sum += scores[i];
		}
		
		double avg = (double)sum / scores.length;
		
		
		/*for (int i = 0; i < subjects.length; i++) {
			System.out.println(subjects[i] + " : " + scores[i]);
		}*/
		
		System.out.println("�հ� : " + sum);
		System.out.println("��� : " + avg);
		
		/*System.out.println("���� : " + scores[0]);
		System.out.println("���� : " + scores[1]);
		System.out.println("���� : " + scores[2]);
		System.out.println("��ȸ : " + scores[3]);*/
		
		

	}

}
