package icehs.science.chapter10;

public class AccountTest {

	public static void main(String[] args) {
		
		Account [] funAcc = {
				new Account("1313-445566", "전우치", 1000000),
				new FundAccount("111-222", "홍길동", 5000000, 4.7),
				new FundAccount("666-777", "홍길순", 1000000, 2.9)
		};
		
		for(int i = 0; i < funAcc.length; i++){
			if(funAcc[i] instanceof FundAccount) {
				funAcc[i].openAccount();
				((FundAccount)funAcc[i]).earnMoney();
			}else {
				funAcc[i].openAccount();
			}
			System.out.println();
		}
		
		
		
		
		/*fundAcc.setName("홍길동");
		fundAcc.openAccount();
		fundAcc.setBalance(5000000);*/
		
		
		
		

	}

}
