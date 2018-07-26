package iches.science.chapter08;

public class Account {
	private String accName;
	private String accNo;
	private int balance;
	private double interestRate;
	
	
	
	public Account(String accName, int balance, double interestRate) {
		this.accName = accName;
		this.balance = balance;
		this.interestRate = interestRate;
	}

	public int getBalance() {
		return balance;
		}
	
	
	
	
	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	void deposit(int money) {
		if (money > 0) {
			balance += money;
			}else {
				System.out.println("[에러] 금액은 음수를 입력할 수 없습니다.");
			}
	}
	
	void withdraw(int money) {
		if (money < 0) {
			System.out.println("[에러] 금액은 음수를 입력할 수 없습니다.");
		}else if (money <= balance) {
			balance += money;
			
		}else {
			System.out.println("[에러] 잔액이 부족합니다.");
		}
	}
	
	
	void printAccountInfo() {
		System.out.println("계좌 " + accNo + "( 예금주 : " + accName + ")");
		System.out.println("잔액 : " + balance);
	}
	
	public int calculateInterest() {
		balance += (int)balance * interestRate/100;
		return balance;
	}

}

	
