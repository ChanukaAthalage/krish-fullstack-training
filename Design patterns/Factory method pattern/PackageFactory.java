package com.factory;

public class PackageFactory {

	public static Packages createPackage(Code code) {
		switch(code) {
		case WET:
			return new WetPackage();
		case DRY:
			return new DryPackage();
		case COMBO:
			return new ComboPackage();
		default:
			return null;
		}
	}
}
