package icehs.science.chapter10;

public class Car implements Washer {
	private int oilSize;
	
	

	public int getOilSize() {
		return oilSize;
	}

	public void setOilSize(int oilSize) {
		this.oilSize = oilSize;
	}
	
	public void go(int oilSize) {
		
	}
	


	@Override
	public void wash() {
		System.out.println("세차합니다.");
	}

	
}
