package icehs.science.chapter06;

public class BuildingTest {

	public static void main(String[] args) {
		Building sunin = new Building();
		sunin.name = "선인고";
		sunin.address = "도화동";
		sunin.totalFloor = 4;
		
		System.out.println("건물명 : " + sunin.name);
		System.out.println("주소 : " + sunin.address);
		System.out.println("전체 층 수 : " + sunin.totalFloor);
		
		sunin.moveElevator();
		sunin.changeAddress("박문동");
		System.out.println("주소 : " + sunin.address);
		
		//====================================================;
		System.out.println();
		System.out.println("===========================");
		System.out.println();
		
		Building inhwa = new Building();
		inhwa.name = "인화여고";
		inhwa.address = "연화동";
		inhwa.totalFloor = 5;
		
		System.out.println("건물명 : " + inhwa.name);
		System.out.println("주소 : " + inhwa.address);
		System.out.println("전체 층 수 : " + inhwa.totalFloor);
		
		inhwa.moveElevator();
		inhwa.changeAddress("도화동");
		System.out.println("주소 : " + inhwa.address);

	}

}
