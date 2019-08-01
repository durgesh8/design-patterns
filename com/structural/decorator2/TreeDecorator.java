package com.structural.decorator2;

public abstract class TreeDecorator implements ChrimstasTree{

	private ChrimstasTree tree;
    
    public TreeDecorator(ChrimstasTree tree2) {
		// TODO Auto-generated constructor stub
	}

	// standard constructors
    @Override
    public String decorate() {
        return tree.decorate();
    }
}
