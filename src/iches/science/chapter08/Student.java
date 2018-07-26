package iches.science.chapter08;

public class Student {
	
	private String name;
	private String stuNo;
	private String ponNum;
	
	public Student(String name, String stuNo, String ponNum) {
		this.name = name;
		this.stuNo = stuNo;
		this.ponNum = ponNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStuNo() {
		return stuNo;
	}

	public void setStuNo(String stuNo) {
		this.stuNo = stuNo;
	}

	public String getPonNum() {
		return ponNum;
	}

	public void setPonNum(String ponNum) {
		this.ponNum = ponNum;
	}
	
	

}
