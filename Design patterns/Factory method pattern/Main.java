package com.factory;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Packages apackage = PackageFactory.createPackage(Code.COMBO);
		System.out.println(apackage);
		apackage.show();

	}

}
