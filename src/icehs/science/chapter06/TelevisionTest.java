package icehs.science.chapter06;

public class TelevisionTest {

	public static void main(String[] args) {
		Television tele1 = new Television("INFINIA", 1500000);
		tele1.televisionInfo();
		
		Television tele2 = new Television("XCANVAS", "LCD TV", 1000000);
		tele2.televisionInfo();
		
		Television tele3 = new Television("CINEMA", "3D TV", 2000000);
		tele3.televisionInfo();
		
		System.out.println("가격의 합 : " + (tele1.price + tele2.price + tele3.price) );
			
		
		

	}

}
