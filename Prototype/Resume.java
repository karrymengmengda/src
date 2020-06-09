package Prototype;

import java.awt.DisplayMode;

public class Resume extends Prototype{
	private String name;
	private String sex;
	private String age;
	private String timeArea;
	private String company;
	public Resume(String name) {
		this.name=name;
	}
	
	
	public void setPersonalInfo(String sex,String age) {
		this.sex = sex;
		this.age = age;
	}

	
	

	public void setWorkExperience(String timeArea,String company) {
		this.timeArea = timeArea;
		this.company = company;
	}
	public void Display(){
		System.out.println(name+" "+sex+" "+" "+age);
		System.out.println("工作经历:"+timeArea+company);
	}

	@Override
	public Prototype Clone() {
		return null;
	}

}
