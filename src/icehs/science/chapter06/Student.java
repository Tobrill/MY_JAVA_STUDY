package icehs.science.chapter06;

public class Student {
	
	String name;
	String stuID;
	int korean;
	int english;
	int math;
	double average;
	
	void calculateAVG() {
		average = (double)(korean + english + math)/3;
		
	}
	
	void printStudentInfo() {
		System.out.println("학생명 : " + name);
		System.out.println("학번 : " + stuID);
		System.out.println("국어 성적 : " + korean);
		System.out.println("영어 성적 : " + english);
		System.out.println("수학 성적 : " + math);
		
	}
	
	void changeStudentID(String newStuID) {
		stuID = newStuID;
	}
	
	

}
