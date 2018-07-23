package icehs.science.chapter03;

public class StringTest {

	public static void main(String[] args) {
		String king = "세종대왕";
		String money = "10000";
		
		int year = 2017;
		int intMoney = Integer.parseInt(money);
		
		System.out.println( king + " : " +money);
		System.out.println(year + "년");
		System.out.println(money + year);
		System.out.println(intMoney + year);

	}

}
