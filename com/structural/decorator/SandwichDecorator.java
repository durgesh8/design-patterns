package com.structural.decorator;

public abstract class SandwichDecorator implements Sandwich{

	private Sandwich sandwich;
	
	public SandwichDecorator(Sandwich sandwich) {
		this.sandwich=sandwich;
	}
	
	public String make() {
		return sandwich.make();
	}
}
