
public class DrivingLicense implements A {

	@Override
	public void validateAge(int age) throws InvalidAgeException {
		// TODO Auto-generated method stub
		
		if(age<=18)
			throw new InvalidAgeException("Age is not valid");
		
	}

}
