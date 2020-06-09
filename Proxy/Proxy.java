package Proxy;

public class Proxy implements IGiveGift{
	Persuit gg;
	public Proxy(SchoolGirl mm) {
		gg=new Persuit(mm);
	}
	@Override
	public void GiveDolls() {
		gg.GiveDolls();
		
	}

	@Override
	public void GiveFlowers() {
		gg.GiveFlowers();
	}

	@Override
	public void GiveChocolate() {
		gg.GiveChocolate();
		
	}
	
}
