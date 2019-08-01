package com.structural.decorator;

public class DressingDecorator extends SandwichDecorator {

	public DressingDecorator(Sandwich sandwich) {
		super(sandwich);
	}
	
	public String make() {
		return super.make()+addDressing();
	}

	private String addDressing() {
		return " Dressing";
	}

	
}
