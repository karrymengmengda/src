package Factory;

public class Main2 {
	public static void main(String[] args) {
		LeiFengfactory factory1=new UndergraduateFactory();
		LeiFeng student=factory1.createLeiFeng();
		student.BuyRice();
		
		LeiFengfactory factory2=new VolunteerFacory();
		LeiFeng volunteer=factory2.createLeiFeng();
		volunteer.Sweep();
		
	}
}
