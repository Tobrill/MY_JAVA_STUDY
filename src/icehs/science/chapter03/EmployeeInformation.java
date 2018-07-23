package icehs.science.chapter03;

public class EmployeeInformation {

	public static void main(String[] args) {
		String name = "홍길동";
		String entranceYear = "2002";
		int thisYear = 2018;
		int intentranceYear = Integer.parseInt(entranceYear);
		
		int employedDuration = thisYear - intentranceYear;
		
		System.out.println( "이름 : " + name);
		System.out.println( "입사년도 : " + entranceYear);
		System.out.println( "근무년수 : " + employedDuration);
	}

}
