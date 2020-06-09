package Factory;

public class Main1 {
	public static void main(String[] args) {
		LeiFeng student1=new Undergraduate();
		student1.BuyRice();
		LeiFeng student2=new Undergraduate();
		student2.Wash();
		LeiFeng student3=new Undergraduate();
		student3.Sweep();
	}
}
