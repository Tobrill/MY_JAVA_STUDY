package icehs.science.chapter06;

public class AccountTest {

	public static void main(String[] args) {
		Account gildong = new Account();
		gildong.accName = "홍길동";
		gildong.accNo = "123-456789";
		gildong.balance = 10000;
		gildong.printAccountInfo();
		
		System.out.println();
		
		System.out.println("20000 원 입금합니다.");
		gildong.deposit(20000);
		System.out.println("잔액 : " + gildong.balance + " 원");
		
		System.out.println();
		
		System.out.println("-20000 원 입금합니다.");
		gildong.deposit(-20000);
		System.out.println("잔액 : " + gildong.balance + " 원");
		
		System.out.println();
		
		System.out.println("45000 원 출금합니다.");
		gildong.withdraw(45000);
		System.out.println("잔액 : " + gildong.balance + " 원");
	}

}
