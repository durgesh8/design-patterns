package behavioral.strategy;

import java.util.ArrayList;
import java.util.List;

public class StrategyPatternDemo {

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.setId(1);
		emp.setName("abc");
		
		IDvalidator iDvalidator=new IDvalidator();
		NameValidator nameValidator=new NameValidator();
		
		List<ValidatePattern> pattern = new ArrayList<>();
		pattern.add(iDvalidator);
		pattern.add(nameValidator);
		
		
		pattern.forEach(pattern1-> {
			ValidatorStrategy strategy= new ValidatorStrategy(pattern1);
			strategy.validate(emp);
		});
		
		
		
		
		

		
	}
}
