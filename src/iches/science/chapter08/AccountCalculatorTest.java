package iches.science.chapter08;

public class AccountCalculatorTest {

	public static void main(String[] args) {
		
		Account [] acc = new Account [5];
		
		for(int i = 0; i < acc.length; i++) {
			acc[i] = new Account("111-2222-555" + (i + 1), 10000 * (i + 1), 4.5);
			System.out.println("���¹�ȣ : " + acc[i].getAccName() + " / �ܾ� : " + acc[i].getBalance() + "�� / ���� : " + acc[i].getInterestRate() + "%");
		}
		
		System.out.println("������ �����մϴ�.");
		for(int i = 0; i < acc.length; i++) {
			acc[i].setInterestRate(3.7);
			System.out.println("���¹�ȣ : " + acc[i].getAccName() + " / ���� : " + acc[i].getInterestRate() + "%" + " / �ܾ� : " + acc[i].calculateInterest());
		}

	}

}
