package iches.science.chapter08;

public class AccountCalculatorTest {

	public static void main(String[] args) {
		
		Account [] acc = new Account [5];
		
		for(int i = 0; i < acc.length; i++) {
			acc[i] = new Account("111-2222-555" + (i + 1), 10000 * (i + 1), 4.5);
			System.out.println("계좌번호 : " + acc[i].getAccName() + " / 잔액 : " + acc[i].getBalance() + "원 / 이율 : " + acc[i].getInterestRate() + "%");
		}
		
		System.out.println("이율을 변경합니다.");
		for(int i = 0; i < acc.length; i++) {
			acc[i].setInterestRate(3.7);
			System.out.println("계좌번호 : " + acc[i].getAccName() + " / 이율 : " + acc[i].getInterestRate() + "%" + " / 잔액 : " + acc[i].calculateInterest());
		}

	}

}
