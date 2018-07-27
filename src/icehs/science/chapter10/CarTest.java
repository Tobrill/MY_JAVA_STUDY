package icehs.science.chapter10;

public class CarTest {

	public static void main(String[] args) {
		
		Car[] cars  = {
				new Taxi(),
				new Truck()
		};
		
		
		cars[0].go(20);
		cars[0].setOilSize(10);
		System.out.println("연료 : " + cars[0].getOilSize());
		((Taxi)cars[0]).setMaxNum(4);
		
		cars[1].go(30);
		cars[1].setOilSize(10);
		System.out.println("연료 : " + cars[1].getOilSize());
		((Truck)cars[1]).setMaxWeight(100);
		
		
	}

}
