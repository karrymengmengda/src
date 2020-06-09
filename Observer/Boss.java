package Observer;

import java.util.ArrayList;
import java.util.List;

public class Boss implements Subject{
	private List<Observer> observers=new ArrayList<Observer>();
	private String action;
	
	@Override
	public void Attach(Observer observer) {
		observers.add(observer);
		
	}

	@Override
	public void Detach(Observer observer) {
		observers.remove(observer);
		
	}

	@Override
	public void Notify() {
		for (Observer observer : observers) {
			observer.Update();
		}
	}


	

	
	
}
