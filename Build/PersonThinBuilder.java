package Build;

import java.awt.Graphics;

public class PersonThinBuilder extends Personbulider{

	public PersonThinBuilder(Graphics g) {
		super(g);
	}

	@Override
	public void BuildHead() {
		g.fillOval(50,50,30,30);
	}

	@Override
	public void BuildBody() {
		 g.fillRect(60,80,10,50);
		
	}

	@Override
	public void BuildArmLeft() {
		g.drawLine(60,80,40,130);
		
	}

	@Override
	public void BuildArmRight() {
		g.drawLine(70,80,90,130);
		
	}

	@Override
	public void BuildLegLeft() {
		g.drawLine(60,130,45,180);
		
	}

	@Override
	public void BuildLegRight() {
		 g.drawLine(70,130,85,180);
		
	}

}
