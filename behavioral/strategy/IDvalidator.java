package behavioral.strategy;

public class IDvalidator implements ValidatePattern{

	@Override
	public void validate(Employee emp) {
		if(emp.getId()!=1)
			throw new RuntimeException("id is not 1");
		
	}

}
