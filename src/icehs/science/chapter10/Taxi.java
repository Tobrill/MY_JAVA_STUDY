package icehs.science.chapter10;

public class Taxi extends Car {
	private int maxNum;

	public int getMaxNum() {
		return maxNum;
	}

	public void setMaxNum(int maxNum) {
		this.maxNum = maxNum;
	}
	
	@Override
	public void go(int distance) {
		System.out.println("택시를 타고" + distance + "km이동합니다.");
	}

	
	
	
}
