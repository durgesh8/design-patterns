package behavioral.strategy;

public class NameValidator implements ValidatePattern{

	@Override
	public void validate(Employee emp) {
		if(emp.getName()!="durgesh")
			throw new RuntimeException("Name is not durgesh");
		
	}

}
