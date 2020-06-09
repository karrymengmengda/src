package Build;

import java.awt.Graphics;

public abstract class Personbulider {
	protected Graphics g;
	public Personbulider(Graphics g) {
		this.g=g;
	}
	public abstract void BuildHead();
	public abstract void BuildBody();
	public abstract void BuildArmLeft();
	public abstract void BuildArmRight();
	public abstract void BuildLegLeft();
	public abstract void BuildLegRight();
	
}
