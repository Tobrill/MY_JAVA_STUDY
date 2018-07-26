package icehs.science.chapter09;

public class AccountTest {

	public static void main(String[] args) {
		FundAccount fundAcc = new FundAccount();
		fundAcc.setName("홍길동");
		fundAcc.openAccount();
		fundAcc.setBalance(5000000);
		fundAcc.openAccount();
		fundAcc.setEarningRate(4.7);
		fundAcc.earnMoney();

	}

}
