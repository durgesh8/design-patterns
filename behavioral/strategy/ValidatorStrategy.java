package behavioral.strategy;

class ValidatorStrategy {
	
	private ValidatePattern pattern;
	
	public ValidatorStrategy(ValidatePattern pattern) {
		this.pattern=pattern;
	}

	public void validate(Employee emp) {
		pattern.validate(emp);
	}
}
