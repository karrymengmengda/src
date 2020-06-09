package Factory;

public class VolunteerFacory implements LeiFengfactory{

	@Override
	public LeiFeng createLeiFeng() {
		return new Volunteer();
	}

}
