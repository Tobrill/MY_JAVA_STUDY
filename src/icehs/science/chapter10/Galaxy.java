package icehs.science.chapter10;

public class Galaxy extends Mobile{
	
	private String osVersion;
	
	public String getOsVersion() {
		return osVersion;
	}



	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;

	}

	@Override
	public void charge(int time) {
		System.out.println(this.getProduction() + " : 보조배터리 " + time + "분 충전");
	}


}
