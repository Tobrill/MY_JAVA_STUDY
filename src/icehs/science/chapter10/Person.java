package icehs.science.chapter10;

public class Person {
	private String name;
	private String phoneNo;
	
	public void eat() {
		System.out.println("밥을 먹어요.");
	}
	
	public void sleep() {
		System.out.println("잠을 잡니다.");
	}
}



class Student extends Person{
	private String department;
	
	@Override
	public void sleep() {
		System.out.println("A동에서 잠을잡니다.");
	}
	
	
	public void study() {
		System.out.println("공부합니다.");
	}
	
	
	public void eat() {
		super.eat();
		System.out.println("조별로 먹어요.");
	}
}



class Teacher extends Person{
	private String subject;
	
	@Override
	public void sleep() {
		System.out.println("B동에서 잠을잡니다.");
	}
	
	public void teach() {
		System.out.println("수업을 합니다.");
	}
	
	
	public void eat() {
		super.eat();
		System.out.println("다 같이 먹어요.");
	}
}

