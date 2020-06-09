package Build;

public class PersonDirector {
	private Personbulider pb;
	public PersonDirector(Personbulider pb) {
		this.pb=pb;
	}
	public void createPerson(){
		pb.BuildHead();
		pb.BuildBody();
		pb.BuildArmLeft();
		pb.BuildArmRight();
		pb.BuildLegLeft();
		pb.BuildLegRight();
	}
}
