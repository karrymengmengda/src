package Factory;

public class UndergraduateFactory implements LeiFengfactory{

	@Override
	public LeiFeng createLeiFeng() {
		return new Undergraduate();
	}

}
