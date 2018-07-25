package icehs.science.chapter06;

public class Account {
	String accName;
	String accNo;
	int balance;
	
	public int getBalance() {
		return balance;
		}
	
	void deposit(int money) {
		if (money > 0) {
			balance += money;
			}else {
				System.out.println("[����] �ݾ��� ������ �Է��� �� �����ϴ�.");
			}
	}
	
	void withdraw(int money) {
		if (money < 0) {
			System.out.println("[����] �ݾ��� ������ �Է��� �� �����ϴ�.");
		}else if (money <= balance) {
			balance += money;
			
		}else {
			System.out.println("[����] �ܾ��� �����մϴ�.");
		}
	}
	
	
	void printAccountInfo() {
		System.out.println("���� " + accNo + "( ������ : " + accName + ")");
		System.out.println("�ܾ� : " + balance);
	}
	
	

}

	
