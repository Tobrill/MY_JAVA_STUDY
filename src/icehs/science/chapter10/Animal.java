package icehs.science.chapter10;

public abstract class Animal {
	private int age;
	private String kind;
	private String name;
	
	
	
	
	public Animal(int age, String kind) {
		super();
		this.age = age;
		this.kind = kind;
	}
	
	
	

	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	
	public void run() {
		System.out.println("달리라우.....!!!");
	}
	
	public void hunt() {
		
	}
	
	
}
