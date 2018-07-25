package icehs.science.chapter06;

public class Car {
	String name = "ICEī";
	int oilAmount;
	double distance;
	
	void driveCar(String start, String end, double driveDistance) {
		distance += driveDistance;
		oilAmount -= distance/20;
		System.out.println(start + "���� " + end + "���� " + driveDistance + "km �����Ͽ����ϴ�.");
	}
	
	void addOil(int oil) {
		oilAmount += oil;
		System.out.println("�ֹ��� " + oil + "L �����մϴ�.");
	}
	
	void calculateDrivingDistance() {
		System.out.println("���డ���� �Ÿ��� ��" + (double)oilAmount * 20);
	}
	
	void printCarInfo() {
		System.out.println("[" + name +"]" + " ���� �⸧�� : " + oilAmount + "L , �� ����Ÿ� : " + distance + "km");
	}
	

}
