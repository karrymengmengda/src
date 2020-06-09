package Proxy;
import java.io.Console;

/*
 * 追求者
 */
public class Persuit implements IGiveGift{
	SchoolGirl mm;
	 public Persuit(SchoolGirl mm) {
		this.mm=mm;
	}
	@Override
	public void GiveDolls() {
		System.out.println(mm.getName()+"送你洋娃娃");
	}

	@Override
	public void GiveFlowers() {
		System.out.println(mm.getName()+"送你花花");
		
	}

	@Override
	public void GiveChocolate() {
		System.out.println(mm.getName()+"送你巧克力");
		
	}

}
