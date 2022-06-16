package com.prototype;

public class Student extends Members {
	
	private String seniority;

	public String getSeniority() {
		return seniority;
	}

	public void setSeniority(String seniority) {
		this.seniority = seniority;
	}

	@Override
	public String toString() {
		return "Student [seniority=" + seniority + "]";
	}
	
	
	
	
	
	

	
}
