package icehs.science.chapter06;

public class CarTest {

	public static void main(String[] args) {
		Car ice = new Car();
		ice.oilAmount = 5;
		ice.distance = 140;
		
		ice.printCarInfo();
		ice.addOil(10);
		ice.printCarInfo();
		ice.driveCar("IT센터", "인천공항",10.17);
		ice.printCarInfo();
		ice.driveCar("인천공항", "곤지암", 60.21);
		ice.printCarInfo();
		ice.calculateDrivingDistance();
		
		

	}

}
