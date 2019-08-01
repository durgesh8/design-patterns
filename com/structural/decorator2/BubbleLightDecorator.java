package com.structural.decorator2;

public class BubbleLightDecorator extends TreeDecorator{

	public BubbleLightDecorator(ChrimstasTree tree) {
		super(tree);
		
		
	}
	  public String decorate() {
	        return super.decorate() + decorateWithBubbleLights();
	    }
	     
	    private String decorateWithBubbleLights() {
	        return " with Bubble Lights";
	    }
}
