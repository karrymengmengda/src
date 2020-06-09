
package Decorator;

public class Main {
	public static void main(String[] args) {
		Person gg=new Person("郭郭");
		
		TShirts tx=new TShirts();
		Sneakers qx=new Sneakers();
		BigTrouser ktk=new BigTrouser();
		qx.Decorate(gg);
		ktk.Decorate(qx);
		tx.Decorate(ktk);
		tx.show();
	}
}
