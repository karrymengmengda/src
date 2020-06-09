package Decorator;

public class Finery extends Person{
	
	protected Person component;
	public void Decorate(Person componet){
		this.component=componet;
	}
	public void show(){
		if(component!=null){
			component.show();
		}
		
	}
}
