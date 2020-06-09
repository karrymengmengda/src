package Build;

import java.awt.Graphics;

public class PersonFatBuilder extends Personbulider{
	public PersonFatBuilder(Graphics g)
    {
        super(g);
    }

	@Override
	public void BuildHead() {
		// TODO Auto-generated method stub
		  g.fillOval(50, 50, 30, 30);
	}

	@Override
	public void BuildBody() {
		// TODO Auto-generated method stub
		 g.fillRect(60, 80, 10, 50);
	}

	@Override
	public void BuildArmLeft() {
		// TODO Auto-generated method stub
		g.drawLine(60, 80, 40, 130);
	}

	@Override
	public void BuildArmRight() {
		// TODO Auto-generated method stub
		 g.drawLine(70, 80, 90, 130);
	}

	@Override
	public void BuildLegLeft() {
		// TODO Auto-generated method stub
		 g.drawLine(60, 130, 45, 180);
	}

	@Override
	public void BuildLegRight() {
		// TODO Auto-generated method stub
		g.drawLine(70, 130, 85, 180);
	}

	
}
