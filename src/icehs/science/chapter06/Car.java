package icehs.science.chapter06;

public class Car {
	String name = "ICE카";
	int oilAmount;
	double distance;
	
	void driveCar(String start, String end, double driveDistance) {
		distance += driveDistance;
		oilAmount -= distance/20;
		System.out.println(start + "에서 " + end + "까지 " + driveDistance + "km 주행하였습니다.");
	}
	
	void addOil(int oil) {
		oilAmount += oil;
		System.out.println("휘발유 " + oil + "L 주유합니다.");
	}
	
	void calculateDrivingDistance() {
		System.out.println("주행가능한 거리는 약" + (double)oilAmount * 20);
	}
	
	void printCarInfo() {
		System.out.println("[" + name +"]" + " 남은 기름양 : " + oilAmount + "L , 총 주행거리 : " + distance + "km");
	}
	

}
