package Prototype;

public class Main {
	public static void main(String[] args) {
		Resume a=new Resume("郭郭");
		a.setPersonalInfo("男", "20");
		a.setWorkExperience("2018-2021", "xx公司");
		
		Resume b=new Resume("成成");
		b.setPersonalInfo("男", "20");
		b.setWorkExperience("2018-2021", "yy公司");
		
		a.Display();
		b.Display();
	}
}
