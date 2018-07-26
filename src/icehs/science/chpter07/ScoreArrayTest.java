package icehs.science.chpter07;

public class ScoreArrayTest {

	public static void main(String[] args) {
		int [] scores = new int [3];
		scores[0] = 93;
		scores[1] = 87;
		scores[2] = 90;
		
		double avg = (double)(scores[0] + scores[1] + scores[2]) / 3;
		
		System.out.println("���� : " + scores[0]);
		System.out.println("���� : " + scores[1]);
		System.out.println("���� : " + scores[2]);
		System.out.println("��� : " + avg);
	}

}
