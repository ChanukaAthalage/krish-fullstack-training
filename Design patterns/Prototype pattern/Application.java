package com.prototype;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Registry registry = new Registry();
		
		Student student = (Student) registry.getMembers(MemberType.STUDENT);
		System.out.println(student);

	}

}
