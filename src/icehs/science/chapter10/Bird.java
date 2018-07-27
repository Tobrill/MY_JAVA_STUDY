package icehs.science.chapter10;

public class Bird extends Animal implements Flyable {
	private String habitat;
	
	public Bird(String kind, int age, String habitat) {
		super(age, kind);
		this.habitat = habitat;
	}

	@Override
	public void Fly() {
		// TODO Auto-generated method stub
		System.out.println("날아간다.");
	}

	@Override
	public void spreadWings() {
		// TODO Auto-generated method stub
		System.out.println("날개를 펼친다.");
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	
	
	
}
