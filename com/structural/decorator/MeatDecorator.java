package com.structural.decorator;

public class MeatDecorator extends SandwichDecorator{

	public MeatDecorator(Sandwich sandwich) {
		super(sandwich);
	}
	
	
	public String make() {
		return super.make()+addMeat();
	}


	private String addMeat() {
		return " Turkey";
	}

}
