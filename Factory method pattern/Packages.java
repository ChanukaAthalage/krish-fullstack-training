package com.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Packages {
	
	protected ArrayList<LeisureWorld> funTypes = new ArrayList<>();
	
	public Packages() {
		createPackage();
		
	}
	
	protected abstract void createPackage();
	
	public void show() {
		System.out.println("Package includes:" + funTypes);
	
	}

}
