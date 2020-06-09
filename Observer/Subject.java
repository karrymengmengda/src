package Observer;

//通知者接口
public interface Subject {
	void Attach(Observer observer);
	void Detach(Observer observer);
	void Notify();
	String SubjectState="boss回来了";
	
}
